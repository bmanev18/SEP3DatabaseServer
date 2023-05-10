package com.database;

import com.protobuf.DataAccess;

import java.sql.SQLException;

public interface DAO {

    // User->
    DataAccess.Response createUser(DataAccess.UserCreationDto dto) throws SQLException;

    DataAccess.UserCreationDto getUserByUsername(DataAccess.Username username) throws SQLException;

    DataAccess.UpdatedUserResponse updateUser(DataAccess.UserCreationDto dto) throws SQLException;

    DataAccess.Response deleteUser(DataAccess.Username dto) throws SQLException;

    DataAccess.FilteredUsersResponse lookForUsers(DataAccess.Username username) throws SQLException;


    // Project->
    DataAccess.ResponseWithID createProject(DataAccess.ProjectCreationDto dto) throws SQLException;

    DataAccess.ProjectsResponse getAllProjects(DataAccess.Username username) throws SQLException;

    // Collaborator->
    DataAccess.FilteredUsersResponse getAllCollaborators(DataAccess.Id id) throws SQLException;

    DataAccess.Response addCollaborator(DataAccess.AddToProjectDto dto) throws SQLException;

    DataAccess.Response removeCollaborator(DataAccess.AddToProjectDto user) throws SQLException;


    // UserStory->
    DataAccess.ResponseWithID addUserStory(DataAccess.UserStoryMessage userStory) throws SQLException;

    DataAccess.UserStoriesResponse getProductBacklog(DataAccess.Id id) throws SQLException;
}