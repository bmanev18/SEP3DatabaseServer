package com.server;

import com.database.*;
import com.server.services.ProjectAccessService;
import com.server.services.UserAccessService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.sql.SQLException;

public class StartServer {
    public static void main(String[] args) throws SQLException, IOException, InterruptedException {
        DatabaseDriver driver;

        IProjectDao projectDao = new ProjectDaoImpl();
        IUserDao userDao = new UserDaoImpl();
        Server server= ServerBuilder.forPort(9111).addService(new UserAccessService(userDao)).addService(new ProjectAccessService(projectDao)).build();
        server.start();
        System.out.println("Server started");
        server.awaitTermination();
    }
}
