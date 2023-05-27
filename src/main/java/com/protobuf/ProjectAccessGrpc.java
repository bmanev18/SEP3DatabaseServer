package com.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: dataAccess.proto")
public final class ProjectAccessGrpc {

  private ProjectAccessGrpc() {}

  public static final String SERVICE_NAME = "ProjectAccess";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.ProjectCreationRequest,
      com.protobuf.DataAccess.Response> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProject",
      requestType = com.protobuf.DataAccess.ProjectCreationRequest.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.ProjectCreationRequest,
      com.protobuf.DataAccess.Response> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.ProjectCreationRequest, com.protobuf.DataAccess.Response> getCreateProjectMethod;
    if ((getCreateProjectMethod = ProjectAccessGrpc.getCreateProjectMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getCreateProjectMethod = ProjectAccessGrpc.getCreateProjectMethod) == null) {
          ProjectAccessGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.ProjectCreationRequest, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.ProjectCreationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("CreateProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserProjectRequest,
      com.protobuf.DataAccess.Response> getAddCollaboratorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddCollaborator",
      requestType = com.protobuf.DataAccess.UserProjectRequest.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserProjectRequest,
      com.protobuf.DataAccess.Response> getAddCollaboratorMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserProjectRequest, com.protobuf.DataAccess.Response> getAddCollaboratorMethod;
    if ((getAddCollaboratorMethod = ProjectAccessGrpc.getAddCollaboratorMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getAddCollaboratorMethod = ProjectAccessGrpc.getAddCollaboratorMethod) == null) {
          ProjectAccessGrpc.getAddCollaboratorMethod = getAddCollaboratorMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.UserProjectRequest, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddCollaborator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("AddCollaborator"))
              .build();
        }
      }
    }
    return getAddCollaboratorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.UsersResponse> getGetAllCollaboratorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllCollaborators",
      requestType = com.protobuf.DataAccess.Id.class,
      responseType = com.protobuf.DataAccess.UsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.UsersResponse> getGetAllCollaboratorsMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.UsersResponse> getGetAllCollaboratorsMethod;
    if ((getGetAllCollaboratorsMethod = ProjectAccessGrpc.getGetAllCollaboratorsMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getGetAllCollaboratorsMethod = ProjectAccessGrpc.getGetAllCollaboratorsMethod) == null) {
          ProjectAccessGrpc.getGetAllCollaboratorsMethod = getGetAllCollaboratorsMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.UsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllCollaborators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("GetAllCollaborators"))
              .build();
        }
      }
    }
    return getGetAllCollaboratorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserProjectRequest,
      com.protobuf.DataAccess.Response> getRemoveCollaboratorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveCollaborator",
      requestType = com.protobuf.DataAccess.UserProjectRequest.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserProjectRequest,
      com.protobuf.DataAccess.Response> getRemoveCollaboratorMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserProjectRequest, com.protobuf.DataAccess.Response> getRemoveCollaboratorMethod;
    if ((getRemoveCollaboratorMethod = ProjectAccessGrpc.getRemoveCollaboratorMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getRemoveCollaboratorMethod = ProjectAccessGrpc.getRemoveCollaboratorMethod) == null) {
          ProjectAccessGrpc.getRemoveCollaboratorMethod = getRemoveCollaboratorMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.UserProjectRequest, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveCollaborator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("RemoveCollaborator"))
              .build();
        }
      }
    }
    return getRemoveCollaboratorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStoryCreationRequest,
      com.protobuf.DataAccess.Response> getAddUserStoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserStory",
      requestType = com.protobuf.DataAccess.UserStoryCreationRequest.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStoryCreationRequest,
      com.protobuf.DataAccess.Response> getAddUserStoryMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStoryCreationRequest, com.protobuf.DataAccess.Response> getAddUserStoryMethod;
    if ((getAddUserStoryMethod = ProjectAccessGrpc.getAddUserStoryMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getAddUserStoryMethod = ProjectAccessGrpc.getAddUserStoryMethod) == null) {
          ProjectAccessGrpc.getAddUserStoryMethod = getAddUserStoryMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.UserStoryCreationRequest, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserStory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserStoryCreationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("AddUserStory"))
              .build();
        }
      }
    }
    return getAddUserStoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.UserStoriesResponse> getGetUserStoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserStories",
      requestType = com.protobuf.DataAccess.Id.class,
      responseType = com.protobuf.DataAccess.UserStoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.UserStoriesResponse> getGetUserStoriesMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.UserStoriesResponse> getGetUserStoriesMethod;
    if ((getGetUserStoriesMethod = ProjectAccessGrpc.getGetUserStoriesMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getGetUserStoriesMethod = ProjectAccessGrpc.getGetUserStoriesMethod) == null) {
          ProjectAccessGrpc.getGetUserStoriesMethod = getGetUserStoriesMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.UserStoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserStories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserStoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("GetUserStories"))
              .build();
        }
      }
    }
    return getGetUserStoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.SprintCreationRequest,
      com.protobuf.DataAccess.Response> getCreateSprintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSprint",
      requestType = com.protobuf.DataAccess.SprintCreationRequest.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.SprintCreationRequest,
      com.protobuf.DataAccess.Response> getCreateSprintMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.SprintCreationRequest, com.protobuf.DataAccess.Response> getCreateSprintMethod;
    if ((getCreateSprintMethod = ProjectAccessGrpc.getCreateSprintMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getCreateSprintMethod = ProjectAccessGrpc.getCreateSprintMethod) == null) {
          ProjectAccessGrpc.getCreateSprintMethod = getCreateSprintMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.SprintCreationRequest, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSprint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.SprintCreationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("CreateSprint"))
              .build();
        }
      }
    }
    return getCreateSprintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.AllSprintsMessage> getGetSprintByProjectIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSprintByProjectId",
      requestType = com.protobuf.DataAccess.Id.class,
      responseType = com.protobuf.DataAccess.AllSprintsMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.AllSprintsMessage> getGetSprintByProjectIdMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.AllSprintsMessage> getGetSprintByProjectIdMethod;
    if ((getGetSprintByProjectIdMethod = ProjectAccessGrpc.getGetSprintByProjectIdMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getGetSprintByProjectIdMethod = ProjectAccessGrpc.getGetSprintByProjectIdMethod) == null) {
          ProjectAccessGrpc.getGetSprintByProjectIdMethod = getGetSprintByProjectIdMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.AllSprintsMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSprintByProjectId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.AllSprintsMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("GetSprintByProjectId"))
              .build();
        }
      }
    }
    return getGetSprintByProjectIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectAccessStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectAccessStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectAccessStub>() {
        @java.lang.Override
        public ProjectAccessStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectAccessStub(channel, callOptions);
        }
      };
    return ProjectAccessStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectAccessBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectAccessBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectAccessBlockingStub>() {
        @java.lang.Override
        public ProjectAccessBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectAccessBlockingStub(channel, callOptions);
        }
      };
    return ProjectAccessBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectAccessFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProjectAccessFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProjectAccessFutureStub>() {
        @java.lang.Override
        public ProjectAccessFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProjectAccessFutureStub(channel, callOptions);
        }
      };
    return ProjectAccessFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProjectAccessImplBase implements io.grpc.BindableService {

    /**
     */
    public void createProject(com.protobuf.DataAccess.ProjectCreationRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     */
    public void addCollaborator(com.protobuf.DataAccess.UserProjectRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCollaboratorMethod(), responseObserver);
    }

    /**
     */
    public void getAllCollaborators(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllCollaboratorsMethod(), responseObserver);
    }

    /**
     */
    public void removeCollaborator(com.protobuf.DataAccess.UserProjectRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveCollaboratorMethod(), responseObserver);
    }

    /**
     */
    public void addUserStory(com.protobuf.DataAccess.UserStoryCreationRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserStoryMethod(), responseObserver);
    }

    /**
     */
    public void getUserStories(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserStoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserStoriesMethod(), responseObserver);
    }

    /**
     */
    public void createSprint(com.protobuf.DataAccess.SprintCreationRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSprintMethod(), responseObserver);
    }

    /**
     */
    public void getSprintByProjectId(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.AllSprintsMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSprintByProjectIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateProjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.ProjectCreationRequest,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_CREATE_PROJECT)))
          .addMethod(
            getAddCollaboratorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.UserProjectRequest,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_ADD_COLLABORATOR)))
          .addMethod(
            getGetAllCollaboratorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.UsersResponse>(
                  this, METHODID_GET_ALL_COLLABORATORS)))
          .addMethod(
            getRemoveCollaboratorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.UserProjectRequest,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_REMOVE_COLLABORATOR)))
          .addMethod(
            getAddUserStoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.UserStoryCreationRequest,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_ADD_USER_STORY)))
          .addMethod(
            getGetUserStoriesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.UserStoriesResponse>(
                  this, METHODID_GET_USER_STORIES)))
          .addMethod(
            getCreateSprintMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.SprintCreationRequest,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_CREATE_SPRINT)))
          .addMethod(
            getGetSprintByProjectIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.AllSprintsMessage>(
                  this, METHODID_GET_SPRINT_BY_PROJECT_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ProjectAccessStub extends io.grpc.stub.AbstractAsyncStub<ProjectAccessStub> {
    private ProjectAccessStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectAccessStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectAccessStub(channel, callOptions);
    }

    /**
     */
    public void createProject(com.protobuf.DataAccess.ProjectCreationRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCollaborator(com.protobuf.DataAccess.UserProjectRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCollaboratorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllCollaborators(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllCollaboratorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeCollaborator(com.protobuf.DataAccess.UserProjectRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveCollaboratorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUserStory(com.protobuf.DataAccess.UserStoryCreationRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserStoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserStories(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserStoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserStoriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSprint(com.protobuf.DataAccess.SprintCreationRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSprintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSprintByProjectId(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.AllSprintsMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSprintByProjectIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProjectAccessBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProjectAccessBlockingStub> {
    private ProjectAccessBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectAccessBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectAccessBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.protobuf.DataAccess.Response createProject(com.protobuf.DataAccess.ProjectCreationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response addCollaborator(com.protobuf.DataAccess.UserProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCollaboratorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.UsersResponse getAllCollaborators(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllCollaboratorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response removeCollaborator(com.protobuf.DataAccess.UserProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveCollaboratorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response addUserStory(com.protobuf.DataAccess.UserStoryCreationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserStoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.UserStoriesResponse getUserStories(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserStoriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response createSprint(com.protobuf.DataAccess.SprintCreationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSprintMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.AllSprintsMessage getSprintByProjectId(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSprintByProjectIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProjectAccessFutureStub extends io.grpc.stub.AbstractFutureStub<ProjectAccessFutureStub> {
    private ProjectAccessFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectAccessFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProjectAccessFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> createProject(
        com.protobuf.DataAccess.ProjectCreationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> addCollaborator(
        com.protobuf.DataAccess.UserProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCollaboratorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.UsersResponse> getAllCollaborators(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllCollaboratorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> removeCollaborator(
        com.protobuf.DataAccess.UserProjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveCollaboratorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> addUserStory(
        com.protobuf.DataAccess.UserStoryCreationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserStoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.UserStoriesResponse> getUserStories(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserStoriesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> createSprint(
        com.protobuf.DataAccess.SprintCreationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSprintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.AllSprintsMessage> getSprintByProjectId(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSprintByProjectIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROJECT = 0;
  private static final int METHODID_ADD_COLLABORATOR = 1;
  private static final int METHODID_GET_ALL_COLLABORATORS = 2;
  private static final int METHODID_REMOVE_COLLABORATOR = 3;
  private static final int METHODID_ADD_USER_STORY = 4;
  private static final int METHODID_GET_USER_STORIES = 5;
  private static final int METHODID_CREATE_SPRINT = 6;
  private static final int METHODID_GET_SPRINT_BY_PROJECT_ID = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectAccessImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectAccessImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PROJECT:
          serviceImpl.createProject((com.protobuf.DataAccess.ProjectCreationRequest) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_ADD_COLLABORATOR:
          serviceImpl.addCollaborator((com.protobuf.DataAccess.UserProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_GET_ALL_COLLABORATORS:
          serviceImpl.getAllCollaborators((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UsersResponse>) responseObserver);
          break;
        case METHODID_REMOVE_COLLABORATOR:
          serviceImpl.removeCollaborator((com.protobuf.DataAccess.UserProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_ADD_USER_STORY:
          serviceImpl.addUserStory((com.protobuf.DataAccess.UserStoryCreationRequest) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_GET_USER_STORIES:
          serviceImpl.getUserStories((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserStoriesResponse>) responseObserver);
          break;
        case METHODID_CREATE_SPRINT:
          serviceImpl.createSprint((com.protobuf.DataAccess.SprintCreationRequest) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_GET_SPRINT_BY_PROJECT_ID:
          serviceImpl.getSprintByProjectId((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.AllSprintsMessage>) responseObserver);
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

  private static abstract class ProjectAccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectAccessBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.protobuf.DataAccess.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectAccess");
    }
  }

  private static final class ProjectAccessFileDescriptorSupplier
      extends ProjectAccessBaseDescriptorSupplier {
    ProjectAccessFileDescriptorSupplier() {}
  }

  private static final class ProjectAccessMethodDescriptorSupplier
      extends ProjectAccessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectAccessMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProjectAccessGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectAccessFileDescriptorSupplier())
              .addMethod(getCreateProjectMethod())
              .addMethod(getAddCollaboratorMethod())
              .addMethod(getGetAllCollaboratorsMethod())
              .addMethod(getRemoveCollaboratorMethod())
              .addMethod(getAddUserStoryMethod())
              .addMethod(getGetUserStoriesMethod())
              .addMethod(getCreateSprintMethod())
              .addMethod(getGetSprintByProjectIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
