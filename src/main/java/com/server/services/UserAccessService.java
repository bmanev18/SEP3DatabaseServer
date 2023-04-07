package com.server.services;

import com.database.DAO;
import com.database.DAOImpl;
import com.protobuf.DataAccess;
import com.protobuf.UserAccessGrpc;
import io.grpc.stub.StreamObserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserAccessService extends UserAccessGrpc.UserAccessImplBase {
    private final DAO dao;

    public UserAccessService(DAO dao) throws SQLException {
        this.dao = dao;
    }

    @Override
    public void createUser(DataAccess.UserCreationDto request, StreamObserver<DataAccess.UserCreationResponse> responseObserver){
        System.out.printf("Received request to create user: %s", request.getUsername());

        try {
            responseObserver.onNext(dao.createUser(request));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onCompleted();
    }
}
