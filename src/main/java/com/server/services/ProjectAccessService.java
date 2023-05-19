package com.server.services;

import com.database.IProjectDao;
import com.protobuf.DataAccess;
import com.protobuf.ProjectAccessGrpc;
import io.grpc.stub.StreamObserver;

public class ProjectAccessService extends ProjectAccessGrpc.ProjectAccessImplBase{
    private final IProjectDao dao;

    public ProjectAccessService(IProjectDao dao) {
        this.dao = dao;
    }

    @Override
    public void createProject(DataAccess.ProjectCreationDto request, StreamObserver<DataAccess.ResponseWithID> responseObserver) {
        System.out.printf("Received request to create project: %s %n", request.getTitle());

        responseObserver.onNext(dao.createProject(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getAllProjects(DataAccess.Username request, StreamObserver<DataAccess.ProjectsResponse> responseObserver) {
        System.out.printf("Received request to get projects for user: %s %n", request.getUsername());
        responseObserver.onNext(dao.getAllProjects(request));

        responseObserver.onCompleted();
    }

    @Override
    public void addCollaborator(DataAccess.AddToProjectDto request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to add user: %s to project: %d %n", request.getUsername(), request.getProjectId());

        responseObserver.onNext(dao.addCollaborator(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getAllCollaborators(DataAccess.Id request, StreamObserver<DataAccess.FilteredUsersResponse> responseObserver) {
        System.out.printf("Received request to get all collaborators from: %d %n", request.getId());
        responseObserver.onNext(dao.getAllCollaborators(request));
        responseObserver.onCompleted();;
    }
    @Override
    public void removeCollaborator(DataAccess.AddToProjectDto request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to remove user: %s from project: %d %n", request.getUsername(),request.getProjectId());
        responseObserver.onNext(dao.removeCollaborator(request));
        responseObserver.onCompleted();;
    }

    @Override
    public void addUserStory(DataAccess.UserStoryMessage request, StreamObserver<DataAccess.ResponseWithID> responseObserver) {
        System.out.printf("Received request to add a user story: %s to project %d %n", request.getTaskBody(),request.getProjectId());
        responseObserver.onNext(dao.addUserStory(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getUserStories(DataAccess.Id request, StreamObserver<DataAccess.UserStoriesResponse> responseObserver) {
        System.out.printf("Received request to get product backlog: %d %n", request.getId());
        responseObserver.onNext(dao.getUserStories(request));
        responseObserver.onCompleted();
    }

    @Override
    public void updateUserStoryPoints(DataAccess.PointsUpdate request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to update userStory points %d %n", request.getPoints());
        responseObserver.onNext(dao.updateUserStoryPoints(request));
        responseObserver.onCompleted();
    }

    public void updateStatus(DataAccess.StatusUpdate request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to update status %s %n", request.getStatus());
        responseObserver.onNext(dao.updateStatus(request));
        responseObserver.onCompleted();
    }

    @Override
    public void createSprint(DataAccess.SprintCreationRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to create sprint: %s %n", request.getName());

        responseObserver.onNext(dao.createSprint(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getSprintByID(DataAccess.Id request, StreamObserver<DataAccess.SprintMessage> responseObserver) {
        System.out.printf("Received request to get sprint by ID: %s %n", request.getId());

        responseObserver.onNext(dao.getSprintById(request));
        responseObserver.onCompleted();
    }


    @Override
    public void getSprintByProjectId(DataAccess.Id request, StreamObserver<DataAccess.AllSprintsMessage> responseObserver) {
        System.out.printf("Received request to get sprints for project: %s %n", request.getId());

        responseObserver.onNext(dao.getSprintByProjectId(request));
        responseObserver.onCompleted();
    }

    @Override
    public void addTask(DataAccess.TaskRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to create task: %s %n", request.getBody());

        responseObserver.onNext(dao.addTask(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getTasks(DataAccess.Id request, StreamObserver<DataAccess.AllTasksMessage> responseObserver) {
        System.out.printf("Received request to get the task with ID: %s %n", request.getId());

        responseObserver.onNext(dao.getTask(request));
        responseObserver.onCompleted();
    }


    @Override
    public void getAllUserStoriesFromSprint(DataAccess.Id request, StreamObserver<DataAccess.UserStoriesResponse> responseObserver) {
        System.out.printf("Received request to get all user stories from sprint: %s %n", request.getId());

        responseObserver.onNext(dao.getAllUserStoriesFromSprint(request));
        responseObserver.onCompleted();
    }


    @Override
    public void addUserStoryToSprint(DataAccess.UserStoryToSprintRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to add user story to sprint: %s %n", request.getSprintId());

        responseObserver.onNext(dao.addUserStoryToSprint(request));
        responseObserver.onCompleted();
    }

    @Override
    public void removeUserStoryFromSprint(DataAccess.UserStoryToSprintRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to remove user story to sprint: %s %n", request.getSprintId());

        responseObserver.onNext(dao.removeUserStoryFromSprint(request));
        responseObserver.onCompleted();
    }

    @Override
    public void removeSprint(DataAccess.RemoveSprintMessage request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to remove sprint: %s %n", request.getSprintId());

        responseObserver.onNext(dao.removeSprint(request));
        responseObserver.onCompleted();
    }

    @Override
    public void removeTask(DataAccess.Id request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to remove task: %s %n", request.getId());

        responseObserver.onNext(dao.removeTask(request));
        responseObserver.onCompleted();
    }

    @Override
    public void deleteUserStory(DataAccess.Id request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to delete user story: %s %n", request.getId());

        responseObserver.onNext(dao.deleteUserStory(request));
        responseObserver.onCompleted();
    }

    @Override
    public void editTask(DataAccess.TaskRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to edit task: %s %n", request.getId());

        responseObserver.onNext(dao.editTask(request));
        responseObserver.onCompleted();
    }
}
