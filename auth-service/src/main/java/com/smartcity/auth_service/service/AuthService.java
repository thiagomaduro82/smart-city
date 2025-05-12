package com.smartcity.auth_service.service;

import com.smartcity.auth_service.dto.RegisterRequest;
import com.smartcity.auth_service.model.User;
import com.smartcity.auth_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

// This service handles user registration and authentication
@Service
public class AuthService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private JwtService jwtService;

	private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	// Register a new user
	public String register(RegisterRequest request) {
		if (userRepository.findByUsername(request.getUsername()).isPresent()) {
			throw new RuntimeException("Username already exists");
		}

		User user = new User(request.getUsername(), passwordEncoder.encode(request.getPassword()), request.getRole());
		userRepository.save(user);

		return jwtService.generateToken(user.getUsername());
	}

	// Authenticate an existing user and return token
	public String login(String username, String password) {
		Optional<User> userOpt = userRepository.findByUsername(username);
		if (userOpt.isEmpty()) {
			throw new RuntimeException("User not found");
		}

		User user = userOpt.get();
		if (!passwordEncoder.matches(password, user.getPassword())) {
			throw new RuntimeException("Invalid password");
		}

		return jwtService.generateToken(user.getUsername());
	}
}
