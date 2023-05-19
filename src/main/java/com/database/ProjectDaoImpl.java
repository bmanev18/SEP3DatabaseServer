package com.database;

import com.protobuf.DataAccess;

import java.sql.*;

public class ProjectDaoImpl implements IProjectDao {


    private final DatabaseDriver driver;

    public ProjectDaoImpl() {
        driver = DatabaseDriver.getInstance();
    }

    @Override
    public DataAccess.ResponseWithID createProject(DataAccess.ProjectCreationDto dto) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement1 = connection.prepareStatement("INSERT INTO project(title) VALUES(?) returning id;");
            PreparedStatement statement2 = connection.prepareStatement("INSERT INTO worksOn(username, project_id) VALUES(?,?); ");

            statement1.setString(1, dto.getTitle());
            ResultSet rs1 = statement1.executeQuery();
            int code = 404;
            int id = -1;
            int project_id = rs1.getInt("id");

            if (rs1.next()) {
                code = 200;
                id = rs1.getInt("id");
            }
            statement1.close();

            statement2.setString(1, dto.getOwnerUsername());
            statement2.setInt(2, project_id);
            statement2.executeUpdate();

            statement2.close();
            return DataAccess.ResponseWithID.newBuilder().setCode(code).setId(id).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public DataAccess.ProjectsResponse getAllProjects(DataAccess.Username username) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from project, worksOn where id= worksOn.project_id and username = ?");
            statement.setString(1, username.getUsername());
            ResultSet rs = statement.executeQuery();
            DataAccess.ProjectsResponse.Builder builder = DataAccess.ProjectsResponse.newBuilder();

            int code = 404;
            while (rs.next()) {
                builder.addProjects(DataAccess.ProjectMessage.newBuilder().setId(rs.getInt("id")).setTitle(rs.getString("title")));

                code = 200;
            }
            statement.close();
            return builder.setCode(code).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public DataAccess.FilteredUsersResponse getAllCollaborators(DataAccess.Id id) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from user,worksOn where user.username = worksOn.username and project_id = ?");
            statement.setInt(1, id.getId());
            ResultSet rs = statement.executeQuery();

            DataAccess.FilteredUsersResponse.Builder builder = DataAccess.FilteredUsersResponse.newBuilder();
            int code = 404;
            while (rs.next()) {
                builder.addUsers(DataAccess.UserSearchDto.newBuilder()
                        .setUsername(rs.getString("username"))
                        .setFirstName(rs.getString("firstname"))
                        .setLastName(rs.getString("lastname"))
                        .setRole(String.valueOf(rs.getInt("role_id")))
                        .build());
                code = 200;
            }
            statement.close();
            return builder.setCode(code).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response addCollaborator(DataAccess.AddToProjectDto dto) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO worksOn(username, project_id) VALUES (?,?)");
            statement.setString(1, dto.getUsername());
            statement.setInt(2, dto.getProjectId());
            int rowsAffected = statement.executeUpdate();
            statement.close();

            int code = 404;

            if (rowsAffected == 1) {
                code = 200;
            }
            return DataAccess.Response.newBuilder()
                    .setCode(code)
                    .build();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public DataAccess.Response removeCollaborator(DataAccess.AddToProjectDto user) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("DELETE from worksOn where  username = ? and project_id = ?");
            statement.setString(1, user.getUsername());
            statement.setInt(2, user.getProjectId());

            int rowsAffected = statement.executeUpdate();
            int code = 404;
            if (rowsAffected == 1) {
                code = 200;
            }
            statement.close();
            return DataAccess.Response.newBuilder().
                    setCode(code).
                    build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    // UserStory->
    @Override
    public DataAccess.ResponseWithID addUserStory(DataAccess.UserStoryMessage userStory) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO userStory( project_id,body, priority, status_id, storyPoint) VALUES (?,?,?,?,?) returning id");
            statement.setString(2, userStory.getTaskBody());
            statement.setInt(1, userStory.getProjectId());
            statement.setString(2, userStory.getTaskBody());
            statement.setString(3, userStory.getPriority());
            statement.setInt(4, getStatusId(userStory.getStatus()));
            statement.setInt(5, userStory.getStoryPoint());

