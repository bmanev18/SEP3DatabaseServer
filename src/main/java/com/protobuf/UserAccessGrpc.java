package com.protobuf;

import java.sql.SQLException;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: dataAccess.proto")
public final class UserAccessGrpc {

  private UserAccessGrpc() {}

  public static final String SERVICE_NAME = "UserAccess";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserCreationDto,
      com.protobuf.DataAccess.UserCreationResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.protobuf.DataAccess.UserCreationDto.class,
      responseType = com.protobuf.DataAccess.UserCreationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserCreationDto,
      com.protobuf.DataAccess.UserCreationResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserCreationDto, com.protobuf.DataAccess.UserCreationResponse> getCreateUserMethod;
    if ((getCreateUserMethod = UserAccessGrpc.getCreateUserMethod) == null) {
      synchronized (UserAccessGrpc.class) {
        if ((getCreateUserMethod = UserAccessGrpc.getCreateUserMethod) == null) {
          UserAccessGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.UserCreationDto, com.protobuf.DataAccess.UserCreationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserCreationDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserCreationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAccessMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserAccessStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAccessStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAccessStub>() {
        @java.lang.Override
        public UserAccessStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAccessStub(channel, callOptions);
        }
      };
    return UserAccessStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserAccessBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAccessBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAccessBlockingStub>() {
        @java.lang.Override
        public UserAccessBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAccessBlockingStub(channel, callOptions);
        }
      };
    return UserAccessBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserAccessFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserAccessFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserAccessFutureStub>() {
        @java.lang.Override
        public UserAccessFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserAccessFutureStub(channel, callOptions);
        }
      };
    return UserAccessFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserAccessImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(com.protobuf.DataAccess.UserCreationDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserCreationResponse> responseObserver){
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.UserCreationDto,
                com.protobuf.DataAccess.UserCreationResponse>(
                  this, METHODID_CREATE_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserAccessStub extends io.grpc.stub.AbstractAsyncStub<UserAccessStub> {
    private UserAccessStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAccessStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAccessStub(channel, callOptions);
    }

    /**
     */
    public void createUser(com.protobuf.DataAccess.UserCreationDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserCreationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserAccessBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserAccessBlockingStub> {
    private UserAccessBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAccessBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAccessBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.protobuf.DataAccess.UserCreationResponse createUser(com.protobuf.DataAccess.UserCreationDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserAccessFutureStub extends io.grpc.stub.AbstractFutureStub<UserAccessFutureStub> {
    private UserAccessFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserAccessFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserAccessFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.UserCreationResponse> createUser(
        com.protobuf.DataAccess.UserCreationDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserAccessImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserAccessImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.protobuf.DataAccess.UserCreationDto) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserCreationResponse>) responseObserver);
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

  private static abstract class UserAccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserAccessBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.protobuf.DataAccess.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserAccess");
    }
  }

  private static final class UserAccessFileDescriptorSupplier
      extends UserAccessBaseDescriptorSupplier {
    UserAccessFileDescriptorSupplier() {}
  }

  private static final class UserAccessMethodDescriptorSupplier
      extends UserAccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserAccessMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserAccessGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserAccessFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
