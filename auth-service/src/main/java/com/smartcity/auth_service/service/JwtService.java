package com.smartcity.auth_service.service;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Service;

import java.util.Date;

//This service handles JWT token generation and validation
@Service
public class JwtService {
	
	// Secret key to sign tokens (for demo purposes, keep it safe in real apps!)
    private static final String SECRET_KEY = "my-secret-key";

    // Token validity time: 1 hour
    private static final long EXPIRATION_TIME = 3600000;

    // Generate a JWT token with user details
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }

    // Extract username from the JWT token
    public String extractUsername(String token) {
        return getClaims(token).getSubject();
    }

    // Validate the token
    public boolean isTokenValid(String token) {
        try {
            getClaims(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            return false;
        }
    }

    // Get the claims (payload) from token
    private Claims getClaims(String token) {
        return Jwts.parser()
                   .setSigningKey(SECRET_KEY)
                   .parseClaimsJws(token)
                   .getBody();
    }

}
