package com.smartcity.auth_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

// This class configures Spring Security for the application
@Configuration
public class SecurityConfig {

	// Define password encoder to hash passwords
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// Define the security filter chain
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    http
	        .csrf(csrf -> csrf.disable()) // Disable CSRF for H2 console
	        .headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable()))
	        .authorizeHttpRequests(auth -> auth
	            .requestMatchers("/h2-console/**").permitAll()
	            .anyRequest().permitAll()
	        )
	        .httpBasic(Customizer.withDefaults());

	    return http.build();
	}
}
