package com.database;

import com.protobuf.DataAccess;

import javax.xml.crypto.Data;

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
    int getTotalStoryPoints(DataAccess.Id id);
    DataAccess.Response updateUserStoryPoints(DataAccess.PointsUpdate request);



    //Sprint->
    DataAccess.Response createSprint(DataAccess.SprintCreationRequest sprint);
    DataAccess.SprintMessage getSprintById(DataAccess.Id id);
    DataAccess.AllSprintsMessage getSprintByProjectId(DataAccess.Id id);

    //Task->
    DataAccess.Response addTask(DataAccess.TaskRequest task);
    DataAccess.AllTasksMessage getTask(DataAccess.Id id);
//    DataAccess.Response changeTask(DataAccess.ChangeTaskRequest taskRequest);
    DataAccess.UserStoriesResponse getAllUserStoriesFromSprint(DataAccess.Id sprintId);
    DataAccess.Response assignTaskTo(DataAccess.AssignTaskMessage message);

    DataAccess.Response addUserStoryToSprint(DataAccess.UserStoryToSprintRequest request);

    DataAccess.Response removeUserStoryFromSprint(DataAccess.UserStoryToSprintRequest request);

    DataAccess.Response removeSprint(DataAccess.RemoveSprintMessage request);

    DataAccess.Response removeTask(DataAccess.Id request);

    DataAccess.Response deleteUserStory(DataAccess.Id request);

    DataAccess.Response editTask(DataAccess.TaskRequest request);

}
