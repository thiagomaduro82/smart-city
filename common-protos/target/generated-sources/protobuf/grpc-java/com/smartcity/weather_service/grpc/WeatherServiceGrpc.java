package com.smartcity.weather_service.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * gRPC service to provide weather-related features
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: weather.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WeatherServiceGrpc {

  private WeatherServiceGrpc() {}

  public static final String SERVICE_NAME = "weather_service.WeatherService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartcity.weather_service.grpc.WeatherRequest,
      com.smartcity.weather_service.grpc.WeatherResponse> getGetCurrentWeatherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentWeather",
      requestType = com.smartcity.weather_service.grpc.WeatherRequest.class,
      responseType = com.smartcity.weather_service.grpc.WeatherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcity.weather_service.grpc.WeatherRequest,
      com.smartcity.weather_service.grpc.WeatherResponse> getGetCurrentWeatherMethod() {
    io.grpc.MethodDescriptor<com.smartcity.weather_service.grpc.WeatherRequest, com.smartcity.weather_service.grpc.WeatherResponse> getGetCurrentWeatherMethod;
    if ((getGetCurrentWeatherMethod = WeatherServiceGrpc.getGetCurrentWeatherMethod) == null) {
      synchronized (WeatherServiceGrpc.class) {
        if ((getGetCurrentWeatherMethod = WeatherServiceGrpc.getGetCurrentWeatherMethod) == null) {
          WeatherServiceGrpc.getGetCurrentWeatherMethod = getGetCurrentWeatherMethod =
              io.grpc.MethodDescriptor.<com.smartcity.weather_service.grpc.WeatherRequest, com.smartcity.weather_service.grpc.WeatherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentWeather"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.weather_service.grpc.WeatherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.weather_service.grpc.WeatherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherServiceMethodDescriptorSupplier("GetCurrentWeather"))
              .build();
        }
      }
    }
    return getGetCurrentWeatherMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartcity.weather_service.grpc.WeatherForecastRequest,
      com.smartcity.weather_service.grpc.WeatherForecastResponse> getGetForecastMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetForecast",
      requestType = com.smartcity.weather_service.grpc.WeatherForecastRequest.class,
      responseType = com.smartcity.weather_service.grpc.WeatherForecastResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcity.weather_service.grpc.WeatherForecastRequest,
      com.smartcity.weather_service.grpc.WeatherForecastResponse> getGetForecastMethod() {
    io.grpc.MethodDescriptor<com.smartcity.weather_service.grpc.WeatherForecastRequest, com.smartcity.weather_service.grpc.WeatherForecastResponse> getGetForecastMethod;
    if ((getGetForecastMethod = WeatherServiceGrpc.getGetForecastMethod) == null) {
      synchronized (WeatherServiceGrpc.class) {
        if ((getGetForecastMethod = WeatherServiceGrpc.getGetForecastMethod) == null) {
          WeatherServiceGrpc.getGetForecastMethod = getGetForecastMethod =
              io.grpc.MethodDescriptor.<com.smartcity.weather_service.grpc.WeatherForecastRequest, com.smartcity.weather_service.grpc.WeatherForecastResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetForecast"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.weather_service.grpc.WeatherForecastRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.weather_service.grpc.WeatherForecastResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherServiceMethodDescriptorSupplier("GetForecast"))
              .build();
        }
      }
    }
    return getGetForecastMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartcity.weather_service.grpc.WeatherAnomalyRequest,
      com.smartcity.weather_service.grpc.AnomalyResponse> getReportWeatherAnomalyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportWeatherAnomaly",
      requestType = com.smartcity.weather_service.grpc.WeatherAnomalyRequest.class,
      responseType = com.smartcity.weather_service.grpc.AnomalyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcity.weather_service.grpc.WeatherAnomalyRequest,
      com.smartcity.weather_service.grpc.AnomalyResponse> getReportWeatherAnomalyMethod() {
    io.grpc.MethodDescriptor<com.smartcity.weather_service.grpc.WeatherAnomalyRequest, com.smartcity.weather_service.grpc.AnomalyResponse> getReportWeatherAnomalyMethod;
    if ((getReportWeatherAnomalyMethod = WeatherServiceGrpc.getReportWeatherAnomalyMethod) == null) {
      synchronized (WeatherServiceGrpc.class) {
        if ((getReportWeatherAnomalyMethod = WeatherServiceGrpc.getReportWeatherAnomalyMethod) == null) {
          WeatherServiceGrpc.getReportWeatherAnomalyMethod = getReportWeatherAnomalyMethod =
              io.grpc.MethodDescriptor.<com.smartcity.weather_service.grpc.WeatherAnomalyRequest, com.smartcity.weather_service.grpc.AnomalyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportWeatherAnomaly"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.weather_service.grpc.WeatherAnomalyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.weather_service.grpc.AnomalyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherServiceMethodDescriptorSupplier("ReportWeatherAnomaly"))
              .build();
        }
      }
    }
    return getReportWeatherAnomalyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WeatherServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherServiceStub>() {
        @java.lang.Override
        public WeatherServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherServiceStub(channel, callOptions);
        }
      };
    return WeatherServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WeatherServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherServiceBlockingStub>() {
        @java.lang.Override
        public WeatherServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherServiceBlockingStub(channel, callOptions);
        }
      };
    return WeatherServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WeatherServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherServiceFutureStub>() {
        @java.lang.Override
        public WeatherServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherServiceFutureStub(channel, callOptions);
        }
      };
    return WeatherServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * gRPC service to provide weather-related features
   * </pre>
   */
  public static abstract class WeatherServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns current weather for a given region
     * </pre>
     */
    public void getCurrentWeather(com.smartcity.weather_service.grpc.WeatherRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.weather_service.grpc.WeatherResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentWeatherMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns multi-day forecast for a region
     * </pre>
     */
    public void getForecast(com.smartcity.weather_service.grpc.WeatherForecastRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.weather_service.grpc.WeatherForecastResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetForecastMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reports a weather anomaly (e.g. storm, heatwave)
     * </pre>
     */
    public void reportWeatherAnomaly(com.smartcity.weather_service.grpc.WeatherAnomalyRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.weather_service.grpc.AnomalyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportWeatherAnomalyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCurrentWeatherMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartcity.weather_service.grpc.WeatherRequest,
                com.smartcity.weather_service.grpc.WeatherResponse>(
                  this, METHODID_GET_CURRENT_WEATHER)))
          .addMethod(
            getGetForecastMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartcity.weather_service.grpc.WeatherForecastRequest,
                com.smartcity.weather_service.grpc.WeatherForecastResponse>(
                  this, METHODID_GET_FORECAST)))
          .addMethod(
            getReportWeatherAnomalyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartcity.weather_service.grpc.WeatherAnomalyRequest,
                com.smartcity.weather_service.grpc.AnomalyResponse>(
                  this, METHODID_REPORT_WEATHER_ANOMALY)))
          .build();
    }
  }

  /**
   * <pre>
   * gRPC service to provide weather-related features
   * </pre>
   */
  public static final class WeatherServiceStub extends io.grpc.stub.AbstractAsyncStub<WeatherServiceStub> {
    private WeatherServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns current weather for a given region
     * </pre>
     */
    public void getCurrentWeather(com.smartcity.weather_service.grpc.WeatherRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.weather_service.grpc.WeatherResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentWeatherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns multi-day forecast for a region
     * </pre>
     */
    public void getForecast(com.smartcity.weather_service.grpc.WeatherForecastRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.weather_service.grpc.WeatherForecastResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetForecastMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reports a weather anomaly (e.g. storm, heatwave)
     * </pre>
     */
    public void reportWeatherAnomaly(com.smartcity.weather_service.grpc.WeatherAnomalyRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.weather_service.grpc.AnomalyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportWeatherAnomalyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * gRPC service to provide weather-related features
   * </pre>
   */
  public static final class WeatherServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WeatherServiceBlockingStub> {
    private WeatherServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns current weather for a given region
     * </pre>
     */
    public com.smartcity.weather_service.grpc.WeatherResponse getCurrentWeather(com.smartcity.weather_service.grpc.WeatherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentWeatherMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns multi-day forecast for a region
     * </pre>
     */
    public com.smartcity.weather_service.grpc.WeatherForecastResponse getForecast(com.smartcity.weather_service.grpc.WeatherForecastRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetForecastMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reports a weather anomaly (e.g. storm, heatwave)
     * </pre>
     */
    public com.smartcity.weather_service.grpc.AnomalyResponse reportWeatherAnomaly(com.smartcity.weather_service.grpc.WeatherAnomalyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportWeatherAnomalyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * gRPC service to provide weather-related features
   * </pre>
   */
  public static final class WeatherServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WeatherServiceFutureStub> {
    private WeatherServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns current weather for a given region
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcity.weather_service.grpc.WeatherResponse> getCurrentWeather(
        com.smartcity.weather_service.grpc.WeatherRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentWeatherMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns multi-day forecast for a region
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcity.weather_service.grpc.WeatherForecastResponse> getForecast(
        com.smartcity.weather_service.grpc.WeatherForecastRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetForecastMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reports a weather anomaly (e.g. storm, heatwave)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcity.weather_service.grpc.AnomalyResponse> reportWeatherAnomaly(
        com.smartcity.weather_service.grpc.WeatherAnomalyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportWeatherAnomalyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CURRENT_WEATHER = 0;
  private static final int METHODID_GET_FORECAST = 1;
  private static final int METHODID_REPORT_WEATHER_ANOMALY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WeatherServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WeatherServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CURRENT_WEATHER:
          serviceImpl.getCurrentWeather((com.smartcity.weather_service.grpc.WeatherRequest) request,
              (io.grpc.stub.StreamObserver<com.smartcity.weather_service.grpc.WeatherResponse>) responseObserver);
          break;
        case METHODID_GET_FORECAST:
          serviceImpl.getForecast((com.smartcity.weather_service.grpc.WeatherForecastRequest) request,
              (io.grpc.stub.StreamObserver<com.smartcity.weather_service.grpc.WeatherForecastResponse>) responseObserver);
          break;
        case METHODID_REPORT_WEATHER_ANOMALY:
          serviceImpl.reportWeatherAnomaly((com.smartcity.weather_service.grpc.WeatherAnomalyRequest) request,
              (io.grpc.stub.StreamObserver<com.smartcity.weather_service.grpc.AnomalyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WeatherServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WeatherServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartcity.weather_service.grpc.WeatherProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WeatherService");
    }
  }

  private static final class WeatherServiceFileDescriptorSupplier
      extends WeatherServiceBaseDescriptorSupplier {
    WeatherServiceFileDescriptorSupplier() {}
  }

  private static final class WeatherServiceMethodDescriptorSupplier
      extends WeatherServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WeatherServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WeatherServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WeatherServiceFileDescriptorSupplier())
              .addMethod(getGetCurrentWeatherMethod())
              .addMethod(getGetForecastMethod())
              .addMethod(getReportWeatherAnomalyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
