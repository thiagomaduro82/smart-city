package com.smartcity.auth_service.grpc;

import com.smartcity.auth_service.service.AuthService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

// This class implements the gRPC endpoints for authentication
@GrpcService
public class AuthGrpcService extends AuthServiceGrpc.AuthServiceImplBase {

    @Autowired
    private AuthService authService;

    // Handles user registration
    @Override
    public void register(RegisterRequest request, StreamObserver<AuthResponse> responseObserver) {
        // We call the AuthService using extracted values from gRPC request
        String token = authService.register(
                new com.smartcity.auth_service.dto.RegisterRequest() {{
                    setUsername(request.getUsername());
                    setPassword(request.getPassword());
                    setRole(request.getRole());
                }}
        );

        // Build gRPC response using generated message class
        AuthResponse response = AuthResponse.newBuilder()
                .setToken(token)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Handles user login
    @Override
    public void login(LoginRequest request, StreamObserver<AuthResponse> responseObserver) {
        String token = authService.login(request.getUsername(), request.getPassword());

        AuthResponse response = AuthResponse.newBuilder()
                .setToken(token)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
