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
      com.protobuf.DataAccess.Response> getRemoveCollaboratorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveCollaborator",
      requestType = com.protobuf.DataAccess.AddToProjectDto.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto,
      com.protobuf.DataAccess.Response> getRemoveCollaboratorMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.AddToProjectDto, com.protobuf.DataAccess.Response> getRemoveCollaboratorMethod;
    if ((getRemoveCollaboratorMethod = ProjectAccessGrpc.getRemoveCollaboratorMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getRemoveCollaboratorMethod = ProjectAccessGrpc.getRemoveCollaboratorMethod) == null) {
          ProjectAccessGrpc.getRemoveCollaboratorMethod = getRemoveCollaboratorMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.AddToProjectDto, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveCollaborator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.AddToProjectDto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
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
    if ((getUpdateUserStoryPointsMethod = ProjectAccessGrpc.getUpdateUserStoryPointsMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getUpdateUserStoryPointsMethod = ProjectAccessGrpc.getUpdateUserStoryPointsMethod) == null) {
          ProjectAccessGrpc.getUpdateUserStoryPointsMethod = getUpdateUserStoryPointsMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.PointsUpdate, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserStoryPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.PointsUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("UpdateUserStoryPoints"))
              .build();
        }
      }
    }
    return getUpdateUserStoryPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.StatusUpdate,
      com.protobuf.DataAccess.Response> getUpdateStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStatus",
      requestType = com.protobuf.DataAccess.StatusUpdate.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.StatusUpdate,
      com.protobuf.DataAccess.Response> getUpdateStatusMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.StatusUpdate, com.protobuf.DataAccess.Response> getUpdateStatusMethod;
    if ((getUpdateStatusMethod = ProjectAccessGrpc.getUpdateStatusMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getUpdateStatusMethod = ProjectAccessGrpc.getUpdateStatusMethod) == null) {
          ProjectAccessGrpc.getUpdateStatusMethod = getUpdateStatusMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.StatusUpdate, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.StatusUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("UpdateStatus"))
              .build();
        }
      }
    }
    return getUpdateStatusMethod;
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
    if ((getDeleteUserStoryMethod = ProjectAccessGrpc.getDeleteUserStoryMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getDeleteUserStoryMethod = ProjectAccessGrpc.getDeleteUserStoryMethod) == null) {
          ProjectAccessGrpc.getDeleteUserStoryMethod = getDeleteUserStoryMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUserStory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("DeleteUserStory"))
              .build();
        }
      }
    }
    return getDeleteUserStoryMethod;
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
      com.protobuf.DataAccess.SprintMessage> getGetSprintByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSprintByID",
      requestType = com.protobuf.DataAccess.Id.class,
      responseType = com.protobuf.DataAccess.SprintMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.SprintMessage> getGetSprintByIDMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.SprintMessage> getGetSprintByIDMethod;
    if ((getGetSprintByIDMethod = ProjectAccessGrpc.getGetSprintByIDMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getGetSprintByIDMethod = ProjectAccessGrpc.getGetSprintByIDMethod) == null) {
          ProjectAccessGrpc.getGetSprintByIDMethod = getGetSprintByIDMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.SprintMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSprintByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.SprintMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("GetSprintByID"))
              .build();
        }
      }
    }
    return getGetSprintByIDMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.RemoveSprintMessage,
      com.protobuf.DataAccess.Response> getRemoveSprintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveSprint",
      requestType = com.protobuf.DataAccess.RemoveSprintMessage.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.RemoveSprintMessage,
      com.protobuf.DataAccess.Response> getRemoveSprintMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.RemoveSprintMessage, com.protobuf.DataAccess.Response> getRemoveSprintMethod;
    if ((getRemoveSprintMethod = ProjectAccessGrpc.getRemoveSprintMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getRemoveSprintMethod = ProjectAccessGrpc.getRemoveSprintMethod) == null) {
          ProjectAccessGrpc.getRemoveSprintMethod = getRemoveSprintMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.RemoveSprintMessage, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveSprint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.RemoveSprintMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("RemoveSprint"))
              .build();
        }
      }
    }
    return getRemoveSprintMethod;
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
    if ((getRemoveTaskMethod = ProjectAccessGrpc.getRemoveTaskMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getRemoveTaskMethod = ProjectAccessGrpc.getRemoveTaskMethod) == null) {
          ProjectAccessGrpc.getRemoveTaskMethod = getRemoveTaskMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("RemoveTask"))
              .build();
        }
      }
    }
    return getRemoveTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.TaskRequest,
      com.protobuf.DataAccess.Response> getAddTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTask",
      requestType = com.protobuf.DataAccess.TaskRequest.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.TaskRequest,
      com.protobuf.DataAccess.Response> getAddTaskMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.TaskRequest, com.protobuf.DataAccess.Response> getAddTaskMethod;
    if ((getAddTaskMethod = ProjectAccessGrpc.getAddTaskMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getAddTaskMethod = ProjectAccessGrpc.getAddTaskMethod) == null) {
          ProjectAccessGrpc.getAddTaskMethod = getAddTaskMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.TaskRequest, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.TaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("AddTask"))
              .build();
        }
      }
    }
    return getAddTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.AllTasksMessage> getGetTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTasks",
      requestType = com.protobuf.DataAccess.Id.class,
      responseType = com.protobuf.DataAccess.AllTasksMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id,
      com.protobuf.DataAccess.AllTasksMessage> getGetTasksMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.AllTasksMessage> getGetTasksMethod;
    if ((getGetTasksMethod = ProjectAccessGrpc.getGetTasksMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getGetTasksMethod = ProjectAccessGrpc.getGetTasksMethod) == null) {
          ProjectAccessGrpc.getGetTasksMethod = getGetTasksMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.AllTasksMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.AllTasksMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("GetTasks"))
              .build();
        }
      }
    }
    return getGetTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.TaskRequest,
      com.protobuf.DataAccess.Response> getEditTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditTask",
      requestType = com.protobuf.DataAccess.TaskRequest.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.TaskRequest,
      com.protobuf.DataAccess.Response> getEditTaskMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.TaskRequest, com.protobuf.DataAccess.Response> getEditTaskMethod;
    if ((getEditTaskMethod = ProjectAccessGrpc.getEditTaskMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getEditTaskMethod = ProjectAccessGrpc.getEditTaskMethod) == null) {
          ProjectAccessGrpc.getEditTaskMethod = getEditTaskMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.TaskRequest, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.TaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("EditTask"))
              .build();
        }
      }
    }
    return getEditTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStoryToSprintRequest,
      com.protobuf.DataAccess.Response> getAddUserStoryToSprintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserStoryToSprint",
      requestType = com.protobuf.DataAccess.UserStoryToSprintRequest.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStoryToSprintRequest,
      com.protobuf.DataAccess.Response> getAddUserStoryToSprintMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStoryToSprintRequest, com.protobuf.DataAccess.Response> getAddUserStoryToSprintMethod;
    if ((getAddUserStoryToSprintMethod = ProjectAccessGrpc.getAddUserStoryToSprintMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getAddUserStoryToSprintMethod = ProjectAccessGrpc.getAddUserStoryToSprintMethod) == null) {
          ProjectAccessGrpc.getAddUserStoryToSprintMethod = getAddUserStoryToSprintMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.UserStoryToSprintRequest, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserStoryToSprint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserStoryToSprintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("AddUserStoryToSprint"))
              .build();
        }
      }
    }
    return getAddUserStoryToSprintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStoryToSprintRequest,
      com.protobuf.DataAccess.Response> getRemoveUserStoryFromSprintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserStoryFromSprint",
      requestType = com.protobuf.DataAccess.UserStoryToSprintRequest.class,
      responseType = com.protobuf.DataAccess.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStoryToSprintRequest,
      com.protobuf.DataAccess.Response> getRemoveUserStoryFromSprintMethod() {
    io.grpc.MethodDescriptor<com.protobuf.DataAccess.UserStoryToSprintRequest, com.protobuf.DataAccess.Response> getRemoveUserStoryFromSprintMethod;
    if ((getRemoveUserStoryFromSprintMethod = ProjectAccessGrpc.getRemoveUserStoryFromSprintMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getRemoveUserStoryFromSprintMethod = ProjectAccessGrpc.getRemoveUserStoryFromSprintMethod) == null) {
          ProjectAccessGrpc.getRemoveUserStoryFromSprintMethod = getRemoveUserStoryFromSprintMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.UserStoryToSprintRequest, com.protobuf.DataAccess.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserStoryFromSprint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserStoryToSprintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("RemoveUserStoryFromSprint"))
              .build();
        }
      }
    }
    return getRemoveUserStoryFromSprintMethod;
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
    if ((getGetAllUserStoriesFromSprintMethod = ProjectAccessGrpc.getGetAllUserStoriesFromSprintMethod) == null) {
      synchronized (ProjectAccessGrpc.class) {
        if ((getGetAllUserStoriesFromSprintMethod = ProjectAccessGrpc.getGetAllUserStoriesFromSprintMethod) == null) {
          ProjectAccessGrpc.getGetAllUserStoriesFromSprintMethod = getGetAllUserStoriesFromSprintMethod =
              io.grpc.MethodDescriptor.<com.protobuf.DataAccess.Id, com.protobuf.DataAccess.UserStoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllUserStoriesFromSprint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.DataAccess.UserStoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProjectAccessMethodDescriptorSupplier("GetAllUserStoriesFromSprint"))
              .build();
        }
      }
    }
    return getGetAllUserStoriesFromSprintMethod;
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
     * <pre>
     *Project
     * </pre>
     */
    public void createProject(com.protobuf.DataAccess.ProjectCreationDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ResponseWithID> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     */
    public void getAllProjects(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ProjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     *Collaborators
     * </pre>
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
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveCollaboratorMethod(), responseObserver);
    }

    /**
     * <pre>
     *UserStories
     * </pre>
     */
    public void addUserStory(com.protobuf.DataAccess.UserStoryMessage request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ResponseWithID> responseObserver) {
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
    public void updateUserStoryPoints(com.protobuf.DataAccess.PointsUpdate request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserStoryPointsMethod(), responseObserver);
    }

    /**
     */
    public void updateStatus(com.protobuf.DataAccess.StatusUpdate request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStatusMethod(), responseObserver);
    }

    /**
     */
    public void deleteUserStory(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserStoryMethod(), responseObserver);
    }

    /**
     * <pre>
     *Sprints
     * </pre>
     */
    public void createSprint(com.protobuf.DataAccess.SprintCreationRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSprintMethod(), responseObserver);
    }

    /**
     */
    public void getSprintByID(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.SprintMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSprintByIDMethod(), responseObserver);
    }

    /**
     */
    public void getSprintByProjectId(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.AllSprintsMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSprintByProjectIdMethod(), responseObserver);
    }

    /**
     */
    public void removeSprint(com.protobuf.DataAccess.RemoveSprintMessage request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveSprintMethod(), responseObserver);
    }

    /**
     */
    public void removeTask(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     *SprintBacklog
     * </pre>
     */
    public void addTask(com.protobuf.DataAccess.TaskRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddTaskMethod(), responseObserver);
    }

    /**
     */
    public void getTasks(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.AllTasksMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTasksMethod(), responseObserver);
    }

    /**
     */
    public void editTask(com.protobuf.DataAccess.TaskRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditTaskMethod(), responseObserver);
    }

    /**
     */
    public void addUserStoryToSprint(com.protobuf.DataAccess.UserStoryToSprintRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserStoryToSprintMethod(), responseObserver);
    }

    /**
     */
    public void removeUserStoryFromSprint(com.protobuf.DataAccess.UserStoryToSprintRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUserStoryFromSprintMethod(), responseObserver);
    }

    /**
     */
    public void getAllUserStoriesFromSprint(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserStoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllUserStoriesFromSprintMethod(), responseObserver);
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
            getGetAllProjectsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Username,
                com.protobuf.DataAccess.ProjectsResponse>(
                  this, METHODID_GET_ALL_PROJECTS)))
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
                com.protobuf.DataAccess.Response>(
                  this, METHODID_REMOVE_COLLABORATOR)))
          .addMethod(
            getAddUserStoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.UserStoryMessage,
                com.protobuf.DataAccess.ResponseWithID>(
                  this, METHODID_ADD_USER_STORY)))
          .addMethod(
            getGetUserStoriesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.UserStoriesResponse>(
                  this, METHODID_GET_USER_STORIES)))
          .addMethod(
            getUpdateUserStoryPointsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.PointsUpdate,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_UPDATE_USER_STORY_POINTS)))
          .addMethod(
            getUpdateStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.StatusUpdate,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_UPDATE_STATUS)))
          .addMethod(
            getDeleteUserStoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_DELETE_USER_STORY)))
          .addMethod(
            getCreateSprintMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.SprintCreationRequest,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_CREATE_SPRINT)))
          .addMethod(
            getGetSprintByIDMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.SprintMessage>(
                  this, METHODID_GET_SPRINT_BY_ID)))
          .addMethod(
            getGetSprintByProjectIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.AllSprintsMessage>(
                  this, METHODID_GET_SPRINT_BY_PROJECT_ID)))
          .addMethod(
            getRemoveSprintMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.RemoveSprintMessage,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_REMOVE_SPRINT)))
          .addMethod(
            getRemoveTaskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_REMOVE_TASK)))
          .addMethod(
            getAddTaskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.TaskRequest,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_ADD_TASK)))
          .addMethod(
            getGetTasksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.AllTasksMessage>(
                  this, METHODID_GET_TASKS)))
          .addMethod(
            getEditTaskMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.TaskRequest,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_EDIT_TASK)))
          .addMethod(
            getAddUserStoryToSprintMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.UserStoryToSprintRequest,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_ADD_USER_STORY_TO_SPRINT)))
          .addMethod(
            getRemoveUserStoryFromSprintMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.UserStoryToSprintRequest,
                com.protobuf.DataAccess.Response>(
                  this, METHODID_REMOVE_USER_STORY_FROM_SPRINT)))
          .addMethod(
            getGetAllUserStoriesFromSprintMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.DataAccess.Id,
                com.protobuf.DataAccess.UserStoriesResponse>(
                  this, METHODID_GET_ALL_USER_STORIES_FROM_SPRINT)))
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
     * <pre>
     *Project
     * </pre>
     */
    public void createProject(com.protobuf.DataAccess.ProjectCreationDto request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ResponseWithID> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllProjects(com.protobuf.DataAccess.Username request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ProjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Collaborators
     * </pre>
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
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveCollaboratorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *UserStories
     * </pre>
     */
    public void addUserStory(com.protobuf.DataAccess.UserStoryMessage request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ResponseWithID> responseObserver) {
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
    public void updateUserStoryPoints(com.protobuf.DataAccess.PointsUpdate request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserStoryPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStatus(com.protobuf.DataAccess.StatusUpdate request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUserStory(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserStoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Sprints
     * </pre>
     */
    public void createSprint(com.protobuf.DataAccess.SprintCreationRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSprintMethod(), getCallOptions()), request, responseObserver);
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
    public void getSprintByProjectId(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.AllSprintsMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSprintByProjectIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeSprint(com.protobuf.DataAccess.RemoveSprintMessage request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveSprintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeTask(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *SprintBacklog
     * </pre>
     */
    public void addTask(com.protobuf.DataAccess.TaskRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTasks(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.AllTasksMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editTask(com.protobuf.DataAccess.TaskRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUserStoryToSprint(com.protobuf.DataAccess.UserStoryToSprintRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserStoryToSprintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUserStoryFromSprint(com.protobuf.DataAccess.UserStoryToSprintRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUserStoryFromSprintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUserStoriesFromSprint(com.protobuf.DataAccess.Id request,
        io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserStoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllUserStoriesFromSprintMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     *Project
     * </pre>
     */
    public com.protobuf.DataAccess.ResponseWithID createProject(com.protobuf.DataAccess.ProjectCreationDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.ProjectsResponse getAllProjects(com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Collaborators
     * </pre>
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
    public com.protobuf.DataAccess.Response removeCollaborator(com.protobuf.DataAccess.AddToProjectDto request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveCollaboratorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *UserStories
     * </pre>
     */
    public com.protobuf.DataAccess.ResponseWithID addUserStory(com.protobuf.DataAccess.UserStoryMessage request) {
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
    public com.protobuf.DataAccess.Response updateUserStoryPoints(com.protobuf.DataAccess.PointsUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserStoryPointsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response updateStatus(com.protobuf.DataAccess.StatusUpdate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response deleteUserStory(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserStoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Sprints
     * </pre>
     */
    public com.protobuf.DataAccess.Response createSprint(com.protobuf.DataAccess.SprintCreationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSprintMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.SprintMessage getSprintByID(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSprintByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.AllSprintsMessage getSprintByProjectId(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSprintByProjectIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response removeSprint(com.protobuf.DataAccess.RemoveSprintMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveSprintMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response removeTask(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *SprintBacklog
     * </pre>
     */
    public com.protobuf.DataAccess.Response addTask(com.protobuf.DataAccess.TaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.AllTasksMessage getTasks(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTasksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response editTask(com.protobuf.DataAccess.TaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response addUserStoryToSprint(com.protobuf.DataAccess.UserStoryToSprintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserStoryToSprintMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.Response removeUserStoryFromSprint(com.protobuf.DataAccess.UserStoryToSprintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserStoryFromSprintMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.DataAccess.UserStoriesResponse getAllUserStoriesFromSprint(com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllUserStoriesFromSprintMethod(), getCallOptions(), request);
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
     * <pre>
     *Project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.ResponseWithID> createProject(
        com.protobuf.DataAccess.ProjectCreationDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.ProjectsResponse> getAllProjects(
        com.protobuf.DataAccess.Username request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Collaborators
     * </pre>
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
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> removeCollaborator(
        com.protobuf.DataAccess.AddToProjectDto request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveCollaboratorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *UserStories
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.ResponseWithID> addUserStory(
        com.protobuf.DataAccess.UserStoryMessage request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> updateUserStoryPoints(
        com.protobuf.DataAccess.PointsUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserStoryPointsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> updateStatus(
        com.protobuf.DataAccess.StatusUpdate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> deleteUserStory(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserStoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Sprints
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> createSprint(
        com.protobuf.DataAccess.SprintCreationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSprintMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.AllSprintsMessage> getSprintByProjectId(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSprintByProjectIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> removeSprint(
        com.protobuf.DataAccess.RemoveSprintMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveSprintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> removeTask(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *SprintBacklog
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> addTask(
        com.protobuf.DataAccess.TaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.AllTasksMessage> getTasks(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTasksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> editTask(
        com.protobuf.DataAccess.TaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> addUserStoryToSprint(
        com.protobuf.DataAccess.UserStoryToSprintRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserStoryToSprintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.Response> removeUserStoryFromSprint(
        com.protobuf.DataAccess.UserStoryToSprintRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUserStoryFromSprintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.DataAccess.UserStoriesResponse> getAllUserStoriesFromSprint(
        com.protobuf.DataAccess.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllUserStoriesFromSprintMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROJECT = 0;
  private static final int METHODID_GET_ALL_PROJECTS = 1;
  private static final int METHODID_GET_ALL_COLLABORATORS = 2;
  private static final int METHODID_ADD_COLLABORATOR = 3;
  private static final int METHODID_REMOVE_COLLABORATOR = 4;
  private static final int METHODID_ADD_USER_STORY = 5;
  private static final int METHODID_GET_USER_STORIES = 6;
  private static final int METHODID_UPDATE_USER_STORY_POINTS = 7;
  private static final int METHODID_UPDATE_STATUS = 8;
  private static final int METHODID_DELETE_USER_STORY = 9;
  private static final int METHODID_CREATE_SPRINT = 10;
  private static final int METHODID_GET_SPRINT_BY_ID = 11;
  private static final int METHODID_GET_SPRINT_BY_PROJECT_ID = 12;
  private static final int METHODID_REMOVE_SPRINT = 13;
  private static final int METHODID_REMOVE_TASK = 14;
  private static final int METHODID_ADD_TASK = 15;
  private static final int METHODID_GET_TASKS = 16;
  private static final int METHODID_EDIT_TASK = 17;
  private static final int METHODID_ADD_USER_STORY_TO_SPRINT = 18;
  private static final int METHODID_REMOVE_USER_STORY_FROM_SPRINT = 19;
  private static final int METHODID_GET_ALL_USER_STORIES_FROM_SPRINT = 20;

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
        case METHODID_GET_ALL_PROJECTS:
          serviceImpl.getAllProjects((com.protobuf.DataAccess.Username) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ProjectsResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_ADD_USER_STORY:
          serviceImpl.addUserStory((com.protobuf.DataAccess.UserStoryMessage) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.ResponseWithID>) responseObserver);
          break;
        case METHODID_GET_USER_STORIES:
          serviceImpl.getUserStories((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserStoriesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_STORY_POINTS:
          serviceImpl.updateUserStoryPoints((com.protobuf.DataAccess.PointsUpdate) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_UPDATE_STATUS:
          serviceImpl.updateStatus((com.protobuf.DataAccess.StatusUpdate) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_DELETE_USER_STORY:
          serviceImpl.deleteUserStory((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_CREATE_SPRINT:
          serviceImpl.createSprint((com.protobuf.DataAccess.SprintCreationRequest) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_GET_SPRINT_BY_ID:
          serviceImpl.getSprintByID((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.SprintMessage>) responseObserver);
          break;
        case METHODID_GET_SPRINT_BY_PROJECT_ID:
          serviceImpl.getSprintByProjectId((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.AllSprintsMessage>) responseObserver);
          break;
        case METHODID_REMOVE_SPRINT:
          serviceImpl.removeSprint((com.protobuf.DataAccess.RemoveSprintMessage) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_REMOVE_TASK:
          serviceImpl.removeTask((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_ADD_TASK:
          serviceImpl.addTask((com.protobuf.DataAccess.TaskRequest) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_GET_TASKS:
          serviceImpl.getTasks((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.AllTasksMessage>) responseObserver);
          break;
        case METHODID_EDIT_TASK:
          serviceImpl.editTask((com.protobuf.DataAccess.TaskRequest) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_ADD_USER_STORY_TO_SPRINT:
          serviceImpl.addUserStoryToSprint((com.protobuf.DataAccess.UserStoryToSprintRequest) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_REMOVE_USER_STORY_FROM_SPRINT:
          serviceImpl.removeUserStoryFromSprint((com.protobuf.DataAccess.UserStoryToSprintRequest) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.Response>) responseObserver);
          break;
        case METHODID_GET_ALL_USER_STORIES_FROM_SPRINT:
          serviceImpl.getAllUserStoriesFromSprint((com.protobuf.DataAccess.Id) request,
              (io.grpc.stub.StreamObserver<com.protobuf.DataAccess.UserStoriesResponse>) responseObserver);
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
              .addMethod(getGetAllProjectsMethod())
              .addMethod(getGetAllCollaboratorsMethod())
              .addMethod(getAddCollaboratorMethod())
              .addMethod(getRemoveCollaboratorMethod())
              .addMethod(getAddUserStoryMethod())
              .addMethod(getGetUserStoriesMethod())
              .addMethod(getUpdateUserStoryPointsMethod())
              .addMethod(getUpdateStatusMethod())
              .addMethod(getDeleteUserStoryMethod())
              .addMethod(getCreateSprintMethod())
              .addMethod(getGetSprintByIDMethod())
              .addMethod(getGetSprintByProjectIdMethod())
              .addMethod(getRemoveSprintMethod())
              .addMethod(getRemoveTaskMethod())
              .addMethod(getAddTaskMethod())
              .addMethod(getGetTasksMethod())
              .addMethod(getEditTaskMethod())
              .addMethod(getAddUserStoryToSprintMethod())
              .addMethod(getRemoveUserStoryFromSprintMethod())
              .addMethod(getGetAllUserStoriesFromSprintMethod())
              .build();
        }
      }
    }
    return result;
  }
}
