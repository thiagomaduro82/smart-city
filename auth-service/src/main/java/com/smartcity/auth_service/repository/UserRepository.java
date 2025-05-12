package com.smartcity.auth_service.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcity.auth_service.model.User;

public interface UserRepository extends JpaRepository<User, UUID> {
	
	Optional<User> findByUsername(String username);

}
