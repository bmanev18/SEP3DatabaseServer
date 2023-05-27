package com.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: dataAccess.proto")
public final class UserStoryAccessGrpc {

  private UserStoryAccessGrpc() {}

  public static final String SERVICE_NAME = "UserStoryAccess";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.PointsUpdate,
      com.protobuf.DataAccess.Response> getUpdateUserStoryPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserStoryPoints",
      requestType = com.protobuf.DataAccess.PointsUpdate.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.PointsUpdate,
      com.protobuf.DataAccess.Response> getUpdateUserStoryPointsMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.PointsUpdate, com.protobuf.DataAccess.Response> getUpdateUserStoryPointsMethod;
    if ((getUpdateUserStoryPointsMethod = UserStoryAccessGrpc.getUpdateUserStoryPointsMethod) == null) {
      synchronized (UserStoryAccessGrpc.class) {
        if ((getUpdateUserStoryPointsMethod = UserStoryAccessGrpc.getUpdateUserStoryPointsMethod) == null) {
          UserStoryAccessGrpc.getUpdateUserStoryPointsMethod = getUpdateUserStoryPointsMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.PointsUpdate, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserStoryPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.PointsUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UserStoryAccessMethodDescriptorSupplier("UpdateUserStoryPoints"))
              .build();
        }
      }
    }
    return getUpdateUserStoryPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.StatusUpdate,
      com.protobuf.DataAccess.Response> getUpdateUserStoryStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserStoryStatus",
      requestType = com.protobuf.DataAccess.StatusUpdate.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.StatusUpdate,
      com.protobuf.DataAccess.Response> getUpdateUserStoryStatusMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.StatusUpdate, com.protobuf.DataAccess.Response> getUpdateUserStoryStatusMethod;
    if ((getUpdateUserStoryStatusMethod = UserStoryAccessGrpc.getUpdateUserStoryStatusMethod) == null) {
      synchronized (UserStoryAccessGrpc.class) {
        if ((getUpdateUserStoryStatusMethod = UserStoryAccessGrpc.getUpdateUserStoryStatusMethod) == null) {
          UserStoryAccessGrpc.getUpdateUserStoryStatusMethod = getUpdateUserStoryStatusMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.StatusUpdate, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserStoryStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.StatusUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UserStoryAccessMethodDescriptorSupplier("UpdateUserStoryStatus"))
              .build();
        }
      }
    }
    return getUpdateUserStoryStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.PriorityUpdate,
      com.protobuf.DataAccess.Response> getUpdateUserStoryPriorityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserStoryPriority",
      requestType = com.protobuf.DataAccess.PriorityUpdate.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.PriorityUpdate,
      com.protobuf.DataAccess.Response> getUpdateUserStoryPriorityMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.PriorityUpdate, com.protobuf.DataAccess.Response> getUpdateUserStoryPriorityMethod;
    if ((getUpdateUserStoryPriorityMethod = UserStoryAccessGrpc.getUpdateUserStoryPriorityMethod) == null) {
      synchronized (UserStoryAccessGrpc.class) {
        if ((getUpdateUserStoryPriorityMethod = UserStoryAccessGrpc.getUpdateUserStoryPriorityMethod) == null) {
          UserStoryAccessGrpc.getUpdateUserStoryPriorityMethod = getUpdateUserStoryPriorityMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.PriorityUpdate, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserStoryPriority"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.PriorityUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UserStoryAccessMethodDescriptorSupplier("UpdateUserStoryPriority"))
              .build();
        }
      }
    }
    return getUpdateUserStoryPriorityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.Response> getDeleteUserStoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUserStory",
      requestType = com.protobuf.DataAccess.Id.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.Response> getDeleteUserStoryMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.Response> getDeleteUserStoryMethod;
    if ((getDeleteUserStoryMethod = UserStoryAccessGrpc.getDeleteUserStoryMethod) == null) {
      synchronized (UserStoryAccessGrpc.class) {
        if ((getDeleteUserStoryMethod = UserStoryAccessGrpc.getDeleteUserStoryMethod) == null) {
          UserStoryAccessGrpc.getDeleteUserStoryMethod = getDeleteUserStoryMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUserStory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UserStoryAccessMethodDescriptorSupplier("DeleteUserStory"))
              .build();
        }
      }
    }
    return getDeleteUserStoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.TaskCreationRequest,
      com.protobuf.DataAccess.Response> getAddTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTask",
      requestType = com.protobuf.DataAccess.TaskCreationRequest.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.TaskCreationRequest,
      com.protobuf.DataAccess.Response> getAddTaskMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.TaskCreationRequest, com.protobuf.DataAccess.Response> getAddTaskMethod;
    if ((getAddTaskMethod = UserStoryAccessGrpc.getAddTaskMethod) == null) {
      synchronized (UserStoryAccessGrpc.class) {
        if ((getAddTaskMethod = UserStoryAccessGrpc.getAddTaskMethod) == null) {
          UserStoryAccessGrpc.getAddTaskMethod = getAddTaskMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.TaskCreationRequest, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.TaskCreationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UserStoryAccessMethodDescriptorSupplier("AddTask"))
              .build();
        }
      }
    }
    return getAddTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.TasksMessage> getGetTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTasks",
      requestType = com.protobuf.DataAccess.Id.class,
      responseType = com.protobuf.DataAccess.TasksMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.TasksMessage> getGetTasksMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.TasksMessage> getGetTasksMethod;
    if ((getGetTasksMethod = UserStoryAccessGrpc.getGetTasksMethod) == null) {
      synchronized (UserStoryAccessGrpc.class) {
        if ((getGetTasksMethod = UserStoryAccessGrpc.getGetTasksMethod) == null) {
          UserStoryAccessGrpc.getGetTasksMethod = getGetTasksMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.TasksMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.TasksMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UserStoryAccessMethodDescriptorSupplier("GetTasks"))
              .build();
        }
      }
    }
    return getGetTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.TaskMessage,
      com.protobuf.DataAccess.Response> getEditTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditTask",
      requestType = com.protobuf.DataAccess.TaskMessage.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.TaskMessage,
      com.protobuf.DataAccess.Response> getEditTaskMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.TaskMessage, com.protobuf.DataAccess.Response> getEditTaskMethod;
    if ((getEditTaskMethod = UserStoryAccessGrpc.getEditTaskMethod) == null) {
      synchronized (UserStoryAccessGrpc.class) {
        if ((getEditTaskMethod = UserStoryAccessGrpc.getEditTaskMethod) == null) {
          UserStoryAccessGrpc.getEditTaskMethod = getEditTaskMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.TaskMessage, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.TaskMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UserStoryAccessMethodDescriptorSupplier("EditTask"))
              .build();
        }
      }
    }
    return getEditTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.Response> getRemoveTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveTask",
      requestType = com.protobuf.DataAccess.Id.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.Response> getRemoveTaskMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.Response> getRemoveTaskMethod;
    if ((getRemoveTaskMethod = UserStoryAccessGrpc.getRemoveTaskMethod) == null) {
      synchronized (UserStoryAccessGrpc.class) {
        if ((getRemoveTaskMethod = UserStoryAccessGrpc.getRemoveTaskMethod) == null) {
          UserStoryAccessGrpc.getRemoveTaskMethod = getRemoveTaskMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UserStoryAccessMethodDescriptorSupplier("RemoveTask"))
              .build();
        }
      }
    }
    return getRemoveTaskMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStoryAccessStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserStoryAccessStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserStoryAccessStub>() {
        @java.lang.Override
        public UserStoryAccessStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserStoryAccessStub(channel, callOptions);
        }
      };
    return UserStoryAccessStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserStoryAccessBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserStoryAccessBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserStoryAccessBlockingStub>() {
        @java.lang.Override
        public UserStoryAccessBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserStoryAccessBlockingStub(channel, callOptions);
        }
      };
    return UserStoryAccessBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserStoryAccessFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserStoryAccessFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserStoryAccessFutureStub>() {
        @java.lang.Override
        public UserStoryAccessFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserStoryAccessFutureStub(channel, callOptions);
        }
      };
    return UserStoryAccessFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserStoryAccessImplBase implements io.grpc.BindableService {

    /**
     */
    public void updateUserStoryPoints(com.protobuf.DataAccess.PointsUpdate request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserStoryPointsMethod(), responseObserver);
    }

    /**
     */
    public void updateUserStoryStatus(com.protobuf.DataAccess.StatusUpdate request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserStoryStatusMethod(), responseObserver);
    }

    /**
     */
    public void updateUserStoryPriority(com.protobuf.DataAccess.PriorityUpdate request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserStoryPriorityMethod(), responseObserver);
    }

    /**
     */
    public void deleteUserStory(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserStoryMethod(), responseObserver);
    }

    /**
     */
    public void addTask(com.protobuf.DataAccess.TaskCreationRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTaskMethod(), responseObserver);
    }

    /**
     */
    public void getTasks(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.TasksMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTasksMethod(), responseObserver);
    }

    /**
     */
    public void editTask(com.protobuf.DataAccess.TaskMessage request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditTaskMethod(), responseObserver);
    }

    /**
     */
    public void removeTask(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveTaskMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateUserStoryPointsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.PointsUpdate,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_UPDATE_USER_STORY_POINTS)))
          .addMethod(
            getUpdateUserStoryStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.StatusUpdate,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_UPDATE_USER_STORY_STATUS)))
          .addMethod(
            getUpdateUserStoryPriorityMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.PriorityUpdate,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_UPDATE_USER_STORY_PRIORITY)))
          .addMethod(
            getDeleteUserStoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_DELETE_USER_STORY)))
          .addMethod(
            getAddTaskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.TaskCreationRequest,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_ADD_TASK)))
          .addMethod(
            getGetTasksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.TasksMessage>(
                  this, METHODID_GET_TASKS)))
          .addMethod(
            getEditTaskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.TaskMessage,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_EDIT_TASK)))
          .addMethod(
            getRemoveTaskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_REMOVE_TASK)))
          .build();
    }
  }

  /**
   */
  public static final class UserStoryAccessStub extends io.grpc.stub.AbstractAsyncStub<UserStoryAccessStub> {
    private UserStoryAccessStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStoryAccessStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserStoryAccessStub(channel, callOptions);
    }

    /**
     */
    public void updateUserStoryPoints(com.protobuf.DataAccess.PointsUpdate request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserStoryPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUserStoryStatus(com.protobuf.DataAccess.StatusUpdate request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserStoryStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUserStoryPriority(com.protobuf.DataAccess.PriorityUpdate request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserStoryPriorityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUserStory(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserStoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addTask(com.protobuf.DataAccess.TaskCreationRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTasks(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.TasksMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editTask(com.protobuf.DataAccess.TaskMessage request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeTask(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveTaskMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserStoryAccessBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserStoryAccessBlockingStub> {
    private UserStoryAccessBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStoryAccessBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserStoryAccessBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.protobuf.DataAccess.Response updateUserStoryPoints(com.protobuf.DataAccess.PointsUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserStoryPointsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response updateUserStoryStatus(com.protobuf.DataAccess.StatusUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserStoryStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response updateUserStoryPriority(com.protobuf.DataAccess.PriorityUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserStoryPriorityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response deleteUserStory(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserStoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response addTask(com.protobuf.DataAccess.TaskCreationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.TasksMessage getTasks(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTasksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response editTask(com.protobuf.DataAccess.TaskMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response removeTask(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveTaskMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserStoryAccessFutureStub extends io.grpc.stub.AbstractFutureStub<UserStoryAccessFutureStub> {
    private UserStoryAccessFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStoryAccessFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserStoryAccessFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> updateUserStoryPoints(
        com.protobuf.DataAccess.PointsUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserStoryPointsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> updateUserStoryStatus(
        com.protobuf.DataAccess.StatusUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserStoryStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> updateUserStoryPriority(
        com.protobuf.DataAccess.PriorityUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserStoryPriorityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> deleteUserStory(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserStoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> addTask(
        com.protobuf.DataAccess.TaskCreationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.TasksMessage> getTasks(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTasksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> editTask(
        com.protobuf.DataAccess.TaskMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> removeTask(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveTaskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_USER_STORY_POINTS = 0;
  private static final int METHODID_UPDATE_USER_STORY_STATUS = 1;
  private static final int METHODID_UPDATE_USER_STORY_PRIORITY = 2;
  private static final int METHODID_DELETE_USER_STORY = 3;
  private static final int METHODID_ADD_TASK = 4;
  private static final int METHODID_GET_TASKS = 5;
  private static final int METHODID_EDIT_TASK = 6;
  private static final int METHODID_REMOVE_TASK = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserStoryAccessImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserStoryAccessImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_USER_STORY_POINTS:
          serviceImpl.updateUserStoryPoints((com.protobuf.DataAccess.PointsUpdate) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_UPDATE_USER_STORY_STATUS:
          serviceImpl.updateUserStoryStatus((com.protobuf.DataAccess.StatusUpdate) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_UPDATE_USER_STORY_PRIORITY:
          serviceImpl.updateUserStoryPriority((com.protobuf.DataAccess.PriorityUpdate) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_DELETE_USER_STORY:
          serviceImpl.deleteUserStory((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_ADD_TASK:
          serviceImpl.addTask((com.protobuf.DataAccess.TaskCreationRequest) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_GET_TASKS:
          serviceImpl.getTasks((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.TasksMessage>) responseObserver);
          break;
        case METHODID_EDIT_TASK:
          serviceImpl.editTask((com.protobuf.DataAccess.TaskMessage) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_REMOVE_TASK:
          serviceImpl.removeTask((com.protobuf.DataAccess.Id) request,
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

  private static abstract class UserStoryAccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserStoryAccessBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.protobuf.DataAccess.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserStoryAccess");
    }
  }

  private static final class UserStoryAccessFileDescriptorSupplier
      extends UserStoryAccessBaseDescriptorSupplier {
    UserStoryAccessFileDescriptorSupplier() {}
  }

  private static final class UserStoryAccessMethodDescriptorSupplier
      extends UserStoryAccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserStoryAccessMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserStoryAccessGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserStoryAccessFileDescriptorSupplier())
              .addMethod(getUpdateUserStoryPointsMethod())
              .addMethod(getUpdateUserStoryStatusMethod())
              .addMethod(getUpdateUserStoryPriorityMethod())
              .addMethod(getDeleteUserStoryMethod())
              .addMethod(getAddTaskMethod())
              .addMethod(getGetTasksMethod())
              .addMethod(getEditTaskMethod())
              .addMethod(getRemoveTaskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
