package com.database.DaoInterfaces;

import com.protobuf.DataAccess;

import javax.xml.crypto.Data;

public interface IProjectDao {
    DataAccess.Response createProject(DataAccess.ProjectCreationRequest request);

    DataAccess.Response addCollaborator(DataAccess.UserProjectRequest request) ;
    DataAccess.UsersResponse getAllCollaborators(DataAccess.Id id);
    DataAccess.Response removeCollaborator(DataAccess.UserProjectRequest request);

    DataAccess.Response addUserStory(DataAccess.UserStoryCreationRequest userStory) ;
    DataAccess.UserStoriesResponse getUserStories(DataAccess.Id id) ;
    DataAccess.Response createSprint(DataAccess.SprintCreationRequest sprint);
    DataAccess.AllSprintsMessage getSprintByProjectId(DataAccess.Id id);

    DataAccess.Response createMeetingNote(DataAccess.MeetingNote request);
    DataAccess.MeetingResponse getMeetingNotes(DataAccess.Id id);


    //Task->
    /*
//    DataAccess.Response changeTask(DataAccess.ChangeTaskRequest taskRequest);

*/

}
