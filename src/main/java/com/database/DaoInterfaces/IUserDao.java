package com.database.DaoInterfaces;

import com.protobuf.DataAccess;

public interface IUserDao {
    DataAccess.Response createUser(DataAccess.UserMessage user) ;

    DataAccess.UserMessage getUserByUsername(DataAccess.Username username) ;

    DataAccess.ProjectsResponse getAllProjects(DataAccess.Username username);

    DataAccess.UsersResponse lookForUsers(DataAccess.Username username) ;

    DataAccess.Response updateUser(DataAccess.UserMessage message) ;

    DataAccess.Response deleteUser(DataAccess.Username username) ;
}
