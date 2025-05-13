package com.smartcity.weather_service.service;

import com.smartcity.weather_service.grpc.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Arrays;

// gRPC service implementation for weather-related operations
@GrpcService
public class WeatherGrpcService extends WeatherServiceGrpc.WeatherServiceImplBase {

    // Handles current weather data request for a specific region
    @Override
    public void getCurrentWeather(WeatherRequest request, StreamObserver<WeatherResponse> responseObserver) {
        // Normally, you would validate the token here and query a weather database or API

        WeatherResponse response = WeatherResponse.newBuilder()
                .setTemperature("22°C")
                .setHumidity("65%")
                .setCondition("Partly Cloudy")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Handles multi-day weather forecast request
    @Override
    public void getForecast(WeatherForecastRequest request, StreamObserver<WeatherForecastResponse> responseObserver) {
        // Simulated daily forecast data for the given region

        WeatherForecastResponse response = WeatherForecastResponse.newBuilder()
                .addAllDailyForecasts(Arrays.asList("Sunny", "Cloudy", "Rainy"))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Handles reports of extreme weather anomalies
    @Override
    public void reportWeatherAnomaly(WeatherAnomalyRequest request, StreamObserver<AnomalyResponse> responseObserver) {
        // Normally, this would save the anomaly report to the database or trigger alerts

        String msg = String.format("Anomaly received: %s (Severity: %s) in region: %s",
                request.getDescription(), request.getSeverity(), request.getRegion());

        System.out.println("[Weather Service] " + msg);

        AnomalyResponse response = AnomalyResponse.newBuilder()
                .setMessage("Anomaly successfully reported.")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
