package com.database;

import com.protobuf.DataAccess;

import javax.xml.crypto.Data;
import java.sql.SQLException;

public interface DAO {
    DataAccess.Response createUser(DataAccess.UserCreationDto dto) throws SQLException;
    DataAccess.ResponseWithID createProject(DataAccess.ProjectCreationDto dto) throws SQLException;
    DataAccess.Response addCollaborator(DataAccess.AddToProjectDto dto) throws SQLException;
    DataAccess.FilteredUsersResponse getUsersByRole(DataAccess.Role dto) throws SQLException;
    DataAccess.FilteredUsersResponse getUsersByName(DataAccess.UserSearchDto dto) throws SQLException;
    DataAccess.UpdatedUserResponse updateUser(DataAccess.UserCreationDto dto) throws SQLException;
    DataAccess.Response deleteUser(DataAccess.Username dto) throws SQLException;
    DataAccess.UserCreationDto getUserByUsername(DataAccess.Username username) throws SQLException;
    DataAccess.ProjectsResponse getAllProjects (DataAccess.Username username) throws SQLException;
    DataAccess.ProductBacklogResponse getProductBacklog(DataAccess.Id id) throws SQLException;
    DataAccess.ResponseWithID addUserStory(DataAccess.UserStoryMessage userStory) throws SQLException;
    DataAccess.FilteredUsersResponse getAllCollaborators (DataAccess.Id id) throws SQLException;
    DataAccess.ResponseWithID removeCollaborator (DataAccess.AddToProjectDto user) throws SQLException;



}
