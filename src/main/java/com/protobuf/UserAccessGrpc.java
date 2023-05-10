package com.protobuf;

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
      com.protobuf.DataAccess.Response> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.protobuf.DataAccess.UserCreationDto.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserCreationDto,
      com.protobuf.DataAccess.Response> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserCreationDto, com.protobuf.DataAccess.Response> getCreateUserMethod;
    if ((getCreateUserMethod = UserAccessGrpc.getCreateUserMethod) == null) {
      synchronized (UserAccessGrpc.class) {
        if ((getCreateUserMethod = UserAccessGrpc.getCreateUserMethod) == null) {
          UserAccessGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.UserCreationDto, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserCreationDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UserAccessMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Role,
      com.protobuf.DataAccess.FilteredUsersResponse> getUsersByRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UsersByRole",
      requestType = com.protobuf.DataAccess.Role.class,
      responseType = com.protobuf.DataAccess.FilteredUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Role,
      com.protobuf.DataAccess.FilteredUsersResponse> getUsersByRoleMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Role, com.protobuf.DataAccess.FilteredUsersResponse> getUsersByRoleMethod;
    if ((getUsersByRoleMethod = UserAccessGrpc.getUsersByRoleMethod) == null) {
      synchronized (UserAccessGrpc.class) {
        if ((getUsersByRoleMethod = UserAccessGrpc.getUsersByRoleMethod) == null) {
          UserAccessGrpc.getUsersByRoleMethod = getUsersByRoleMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Role, com.protobuf.DataAccess.FilteredUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UsersByRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Role.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.FilteredUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAccessMethodDescriptorSupplier("UsersByRole"))
              .build();
        }
      }
    }
    return getUsersByRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username,
      com.protobuf.DataAccess.UserCreationDto> getUserByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserByUsername",
      requestType = com.protobuf.DataAccess.Username.class,
      responseType = com.protobuf.DataAccess.UserCreationDto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username,
      com.protobuf.DataAccess.UserCreationDto> getUserByUsernameMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username, com.protobuf.DataAccess.UserCreationDto> getUserByUsernameMethod;
    if ((getUserByUsernameMethod = UserAccessGrpc.getUserByUsernameMethod) == null) {
      synchronized (UserAccessGrpc.class) {
        if ((getUserByUsernameMethod = UserAccessGrpc.getUserByUsernameMethod) == null) {
          UserAccessGrpc.getUserByUsernameMethod = getUserByUsernameMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Username, com.protobuf.DataAccess.UserCreationDto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Username.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserCreationDto.getDefaultInstance()))
              .setSchemaDescriptor(new UserAccessMethodDescriptorSupplier("UserByUsername"))
              .build();
        }
      }
    }
    return getUserByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserCreationDto,
      com.protobuf.DataAccess.UpdatedUserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.protobuf.DataAccess.UserCreationDto.class,
      responseType = com.protobuf.DataAccess.UpdatedUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserCreationDto,
      com.protobuf.DataAccess.UpdatedUserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserCreationDto, com.protobuf.DataAccess.UpdatedUserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserAccessGrpc.getUpdateUserMethod) == null) {
      synchronized (UserAccessGrpc.class) {
        if ((getUpdateUserMethod = UserAccessGrpc.getUpdateUserMethod) == null) {
          UserAccessGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.UserCreationDto, com.protobuf.DataAccess.UpdatedUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserCreationDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UpdatedUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAccessMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username,
      com.protobuf.DataAccess.Response> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = com.protobuf.DataAccess.Username.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username,
      com.protobuf.DataAccess.Response> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username, com.protobuf.DataAccess.Response> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserAccessGrpc.getDeleteUserMethod) == null) {
      synchronized (UserAccessGrpc.class) {
        if ((getDeleteUserMethod = UserAccessGrpc.getDeleteUserMethod) == null) {
          UserAccessGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Username, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Username.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UserAccessMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username,
      com.protobuf.DataAccess.Password> getGetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPassword",
      requestType = com.protobuf.DataAccess.Username.class,
      responseType = com.protobuf.DataAccess.Password.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username,
      com.protobuf.DataAccess.Password> getGetPasswordMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username, com.protobuf.DataAccess.Password> getGetPasswordMethod;
    if ((getGetPasswordMethod = UserAccessGrpc.getGetPasswordMethod) == null) {
      synchronized (UserAccessGrpc.class) {
        if ((getGetPasswordMethod = UserAccessGrpc.getGetPasswordMethod) == null) {
          UserAccessGrpc.getGetPasswordMethod = getGetPasswordMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Username, com.protobuf.DataAccess.Password>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Username.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Password.getDefaultInstance()))
              .setSchemaDescriptor(new UserAccessMethodDescriptorSupplier("GetPassword"))
              .build();
        }
      }
    }
    return getGetPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username,
      com.protobuf.DataAccess.FilteredUsersResponse> getLookForUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LookForUsers",
      requestType = com.protobuf.DataAccess.Username.class,
      responseType = com.protobuf.DataAccess.FilteredUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username,
      com.protobuf.DataAccess.FilteredUsersResponse> getLookForUsersMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username, com.protobuf.DataAccess.FilteredUsersResponse> getLookForUsersMethod;
    if ((getLookForUsersMethod = UserAccessGrpc.getLookForUsersMethod) == null) {
      synchronized (UserAccessGrpc.class) {
        if ((getLookForUsersMethod = UserAccessGrpc.getLookForUsersMethod) == null) {
          UserAccessGrpc.getLookForUsersMethod = getLookForUsersMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Username, com.protobuf.DataAccess.FilteredUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LookForUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Username.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.FilteredUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAccessMethodDescriptorSupplier("LookForUsers"))
              .build();
        }
      }
    }
    return getLookForUsersMethod;
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
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void usersByRole(com.protobuf.DataAccess.Role request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.FilteredUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUsersByRoleMethod(), responseObserver);
    }

    /**
     */
    public void userByUsername(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserCreationDto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserByUsernameMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(com.protobuf.DataAccess.UserCreationDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UpdatedUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void getPassword(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Password> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPasswordMethod(), responseObserver);
    }

    /**
     */
    public void lookForUsers(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.FilteredUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLookForUsersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.UserCreationDto,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getUsersByRoleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Role,
                com.protobuf.DataAccess.FilteredUsersResponse>(
                  this, METHODID_USERS_BY_ROLE)))
          .addMethod(
            getUserByUsernameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Username,
                com.protobuf.DataAccess.UserCreationDto>(
                  this, METHODID_USER_BY_USERNAME)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.UserCreationDto,
                com.protobuf.DataAccess.UpdatedUserResponse>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Username,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getGetPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Username,
                com.protobuf.DataAccess.Password>(
                  this, METHODID_GET_PASSWORD)))
          .addMethod(
            getLookForUsersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Username,
                com.protobuf.DataAccess.FilteredUsersResponse>(
                  this, METHODID_LOOK_FOR_USERS)))
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
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void usersByRole(com.protobuf.DataAccess.Role request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.FilteredUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUsersByRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userByUsername(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserCreationDto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.protobuf.DataAccess.UserCreationDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UpdatedUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPassword(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Password> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lookForUsers(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.FilteredUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLookForUsersMethod(), getCallOptions()), request, responseObserver);
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
    public com.protobuf.DataAccess.Response createUser(com.protobuf.DataAccess.UserCreationDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.FilteredUsersResponse usersByRole(com.protobuf.DataAccess.Role request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUsersByRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.UserCreationDto userByUsername(com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.UpdatedUserResponse updateUser(com.protobuf.DataAccess.UserCreationDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response deleteUser(com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Password getPassword(com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.FilteredUsersResponse lookForUsers(com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLookForUsersMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> createUser(
        com.protobuf.DataAccess.UserCreationDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.FilteredUsersResponse> usersByRole(
        com.protobuf.DataAccess.Role request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUsersByRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.UserCreationDto> userByUsername(
        com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserByUsernameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.UpdatedUserResponse> updateUser(
        com.protobuf.DataAccess.UserCreationDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> deleteUser(
        com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Password> getPassword(
        com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.FilteredUsersResponse> lookForUsers(
        com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLookForUsersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_USERS_BY_ROLE = 1;
  private static final int METHODID_USER_BY_USERNAME = 2;
  private static final int METHODID_UPDATE_USER = 3;
  private static final int METHODID_DELETE_USER = 4;
  private static final int METHODID_GET_PASSWORD = 5;
  private static final int METHODID_LOOK_FOR_USERS = 6;

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
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_USERS_BY_ROLE:
          serviceImpl.usersByRole((com.protobuf.DataAccess.Role) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.FilteredUsersResponse>) responseObserver);
          break;
        case METHODID_USER_BY_USERNAME:
          serviceImpl.userByUsername((com.protobuf.DataAccess.Username) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserCreationDto>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.protobuf.DataAccess.UserCreationDto) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UpdatedUserResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.protobuf.DataAccess.Username) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_GET_PASSWORD:
          serviceImpl.getPassword((com.protobuf.DataAccess.Username) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Password>) responseObserver);
          break;
        case METHODID_LOOK_FOR_USERS:
          serviceImpl.lookForUsers((com.protobuf.DataAccess.Username) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.FilteredUsersResponse>) responseObserver);
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
              .addMethod(getUsersByRoleMethod())
              .addMethod(getUserByUsernameMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getGetPasswordMethod())
              .addMethod(getLookForUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
