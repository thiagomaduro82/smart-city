package com.smartcity.auth_service.dto;

import jakarta.validation.constraints.NotBlank;

//Request DTO for user registration
public class RegisterRequest {
	@NotBlank
	private String username;

	@NotBlank
	private String password;

	private String role = "USER"; // default role

	// Getters and Setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}