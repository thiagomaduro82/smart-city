package com.smartcity.traffic_service.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * gRPC service for traffic management in the smart city
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: traffic.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrafficServiceGrpc {

  private TrafficServiceGrpc() {}

  public static final String SERVICE_NAME = "traffic.TrafficService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartcity.traffic_service.grpc.TrafficLightRequest,
      com.smartcity.traffic_service.grpc.TrafficResponse> getRegisterTrafficLightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterTrafficLight",
      requestType = com.smartcity.traffic_service.grpc.TrafficLightRequest.class,
      responseType = com.smartcity.traffic_service.grpc.TrafficResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcity.traffic_service.grpc.TrafficLightRequest,
      com.smartcity.traffic_service.grpc.TrafficResponse> getRegisterTrafficLightMethod() {
    io.grpc.MethodDescriptor<com.smartcity.traffic_service.grpc.TrafficLightRequest, com.smartcity.traffic_service.grpc.TrafficResponse> getRegisterTrafficLightMethod;
    if ((getRegisterTrafficLightMethod = TrafficServiceGrpc.getRegisterTrafficLightMethod) == null) {
      synchronized (TrafficServiceGrpc.class) {
        if ((getRegisterTrafficLightMethod = TrafficServiceGrpc.getRegisterTrafficLightMethod) == null) {
          TrafficServiceGrpc.getRegisterTrafficLightMethod = getRegisterTrafficLightMethod =
              io.grpc.MethodDescriptor.<com.smartcity.traffic_service.grpc.TrafficLightRequest, com.smartcity.traffic_service.grpc.TrafficResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterTrafficLight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.traffic_service.grpc.TrafficLightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.traffic_service.grpc.TrafficResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrafficServiceMethodDescriptorSupplier("RegisterTrafficLight"))
              .build();
        }
      }
    }
    return getRegisterTrafficLightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartcity.traffic_service.grpc.TrafficStatusUpdateRequest,
      com.smartcity.traffic_service.grpc.TrafficResponse> getUpdateTrafficStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTrafficStatus",
      requestType = com.smartcity.traffic_service.grpc.TrafficStatusUpdateRequest.class,
      responseType = com.smartcity.traffic_service.grpc.TrafficResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcity.traffic_service.grpc.TrafficStatusUpdateRequest,
      com.smartcity.traffic_service.grpc.TrafficResponse> getUpdateTrafficStatusMethod() {
    io.grpc.MethodDescriptor<com.smartcity.traffic_service.grpc.TrafficStatusUpdateRequest, com.smartcity.traffic_service.grpc.TrafficResponse> getUpdateTrafficStatusMethod;
    if ((getUpdateTrafficStatusMethod = TrafficServiceGrpc.getUpdateTrafficStatusMethod) == null) {
      synchronized (TrafficServiceGrpc.class) {
        if ((getUpdateTrafficStatusMethod = TrafficServiceGrpc.getUpdateTrafficStatusMethod) == null) {
          TrafficServiceGrpc.getUpdateTrafficStatusMethod = getUpdateTrafficStatusMethod =
              io.grpc.MethodDescriptor.<com.smartcity.traffic_service.grpc.TrafficStatusUpdateRequest, com.smartcity.traffic_service.grpc.TrafficResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTrafficStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.traffic_service.grpc.TrafficStatusUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.traffic_service.grpc.TrafficResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrafficServiceMethodDescriptorSupplier("UpdateTrafficStatus"))
              .build();
        }
      }
    }
    return getUpdateTrafficStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartcity.traffic_service.grpc.RegionTrafficRequest,
      com.smartcity.traffic_service.grpc.RegionTrafficResponse> getGetTrafficByRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTrafficByRegion",
      requestType = com.smartcity.traffic_service.grpc.RegionTrafficRequest.class,
      responseType = com.smartcity.traffic_service.grpc.RegionTrafficResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcity.traffic_service.grpc.RegionTrafficRequest,
      com.smartcity.traffic_service.grpc.RegionTrafficResponse> getGetTrafficByRegionMethod() {
    io.grpc.MethodDescriptor<com.smartcity.traffic_service.grpc.RegionTrafficRequest, com.smartcity.traffic_service.grpc.RegionTrafficResponse> getGetTrafficByRegionMethod;
    if ((getGetTrafficByRegionMethod = TrafficServiceGrpc.getGetTrafficByRegionMethod) == null) {
      synchronized (TrafficServiceGrpc.class) {
        if ((getGetTrafficByRegionMethod = TrafficServiceGrpc.getGetTrafficByRegionMethod) == null) {
          TrafficServiceGrpc.getGetTrafficByRegionMethod = getGetTrafficByRegionMethod =
              io.grpc.MethodDescriptor.<com.smartcity.traffic_service.grpc.RegionTrafficRequest, com.smartcity.traffic_service.grpc.RegionTrafficResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTrafficByRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.traffic_service.grpc.RegionTrafficRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.traffic_service.grpc.RegionTrafficResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrafficServiceMethodDescriptorSupplier("GetTrafficByRegion"))
              .build();
        }
      }
    }
    return getGetTrafficByRegionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrafficServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrafficServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrafficServiceStub>() {
        @java.lang.Override
        public TrafficServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrafficServiceStub(channel, callOptions);
        }
      };
    return TrafficServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrafficServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrafficServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrafficServiceBlockingStub>() {
        @java.lang.Override
        public TrafficServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrafficServiceBlockingStub(channel, callOptions);
        }
      };
    return TrafficServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrafficServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrafficServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrafficServiceFutureStub>() {
        @java.lang.Override
        public TrafficServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrafficServiceFutureStub(channel, callOptions);
        }
      };
    return TrafficServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * gRPC service for traffic management in the smart city
   * </pre>
   */
  public static abstract class TrafficServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Registers a new traffic light in the system
     * </pre>
     */
    public void registerTrafficLight(com.smartcity.traffic_service.grpc.TrafficLightRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.traffic_service.grpc.TrafficResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterTrafficLightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the status of a traffic light (e.g. GREEN, YELLOW, RED)
     * </pre>
     */
    public void updateTrafficStatus(com.smartcity.traffic_service.grpc.TrafficStatusUpdateRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.traffic_service.grpc.TrafficResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTrafficStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves traffic congestion level for a specific region
     * </pre>
     */
    public void getTrafficByRegion(com.smartcity.traffic_service.grpc.RegionTrafficRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.traffic_service.grpc.RegionTrafficResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTrafficByRegionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterTrafficLightMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartcity.traffic_service.grpc.TrafficLightRequest,
                com.smartcity.traffic_service.grpc.TrafficResponse>(
                  this, METHODID_REGISTER_TRAFFIC_LIGHT)))
          .addMethod(
            getUpdateTrafficStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartcity.traffic_service.grpc.TrafficStatusUpdateRequest,
                com.smartcity.traffic_service.grpc.TrafficResponse>(
                  this, METHODID_UPDATE_TRAFFIC_STATUS)))
          .addMethod(
            getGetTrafficByRegionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartcity.traffic_service.grpc.RegionTrafficRequest,
                com.smartcity.traffic_service.grpc.RegionTrafficResponse>(
                  this, METHODID_GET_TRAFFIC_BY_REGION)))
          .build();
    }
  }

  /**
   * <pre>
   * gRPC service for traffic management in the smart city
   * </pre>
   */
  public static final class TrafficServiceStub extends io.grpc.stub.AbstractAsyncStub<TrafficServiceStub> {
    private TrafficServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrafficServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers a new traffic light in the system
     * </pre>
     */
    public void registerTrafficLight(com.smartcity.traffic_service.grpc.TrafficLightRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.traffic_service.grpc.TrafficResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterTrafficLightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the status of a traffic light (e.g. GREEN, YELLOW, RED)
     * </pre>
     */
    public void updateTrafficStatus(com.smartcity.traffic_service.grpc.TrafficStatusUpdateRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.traffic_service.grpc.TrafficResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTrafficStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves traffic congestion level for a specific region
     * </pre>
     */
    public void getTrafficByRegion(com.smartcity.traffic_service.grpc.RegionTrafficRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.traffic_service.grpc.RegionTrafficResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTrafficByRegionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * gRPC service for traffic management in the smart city
   * </pre>
   */
  public static final class TrafficServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TrafficServiceBlockingStub> {
    private TrafficServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrafficServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers a new traffic light in the system
     * </pre>
     */
    public com.smartcity.traffic_service.grpc.TrafficResponse registerTrafficLight(com.smartcity.traffic_service.grpc.TrafficLightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterTrafficLightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the status of a traffic light (e.g. GREEN, YELLOW, RED)
     * </pre>
     */
    public com.smartcity.traffic_service.grpc.TrafficResponse updateTrafficStatus(com.smartcity.traffic_service.grpc.TrafficStatusUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTrafficStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves traffic congestion level for a specific region
     * </pre>
     */
    public com.smartcity.traffic_service.grpc.RegionTrafficResponse getTrafficByRegion(com.smartcity.traffic_service.grpc.RegionTrafficRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTrafficByRegionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * gRPC service for traffic management in the smart city
   * </pre>
   */
  public static final class TrafficServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TrafficServiceFutureStub> {
    private TrafficServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrafficServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrafficServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers a new traffic light in the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcity.traffic_service.grpc.TrafficResponse> registerTrafficLight(
        com.smartcity.traffic_service.grpc.TrafficLightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterTrafficLightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the status of a traffic light (e.g. GREEN, YELLOW, RED)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcity.traffic_service.grpc.TrafficResponse> updateTrafficStatus(
        com.smartcity.traffic_service.grpc.TrafficStatusUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTrafficStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves traffic congestion level for a specific region
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcity.traffic_service.grpc.RegionTrafficResponse> getTrafficByRegion(
        com.smartcity.traffic_service.grpc.RegionTrafficRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTrafficByRegionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_TRAFFIC_LIGHT = 0;
  private static final int METHODID_UPDATE_TRAFFIC_STATUS = 1;
  private static final int METHODID_GET_TRAFFIC_BY_REGION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrafficServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrafficServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_TRAFFIC_LIGHT:
          serviceImpl.registerTrafficLight((com.smartcity.traffic_service.grpc.TrafficLightRequest) request,
              (io.grpc.stub.StreamObserver<com.smartcity.traffic_service.grpc.TrafficResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TRAFFIC_STATUS:
          serviceImpl.updateTrafficStatus((com.smartcity.traffic_service.grpc.TrafficStatusUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.smartcity.traffic_service.grpc.TrafficResponse>) responseObserver);
          break;
        case METHODID_GET_TRAFFIC_BY_REGION:
          serviceImpl.getTrafficByRegion((com.smartcity.traffic_service.grpc.RegionTrafficRequest) request,
              (io.grpc.stub.StreamObserver<com.smartcity.traffic_service.grpc.RegionTrafficResponse>) responseObserver);
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

  private static abstract class TrafficServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrafficServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartcity.traffic_service.grpc.TrafficProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrafficService");
    }
  }

  private static final class TrafficServiceFileDescriptorSupplier
      extends TrafficServiceBaseDescriptorSupplier {
    TrafficServiceFileDescriptorSupplier() {}
  }

  private static final class TrafficServiceMethodDescriptorSupplier
      extends TrafficServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrafficServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrafficServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrafficServiceFileDescriptorSupplier())
              .addMethod(getRegisterTrafficLightMethod())
              .addMethod(getUpdateTrafficStatusMethod())
              .addMethod(getGetTrafficByRegionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
