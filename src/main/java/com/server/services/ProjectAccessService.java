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
        System.out.printf("Received request to create project: %s", request.getTitle());

        responseObserver.onNext(dao.createProject(request));
        responseObserver.onCompleted();
    }

    @Override
    public void addCollaborator(DataAccess.AddToProjectDto request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to add user to project: %s", request.getUsername());

        responseObserver.onNext(dao.addCollaborator(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getUserStories(DataAccess.Id request, StreamObserver<DataAccess.UserStoriesResponse> responseObserver) {
        System.out.printf("Received request to get product backlog: %s", request.getId());
        responseObserver.onNext(dao.getUserStories(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getAllProjects(DataAccess.Username request, StreamObserver<DataAccess.ProjectsResponse> responseObserver) {
        System.out.printf("Received request to get projects for user: %s", request.getUsername());
        responseObserver.onNext(dao.getAllProjects(request));

        responseObserver.onCompleted();
    }
    @Override
    public void addUserStory(DataAccess.UserStoryMessage request, StreamObserver<DataAccess.ResponseWithID> responseObserver) {
        System.out.printf("Received request to add a user story: %s", request.getTaskBody(),request.getProjectId());
        responseObserver.onNext(dao.addUserStory(request));
        responseObserver.onCompleted();
    }

    @Override
    public void removeCollaborator(DataAccess.AddToProjectDto request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to remove user from project: %s", request.getUsername(),request.getProjectId());
        responseObserver.onNext(dao.removeCollaborator(request));
        responseObserver.onCompleted();;
    }

    @Override
    public void getAllCollaborators(DataAccess.Id request, StreamObserver<DataAccess.FilteredUsersResponse> responseObserver) {
        System.out.printf("Received request to get all collaborators from: %s", request.getId());
        responseObserver.onNext(dao.getAllCollaborators(request));
        responseObserver.onCompleted();;
    }


    @Override
    public void createSprint(DataAccess.SprintCreationRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to create sprint: %s", request.getName());

        responseObserver.onNext(dao.createSprint(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getSprintByID(DataAccess.Id request, StreamObserver<DataAccess.SprintMessage> responseObserver) {
        System.out.printf("Received request to get sprint by ID: %s", request.getId());

        responseObserver.onNext(dao.getSprintById(request));
        responseObserver.onCompleted();
    }


    @Override
    public void getSprintByProjectId(DataAccess.Id request, StreamObserver<DataAccess.AllSprintsMessage> responseObserver) {
        System.out.printf("Received request to get sprints for project: %s", request.getId());

        responseObserver.onNext(dao.getSprintByProjectId(request));
        responseObserver.onCompleted();
    }

    @Override
    public void addTask(DataAccess.TaskRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to create task: %s", request.getBody());

        responseObserver.onNext(dao.addTask(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getTasks(DataAccess.Id request, StreamObserver<DataAccess.AllTasksMessage> responseObserver) {
        System.out.printf("Received request to get the task with ID: %s", request.getId());

        responseObserver.onNext(dao.getTask(request));
        responseObserver.onCompleted();
    }

    @Override
    public void changeTask(DataAccess.ChangeTaskRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to change the task with ID: %s", request.getTaskId());

        responseObserver.onNext(dao.changeTask(request));
        responseObserver.onCompleted();
    }

    @Override
    public void getAllUserStoriesFromSprint(DataAccess.Id request, StreamObserver<DataAccess.UserStoriesResponse> responseObserver) {
        System.out.printf("Received request to get all user stories from sprint: %s", request.getId());

        responseObserver.onNext(dao.getAllUserStoriesFromSprint(request));
        responseObserver.onCompleted();
    }

    @Override
    public void assignTaskTo(DataAccess.AssignTaskMessage request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to assign task to: %s", request.getUsername());

        responseObserver.onNext(dao.assignTaskTo(request));
        responseObserver.onCompleted();
    }

    @Override
    public void addUserStoryToSprint(DataAccess.UserStoryToSprintRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to add user story to sprint: %s", request.getSprintId());

        responseObserver.onNext(dao.addUserStoryToSprint(request));
        responseObserver.onCompleted();
    }

    @Override
    public void removeUserStoryFromSprint(DataAccess.UserStoryToSprintRequest request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to remove user story to sprint: %s", request.getSprintId());

        responseObserver.onNext(dao.removeUserStoryFromSprint(request));
        responseObserver.onCompleted();
    }

    @Override
    public void removeSprint(DataAccess.RemoveSprintMessage request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to remove sprint: %s", request.getSprintId());

        responseObserver.onNext(dao.removeSprint(request));
        responseObserver.onCompleted();
    }

    @Override
    public void removeTask(DataAccess.Id request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to remove task: %s", request.getId());

        responseObserver.onNext(dao.removeTask(request));
        responseObserver.onCompleted();
    }

    @Override
    public void deleteUserStory(DataAccess.Id request, StreamObserver<DataAccess.Response> responseObserver) {
        System.out.printf("Received request to delete user story: %s", request.getId());

        responseObserver.onNext(dao.deleteUserStory(request));
        responseObserver.onCompleted();
    }
}
