package com.database;

import com.protobuf.DataAccess;

public interface IUserDao {
    DataAccess.Response createUser(DataAccess.UserCreationDto dto) ;

    DataAccess.UserCreationDto getUserByUsername(DataAccess.Username username) ;

    DataAccess.UpdatedUserResponse updateUser(DataAccess.UserCreationDto dto) ;

    DataAccess.Response deleteUser(DataAccess.Username dto) ;

    DataAccess.FilteredUsersResponse lookForUsers(DataAccess.Username username) ;

    DataAccess.ProjectsResponse getAllProjects(DataAccess.Username request);
}
