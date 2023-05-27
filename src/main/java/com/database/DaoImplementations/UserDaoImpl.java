package com.database.DaoImplementations;

import com.database.DaoInterfaces.IUserDao;
import com.database.DatabaseDriver;
import com.protobuf.DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements IUserDao {
    private final DatabaseDriver driver = DatabaseDriver.getInstance();

    @Override
    public DataAccess.Response createUser(DataAccess.UserMessage user) {
        try (Connection connection = driver.getConnection()) {

            PreparedStatement statement = connection.prepareStatement("INSERT INTO user(username, firstname, lastname, password, role_id) VALUES (?,?,?,?,?);");

            statement.setString(1, user.getUsername());
            statement.setString(2, user.getFirstName());
            statement.setString(3, user.getLastName());
            statement.setString(4, user.getPassword());
            statement.setInt(5, getRoleId(user.getRole()));

            boolean successful = statement.executeUpdate()>0;
            statement.close();

            return DataAccess.Response.newBuilder().setResponse(successful).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.UserMessage getUserByUsername(DataAccess.Username username) {

        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from user where username=?;");
            statement.setString(1, username.getUsername());

            ResultSet rs = statement.executeQuery();
            DataAccess.UserMessage.Builder builder = DataAccess.UserMessage.newBuilder();
            if (rs.next()) {
                builder.setUsername(rs.getString("username"));
                builder.setPassword(rs.getString("password"));
                builder.setFirstName(rs.getString("firstname"));
                builder.setLastName(rs.getString("lastname"));
                builder.setRole(getRoleName(rs.getInt("role_id")));
            }
            statement.close();
            return builder.build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public DataAccess.ProjectsResponse getAllProjects(DataAccess.Username username) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from project, worksOn where id= worksOn.project_id and username = ?");
            statement.setString(1, username.getUsername());
            ResultSet rs = statement.executeQuery();
            DataAccess.ProjectsResponse.Builder builder = DataAccess.ProjectsResponse.newBuilder();

            while (rs.next()) {
                builder.addProjects(DataAccess.ProjectDto.newBuilder().setId(rs.getInt("id")).setTitle(rs.getString("title")));
            }
            statement.close();
            return builder.build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    @Override
    public DataAccess.UsersResponse lookForUsers(DataAccess.Username username) {

        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT username, firstname, lastname, role_id from user where username like ?");
            String statementBuild = "%" + username.getUsername() + "%";
            statement.setString(1, statementBuild);

            ResultSet result = statement.executeQuery();

            DataAccess.UsersResponse.Builder builder = DataAccess.UsersResponse.newBuilder();

            while (result.next()) {
                 builder.addUsers(DataAccess.UserSearchDto.newBuilder()
                        .setUsername(result.getString("username"))
                        .setFirstName(result.getString("firstName"))
                        .setLastName(result.getString("lastName"))
                        .setRole(getRoleName(result.getInt("role_id")))
                        .build());
            }

            statement.close();

            return builder.build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DataAccess.Response updateUser(DataAccess.UserMessage message) {
        //todo
        return null;
    }

    @Override
    public DataAccess.Response deleteUser(DataAccess.Username username) {
        //todo
        return null;
    }

    private int getRoleId(String role) {
        try (Connection connection = driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("Select id from role where name = ?");
            statement.setString(1, role);
            ResultSet result = statement.executeQuery();

            return result.next() ? result.getInt("id") : 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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
}
