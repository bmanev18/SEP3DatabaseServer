package com.server.services;

import com.database.DaoInterfaces.IProjectDao;
import com.protobuf.DataAccess;
import com.protobuf.ProjectAccessGrpc;
import io.grpc.stub.StreamObserver;

public class ProjectAccessService extends ProjectAccessGrpc.ProjectAccessImplBase{
    private final IProjectDao dao;

    public ProjectAccessService(IProjectDao dao) {
        this.dao = dao;
    }

    @Override
    public void createProject(DataAccess.ProjectCreationRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to create project: %s %n", request.getTitle());

        responseObserver.onNext(dao.createProject(request));
        responseObserver.onCompleted();
    }

    @Override
    public void addCollaborator(DataAccess.UserProjectRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to add user: %s to project: %d %n", request.getUsername(), request.getProjectId());

        responseObserver.onNext(dao.addCollaborator(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getAllCollaborators(DataAccess.Id request, StreamObserver<DataAccess.UsersResponse> responseObserver) {
        System.out.printf("Received request to get all collaborators from: %d %n", request.getId());
        responseObserver.onNext(dao.getAllCollaborators(request));
        responseObserver.onCompleted();
    }

    @Override
    public void removeCollaborator(DataAccess.UserProjectRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to remove user: %s from project: %d %n", request.getUsername(),request.getProjectId());
        responseObserver.onNext(dao.removeCollaborator(request));
        responseObserver.onCompleted();
    }

    @Override
    public void addUserStory(DataAccess.UserStoryCreationRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to add a user story: %s to project %d %n", request.getTaskBody(),request.getProjectId());
        responseObserver.onNext(dao.addUserStory(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getUserStories(DataAccess.Id request, StreamObserver<DataAccess.UserStoriesResponse> responseObserver) {
        System.out.printf("Received request to get product backlog: %d %n", request.getId());
        responseObserver.onNext(dao.getUserStories(request));
        responseObserver.onCompleted();
    }

    @Override
    public void createSprint(DataAccess.SprintCreationRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to create sprint: %s %n", request.getName());

        responseObserver.onNext(dao.createSprint(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getSprintByProjectId(DataAccess.Id request, StreamObserver<DataAccess.AllSprintsMessage> responseObserver) {
        System.out.printf("Received request to get sprints for project: %s %n", request.getId());

        responseObserver.onNext(dao.getSprintByProjectId(request));
        responseObserver.onCompleted();
    }
}
