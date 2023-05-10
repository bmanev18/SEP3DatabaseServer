package com.database;

import com.protobuf.DataAccess;

import java.sql.*;

public class DAOImpl implements DAO {
    private final Connection connection;

    public DAOImpl() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:identifier.sqlite");
    }

    // User->
    @Override
    public DataAccess.Response createUser(DataAccess.UserCreationDto dto) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO user(username, firstname, lastname, password, role_id) VALUES (?,?,?,?,?);");

        statement.setString(1, dto.getUsername());
        statement.setString(2, dto.getFirstName());
        statement.setString(3, dto.getLastName());
        statement.setString(4, dto.getPassword());
        statement.setInt(5, Integer.parseInt(dto.getRole()));

        int rowsAffected = statement.executeUpdate();
        statement.close();

        int code = 404;
        if (rowsAffected == 1) {
            code = 200;
        }
        return DataAccess.Response.newBuilder().setCode(code).build();
    }

    @Override
    public DataAccess.UserCreationDto getUserByUsername(DataAccess.Username username) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * from user where username=?;");
        statement.setString(1, username.getUsername());

        ResultSet rs = statement.executeQuery();
        DataAccess.UserCreationDto.Builder builder = DataAccess.UserCreationDto.newBuilder();
        if (rs.next()) {
            builder.setUsername(rs.getString("username"));
            builder.setPassword(rs.getString("password"));
            builder.setFirstName(rs.getString("firstname"));
            builder.setLastName(rs.getString("lastname"));
            builder.setRole(String.valueOf(rs.getString("role_id")));
        }
        statement.close();
        return builder.build();
    }

    @Override
    public DataAccess.UpdatedUserResponse updateUser(DataAccess.UserCreationDto dto) throws SQLException {
        //todo
        return null;
    }

    @Override
    public DataAccess.Response deleteUser(DataAccess.Username dto) throws SQLException {
        //todo
        return null;
    }

    @Override
    public DataAccess.FilteredUsersResponse lookForUsers(DataAccess.Username username) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT username, firstname, lastname, role_id from user where username like ?");
        String statementBuild = "%" + username.getUsername() + "%";
        statement.setString(1, statementBuild);

        ResultSet result = statement.executeQuery();

        DataAccess.FilteredUsersResponse.Builder builder = DataAccess.FilteredUsersResponse.newBuilder();
        int code = 404;

        while (result.next()) {
            builder.addUsers(DataAccess.UserSearchDto.newBuilder().setUsername(result.getString("username")).setFirstName(result.getString("firstName")).setLastName(result.getString("lastName")).setRole(String.valueOf(result.getInt("role_id"))).build());
            code = 200;
        }
        statement.close();

        return builder.setCode(code).build();
    }

    // Project->

    @Override
    public DataAccess.ResponseWithID createProject(DataAccess.ProjectCreationDto dto) throws SQLException {
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
    }

    @Override
    public DataAccess.ProjectsResponse getAllProjects(DataAccess.Username username) throws SQLException {
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
    }

    @Override
    public DataAccess.FilteredUsersResponse getAllCollaborators(DataAccess.Id id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * from user,worksOn where user.username = worksOn.username and project_id = ?");
        statement.setInt(1, id.getId());
        ResultSet rs = statement.executeQuery();

        DataAccess.FilteredUsersResponse.Builder builder = DataAccess.FilteredUsersResponse.newBuilder();
        int code = 404;
        while (rs.next()) {
            builder.addUsers(DataAccess.UserSearchDto.newBuilder().setUsername(rs.getString("username")).setFirstName(rs.getString("firstname")).setLastName(rs.getString("lastname")).setRole(String.valueOf(rs.getInt("role_id"))).build());
            code = 200;
        }
        statement.close();
        return builder.setCode(code).build();
    }

    @Override
    public DataAccess.Response addCollaborator(DataAccess.AddToProjectDto dto) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO worksOn(username, project_id) VALUES (?,?)");
        statement.setString(1, dto.getUsername());
        statement.setInt(2, dto.getProjectId());
        int rowsAffected = statement.executeUpdate();
        statement.close();

        int code = 404;

        if (rowsAffected == 1) {
            code = 200;
        }
        return DataAccess.Response.newBuilder().setCode(code).build();
    }

    @Override
    public DataAccess.Response removeCollaborator(DataAccess.AddToProjectDto user) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("DELETE from worksOn where  username = ? and project_id = ?");
        statement.setString(1, user.getUsername());
        statement.setInt(2, user.getProjectId());

        int rowsAffected = statement.executeUpdate();
        int code = 404;
        if (rowsAffected == 1) {
            code = 200;
        }
        statement.close();
        return DataAccess.Response.newBuilder().setCode(code).build();
    }

    // UserStory->
    @Override
    public DataAccess.ResponseWithID addUserStory(DataAccess.UserStoryMessage userStory) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO productBacklog(userStory, project_id,priority) VALUES (?,?,?) returning id");
        statement.setString(1, userStory.getTaskBody());
        statement.setInt(2, userStory.getProjectId());
        statement.setString(3, userStory.getPriority());

        ResultSet resultSet = statement.executeQuery();

        int code = 404;
        int id = -1;
        if (resultSet.next()) {
            code = 200;
            id = resultSet.getInt("id");
        }
        statement.close();
        return DataAccess.ResponseWithID.newBuilder().setId(id).setCode(code).build();
    }

    @Override
    public DataAccess.UserStoriesResponse getProductBacklog(DataAccess.Id id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * from productBacklog where id=?;");
        statement.setInt(1, id.getId());
        ResultSet rs = statement.executeQuery();
        DataAccess.UserStoriesResponse.Builder builder = DataAccess.UserStoriesResponse.newBuilder();

        int code = 404;
        while (rs.next()) {
            builder.addUserStories(DataAccess.UserStory.newBuilder().setProjectId(rs.getInt("project_id")).setId(rs.getInt("id")).setUserStory(rs.getString("userStory")).setPriority(rs.getString("priority")).build());
            code = 200;
        }
        statement.close();

        return builder.setCode(code).build();
    }
}