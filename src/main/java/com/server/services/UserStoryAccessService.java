package com.server.services;

import com.database.DaoInterfaces.IUserStoryDao;
import com.protobuf.DataAccess;
import com.protobuf.UserStoryAccessGrpc;
import io.grpc.stub.StreamObserver;

public class UserStoryAccessService extends UserStoryAccessGrpc.UserStoryAccessImplBase {

    private final IUserStoryDao dao;

    public UserStoryAccessService(IUserStoryDao storyDao) {
        dao = storyDao;
    }

    @Override
    public void updateUserStoryPoints(DataAccess.PointsUpdate request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to update userStory points %d %n", request.getPoints());

        responseObserver.onNext(dao.updateUserStoryPoints(request));
        responseObserver.onCompleted();
    }

    @Override
    public void updateUserStoryStatus(DataAccess.StatusUpdate request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to update status %s %n", request.getStatus());

        responseObserver.onNext(dao.updateUserStoryStatus(request));
        responseObserver.onCompleted();
    }

    @Override
    public void updateUserStoryPriority(DataAccess.PriorityUpdate request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to update status %s %n", request.getPriority());

        responseObserver.onNext(dao.updateUserStoryPriority(request));
        responseObserver.onCompleted();
    }

    @Override
    public void deleteUserStory(DataAccess.Id request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to delete user story: %s %n", request.getId());

        responseObserver.onNext(dao.deleteUserStory(request));
        responseObserver.onCompleted();
    }

    @Override
    public void addTask(DataAccess.TaskCreationRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to create task: %s %n", request.getBody());

        responseObserver.onNext(dao.addTask(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getTasks(DataAccess.Id request, StreamObserver<DataAccess.TasksMessage> responseObserver) {
        System.out.printf("Received request to get the task with ID: %s %n", request.getId());

        responseObserver.onNext(dao.getTask(request));
        responseObserver.onCompleted();
    }

    @Override
    public void editTask(DataAccess.TaskMessage request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to edit task: %s %n", request.getId());

        responseObserver.onNext(dao.editTask(request));
        responseObserver.onCompleted();
    }

    @Override
    public void removeTask(DataAccess.Id request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to remove task: %s %n", request.getId());

        responseObserver.onNext(dao.removeTask(request));
        responseObserver.onCompleted();
    }

}
