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
