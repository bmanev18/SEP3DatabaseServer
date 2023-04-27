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
  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.ProjectDto,
      com.protobuf.DataAccess.Response> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProject",
      requestType = com.protobuf.DataAccess.ProjectDto.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.ProjectDto,
      com.protobuf.DataAccess.Response> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.ProjectDto, com.protobuf.DataAccess.Response> getCreateProjectMethod;
    if ((getCreateProjectMethod = ProjectAccessGrpc.getCreateProjectMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getCreateProjectMethod = ProjectAccessGrpc.getCreateProjectMethod) == null) {
          ProjectAccessGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.ProjectDto, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.ProjectDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("CreateProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto,
      com.protobuf.DataAccess.Response> getAddOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOwner",
      requestType = com.protobuf.DataAccess.AddToProjectDto.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto,
      com.protobuf.DataAccess.Response> getAddOwnerMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto, com.protobuf.DataAccess.Response> getAddOwnerMethod;
    if ((getAddOwnerMethod = ProjectAccessGrpc.getAddOwnerMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getAddOwnerMethod = ProjectAccessGrpc.getAddOwnerMethod) == null) {
          ProjectAccessGrpc.getAddOwnerMethod = getAddOwnerMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.AddToProjectDto, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.AddToProjectDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("AddOwner"))
              .build();
        }
      }
    }
    return getAddOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto,
      com.protobuf.DataAccess.Response> getAddScrumMasterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddScrumMaster",
      requestType = com.protobuf.DataAccess.AddToProjectDto.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto,
      com.protobuf.DataAccess.Response> getAddScrumMasterMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto, com.protobuf.DataAccess.Response> getAddScrumMasterMethod;
    if ((getAddScrumMasterMethod = ProjectAccessGrpc.getAddScrumMasterMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getAddScrumMasterMethod = ProjectAccessGrpc.getAddScrumMasterMethod) == null) {
          ProjectAccessGrpc.getAddScrumMasterMethod = getAddScrumMasterMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.AddToProjectDto, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddScrumMaster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.AddToProjectDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("AddScrumMaster"))
              .build();
        }
      }
    }
    return getAddScrumMasterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto,
      com.protobuf.DataAccess.Response> getAddDeveloperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDeveloper",
      requestType = com.protobuf.DataAccess.AddToProjectDto.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto,
      com.protobuf.DataAccess.Response> getAddDeveloperMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto, com.protobuf.DataAccess.Response> getAddDeveloperMethod;
    if ((getAddDeveloperMethod = ProjectAccessGrpc.getAddDeveloperMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getAddDeveloperMethod = ProjectAccessGrpc.getAddDeveloperMethod) == null) {
          ProjectAccessGrpc.getAddDeveloperMethod = getAddDeveloperMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.AddToProjectDto, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDeveloper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.AddToProjectDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("AddDeveloper"))
              .build();
        }
      }
    }
    return getAddDeveloperMethod;
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
    public void createProject(com.protobuf.DataAccess.ProjectDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     */
    public void addOwner(com.protobuf.DataAccess.AddToProjectDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddOwnerMethod(), responseObserver);
    }

    /**
     */
    public void addScrumMaster(com.protobuf.DataAccess.AddToProjectDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddScrumMasterMethod(), responseObserver);
    }

    /**
     */
    public void addDeveloper(com.protobuf.DataAccess.AddToProjectDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDeveloperMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateProjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.ProjectDto,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_CREATE_PROJECT)))
          .addMethod(
            getAddOwnerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.AddToProjectDto,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_ADD_OWNER)))
          .addMethod(
            getAddScrumMasterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.AddToProjectDto,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_ADD_SCRUM_MASTER)))
          .addMethod(
            getAddDeveloperMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.AddToProjectDto,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_ADD_DEVELOPER)))
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
    public void createProject(com.protobuf.DataAccess.ProjectDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addOwner(com.protobuf.DataAccess.AddToProjectDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addScrumMaster(com.protobuf.DataAccess.AddToProjectDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddScrumMasterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addDeveloper(com.protobuf.DataAccess.AddToProjectDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDeveloperMethod(), getCallOptions()), request, responseObserver);
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
    public com.protobuf.DataAccess.Response createProject(com.protobuf.DataAccess.ProjectDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response addOwner(com.protobuf.DataAccess.AddToProjectDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response addScrumMaster(com.protobuf.DataAccess.AddToProjectDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddScrumMasterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response addDeveloper(com.protobuf.DataAccess.AddToProjectDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDeveloperMethod(), getCallOptions(), request);
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
        com.protobuf.DataAccess.ProjectDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> addOwner(
        com.protobuf.DataAccess.AddToProjectDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> addScrumMaster(
        com.protobuf.DataAccess.AddToProjectDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddScrumMasterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> addDeveloper(
        com.protobuf.DataAccess.AddToProjectDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDeveloperMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROJECT = 0;
  private static final int METHODID_ADD_OWNER = 1;
  private static final int METHODID_ADD_SCRUM_MASTER = 2;
  private static final int METHODID_ADD_DEVELOPER = 3;

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
          serviceImpl.createProject((com.protobuf.DataAccess.ProjectDto) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_ADD_OWNER:
          serviceImpl.addOwner((com.protobuf.DataAccess.AddToProjectDto) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_ADD_SCRUM_MASTER:
          serviceImpl.addScrumMaster((com.protobuf.DataAccess.AddToProjectDto) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_ADD_DEVELOPER:
          serviceImpl.addDeveloper((com.protobuf.DataAccess.AddToProjectDto) request,
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
              .addMethod(getAddOwnerMethod())
              .addMethod(getAddScrumMasterMethod())
              .addMethod(getAddDeveloperMethod())
              .build();
        }
      }
    }
    return result;
  }
}
