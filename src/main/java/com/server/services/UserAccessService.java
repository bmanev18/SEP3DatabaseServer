package com.server.services;

import com.database.DAO;
import com.protobuf.DataAccess;
import com.protobuf.UserAccessGrpc;
import io.grpc.stub.StreamObserver;
import java.sql.SQLException;

public class UserAccessService extends UserAccessGrpc.UserAccessImplBase {
    private final DAO dao;

    public UserAccessService(DAO dao) {
        this.dao = dao;
    }

    @Override
    public void createUser(DataAccess.UserDto request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to create user: %s", request.getUsername());

        try {
            responseObserver.onNext(dao.createUser(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
    }

//    @Override
//    public void login(DataAccess.UserLoginDto request, StreamObserver<DataAccess.LoginResponse> responseObserver) {
//        System.out.printf("Received request to login: %s", request.getUsername());
//
//        try {
//            responseObserver.onNext(dao.loginUser(request));
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        responseObserver.onCompleted();
//    }

    @Override
    public void usersByRole(DataAccess.Role request, StreamObserver<DataAccess.FilteredUsersResponse> responseObserver) {
        System.out.printf("Received request to search user by role: %s", request.getRoleName());

        try {
            responseObserver.onNext(dao.getUsersByRole(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void userByName(DataAccess.UserSearchDto request, StreamObserver<DataAccess.FilteredUsersResponse> responseObserver) {
        System.out.printf("Received request to search user by name: %s", request.getFirstName(), request.getLastName(), request.getUsername());

        try {
            responseObserver.onNext(dao.getUsersByName(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void updateUser(DataAccess.UserDto request, StreamObserver<DataAccess.UpdatedUserResponse> responseObserver) {
        System.out.printf("Received request to update user: %s", request.getUsername(), request.getFirstName(), request.getLastName(), request.getPassword(), request.getRoleId());

        try {
            responseObserver.onNext(dao.updateUser(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void deleteUser(DataAccess.Username request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to login: %s", request.getUsername());

        try {
            responseObserver.onNext(dao.deleteUser(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();    }

    /*@Override
    public void createUser(DataAccess.UserDto request, StreamObserver<DataAccess.UserCreationResponse> responseObserver){
        System.out.printf("Received request to create user: %s", request.getUsername());

        try {
            responseObserver.onNext(dao.createUser(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
    }*/
}
