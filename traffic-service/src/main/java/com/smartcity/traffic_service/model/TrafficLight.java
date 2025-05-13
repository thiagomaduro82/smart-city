package com.smartcity.traffic_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Entity representing a traffic light device
@Entity
@Table(name = "traffic_lights")
public class TrafficLight {

    @Id
    private String id;

    private String location;
    private String status; // RED, YELLOW, GREEN

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
