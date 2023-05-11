package com.server.services;

import com.database.DAO;
import com.database.IProjectDao;
import com.protobuf.DataAccess;
import com.protobuf.ProjectAccessGrpc;
import io.grpc.stub.StreamObserver;

import javax.xml.crypto.Data;
import java.sql.SQLException;

public class ProjectAccessService extends ProjectAccessGrpc.ProjectAccessImplBase{
    private final IProjectDao dao;

    public ProjectAccessService(IProjectDao dao) {
        this.dao = dao;
    }

    @Override
    public void createProject(DataAccess.ProjectCreationDto request, StreamObserver<DataAccess.ResponseWithID> responseObserver) {
        System.out.printf("Received request to create project: %s", request.getTitle());

        responseObserver.onNext(dao.createProject(request));
        responseObserver.onCompleted();
    }

    @Override
    public void addCollaborator(DataAccess.AddToProjectDto request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to add user to project: %s", request.getUsername());

        responseObserver.onNext(dao.addCollaborator(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getProductBacklog(DataAccess.Id request, StreamObserver<DataAccess.UserStoriesResponse> responseObserver) {
        System.out.printf("Received request to get product backlog: %s", request.getId());
        responseObserver.onNext(dao.getProductBacklog(request));
        responseObserver.onCompleted();
    }
    @Override
    public void getAllProjects(DataAccess.Username request, StreamObserver<DataAccess.ProjectsResponse> responseObserver) {
        System.out.printf("Received request to get projects for user: %s", request.getUsername());
        responseObserver.onNext(dao.getAllProjects(request));

        responseObserver.onCompleted();
    }
    @Override
    public void addUserStory(DataAccess.UserStoryMessage request, StreamObserver<DataAccess.ResponseWithID> responseObserver) {
        System.out.printf("Received request to add a user story: %s", request.getTaskBody(),request.getProjectId());
        responseObserver.onNext(dao.addUserStory(request));
        responseObserver.onCompleted();
    }

    @Override
    public void removeCollaborator(DataAccess.AddToProjectDto request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to remove user from project: %s", request.getUsername(),request.getProjectId());
        responseObserver.onNext(dao.removeCollaborator(request));
        responseObserver.onCompleted();;
    }

    @Override
    public void getAllCollaborators(DataAccess.Id request, StreamObserver<DataAccess.FilteredUsersResponse> responseObserver) {
        System.out.printf("Received request to get all collaborators from: %s", request.getId());
        responseObserver.onNext(dao.getAllCollaborators(request));
        responseObserver.onCompleted();;
    }

}
