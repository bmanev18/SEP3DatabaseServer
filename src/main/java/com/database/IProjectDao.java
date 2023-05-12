package com.database;

import com.protobuf.DataAccess;

public interface IProjectDao {
    DataAccess.ResponseWithID createProject(DataAccess.ProjectCreationDto dto);

    DataAccess.ProjectsResponse getAllProjects(DataAccess.Username username);

    // Collaborator->
    DataAccess.FilteredUsersResponse getAllCollaborators(DataAccess.Id id);

    DataAccess.Response addCollaborator(DataAccess.AddToProjectDto dto) ;

    DataAccess.Response removeCollaborator(DataAccess.AddToProjectDto user);


    // UserStory->
    DataAccess.ResponseWithID addUserStory(DataAccess.UserStoryMessage userStory) ;

    DataAccess.UserStoriesResponse getUserStories(DataAccess.Id id) ;
}
