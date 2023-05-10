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
  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.ProjectCreationDto,
      com.protobuf.DataAccess.ResponseWithID> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProject",
      requestType = com.protobuf.DataAccess.ProjectCreationDto.class,
      responseType = com.protobuf.DataAccess.ResponseWithID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.ProjectCreationDto,
      com.protobuf.DataAccess.ResponseWithID> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.ProjectCreationDto, com.protobuf.DataAccess.ResponseWithID> getCreateProjectMethod;
    if ((getCreateProjectMethod = ProjectAccessGrpc.getCreateProjectMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getCreateProjectMethod = ProjectAccessGrpc.getCreateProjectMethod) == null) {
          ProjectAccessGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.ProjectCreationDto, com.protobuf.DataAccess.ResponseWithID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.ProjectCreationDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.ResponseWithID.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("CreateProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.FilteredUsersResponse> getGetAllCollaboratorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllCollaborators",
      requestType = com.protobuf.DataAccess.Id.class,
      responseType = com.protobuf.DataAccess.FilteredUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.FilteredUsersResponse> getGetAllCollaboratorsMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.FilteredUsersResponse> getGetAllCollaboratorsMethod;
    if ((getGetAllCollaboratorsMethod = ProjectAccessGrpc.getGetAllCollaboratorsMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getGetAllCollaboratorsMethod = ProjectAccessGrpc.getGetAllCollaboratorsMethod) == null) {
          ProjectAccessGrpc.getGetAllCollaboratorsMethod = getGetAllCollaboratorsMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.FilteredUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllCollaborators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.FilteredUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("GetAllCollaborators"))
              .build();
        }
      }
    }
    return getGetAllCollaboratorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto,
      com.protobuf.DataAccess.Response> getAddCollaboratorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddCollaborator",
      requestType = com.protobuf.DataAccess.AddToProjectDto.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto,
      com.protobuf.DataAccess.Response> getAddCollaboratorMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto, com.protobuf.DataAccess.Response> getAddCollaboratorMethod;
    if ((getAddCollaboratorMethod = ProjectAccessGrpc.getAddCollaboratorMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getAddCollaboratorMethod = ProjectAccessGrpc.getAddCollaboratorMethod) == null) {
          ProjectAccessGrpc.getAddCollaboratorMethod = getAddCollaboratorMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.AddToProjectDto, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddCollaborator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.AddToProjectDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("AddCollaborator"))
              .build();
        }
      }
    }
    return getAddCollaboratorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto,
      com.protobuf.DataAccess.ResponseWithID> getRemoveCollaboratorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveCollaborator",
      requestType = com.protobuf.DataAccess.AddToProjectDto.class,
      responseType = com.protobuf.DataAccess.ResponseWithID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto,
      com.protobuf.DataAccess.ResponseWithID> getRemoveCollaboratorMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto, com.protobuf.DataAccess.ResponseWithID> getRemoveCollaboratorMethod;
    if ((getRemoveCollaboratorMethod = ProjectAccessGrpc.getRemoveCollaboratorMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getRemoveCollaboratorMethod = ProjectAccessGrpc.getRemoveCollaboratorMethod) == null) {
          ProjectAccessGrpc.getRemoveCollaboratorMethod = getRemoveCollaboratorMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.AddToProjectDto, com.protobuf.DataAccess.ResponseWithID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveCollaborator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.AddToProjectDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.ResponseWithID.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("RemoveCollaborator"))
              .build();
        }
      }
    }
    return getRemoveCollaboratorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStoryMessage,
      com.protobuf.DataAccess.ResponseWithID> getAddUserStoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserStory",
      requestType = com.protobuf.DataAccess.UserStoryMessage.class,
      responseType = com.protobuf.DataAccess.ResponseWithID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStoryMessage,
      com.protobuf.DataAccess.ResponseWithID> getAddUserStoryMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStoryMessage, com.protobuf.DataAccess.ResponseWithID> getAddUserStoryMethod;
    if ((getAddUserStoryMethod = ProjectAccessGrpc.getAddUserStoryMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getAddUserStoryMethod = ProjectAccessGrpc.getAddUserStoryMethod) == null) {
          ProjectAccessGrpc.getAddUserStoryMethod = getAddUserStoryMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.UserStoryMessage, com.protobuf.DataAccess.ResponseWithID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserStory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserStoryMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.ResponseWithID.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("AddUserStory"))
              .build();
        }
      }
    }
    return getAddUserStoryMethod;
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
    if ((getGetAllProjectsMethod = ProjectAccessGrpc.getGetAllProjectsMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getGetAllProjectsMethod = ProjectAccessGrpc.getGetAllProjectsMethod) == null) {
          ProjectAccessGrpc.getGetAllProjectsMethod = getGetAllProjectsMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Username, com.protobuf.DataAccess.ProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Username.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.ProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("GetAllProjects"))
              .build();
        }
      }
    }
    return getGetAllProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.ProductBacklogResponse> getGetProductBacklogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductBacklog",
      requestType = com.protobuf.DataAccess.Id.class,
      responseType = com.protobuf.DataAccess.ProductBacklogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.ProductBacklogResponse> getGetProductBacklogMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.ProductBacklogResponse> getGetProductBacklogMethod;
    if ((getGetProductBacklogMethod = ProjectAccessGrpc.getGetProductBacklogMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getGetProductBacklogMethod = ProjectAccessGrpc.getGetProductBacklogMethod) == null) {
          ProjectAccessGrpc.getGetProductBacklogMethod = getGetProductBacklogMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.ProductBacklogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductBacklog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.ProductBacklogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("GetProductBacklog"))
              .build();
        }
      }
    }
    return getGetProductBacklogMethod;
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
    public void createProject(com.protobuf.DataAccess.ProjectCreationDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ResponseWithID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     */
    public void getAllCollaborators(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.FilteredUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllCollaboratorsMethod(), responseObserver);
    }

    /**
     */
    public void addCollaborator(com.protobuf.DataAccess.AddToProjectDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCollaboratorMethod(), responseObserver);
    }

    /**
     */
    public void removeCollaborator(com.protobuf.DataAccess.AddToProjectDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ResponseWithID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveCollaboratorMethod(), responseObserver);
    }

    /**
     */
    public void addUserStory(com.protobuf.DataAccess.UserStoryMessage request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ResponseWithID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserStoryMethod(), responseObserver);
    }

    /**
     */
    public void getAllProjects(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ProjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllProjectsMethod(), responseObserver);
    }

    /**
     */
    public void getProductBacklog(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ProductBacklogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductBacklogMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateProjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.ProjectCreationDto,
                com.protobuf.DataAccess.ResponseWithID>(
                  this, METHODID_CREATE_PROJECT)))
          .addMethod(
            getGetAllCollaboratorsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.FilteredUsersResponse>(
                  this, METHODID_GET_ALL_COLLABORATORS)))
          .addMethod(
            getAddCollaboratorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.AddToProjectDto,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_ADD_COLLABORATOR)))
          .addMethod(
            getRemoveCollaboratorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.AddToProjectDto,
                com.protobuf.DataAccess.ResponseWithID>(
                  this, METHODID_REMOVE_COLLABORATOR)))
          .addMethod(
            getAddUserStoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.UserStoryMessage,
                com.protobuf.DataAccess.ResponseWithID>(
                  this, METHODID_ADD_USER_STORY)))
          .addMethod(
            getGetAllProjectsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Username,
                com.protobuf.DataAccess.ProjectsResponse>(
                  this, METHODID_GET_ALL_PROJECTS)))
          .addMethod(
            getGetProductBacklogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.ProductBacklogResponse>(
                  this, METHODID_GET_PRODUCT_BACKLOG)))
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
    public void createProject(com.protobuf.DataAccess.ProjectCreationDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ResponseWithID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllCollaborators(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.FilteredUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllCollaboratorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCollaborator(com.protobuf.DataAccess.AddToProjectDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCollaboratorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeCollaborator(com.protobuf.DataAccess.AddToProjectDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ResponseWithID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveCollaboratorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUserStory(com.protobuf.DataAccess.UserStoryMessage request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ResponseWithID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserStoryMethod(), getCallOptions()), request, responseObserver);
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
    public void getProductBacklog(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ProductBacklogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductBacklogMethod(), getCallOptions()), request, responseObserver);
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
    public com.protobuf.DataAccess.ResponseWithID createProject(com.protobuf.DataAccess.ProjectCreationDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.FilteredUsersResponse getAllCollaborators(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllCollaboratorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response addCollaborator(com.protobuf.DataAccess.AddToProjectDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCollaboratorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.ResponseWithID removeCollaborator(com.protobuf.DataAccess.AddToProjectDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveCollaboratorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.ResponseWithID addUserStory(com.protobuf.DataAccess.UserStoryMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserStoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.ProjectsResponse getAllProjects(com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllProjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.ProductBacklogResponse getProductBacklog(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductBacklogMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.ResponseWithID> createProject(
        com.protobuf.DataAccess.ProjectCreationDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.FilteredUsersResponse> getAllCollaborators(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllCollaboratorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> addCollaborator(
        com.protobuf.DataAccess.AddToProjectDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCollaboratorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.ResponseWithID> removeCollaborator(
        com.protobuf.DataAccess.AddToProjectDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveCollaboratorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.ResponseWithID> addUserStory(
        com.protobuf.DataAccess.UserStoryMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserStoryMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.ProductBacklogResponse> getProductBacklog(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductBacklogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROJECT = 0;
  private static final int METHODID_GET_ALL_COLLABORATORS = 1;
  private static final int METHODID_ADD_COLLABORATOR = 2;
  private static final int METHODID_REMOVE_COLLABORATOR = 3;
  private static final int METHODID_ADD_USER_STORY = 4;
  private static final int METHODID_GET_ALL_PROJECTS = 5;
  private static final int METHODID_GET_PRODUCT_BACKLOG = 6;

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
          serviceImpl.createProject((com.protobuf.DataAccess.ProjectCreationDto) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ResponseWithID>) responseObserver);
          break;
        case METHODID_GET_ALL_COLLABORATORS:
          serviceImpl.getAllCollaborators((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.FilteredUsersResponse>) responseObserver);
          break;
        case METHODID_ADD_COLLABORATOR:
          serviceImpl.addCollaborator((com.protobuf.DataAccess.AddToProjectDto) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_REMOVE_COLLABORATOR:
          serviceImpl.removeCollaborator((com.protobuf.DataAccess.AddToProjectDto) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ResponseWithID>) responseObserver);
          break;
        case METHODID_ADD_USER_STORY:
          serviceImpl.addUserStory((com.protobuf.DataAccess.UserStoryMessage) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ResponseWithID>) responseObserver);
          break;
        case METHODID_GET_ALL_PROJECTS:
          serviceImpl.getAllProjects((com.protobuf.DataAccess.Username) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ProjectsResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_BACKLOG:
          serviceImpl.getProductBacklog((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ProductBacklogResponse>) responseObserver);
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
              .addMethod(getGetAllCollaboratorsMethod())
              .addMethod(getAddCollaboratorMethod())
              .addMethod(getRemoveCollaboratorMethod())
              .addMethod(getAddUserStoryMethod())
              .addMethod(getGetAllProjectsMethod())
              .addMethod(getGetProductBacklogMethod())
              .build();
        }
      }
    }
    return result;
  }
}
