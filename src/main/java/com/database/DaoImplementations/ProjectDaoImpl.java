package com.database.DaoImplementations;

import com.database.DaoInterfaces.IProjectDao;
import com.database.DatabaseDriver;
import com.protobuf.DataAccess;

import java.sql.*;

public class ProjectDaoImpl implements IProjectDao {


    private final DatabaseDriver driver = DatabaseDriver.getInstance();

    @Override
    public DataAccess.Response createProject(DataAccess.ProjectCreationRequest request) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO project(title) VALUES(?) returning id;");

            statement.setString(1, request.getTitle());
            boolean successful = statement.executeUpdate() > 0;
            statement.close();

            DataAccess.Response response = DataAccess.Response.newBuilder().setResponse(false).build();
            if (successful) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int project_id = generatedKeys.getInt(1);
                    response = addCollaborator(DataAccess.UserProjectRequest.newBuilder().setProjectId(project_id).setUsername(request.getOwnerUsername()).build());
                }
            }

            return response;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response addCollaborator(DataAccess.UserProjectRequest request) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO worksOn(username, project_id) VALUES (?,?)");
            statement.setString(1, request.getUsername());
            statement.setInt(2, request.getProjectId());
            boolean successful = statement.executeUpdate() > 0;
            statement.close();

            return DataAccess.Response.newBuilder().setResponse(successful).build();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public DataAccess.UsersResponse getAllCollaborators(DataAccess.Id id) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from user,worksOn where user.username = worksOn.username and project_id = ?");
            statement.setInt(1, id.getId());
            ResultSet resultSet = statement.executeQuery();

            DataAccess.UsersResponse.Builder builder = DataAccess.UsersResponse.newBuilder();
            while (resultSet.next()) {
                builder.addUsers(DataAccess.UserSearchDto.newBuilder()
                        .setUsername(resultSet.getString("username"))
                        .setFirstName(resultSet.getString("firstname"))
                        .setLastName(resultSet.getString("lastname"))
                        .setRole(getRoleName(resultSet.getInt("role_id")))
                        .build());
            }
            statement.close();
            return builder.build();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response removeCollaborator(DataAccess.UserProjectRequest request) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("DELETE from worksOn where  username = ? and project_id = ?");
            statement.setString(1, request.getUsername());
            statement.setInt(2, request.getProjectId());

            boolean successful = statement.executeUpdate() > 0;
            statement.close();

            return DataAccess.Response.newBuilder().setResponse(successful).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    // UserStory->
    @Override
    public DataAccess.Response addUserStory(DataAccess.UserStoryCreationRequest userStory) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO userStory( project_id,body, priority_id, storyPoint) VALUES (?,?,?,?)");
            statement.setInt(1, userStory.getProjectId());
            statement.setString(2, userStory.getTaskBody());
            statement.setInt(3, getPriorityId(userStory.getPriority()));
            statement.setInt(4, userStory.getStoryPoint());

            boolean successful = statement.executeUpdate() > 0;
            statement.close();

            return DataAccess.Response.newBuilder().setResponse(successful).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public DataAccess.UserStoriesResponse getUserStories(DataAccess.Id id) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from userStory where project_id=?;");
            statement.setInt(1, id.getId());
            ResultSet resultSet = statement.executeQuery();

            DataAccess.UserStoriesResponse.Builder builder = DataAccess.UserStoriesResponse.newBuilder();

            while (resultSet.next()) {
                builder.addUserStories(DataAccess.UserStoryMessage.newBuilder()
                        .setId(resultSet.getInt("id"))
                        .setProjectId(resultSet.getInt("project_id"))
                        .setUserStory(resultSet.getString("body"))
                        .setPriority(getPriorityName(resultSet.getInt("priority_id")))
                        .setStatus(getStatusName(resultSet.getInt("status_id")))
                        .setStoryPoint(resultSet.getInt("storyPoint"))
                        .build());
            }
            statement.close();
            return builder.build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response createSprint(DataAccess.SprintCreationRequest sprint) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO sprint(project_id, name, startDate, endDate) VALUES (?,?,?,?)");
            statement.setInt(1, sprint.getProjectId());
            statement.setString(2, sprint.getName());
            statement.setString(3, sprint.getStarDate());
            statement.setString(4, sprint.getEndDate());

            boolean successful = statement.executeUpdate() > 0;
            statement.close();

            return DataAccess.Response.newBuilder().setResponse(successful).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.AllSprintsMessage getSprintByProjectId(DataAccess.Id id) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from sprint where project_id=?;");
            statement.setInt(1, id.getId());
            ResultSet rs = statement.executeQuery();
            DataAccess.AllSprintsMessage.Builder builder = DataAccess.AllSprintsMessage.newBuilder();

            while (rs.next()) {
                builder.addSprints(DataAccess.SprintMessage.newBuilder().setId(rs.getInt("id")).setProjectId(rs.getInt("project_id")).setName(rs.getString("name")).setStarDate(rs.getString("startDate")).setEndDate(rs.getString("endDate")).build());
            }
            statement.close();

            return builder.build();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private int getPriorityId(String priority) {
        int id = 1;
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("Select id from priority where name = ?");
            statement.setString(1, priority);
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

    private String getRoleName(int roleId) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("Select name from role where id = ?");
            statement.setInt(1, roleId);
            ResultSet result = statement.executeQuery();

            return result.next() ? result.getString("name") : null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private String getPriorityName(int id) {
        String priority = "";
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("Select name from priority where id = ?");
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                priority = result.getString("name");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return priority;
    }
}

