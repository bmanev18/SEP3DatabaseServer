package com.server;

import com.database.DaoImplementations.ProjectDaoImpl;
import com.database.DaoImplementations.SprintDaoImpl;
import com.database.DaoImplementations.UserDaoImpl;
import com.database.DaoImplementations.UserStoryDaoImpl;
import com.database.DaoInterfaces.IProjectDao;
import com.database.DaoInterfaces.ISprintDao;
import com.database.DaoInterfaces.IUserDao;
import com.database.DaoInterfaces.IUserStoryDao;
import com.server.services.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.sql.SQLException;

public class StartServer {
    public static void main(String[] args) throws SQLException, IOException, InterruptedException {

        IProjectDao projectDao = new ProjectDaoImpl();
        IUserDao userDao = new UserDaoImpl();
        IUserStoryDao storyDao = new UserStoryDaoImpl();
        ISprintDao sprintDao = new SprintDaoImpl();

        Server server= ServerBuilder.forPort(9111)
                .addService(new UserAccessService(userDao))
                .addService(new ProjectAccessService(projectDao))
                .addService(new UserStoryAccessService(storyDao))
                .addService(new SprintAccessService(sprintDao))
                .build();
        server.start();
        System.out.println("Server started");
        server.awaitTermination();
    }
}