            ResultSet resultSet = statement.executeQuery();

            int code = 404;
            int id = -1;
            if (resultSet.next()) {
                code = 200;
                id = resultSet.getInt("id");
            }
            statement.close();
            return DataAccess.ResponseWithID.newBuilder()
                    .setId(id)
                    .setCode(code)
                    .build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public DataAccess.UserStoriesResponse getUserStories(DataAccess.Id id) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from userStory where project_id=?;");
            statement.setInt(1, id.getId());
            ResultSet rs = statement.executeQuery();
            DataAccess.UserStoriesResponse.Builder builder = DataAccess.UserStoriesResponse.newBuilder();

            int code = 404;
            while (rs.next()) {
                builder.addUserStories(DataAccess.UserStory.newBuilder()
                        .setId(rs.getInt("id"))
                        .setProjectId(rs.getInt("project_id"))
                        .setUserStory(rs.getString("body"))
                        .setPriority(rs.getString("priority"))
                        .setStatus(getStatusName(rs.getInt("status_id")))
                        .setStoryPoint(rs.getInt("storyPoint"))
                        .build());
                code = 200;
            }
            statement.close();

            return builder.setCode(code).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int getTotalStoryPoints(DataAccess.Id id) {
//        try(Connection connection=DatabaseDriver.getInstance().getConnection()){
//            PreparedStatement statement=connection.prepareStatement(" ");
//
//
//            return 0;
//        }
//        catch(SQLException e){
//            throw new RuntimeException(e);
//        }
        return 0;
    }

