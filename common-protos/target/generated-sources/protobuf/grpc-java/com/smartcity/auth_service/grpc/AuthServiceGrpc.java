package com.smartcity.auth_service.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to handle authentication
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final String SERVICE_NAME = "auth_service.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smartcity.auth_service.grpc.RegisterRequest,
      com.smartcity.auth_service.grpc.AuthResponse> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = com.smartcity.auth_service.grpc.RegisterRequest.class,
      responseType = com.smartcity.auth_service.grpc.AuthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcity.auth_service.grpc.RegisterRequest,
      com.smartcity.auth_service.grpc.AuthResponse> getRegisterMethod() {
    io.grpc.MethodDescriptor<com.smartcity.auth_service.grpc.RegisterRequest, com.smartcity.auth_service.grpc.AuthResponse> getRegisterMethod;
    if ((getRegisterMethod = AuthServiceGrpc.getRegisterMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getRegisterMethod = AuthServiceGrpc.getRegisterMethod) == null) {
          AuthServiceGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<com.smartcity.auth_service.grpc.RegisterRequest, com.smartcity.auth_service.grpc.AuthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.auth_service.grpc.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.auth_service.grpc.AuthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartcity.auth_service.grpc.LoginRequest,
      com.smartcity.auth_service.grpc.AuthResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = com.smartcity.auth_service.grpc.LoginRequest.class,
      responseType = com.smartcity.auth_service.grpc.AuthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcity.auth_service.grpc.LoginRequest,
      com.smartcity.auth_service.grpc.AuthResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.smartcity.auth_service.grpc.LoginRequest, com.smartcity.auth_service.grpc.AuthResponse> getLoginMethod;
    if ((getLoginMethod = AuthServiceGrpc.getLoginMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getLoginMethod = AuthServiceGrpc.getLoginMethod) == null) {
          AuthServiceGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<com.smartcity.auth_service.grpc.LoginRequest, com.smartcity.auth_service.grpc.AuthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.auth_service.grpc.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.auth_service.grpc.AuthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("Login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smartcity.auth_service.grpc.ValidateTokenRequest,
      com.smartcity.auth_service.grpc.ValidateTokenResponse> getValidateTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateToken",
      requestType = com.smartcity.auth_service.grpc.ValidateTokenRequest.class,
      responseType = com.smartcity.auth_service.grpc.ValidateTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smartcity.auth_service.grpc.ValidateTokenRequest,
      com.smartcity.auth_service.grpc.ValidateTokenResponse> getValidateTokenMethod() {
    io.grpc.MethodDescriptor<com.smartcity.auth_service.grpc.ValidateTokenRequest, com.smartcity.auth_service.grpc.ValidateTokenResponse> getValidateTokenMethod;
    if ((getValidateTokenMethod = AuthServiceGrpc.getValidateTokenMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getValidateTokenMethod = AuthServiceGrpc.getValidateTokenMethod) == null) {
          AuthServiceGrpc.getValidateTokenMethod = getValidateTokenMethod =
              io.grpc.MethodDescriptor.<com.smartcity.auth_service.grpc.ValidateTokenRequest, com.smartcity.auth_service.grpc.ValidateTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.auth_service.grpc.ValidateTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smartcity.auth_service.grpc.ValidateTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ValidateToken"))
              .build();
        }
      }
    }
    return getValidateTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to handle authentication
   * </pre>
   */
  public static abstract class AuthServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(com.smartcity.auth_service.grpc.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.auth_service.grpc.AuthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void login(com.smartcity.auth_service.grpc.LoginRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.auth_service.grpc.AuthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void validateToken(com.smartcity.auth_service.grpc.ValidateTokenRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.auth_service.grpc.ValidateTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartcity.auth_service.grpc.RegisterRequest,
                com.smartcity.auth_service.grpc.AuthResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartcity.auth_service.grpc.LoginRequest,
                com.smartcity.auth_service.grpc.AuthResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getValidateTokenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smartcity.auth_service.grpc.ValidateTokenRequest,
                com.smartcity.auth_service.grpc.ValidateTokenResponse>(
                  this, METHODID_VALIDATE_TOKEN)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to handle authentication
   * </pre>
   */
  public static final class AuthServiceStub extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void register(com.smartcity.auth_service.grpc.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.auth_service.grpc.AuthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(com.smartcity.auth_service.grpc.LoginRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.auth_service.grpc.AuthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateToken(com.smartcity.auth_service.grpc.ValidateTokenRequest request,
        io.grpc.stub.StreamObserver<com.smartcity.auth_service.grpc.ValidateTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to handle authentication
   * </pre>
   */
  public static final class AuthServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.smartcity.auth_service.grpc.AuthResponse register(com.smartcity.auth_service.grpc.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartcity.auth_service.grpc.AuthResponse login(com.smartcity.auth_service.grpc.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smartcity.auth_service.grpc.ValidateTokenResponse validateToken(com.smartcity.auth_service.grpc.ValidateTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to handle authentication
   * </pre>
   */
  public static final class AuthServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcity.auth_service.grpc.AuthResponse> register(
        com.smartcity.auth_service.grpc.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcity.auth_service.grpc.AuthResponse> login(
        com.smartcity.auth_service.grpc.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smartcity.auth_service.grpc.ValidateTokenResponse> validateToken(
        com.smartcity.auth_service.grpc.ValidateTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_VALIDATE_TOKEN = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((com.smartcity.auth_service.grpc.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<com.smartcity.auth_service.grpc.AuthResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((com.smartcity.auth_service.grpc.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.smartcity.auth_service.grpc.AuthResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_TOKEN:
          serviceImpl.validateToken((com.smartcity.auth_service.grpc.ValidateTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.smartcity.auth_service.grpc.ValidateTokenResponse>) responseObserver);
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

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smartcity.auth_service.grpc.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getLoginMethod())
              .addMethod(getValidateTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
