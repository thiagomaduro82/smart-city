package com.smartcity.traffic_service.service;

import com.smartcity.auth_service.grpc.AuthServiceGrpc;
import com.smartcity.auth_service.grpc.ValidateTokenRequest;
import com.smartcity.auth_service.grpc.ValidateTokenResponse;
import com.smartcity.traffic_service.grpc.TrafficServiceGrpc;
import com.smartcity.traffic_service.grpc.TrafficLightRequest;
import com.smartcity.traffic_service.grpc.TrafficStatusUpdateRequest;
import com.smartcity.traffic_service.grpc.TrafficResponse;
import com.smartcity.traffic_service.grpc.RegionTrafficRequest;
import com.smartcity.traffic_service.grpc.RegionTrafficResponse;
import com.smartcity.traffic_service.model.TrafficLight;
import com.smartcity.traffic_service.repository.TrafficLightRepository;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

// gRPC implementation of the TrafficService defined in traffic.proto
@GrpcService
public class TrafficGrpcService extends TrafficServiceGrpc.TrafficServiceImplBase {

    @Autowired
    private AuthServiceGrpc.AuthServiceBlockingStub authServiceStub;

    @Autowired
    private TrafficLightRepository trafficRepo;

    // Handles registration of a new traffic light
    @Override
    public void registerTrafficLight(TrafficLightRequest request, StreamObserver<TrafficResponse> responseObserver) {
        if (!validateToken(request.getToken())) {
            responseObserver.onError(Status.UNAUTHENTICATED
                    .withDescription("Invalid token")
                    .asRuntimeException());
            return;
        }

        // Creates a new TrafficLight entity and saves it to the database
        TrafficLight light = new TrafficLight();
        light.setId(request.getId());
        light.setLocation(request.getLocation());
        light.setStatus("RED"); // Default status

        trafficRepo.save(light);

        // Builds a success response
        TrafficResponse response = TrafficResponse.newBuilder()
                .setMessage("Traffic light registered successfully")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Handles status updates for existing traffic lights
    @Override
    public void updateTrafficStatus(TrafficStatusUpdateRequest request, StreamObserver<TrafficResponse> responseObserver) {
        if (!validateToken(request.getToken())) {
            responseObserver.onError(Status.UNAUTHENTICATED
                    .withDescription("Invalid token")
                    .asRuntimeException());
            return;
        }

        // Searches for the traffic light in the database
        Optional<TrafficLight> optional = trafficRepo.findById(request.getId());
        if (optional.isEmpty()) {
            responseObserver.onError(Status.NOT_FOUND
                    .withDescription("Traffic light not found")
                    .asRuntimeException());
            return;
        }

        // Updates the status and saves the entity
        TrafficLight light = optional.get();
        light.setStatus(request.getStatus());
        trafficRepo.save(light);

        TrafficResponse response = TrafficResponse.newBuilder()
                .setMessage("Traffic light status updated")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Returns a congestion level based on the number of traffic lights
    @Override
    public void getTrafficByRegion(RegionTrafficRequest request, StreamObserver<RegionTrafficResponse> responseObserver) {
        if (!validateToken(request.getToken())) {
            responseObserver.onError(Status.UNAUTHENTICATED
                    .withDescription("Invalid token")
                    .asRuntimeException());
            return;
        }

        // Currently uses a simple count-based rule for congestion
        long count = trafficRepo.count();
        String level = count > 5 ? "HIGH" : count > 2 ? "MEDIUM" : "LOW";

        RegionTrafficResponse response = RegionTrafficResponse.newBuilder()
                .setRegion(request.getRegion())
                .setCongestionLevel(level)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Validates a JWT token by calling the Auth Service via gRPC
    private boolean validateToken(String token) {
        ValidateTokenRequest request = ValidateTokenRequest.newBuilder()
                .setToken(token)
                .build();
        try {
            ValidateTokenResponse response = authServiceStub.validateToken(request);
            return response.getValid();
        } catch (Exception e) {
            return false;
        }
    }
}
