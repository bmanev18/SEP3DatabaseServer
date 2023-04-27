package com.server;

import com.database.DAO;
import com.database.DAOImpl;
import com.server.services.ProjectAccessService;
import com.server.services.UserAccessService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.sql.SQLException;

public class StartServer {
    public static void main(String[] args) throws SQLException, IOException, InterruptedException {
        DAO dao = new DAOImpl();
        Server server= ServerBuilder.forPort(9111).addService(new UserAccessService(dao)).addService(new ProjectAccessService(dao)).build();
        server.start();
        System.out.println("Server started");
        server.awaitTermination();
    }
}
