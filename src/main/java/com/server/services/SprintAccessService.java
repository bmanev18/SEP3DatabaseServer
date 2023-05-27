package com.server.services;

import com.database.DaoInterfaces.ISprintDao;
import com.protobuf.DataAccess;
import com.protobuf.SprintAccessGrpc;
import io.grpc.stub.StreamObserver;

public class SprintAccessService extends SprintAccessGrpc.SprintAccessImplBase {

    private final ISprintDao dao;

    public SprintAccessService(ISprintDao sprintDao) {
        dao = sprintDao;
    }


    @Override
    public void getSprintByID(DataAccess.Id request, StreamObserver<DataAccess.SprintMessage> responseObserver) {
        System.out.printf("Received request to get sprint by ID: %s %n", request.getId());

        responseObserver.onNext(dao.getSprintById(request));
        responseObserver.onCompleted();
    }

    @Override
    public void removeSprint(DataAccess.Id request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to remove sprint: %s %n", request.getId());

        responseObserver.onNext(dao.removeSprint(request));
        responseObserver.onCompleted();
    }

    @Override
    public void addUserStoryToSprint(DataAccess.UserStorySprintRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to add user story to sprint: %s %n", request.getSprintId());

        responseObserver.onNext(dao.addUserStoryToSprint(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getAllUserStoriesFromSprint(DataAccess.Id request, StreamObserver<DataAccess.UserStoriesResponse> responseObserver) {
        System.out.printf("Received request to get all user stories from sprint: %s %n", request.getId());

        responseObserver.onNext(dao.getAllUserStoriesFromSprint(request));
        responseObserver.onCompleted();
    }

    @Override
    public void removeUserStoryFromSprint(DataAccess.UserStorySprintRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to remove user story to sprint: %s %n", request.getSprintId());

        responseObserver.onNext(dao.removeUserStoryFromSprint(request));
        responseObserver.onCompleted();
    }
}
