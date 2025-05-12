package com.smartcity.auth_service.dto;

//Response DTO with the JWT token
public class AuthResponse {
	private String token;

	public AuthResponse(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}
}
