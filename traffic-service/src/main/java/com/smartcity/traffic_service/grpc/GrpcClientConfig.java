package com.smartcity.traffic_service.grpc;

import com.smartcity.auth_service.grpc.AuthServiceGrpc;
import com.smartcity.auth_service.grpc.ValidateTokenRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Configuration for gRPC clients to other microservices
@Configuration
public class GrpcClientConfig {

    // Creates a ManagedChannel to the Auth Service (running on localhost:9090)
    @Bean
    public ManagedChannel authManagedChannel() {
        return ManagedChannelBuilder
                    .forAddress("localhost", 9090)
                    .usePlaintext() // no TLS for simplicity
                    .build();
    }

    // Creates a blocking stub for AuthService to call its RPCs
    @Bean
    public AuthServiceGrpc.AuthServiceBlockingStub authServiceStub(ManagedChannel authManagedChannel) {
        return AuthServiceGrpc.newBlockingStub(authManagedChannel);
    }
}