    public DataAccess.Response updateUserStoryPoints(DataAccess.PointsUpdate request) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE userStory SET  storyPoint = ? WHERE id = ?"
            );
            statement.setInt(1, request.getPoints());
            statement.setInt(2, request.getId());
            int rowsAffected = statement.executeUpdate();
            statement.close();

            if (rowsAffected > 0) {
                return DataAccess.Response.newBuilder()
                        .setCode(200)
                        .build();
            } else {
                return DataAccess.Response.newBuilder()
                        .setCode(404)
                        .build();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response updateStatus(DataAccess.StatusUpdate request) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("UPDATE userStory SET status_id=? where id =?");
            statement.setInt(1, getStatusId(request.getStatus()));
            statement.setInt(2, request.getId());
            int rowsAffected = statement.executeUpdate();
            statement.close();

            if (rowsAffected > 0) {
                return DataAccess.Response.newBuilder()
                        .setCode(200)
                        .build();
            } else {
                return DataAccess.Response.newBuilder()
                        .setCode(404)
                        .build();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public DataAccess.Response createSprint(DataAccess.SprintCreationRequest sprint) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO sprint(project_id, name, startDate, endDate) VALUES (?,?,?,?)");
            statement.setInt(1, sprint.getProjectId());
            statement.setString(2, sprint.getName());
            statement.setString(3, String.valueOf(sprint.getStarDate()));
            statement.setString(4, String.valueOf(sprint.getEndDate()));

            int rowsInserted = statement.executeUpdate();

            int code = 404;
            if (rowsInserted > 0) {
                code = 200;
            }

            statement.close();

            return DataAccess.Response.newBuilder().setCode(code).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.SprintMessage getSprintById(DataAccess.Id id) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from sprint where id=?;");
            statement.setInt(1, id.getId());
            ResultSet rs = statement.executeQuery();
            DataAccess.SprintMessage.Builder builder = DataAccess.SprintMessage.newBuilder();

            int code = 404;
            if (rs.next()) {
                builder.setId(rs.getInt("id"))
                        .setProjectId(rs.getInt("project_id"))
                        .setName(rs.getString("name"))
                        .setStarDate(rs.getString("startDate"))
                        .setEndDate(rs.getString("endDate"))
                        .build();
                code = 200;
            }

            statement.close();

            return builder.setCode(code).build();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.AllSprintsMessage getSprintByProjectId(DataAccess.Id id) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from sprint where project_id=?;");
            statement.setInt(1, id.getId());
            ResultSet rs = statement.executeQuery();
            DataAccess.AllSprintsMessage.Builder builder = DataAccess.AllSprintsMessage.newBuilder();

            int code = 404;
            while (rs.next()) {
                builder.addSprints(DataAccess.SprintMessage.newBuilder().setId(rs.getInt("id"))
                        .setProjectId(rs.getInt("project_id"))
                        .setName(rs.getString("name"))
                        .setStarDate(rs.getString("startDate"))
                        .setEndDate(rs.getString("endDate")).build());
                code = 200;
            }

            statement.close();

            return builder.setCode(code).build();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response addTask(DataAccess.TaskRequest task) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO task(assignee, body, status_id,story_id,storyPoints) VALUES (?,?,?,?,?)");
            statement.setString(1, task.getAsignee());
            statement.setString(2, task.getBody());
            statement.setInt(3, getStatusId(task.getStatus()));
            statement.setInt(4, task.getStoryId());
            statement.setInt(5, task.getStoryPoints());

            int rowsInserted = statement.executeUpdate();

            int code = 404;
            if (rowsInserted > 0) {
                code = 200;
            }

            statement.close();

            return DataAccess.Response.newBuilder().setCode(code).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private int getStatusId(String status) {
        int id = 1;
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("Select id from status where status = ?");
            statement.setString(1, status);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                id = result.getInt("id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    private String getStatusName(int id) {
        String status = "";
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("Select status from status where id = ?");
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                status = result.getString("status");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return status;
    }

    //error404
    @Override
    public DataAccess.AllTasksMessage getTask(DataAccess.Id id) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from task where story_id= ?");
            statement.setInt(1, id.getId());
            ResultSet rs = statement.executeQuery();

            DataAccess.AllTasksMessage.Builder builder = DataAccess.AllTasksMessage.newBuilder();
            int code = 404;

            while (rs.next()) {
                DataAccess.TaskRequest task = DataAccess.TaskRequest.newBuilder()
                        .setId(rs.getInt("id"))
                        .setBody(rs.getString("body"))
                        .setStatus(getStatusName(rs.getInt("status_id")))
                        .setAsignee(rs.getString("assignee"))
                        .setStoryPoints(rs.getInt("storyPoints"))
                        .build();
                builder.addTasks(task);
                code = 200;
            }
            builder.setCode(code);
            statement.close();

            return builder.build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //error404
//    @Override
//    public DataAccess.Response changeTask(DataAccess.ChangeTaskRequest taskRequest) {
//        int taskId = taskRequest.getTaskId();
//        String newStatus = taskRequest.getStatus();
//
//        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
//            PreparedStatement statement = connection.prepareStatement(
//                    "UPDATE task SET status_id = ? WHERE id = ?"
//            );
////            statement.setBoolean(1, newStatus);
//            statement.setInt(2, taskId);
//            int rowsAffected = statement.executeUpdate();
//            statement.close();
//
//            if (rowsAffected > 0) {
//                return DataAccess.Response.newBuilder()
//                        .setCode(200)
//                        .build();
//            } else {
//                return DataAccess.Response.newBuilder()
//                        .setCode(404)
//                        .build();
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

    @Override
    public DataAccess.UserStoriesResponse getAllUserStoriesFromSprint(DataAccess.Id sprintId) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from userStory,storyInSprint where storyInSprint.userStory= userStory.id and sprint = ?;");
            statement.setInt(1, sprintId.getId());
            ResultSet rs = statement.executeQuery();
            DataAccess.UserStoriesResponse.Builder builder = DataAccess.UserStoriesResponse.newBuilder();

            int code = 404;
            while (rs.next()) {
                builder.addUserStories(DataAccess.UserStory.newBuilder()
                        .setId(rs.getInt("id"))
                        .setProjectId(rs.getInt("project_id"))
                        .setUserStory(rs.getString("body"))
                        .setPriority(rs.getString("priority"))
                        .setStatus(getStatusName(rs.getInt("status_id")))
                        .setStoryPoint(rs.getInt("storyPoint"))
                        .build());
                code = 200;
            }
            statement.close();

            return builder.setCode(code).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response assignTaskTo(DataAccess.AssignTaskMessage message) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE task SET assignee = ? WHERE id = ?"
            );
            statement.setString(1, message.getUsername().getUsername());
            statement.setInt(2, message.getTaskId());
            int rowsAffected = statement.executeUpdate();
            statement.close();

            if (rowsAffected > 0) {
                return DataAccess.Response.newBuilder()
                        .setCode(200)
                        .build();
            } else {
                return DataAccess.Response.newBuilder()
                        .setCode(404)
                        .build();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response addUserStoryToSprint(DataAccess.UserStoryToSprintRequest request) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO storyInSprint(sprint, userStory) VALUES (?,?) ");
            statement.setInt(1, request.getSprintId());
            statement.setInt(2, request.getUserStoryId());

            int rowsInserted = statement.executeUpdate();

            int code = 404;
            if (rowsInserted > 0) {
                code = 200;
            }

            statement.close();

            return DataAccess.Response.newBuilder().setCode(code).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response removeUserStoryFromSprint(DataAccess.UserStoryToSprintRequest request) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM storyInSprint where sprint = ? and userStory = ?");
            statement.setInt(1, request.getSprintId());
            statement.setInt(2, request.getUserStoryId());

            int rowsInserted = statement.executeUpdate();

            int code = 404;
            if (rowsInserted > 0) {
                code = 200;
            }

            statement.close();

            return DataAccess.Response.newBuilder().setCode(code).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response removeSprint(DataAccess.RemoveSprintMessage request) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM sprint where project_id= ? and id = ?");
            statement.setInt(1, request.getProjectId());
            statement.setInt(2, request.getSprintId());

            int rowsInserted = statement.executeUpdate();

            int code = 404;
            if (rowsInserted > 0) {
                code = 200;
            }

            statement.close();

            return DataAccess.Response.newBuilder().setCode(code).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response removeTask(DataAccess.Id request) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM task where id = ?");
            statement.setInt(1, request.getId());

            int rowsInserted = statement.executeUpdate();

            int code = 404;
            if (rowsInserted > 0) {
                code = 200;
            }

            statement.close();

            return DataAccess.Response.newBuilder().setCode(code).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response deleteUserStory(DataAccess.Id request) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM userStory where id = ?");
            statement.setInt(1, request.getId());

            int rowsInserted = statement.executeUpdate();

            int code = 404;
            if (rowsInserted > 0) {
                code = 200;
            }

            statement.close();

            return DataAccess.Response.newBuilder().setCode(code).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response editTask(DataAccess.TaskRequest request) {
        try (Connection connection = DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE task SET assignee = ?, status_id = ?, storyPoints = ? WHERE id = ?"
            );
            statement.setString(1, request.getAsignee());
            statement.setInt(2, getStatusId(request.getStatus()));
            statement.setInt(3, request.getStoryPoints());
            statement.setInt(4, request.getId());
            int rowsAffected = statement.executeUpdate();
            statement.close();

            if (rowsAffected > 0) {
                return DataAccess.Response.newBuilder()
                        .setCode(200)
                        .build();
            } else {
                return DataAccess.Response.newBuilder()
                        .setCode(404)
                        .build();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

