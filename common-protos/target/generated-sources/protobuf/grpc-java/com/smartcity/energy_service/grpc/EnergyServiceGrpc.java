package com.smartcity.energy_service.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * gRPC service to handle energy monitoring
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: energy.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EnergyServiceGrpc {

  private EnergyServiceGrpc() {}

  public static final String SERVICE_NAME = "energy_service.EnergyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartcity.energy_service.grpc.EnergyUsageRequest,
      com.smartcity.energy_service.grpc.EnergyUsageResponse> getReportEnergyUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportEnergyUsage",
      requestType = com.smartcity.energy_service.grpc.EnergyUsageRequest.class,
      responseType = com.smartcity.energy_service.grpc.EnergyUsageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcity.energy_service.grpc.EnergyUsageRequest,
      com.smartcity.energy_service.grpc.EnergyUsageResponse> getReportEnergyUsageMethod() {
    io.grpc.MethodDescriptor<com.smartcity.energy_service.grpc.EnergyUsageRequest, com.smartcity.energy_service.grpc.EnergyUsageResponse> getReportEnergyUsageMethod;
    if ((getReportEnergyUsageMethod = EnergyServiceGrpc.getReportEnergyUsageMethod) == null) {
      synchronized (EnergyServiceGrpc.class) {
        if ((getReportEnergyUsageMethod = EnergyServiceGrpc.getReportEnergyUsageMethod) == null) {
          EnergyServiceGrpc.getReportEnergyUsageMethod = getReportEnergyUsageMethod =
              io.grpc.MethodDescriptor.<com.smartcity.energy_service.grpc.EnergyUsageRequest, com.smartcity.energy_service.grpc.EnergyUsageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportEnergyUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.energy_service.grpc.EnergyUsageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.energy_service.grpc.EnergyUsageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnergyServiceMethodDescriptorSupplier("ReportEnergyUsage"))
              .build();
        }
      }
    }
    return getReportEnergyUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartcity.energy_service.grpc.EnergyStatusRequest,
      com.smartcity.energy_service.grpc.EnergyStatusResponse> getGetEnergyStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnergyStatus",
      requestType = com.smartcity.energy_service.grpc.EnergyStatusRequest.class,
      responseType = com.smartcity.energy_service.grpc.EnergyStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcity.energy_service.grpc.EnergyStatusRequest,
      com.smartcity.energy_service.grpc.EnergyStatusResponse> getGetEnergyStatusMethod() {
    io.grpc.MethodDescriptor<com.smartcity.energy_service.grpc.EnergyStatusRequest, com.smartcity.energy_service.grpc.EnergyStatusResponse> getGetEnergyStatusMethod;
    if ((getGetEnergyStatusMethod = EnergyServiceGrpc.getGetEnergyStatusMethod) == null) {
      synchronized (EnergyServiceGrpc.class) {
        if ((getGetEnergyStatusMethod = EnergyServiceGrpc.getGetEnergyStatusMethod) == null) {
          EnergyServiceGrpc.getGetEnergyStatusMethod = getGetEnergyStatusMethod =
              io.grpc.MethodDescriptor.<com.smartcity.energy_service.grpc.EnergyStatusRequest, com.smartcity.energy_service.grpc.EnergyStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnergyStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.energy_service.grpc.EnergyStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.energy_service.grpc.EnergyStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnergyServiceMethodDescriptorSupplier("GetEnergyStatus"))
              .build();
        }
      }
    }
    return getGetEnergyStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartcity.energy_service.grpc.OutageReportRequest,
      com.smartcity.energy_service.grpc.OutageResponse> getReportOutageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportOutage",
      requestType = com.smartcity.energy_service.grpc.OutageReportRequest.class,
      responseType = com.smartcity.energy_service.grpc.OutageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcity.energy_service.grpc.OutageReportRequest,
      com.smartcity.energy_service.grpc.OutageResponse> getReportOutageMethod() {
    io.grpc.MethodDescriptor<com.smartcity.energy_service.grpc.OutageReportRequest, com.smartcity.energy_service.grpc.OutageResponse> getReportOutageMethod;
    if ((getReportOutageMethod = EnergyServiceGrpc.getReportOutageMethod) == null) {
      synchronized (EnergyServiceGrpc.class) {
        if ((getReportOutageMethod = EnergyServiceGrpc.getReportOutageMethod) == null) {
          EnergyServiceGrpc.getReportOutageMethod = getReportOutageMethod =
              io.grpc.MethodDescriptor.<com.smartcity.energy_service.grpc.OutageReportRequest, com.smartcity.energy_service.grpc.OutageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportOutage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.energy_service.grpc.OutageReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.energy_service.grpc.OutageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnergyServiceMethodDescriptorSupplier("ReportOutage"))
              .build();
        }
      }
    }
    return getReportOutageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnergyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnergyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnergyServiceStub>() {
        @java.lang.Override
        public EnergyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnergyServiceStub(channel, callOptions);
        }
      };
    return EnergyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnergyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnergyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnergyServiceBlockingStub>() {
        @java.lang.Override
        public EnergyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnergyServiceBlockingStub(channel, callOptions);
        }
      };
    return EnergyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnergyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnergyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnergyServiceFutureStub>() {
        @java.lang.Override
        public EnergyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnergyServiceFutureStub(channel, callOptions);
        }
      };
    return EnergyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * gRPC service to handle energy monitoring
   * </pre>
   */
  public static abstract class EnergyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Reports energy usage from a device or region
     * </pre>
     */
    public void reportEnergyUsage(com.smartcity.energy_service.grpc.EnergyUsageRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.energy_service.grpc.EnergyUsageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportEnergyUsageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the current energy status of a region
     * </pre>
     */
    public void getEnergyStatus(com.smartcity.energy_service.grpc.EnergyStatusRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.energy_service.grpc.EnergyStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEnergyStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reports a power outage event
     * </pre>
     */
    public void reportOutage(com.smartcity.energy_service.grpc.OutageReportRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.energy_service.grpc.OutageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportOutageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReportEnergyUsageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartcity.energy_service.grpc.EnergyUsageRequest,
                com.smartcity.energy_service.grpc.EnergyUsageResponse>(
                  this, METHODID_REPORT_ENERGY_USAGE)))
          .addMethod(
            getGetEnergyStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartcity.energy_service.grpc.EnergyStatusRequest,
                com.smartcity.energy_service.grpc.EnergyStatusResponse>(
                  this, METHODID_GET_ENERGY_STATUS)))
          .addMethod(
            getReportOutageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartcity.energy_service.grpc.OutageReportRequest,
                com.smartcity.energy_service.grpc.OutageResponse>(
                  this, METHODID_REPORT_OUTAGE)))
          .build();
    }
  }

  /**
   * <pre>
   * gRPC service to handle energy monitoring
   * </pre>
   */
  public static final class EnergyServiceStub extends io.grpc.stub.AbstractAsyncStub<EnergyServiceStub> {
    private EnergyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnergyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnergyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reports energy usage from a device or region
     * </pre>
     */
    public void reportEnergyUsage(com.smartcity.energy_service.grpc.EnergyUsageRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.energy_service.grpc.EnergyUsageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportEnergyUsageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the current energy status of a region
     * </pre>
     */
    public void getEnergyStatus(com.smartcity.energy_service.grpc.EnergyStatusRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.energy_service.grpc.EnergyStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEnergyStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reports a power outage event
     * </pre>
     */
    public void reportOutage(com.smartcity.energy_service.grpc.OutageReportRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.energy_service.grpc.OutageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportOutageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * gRPC service to handle energy monitoring
   * </pre>
   */
  public static final class EnergyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EnergyServiceBlockingStub> {
    private EnergyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnergyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnergyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reports energy usage from a device or region
     * </pre>
     */
    public com.smartcity.energy_service.grpc.EnergyUsageResponse reportEnergyUsage(com.smartcity.energy_service.grpc.EnergyUsageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportEnergyUsageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the current energy status of a region
     * </pre>
     */
    public com.smartcity.energy_service.grpc.EnergyStatusResponse getEnergyStatus(com.smartcity.energy_service.grpc.EnergyStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEnergyStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reports a power outage event
     * </pre>
     */
    public com.smartcity.energy_service.grpc.OutageResponse reportOutage(com.smartcity.energy_service.grpc.OutageReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportOutageMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * gRPC service to handle energy monitoring
   * </pre>
   */
  public static final class EnergyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EnergyServiceFutureStub> {
    private EnergyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnergyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnergyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reports energy usage from a device or region
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcity.energy_service.grpc.EnergyUsageResponse> reportEnergyUsage(
        com.smartcity.energy_service.grpc.EnergyUsageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportEnergyUsageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the current energy status of a region
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcity.energy_service.grpc.EnergyStatusResponse> getEnergyStatus(
        com.smartcity.energy_service.grpc.EnergyStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEnergyStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reports a power outage event
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcity.energy_service.grpc.OutageResponse> reportOutage(
        com.smartcity.energy_service.grpc.OutageReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportOutageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REPORT_ENERGY_USAGE = 0;
  private static final int METHODID_GET_ENERGY_STATUS = 1;
  private static final int METHODID_REPORT_OUTAGE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EnergyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnergyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REPORT_ENERGY_USAGE:
          serviceImpl.reportEnergyUsage((com.smartcity.energy_service.grpc.EnergyUsageRequest) request,
              (io.grpc.stub.StreamObserver<com.smartcity.energy_service.grpc.EnergyUsageResponse>) responseObserver);
          break;
        case METHODID_GET_ENERGY_STATUS:
          serviceImpl.getEnergyStatus((com.smartcity.energy_service.grpc.EnergyStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.smartcity.energy_service.grpc.EnergyStatusResponse>) responseObserver);
          break;
        case METHODID_REPORT_OUTAGE:
          serviceImpl.reportOutage((com.smartcity.energy_service.grpc.OutageReportRequest) request,
              (io.grpc.stub.StreamObserver<com.smartcity.energy_service.grpc.OutageResponse>) responseObserver);
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

  private static abstract class EnergyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnergyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartcity.energy_service.grpc.EnergyProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnergyService");
    }
  }

  private static final class EnergyServiceFileDescriptorSupplier
      extends EnergyServiceBaseDescriptorSupplier {
    EnergyServiceFileDescriptorSupplier() {}
  }

  private static final class EnergyServiceMethodDescriptorSupplier
      extends EnergyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EnergyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EnergyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnergyServiceFileDescriptorSupplier())
              .addMethod(getReportEnergyUsageMethod())
              .addMethod(getGetEnergyStatusMethod())
              .addMethod(getReportOutageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
