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
    public void createProject(DataAccess.ProjectDto request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to create project: %s", request.getTitle());

        try {
            responseObserver.onNext(dao.createProject(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
    }


    @Override
    public void addScrumMaster(DataAccess.AddToProjectDto request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to add scrum master: %s", request.getUser());
        try {
            responseObserver.onNext(dao.addScrumMaster(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void addDeveloper(DataAccess.AddToProjectDto request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to add developer: %s", request.getUser());
        try {
            responseObserver.onNext(dao.addScrumMaster(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
    }

    public void addOwner(DataAccess.AddToProjectDto request, StreamObserver<DataAccess.Response> responseObserver){
        System.out.printf("Received request to add owner: %s", request.getUser());
        try {
            responseObserver.onNext(dao.addOwner(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
    }
}
