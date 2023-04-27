package com.database;

import com.protobuf.DataAccess;

import java.sql.SQLException;

public interface DAO {
    DataAccess.Response createUser(DataAccess.UserDto dto) throws SQLException;
    DataAccess.Response createProject(DataAccess.ProjectDto dto) throws SQLException;
    DataAccess.Response addDeveloper(DataAccess.AddToProjectDto dto) throws SQLException;
    DataAccess.Response addScrumMaster(DataAccess.AddToProjectDto dto) throws SQLException;

    DataAccess.Response addOwner(DataAccess.AddToProjectDto dto) throws SQLException;
}
