package com.smartcity.auth_service.grpc;

import com.smartcity.auth_service.service.AuthService;
import com.smartcity.auth_service.service.JwtService;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

// This class implements the gRPC endpoints for authentication
@GrpcService
public class AuthGrpcService extends AuthServiceGrpc.AuthServiceImplBase {

	@Autowired
	private AuthService authService;
	
	@Autowired
	private JwtService jwtService;

	// Handles user registration
	@Override
	public void register(RegisterRequest request, StreamObserver<AuthResponse> responseObserver) {
		// We call the AuthService using extracted values from gRPC request
		String token = authService.register(new com.smartcity.auth_service.dto.RegisterRequest() {
			{
				setUsername(request.getUsername());
				setPassword(request.getPassword());
				setRole(request.getRole());
			}
		});

		// Build gRPC response using generated message class
		AuthResponse response = AuthResponse.newBuilder().setToken(token).build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	// Handles user login
	@Override
	public void login(LoginRequest request, StreamObserver<AuthResponse> responseObserver) {
		String token = authService.login(request.getUsername(), request.getPassword());

		AuthResponse response = AuthResponse.newBuilder().setToken(token).build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	// Handles token validation
	@Override
	public void validateToken(ValidateTokenRequest request, StreamObserver<ValidateTokenResponse> responseObserver) {
		String token = request.getToken();

		try {
			// Try to extract username and validate token
			String username = jwtService.extractUsername(token); 
			boolean isValid = jwtService.isTokenValid(token); 

			ValidateTokenResponse response = ValidateTokenResponse.newBuilder().setValid(isValid)
					.setUsername(isValid ? username : "").build();

			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} catch (Exception e) {
			// If token is invalid or parsing fails, return false
			ValidateTokenResponse response = ValidateTokenResponse.newBuilder().setValid(false).setUsername("").build();

			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
	}
}
