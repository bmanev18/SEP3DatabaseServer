package com.database.DaoInterfaces;

import com.protobuf.DataAccess;

public interface ISprintDao {
    DataAccess.SprintMessage getSprintById(DataAccess.Id id);
    DataAccess.Response removeSprint(DataAccess.Id request);
    DataAccess.Response addUserStoryToSprint(DataAccess.UserStorySprintRequest request);
    DataAccess.UserStoriesResponse getAllUserStoriesFromSprint(DataAccess.Id sprintId);
    DataAccess.Response removeUserStoryFromSprint(DataAccess.UserStorySprintRequest request);
}
