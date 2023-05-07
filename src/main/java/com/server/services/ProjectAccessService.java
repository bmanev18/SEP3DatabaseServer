package com.server.services;

import com.database.DAO;
import com.protobuf.DataAccess;
import com.protobuf.ProjectAccessGrpc;
import io.grpc.stub.StreamObserver;

import javax.xml.crypto.Data;
import java.sql.SQLException;

public class ProjectAccessService extends ProjectAccessGrpc.ProjectAccessImplBase{
    private final DAO dao;

    public ProjectAccessService(DAO dao) {
        this.dao = dao;
    }

    @Override
    public void createProject(DataAccess.ProjectCreationDto request, StreamObserver<DataAccess.ResponseWithID> responseObserver) {
        System.out.printf("Received request to create project: %s", request.getTitle());

        try {
            responseObserver.onNext(dao.createProject(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void addCollaborator(DataAccess.AddToProjectDto request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to add user to project: %s", request.getUsername());

        try {
            responseObserver.onNext(dao.addCollaborator(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getProductBacklog(DataAccess.Id request, StreamObserver<DataAccess.ProductBacklogResponse> responseObserver) {
        System.out.printf("Received request to get product backlog: %s", request.getId());
        try {
            responseObserver.onNext(dao.getProductBacklog(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
    }
    @Override
    public void getAllProjects(DataAccess.Username request, StreamObserver<DataAccess.ProjectsResponse> responseObserver) {
        System.out.printf("Received request to get projects for user: %s", request.getUsername());
        try {
            responseObserver.onNext(dao.getAllProjects(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
    }
    @Override
    public void addUserStory(DataAccess.UserStoryMessage request, StreamObserver<DataAccess.ResponseWithID> responseObserver) {
        System.out.printf("Received request to add a user story: %s", request.getTaskBody(),request.getProjectId());
        try {
            responseObserver.onNext(dao.addUserStory(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void removeCollaborator(DataAccess.AddToProjectDto request, StreamObserver<DataAccess.ResponseWithID> responseObserver) {
        System.out.printf("Received request to remove user from project: %s", request.getUsername(),request.getProjectId());
        try {
            responseObserver.onNext(dao.removeCollaborator(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();;
    }

    @Override
    public void getAllCollaborators(DataAccess.Id request, StreamObserver<DataAccess.FilteredUsersResponse> responseObserver) {
        System.out.printf("Received request to get all collaborators from: %s", request.getId());
        try {
            responseObserver.onNext(dao.getAllCollaborators(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();;
    }

}
