package com.smartcity.traffic_service.repository;

import com.smartcity.traffic_service.model.TrafficLight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repository for TrafficLight entity
@Repository
public interface TrafficLightRepository extends JpaRepository<TrafficLight, String> {
}
