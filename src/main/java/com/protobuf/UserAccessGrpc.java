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
  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserMessage,
      com.protobuf.DataAccess.Response> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.protobuf.DataAccess.UserMessage.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserMessage,
      com.protobuf.DataAccess.Response> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserMessage, com.protobuf.DataAccess.Response> getCreateUserMethod;
    if ((getCreateUserMethod = UserAccessGrpc.getCreateUserMethod) == null) {
      synchronized (UserAccessGrpc.class) {
        if ((getCreateUserMethod = UserAccessGrpc.getCreateUserMethod) == null) {
          UserAccessGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.UserMessage, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UserAccessMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username,
      com.protobuf.DataAccess.UserMessage> getUserByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserByUsername",
      requestType = com.protobuf.DataAccess.Username.class,
      responseType = com.protobuf.DataAccess.UserMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username,
      com.protobuf.DataAccess.UserMessage> getUserByUsernameMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username, com.protobuf.DataAccess.UserMessage> getUserByUsernameMethod;
    if ((getUserByUsernameMethod = UserAccessGrpc.getUserByUsernameMethod) == null) {
      synchronized (UserAccessGrpc.class) {
        if ((getUserByUsernameMethod = UserAccessGrpc.getUserByUsernameMethod) == null) {
          UserAccessGrpc.getUserByUsernameMethod = getUserByUsernameMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Username, com.protobuf.DataAccess.UserMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Username.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UserAccessMethodDescriptorSupplier("UserByUsername"))
              .build();
        }
      }
    }
    return getUserByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username,
      com.protobuf.DataAccess.ProjectsResponse> getGetAllProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllProjects",
      requestType = com.protobuf.DataAccess.Username.class,
      responseType = com.protobuf.DataAccess.ProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username,
      com.protobuf.DataAccess.ProjectsResponse> getGetAllProjectsMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username, com.protobuf.DataAccess.ProjectsResponse> getGetAllProjectsMethod;
    if ((getGetAllProjectsMethod = UserAccessGrpc.getGetAllProjectsMethod) == null) {
      synchronized (UserAccessGrpc.class) {
        if ((getGetAllProjectsMethod = UserAccessGrpc.getGetAllProjectsMethod) == null) {
          UserAccessGrpc.getGetAllProjectsMethod = getGetAllProjectsMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Username, com.protobuf.DataAccess.ProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Username.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.ProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAccessMethodDescriptorSupplier("GetAllProjects"))
              .build();
        }
      }
    }
    return getGetAllProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username,
      com.protobuf.DataAccess.UsersResponse> getLookForUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LookForUsers",
      requestType = com.protobuf.DataAccess.Username.class,
      responseType = com.protobuf.DataAccess.UsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username,
      com.protobuf.DataAccess.UsersResponse> getLookForUsersMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Username, com.protobuf.DataAccess.UsersResponse> getLookForUsersMethod;
    if ((getLookForUsersMethod = UserAccessGrpc.getLookForUsersMethod) == null) {
      synchronized (UserAccessGrpc.class) {
        if ((getLookForUsersMethod = UserAccessGrpc.getLookForUsersMethod) == null) {
          UserAccessGrpc.getLookForUsersMethod = getLookForUsersMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Username, com.protobuf.DataAccess.UsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LookForUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Username.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserAccessMethodDescriptorSupplier("LookForUsers"))
              .build();
        }
      }
    }
    return getLookForUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserMessage,
      com.protobuf.DataAccess.Response> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.protobuf.DataAccess.UserMessage.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserMessage,
      com.protobuf.DataAccess.Response> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserMessage, com.protobuf.DataAccess.Response> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserAccessGrpc.getUpdateUserMethod) == null) {
      synchronized (UserAccessGrpc.class) {
        if ((getUpdateUserMethod = UserAccessGrpc.getUpdateUserMethod) == null) {
          UserAccessGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.UserMessage, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
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
    public void createUser(com.protobuf.DataAccess.UserMessage request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void userByUsername(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserByUsernameMethod(), responseObserver);
    }

    /**
     */
    public void getAllProjects(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ProjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllProjectsMethod(), responseObserver);
    }

    /**
     */
    public void lookForUsers(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLookForUsersMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(com.protobuf.DataAccess.UserMessage request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.UserMessage,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getUserByUsernameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Username,
                com.protobuf.DataAccess.UserMessage>(
                  this, METHODID_USER_BY_USERNAME)))
          .addMethod(
            getGetAllProjectsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Username,
                com.protobuf.DataAccess.ProjectsResponse>(
                  this, METHODID_GET_ALL_PROJECTS)))
          .addMethod(
            getLookForUsersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Username,
                com.protobuf.DataAccess.UsersResponse>(
                  this, METHODID_LOOK_FOR_USERS)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.UserMessage,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Username,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_DELETE_USER)))
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
    public void createUser(com.protobuf.DataAccess.UserMessage request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userByUsername(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllProjects(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ProjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lookForUsers(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLookForUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.protobuf.DataAccess.UserMessage request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
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
    public com.protobuf.DataAccess.Response createUser(com.protobuf.DataAccess.UserMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.UserMessage userByUsername(com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.ProjectsResponse getAllProjects(com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllProjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.UsersResponse lookForUsers(com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLookForUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response updateUser(com.protobuf.DataAccess.UserMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response deleteUser(com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
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
        com.protobuf.DataAccess.UserMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.UserMessage> userByUsername(
        com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserByUsernameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.ProjectsResponse> getAllProjects(
        com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllProjectsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.UsersResponse> lookForUsers(
        com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLookForUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> updateUser(
        com.protobuf.DataAccess.UserMessage request) {
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
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_USER_BY_USERNAME = 1;
  private static final int METHODID_GET_ALL_PROJECTS = 2;
  private static final int METHODID_LOOK_FOR_USERS = 3;
  private static final int METHODID_UPDATE_USER = 4;
  private static final int METHODID_DELETE_USER = 5;

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
          serviceImpl.createUser((com.protobuf.DataAccess.UserMessage) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_USER_BY_USERNAME:
          serviceImpl.userByUsername((com.protobuf.DataAccess.Username) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserMessage>) responseObserver);
          break;
        case METHODID_GET_ALL_PROJECTS:
          serviceImpl.getAllProjects((com.protobuf.DataAccess.Username) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ProjectsResponse>) responseObserver);
          break;
        case METHODID_LOOK_FOR_USERS:
          serviceImpl.lookForUsers((com.protobuf.DataAccess.Username) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UsersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.protobuf.DataAccess.UserMessage) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.protobuf.DataAccess.Username) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
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
              .addMethod(getUserByUsernameMethod())
              .addMethod(getGetAllProjectsMethod())
              .addMethod(getLookForUsersMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
