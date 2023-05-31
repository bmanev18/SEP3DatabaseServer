package com.database.DaoImplementations;

import com.database.DaoInterfaces.ISprintDao;
import com.database.DatabaseDriver;
import com.protobuf.DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SprintDaoImpl implements ISprintDao {
    private final DatabaseDriver driver = DatabaseDriver.getInstance();

    @Override
    public DataAccess.SprintMessage getSprintById(DataAccess.Id id) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from sprint where id=?;");
            statement.setInt(1, id.getId());
            ResultSet rs = statement.executeQuery();
            DataAccess.SprintMessage.Builder builder = DataAccess.SprintMessage.newBuilder();


            if (rs.next()) {
                builder.setId(rs.getInt("id"))
                        .setProjectId(rs.getInt("project_id"))
                        .setName(rs.getString("name"))
                        .setStarDate(rs.getString("startDate"))
                        .setEndDate(rs.getString("endDate"))
                        .build();
            }

            statement.close();

            return builder.build();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response removeSprint(DataAccess.Id request) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM sprint where id = ?");
            statement.setInt(1, request.getId());

            boolean successful = statement.executeUpdate() > 0;
            statement.close();

            return DataAccess.Response.newBuilder().setResponse(successful).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response addUserStoryToSprint(DataAccess.UserStorySprintRequest request) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO storyInSprint(sprint, userStory) VALUES (?,?) ");
            statement.setInt(1, request.getSprintId());
            statement.setInt(2, request.getUserStoryId());


            boolean successful = statement.executeUpdate() > 0;
            statement.close();
            return DataAccess.Response.newBuilder().setResponse(successful).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.UserStoriesResponse getAllUserStoriesFromSprint(DataAccess.Id sprintId) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from userStory,storyInSprint where storyInSprint.userStory= userStory.id and sprint = ?;");
            statement.setInt(1, sprintId.getId());

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
    public DataAccess.Response removeUserStoryFromSprint(DataAccess.UserStorySprintRequest request) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM storyInSprint where sprint = ? and userStory = ?");
            statement.setInt(1, request.getSprintId());
            statement.setInt(2, request.getUserStoryId());

            boolean successful = statement.executeUpdate() > 0;
            statement.close();
            return DataAccess.Response.newBuilder().setResponse(successful).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

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
