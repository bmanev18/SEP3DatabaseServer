package com.database.DaoInterfaces;

import com.protobuf.DataAccess;

public interface IUserStoryDao {
    DataAccess.Response updateUserStoryPoints(DataAccess.PointsUpdate request);
    DataAccess.Response updateUserStoryStatus(DataAccess.StatusUpdate request);
    DataAccess.Response updateUserStoryPriority(DataAccess.PriorityUpdate request);
    DataAccess.Response deleteUserStory(DataAccess.Id request);
    DataAccess.Response addTask(DataAccess.TaskCreationRequest task);
    DataAccess.TasksMessage getTask(DataAccess.Id id);
    DataAccess.Response editTask(DataAccess.TaskMessage request);
    DataAccess.Response removeTask(DataAccess.Id request);


}
