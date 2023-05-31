package com.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: dataAccess.proto")
public final class SprintAccessGrpc {

  private SprintAccessGrpc() {}

  public static final String SERVICE_NAME = "SprintAccess";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.SprintMessage> getGetSprintByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSprintByID",
      requestType = com.protobuf.DataAccess.Id.class,
      responseType = com.protobuf.DataAccess.SprintMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.SprintMessage> getGetSprintByIDMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.SprintMessage> getGetSprintByIDMethod;
    if ((getGetSprintByIDMethod = SprintAccessGrpc.getGetSprintByIDMethod) == null) {
      synchronized (SprintAccessGrpc.class) {
        if ((getGetSprintByIDMethod = SprintAccessGrpc.getGetSprintByIDMethod) == null) {
          SprintAccessGrpc.getGetSprintByIDMethod = getGetSprintByIDMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.SprintMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSprintByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.SprintMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SprintAccessMethodDescriptorSupplier("GetSprintByID"))
              .build();
        }
      }
    }
    return getGetSprintByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.Response> getRemoveSprintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveSprint",
      requestType = com.protobuf.DataAccess.Id.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.Response> getRemoveSprintMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.Response> getRemoveSprintMethod;
    if ((getRemoveSprintMethod = SprintAccessGrpc.getRemoveSprintMethod) == null) {
      synchronized (SprintAccessGrpc.class) {
        if ((getRemoveSprintMethod = SprintAccessGrpc.getRemoveSprintMethod) == null) {
          SprintAccessGrpc.getRemoveSprintMethod = getRemoveSprintMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveSprint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new SprintAccessMethodDescriptorSupplier("RemoveSprint"))
              .build();
        }
      }
    }
    return getRemoveSprintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStorySprintRequest,
      com.protobuf.DataAccess.Response> getAddUserStoryToSprintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserStoryToSprint",
      requestType = com.protobuf.DataAccess.UserStorySprintRequest.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStorySprintRequest,
      com.protobuf.DataAccess.Response> getAddUserStoryToSprintMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStorySprintRequest, com.protobuf.DataAccess.Response> getAddUserStoryToSprintMethod;
    if ((getAddUserStoryToSprintMethod = SprintAccessGrpc.getAddUserStoryToSprintMethod) == null) {
      synchronized (SprintAccessGrpc.class) {
        if ((getAddUserStoryToSprintMethod = SprintAccessGrpc.getAddUserStoryToSprintMethod) == null) {
          SprintAccessGrpc.getAddUserStoryToSprintMethod = getAddUserStoryToSprintMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.UserStorySprintRequest, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserStoryToSprint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserStorySprintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new SprintAccessMethodDescriptorSupplier("AddUserStoryToSprint"))
              .build();
        }
      }
    }
    return getAddUserStoryToSprintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.UserStoriesResponse> getGetAllUserStoriesFromSprintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllUserStoriesFromSprint",
      requestType = com.protobuf.DataAccess.Id.class,
      responseType = com.protobuf.DataAccess.UserStoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.UserStoriesResponse> getGetAllUserStoriesFromSprintMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.UserStoriesResponse> getGetAllUserStoriesFromSprintMethod;
    if ((getGetAllUserStoriesFromSprintMethod = SprintAccessGrpc.getGetAllUserStoriesFromSprintMethod) == null) {
      synchronized (SprintAccessGrpc.class) {
        if ((getGetAllUserStoriesFromSprintMethod = SprintAccessGrpc.getGetAllUserStoriesFromSprintMethod) == null) {
          SprintAccessGrpc.getGetAllUserStoriesFromSprintMethod = getGetAllUserStoriesFromSprintMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.UserStoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllUserStoriesFromSprint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserStoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SprintAccessMethodDescriptorSupplier("GetAllUserStoriesFromSprint"))
              .build();
        }
      }
    }
    return getGetAllUserStoriesFromSprintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStorySprintRequest,
      com.protobuf.DataAccess.Response> getRemoveUserStoryFromSprintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserStoryFromSprint",
      requestType = com.protobuf.DataAccess.UserStorySprintRequest.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStorySprintRequest,
      com.protobuf.DataAccess.Response> getRemoveUserStoryFromSprintMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStorySprintRequest, com.protobuf.DataAccess.Response> getRemoveUserStoryFromSprintMethod;
    if ((getRemoveUserStoryFromSprintMethod = SprintAccessGrpc.getRemoveUserStoryFromSprintMethod) == null) {
      synchronized (SprintAccessGrpc.class) {
        if ((getRemoveUserStoryFromSprintMethod = SprintAccessGrpc.getRemoveUserStoryFromSprintMethod) == null) {
          SprintAccessGrpc.getRemoveUserStoryFromSprintMethod = getRemoveUserStoryFromSprintMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.UserStorySprintRequest, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserStoryFromSprint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserStorySprintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new SprintAccessMethodDescriptorSupplier("RemoveUserStoryFromSprint"))
              .build();
        }
      }
    }
    return getRemoveUserStoryFromSprintMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SprintAccessStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SprintAccessStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SprintAccessStub>() {
        @java.lang.Override
        public SprintAccessStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SprintAccessStub(channel, callOptions);
        }
      };
    return SprintAccessStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SprintAccessBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SprintAccessBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SprintAccessBlockingStub>() {
        @java.lang.Override
        public SprintAccessBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SprintAccessBlockingStub(channel, callOptions);
        }
      };
    return SprintAccessBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SprintAccessFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SprintAccessFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SprintAccessFutureStub>() {
        @java.lang.Override
        public SprintAccessFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SprintAccessFutureStub(channel, callOptions);
        }
      };
    return SprintAccessFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SprintAccessImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSprintByID(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.SprintMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSprintByIDMethod(), responseObserver);
    }

    /**
     */
    public void removeSprint(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveSprintMethod(), responseObserver);
    }

    /**
     */
    public void addUserStoryToSprint(com.protobuf.DataAccess.UserStorySprintRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserStoryToSprintMethod(), responseObserver);
    }

    /**
     */
    public void getAllUserStoriesFromSprint(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserStoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllUserStoriesFromSprintMethod(), responseObserver);
    }

    /**
     */
    public void removeUserStoryFromSprint(com.protobuf.DataAccess.UserStorySprintRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUserStoryFromSprintMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSprintByIDMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.SprintMessage>(
                  this, METHODID_GET_SPRINT_BY_ID)))
          .addMethod(
            getRemoveSprintMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_REMOVE_SPRINT)))
          .addMethod(
            getAddUserStoryToSprintMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.UserStorySprintRequest,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_ADD_USER_STORY_TO_SPRINT)))
          .addMethod(
            getGetAllUserStoriesFromSprintMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.UserStoriesResponse>(
                  this, METHODID_GET_ALL_USER_STORIES_FROM_SPRINT)))
          .addMethod(
            getRemoveUserStoryFromSprintMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.UserStorySprintRequest,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_REMOVE_USER_STORY_FROM_SPRINT)))
          .build();
    }
  }

  /**
   */
  public static final class SprintAccessStub extends io.grpc.stub.AbstractAsyncStub<SprintAccessStub> {
    private SprintAccessStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SprintAccessStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SprintAccessStub(channel, callOptions);
    }

    /**
     */
    public void getSprintByID(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.SprintMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSprintByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeSprint(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveSprintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUserStoryToSprint(com.protobuf.DataAccess.UserStorySprintRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserStoryToSprintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUserStoriesFromSprint(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserStoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllUserStoriesFromSprintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUserStoryFromSprint(com.protobuf.DataAccess.UserStorySprintRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUserStoryFromSprintMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SprintAccessBlockingStub extends io.grpc.stub.AbstractBlockingStub<SprintAccessBlockingStub> {
    private SprintAccessBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SprintAccessBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SprintAccessBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.protobuf.DataAccess.SprintMessage getSprintByID(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSprintByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response removeSprint(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveSprintMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response addUserStoryToSprint(com.protobuf.DataAccess.UserStorySprintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserStoryToSprintMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.UserStoriesResponse getAllUserStoriesFromSprint(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllUserStoriesFromSprintMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response removeUserStoryFromSprint(com.protobuf.DataAccess.UserStorySprintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserStoryFromSprintMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SprintAccessFutureStub extends io.grpc.stub.AbstractFutureStub<SprintAccessFutureStub> {
    private SprintAccessFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SprintAccessFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SprintAccessFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.SprintMessage> getSprintByID(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSprintByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> removeSprint(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveSprintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> addUserStoryToSprint(
        com.protobuf.DataAccess.UserStorySprintRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserStoryToSprintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.UserStoriesResponse> getAllUserStoriesFromSprint(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllUserStoriesFromSprintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> removeUserStoryFromSprint(
        com.protobuf.DataAccess.UserStorySprintRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUserStoryFromSprintMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SPRINT_BY_ID = 0;
  private static final int METHODID_REMOVE_SPRINT = 1;
  private static final int METHODID_ADD_USER_STORY_TO_SPRINT = 2;
  private static final int METHODID_GET_ALL_USER_STORIES_FROM_SPRINT = 3;
  private static final int METHODID_REMOVE_USER_STORY_FROM_SPRINT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SprintAccessImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SprintAccessImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SPRINT_BY_ID:
          serviceImpl.getSprintByID((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.SprintMessage>) responseObserver);
          break;
        case METHODID_REMOVE_SPRINT:
          serviceImpl.removeSprint((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_ADD_USER_STORY_TO_SPRINT:
          serviceImpl.addUserStoryToSprint((com.protobuf.DataAccess.UserStorySprintRequest) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_GET_ALL_USER_STORIES_FROM_SPRINT:
          serviceImpl.getAllUserStoriesFromSprint((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserStoriesResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_STORY_FROM_SPRINT:
          serviceImpl.removeUserStoryFromSprint((com.protobuf.DataAccess.UserStorySprintRequest) request,
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

  private static abstract class SprintAccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SprintAccessBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.protobuf.DataAccess.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SprintAccess");
    }
  }

  private static final class SprintAccessFileDescriptorSupplier
      extends SprintAccessBaseDescriptorSupplier {
    SprintAccessFileDescriptorSupplier() {}
  }

  private static final class SprintAccessMethodDescriptorSupplier
      extends SprintAccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SprintAccessMethodDescriptorSupplier(String methodName) {
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
      synchronized (SprintAccessGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SprintAccessFileDescriptorSupplier())
              .addMethod(getGetSprintByIDMethod())
              .addMethod(getRemoveSprintMethod())
              .addMethod(getAddUserStoryToSprintMethod())
              .addMethod(getGetAllUserStoriesFromSprintMethod())
              .addMethod(getRemoveUserStoryFromSprintMethod())
              .build();
        }
      }
    }
    return result;
  }
}
