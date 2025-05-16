package com.smartcity.energy_service.service;

import com.smartcity.energy_service.grpc.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

// gRPC service implementation for energy monitoring
@GrpcService
public class EnergyGrpcService extends EnergyServiceGrpc.EnergyServiceImplBase {

    // Handles energy usage reports submitted by sensors or devices
    @Override
    public void reportEnergyUsage(EnergyUsageRequest request, StreamObserver<EnergyUsageResponse> responseObserver) {
        // Normally, you would persist this data and validate the token

        String msg = String.format("Usage reported: %.2f kW in region %s", request.getUsageInKw(), request.getRegion());
        System.out.println("[Energy Service] " + msg);

        EnergyUsageResponse response = EnergyUsageResponse.newBuilder()
                .setMessage("Energy usage recorded successfully.")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Provides the current energy status for a specific region
    @Override
    public void getEnergyStatus(EnergyStatusRequest request, StreamObserver<EnergyStatusResponse> responseObserver) {
        // Simulated status. In a real system, you'd check metrics or external API.

        EnergyStatusResponse response = EnergyStatusResponse.newBuilder()
                .setRegion(request.getRegion())
                .setStatus("NORMAL")  // Could be "NORMAL", "OVERLOAD", "OUTAGE"
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Handles reports of power outages from regions
    @Override
    public void reportOutage(OutageReportRequest request, StreamObserver<OutageResponse> responseObserver) {
        // Log the outage event; in real life, it might trigger alerts or database actions

        String log = String.format("Power outage reported in %s: %s", request.getRegion(), request.getDetails());
        System.out.println("[Energy Service] " + log);

        OutageResponse response = OutageResponse.newBuilder()
                .setMessage("Outage report received and logged.")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
