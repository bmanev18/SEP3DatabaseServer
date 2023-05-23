package com.server.services;

import com.database.IUserDao;
import com.protobuf.DataAccess;
import com.protobuf.UserAccessGrpc;
import io.grpc.stub.StreamObserver;

public class UserAccessService extends UserAccessGrpc.UserAccessImplBase {
    private final IUserDao dao;

    public UserAccessService(IUserDao dao) {
        this.dao = dao;
    }

    @Override
    public void createUser(DataAccess.UserCreationDto request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to create user: %s %n", request.getUsername());

        responseObserver.onNext(dao.createUser(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getAllProjects(DataAccess.Username request, StreamObserver<DataAccess.ProjectsResponse> responseObserver) {
        System.out.printf("Received request to get projects for user: %s %n", request.getUsername());
        responseObserver.onNext(dao.getAllProjects(request));

        responseObserver.onCompleted();
    }

    @Override
    public void userByUsername(DataAccess.Username request, StreamObserver<DataAccess.UserCreationDto> responseObserver) {
        System.out.printf("Received request to search user by username: %s%n", request.getUsername());
        responseObserver.onNext(dao.getUserByUsername(request));
        responseObserver.onCompleted();
    }

    @Override
    public void updateUser(DataAccess.UserCreationDto request, StreamObserver<DataAccess.UpdatedUserResponse> responseObserver) {
        System.out.printf("Received request to update user: %s%n", request.getUsername());

        responseObserver.onNext(dao.updateUser(request));
        responseObserver.onCompleted();
    }

    @Override
    public void deleteUser(DataAccess.Username request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to login: %s%n", request.getUsername());

        responseObserver.onNext(dao.deleteUser(request));
        responseObserver.onCompleted();
    }

    @Override
    public void lookForUsers(DataAccess.Username request, StreamObserver<DataAccess.FilteredUsersResponse> responseObserver) {
        System.out.printf("Received request to find users: %s%n", request.getUsername());
        responseObserver.onNext(dao.lookForUsers(request));
        responseObserver.onCompleted();
    }
}
