package com.database;

import com.protobuf.DataAccess;

import javax.xml.crypto.Data;
import java.sql.SQLException;

public interface DAO {
    DataAccess.Response createUser(DataAccess.UserDto dto) throws SQLException;
    DataAccess.Response createProject(DataAccess.ProjectDto dto) throws SQLException;
    DataAccess.Response addDeveloper(DataAccess.AddToProjectDto dto) throws SQLException;
    DataAccess.Response addScrumMaster(DataAccess.AddToProjectDto dto) throws SQLException;
    DataAccess.FilteredUsersResponse getUsersByRole(DataAccess.Role dto) throws SQLException;
    DataAccess.FilteredUsersResponse getUsersByName(DataAccess.UserSearchDto dto) throws SQLException;
    DataAccess.UpdatedUserResponse updateUser(DataAccess.UserDto dto) throws SQLException;
    DataAccess.Response deleteUser(DataAccess.Username dto) throws SQLException;



}
