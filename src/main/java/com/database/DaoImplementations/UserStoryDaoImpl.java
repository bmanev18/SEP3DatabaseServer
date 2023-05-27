package com.database.DaoImplementations;

import com.database.DaoInterfaces.IUserStoryDao;
import com.database.DatabaseDriver;
import com.protobuf.DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserStoryDaoImpl implements IUserStoryDao {
    private final DatabaseDriver driver = DatabaseDriver.getInstance();

    @Override
    public DataAccess.Response updateUserStoryPoints(DataAccess.PointsUpdate request) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("UPDATE userStory SET  storyPoint = ? WHERE id = ?");
            statement.setInt(1, request.getPoints());
            statement.setInt(2, request.getId());

            boolean successful = statement.executeUpdate() > 0;
            statement.close();
            return DataAccess.Response.newBuilder().setResponse(successful).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response updateUserStoryStatus(DataAccess.StatusUpdate request) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("UPDATE userStory SET status_id=? where id =?");
            statement.setInt(1, getStatusId(request.getStatus()));
            statement.setInt(2, request.getId());

            boolean successful = statement.executeUpdate() > 0;
            statement.close();
            return DataAccess.Response.newBuilder().setResponse(successful).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response updateUserStoryPriority(DataAccess.PriorityUpdate request) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("UPDATE userStory SET priority_id=? where id =?");
            statement.setInt(1, getPriorityId(request.getPriority()));
            statement.setInt(2, request.getId());

            boolean successful = statement.executeUpdate() > 0;
            statement.close();
            return DataAccess.Response.newBuilder().setResponse(successful).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response deleteUserStory(DataAccess.Id request) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM userStory where id = ?");
            statement.setInt(1, request.getId());

            boolean successful = statement.executeUpdate() > 0;
            statement.close();
            return DataAccess.Response.newBuilder().setResponse(successful).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response addTask(DataAccess.TaskCreationRequest task) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO task(story_id,assignee, body, storyPoints, status_id) VALUES (?,?,?,?,?)");
            statement.setInt(1, task.getUserStoryId());
            statement.setString(2, task.getAssignee());
            statement.setString(3, task.getBody());
            statement.setInt(4, task.getStoryPoints());
            statement.setInt(5, getStatusId(task.getStatus()));

            boolean successful = statement.executeUpdate() > 0;
            statement.close();
            return DataAccess.Response.newBuilder().setResponse(successful).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.TasksMessage getTask(DataAccess.Id id) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from task where story_id= ?");
            statement.setInt(1, id.getId());
            ResultSet resultSet = statement.executeQuery();

            DataAccess.TasksMessage.Builder builder = DataAccess.TasksMessage.newBuilder();

            while (resultSet.next()) {
                builder.addTasks(DataAccess.TaskMessage.newBuilder()
                        .setId(resultSet.getInt("id"))
                        .setStoryId(resultSet.getInt("story_id"))
                        .setBody(resultSet.getString("body"))
                        .setStatus(getStatusName(resultSet.getInt("status_id")))
                        .setAssignee(resultSet.getString("assignee"))
                        .setStoryPoints(resultSet.getInt("storyPoints"))
                        .build());
            }
            statement.close();

            return builder.build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response editTask(DataAccess.TaskMessage request) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("UPDATE task SET  story_id = ?, assignee = ?, body = ?,  storyPoints = ?, status_id = ? WHERE id = ?");
            statement.setInt(1, request.getStoryId());
            statement.setString(2, request.getAssignee());
            statement.setString(3, request.getBody());
            statement.setInt(4, request.getStoryPoints());
            statement.setInt(5, getStatusId(request.getStatus()));
            statement.setInt(6, request.getId());

            boolean successful = statement.executeUpdate() > 0;
            statement.close();
            return DataAccess.Response.newBuilder().setResponse(successful).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response removeTask(DataAccess.Id request) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM task where id = ?");
            statement.setInt(1, request.getId());

            boolean successful = statement.executeUpdate() > 0;
            statement.close();
            return DataAccess.Response.newBuilder().setResponse(successful).build();
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
}
