package com.database;

import com.protobuf.DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjectDaoImpl implements IProjectDao {

    private final DatabaseDriver driver;

    public ProjectDaoImpl() {
        driver = DatabaseDriver.getInstance();
    }

    @Override
    public DataAccess.ResponseWithID createProject(DataAccess.ProjectCreationDto dto) {
        try (Connection connection=DatabaseDriver.getInstance().getConnection()){
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
        catch (SQLException e) {
         throw new RuntimeException(e);
        }

    }

    @Override
    public DataAccess.ProjectsResponse getAllProjects(DataAccess.Username username) {
        try(Connection connection=DatabaseDriver.getInstance().getConnection()){
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

//        try {
//            ResultSet result = driver.executeQuery(String.format("SELECT * from project, worksOn where id= worksOn.project_id and username = %s", username.getUsername()));
//
//            int code = 404;
//            DataAccess.ProjectsResponse.Builder builder = DataAccess.ProjectsResponse.newBuilder();
//
//            while (result.next()) {
//                builder.addProjects(DataAccess.ProjectMessage.newBuilder().setId(result.getInt("id")).setTitle(result.getString("title")));
//
//            }
//
//            return builder.setCode(code).build();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    @Override
    public DataAccess.FilteredUsersResponse getAllCollaborators(DataAccess.Id id)  {
        try(Connection connection=DatabaseDriver.getInstance().getConnection()) {
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
    public DataAccess.Response addCollaborator(DataAccess.AddToProjectDto dto)  {
        try(Connection connection=DatabaseDriver.getInstance().getConnection()){
        PreparedStatement statement = connection.prepareStatement("INSERT INTO worksOn(username, project_id) VALUES (?,?)");
        statement.setString(1, dto.getUsername());
        statement.setInt(2, dto.getProjectId());
        int rowsAffected = statement.executeUpdate();
        statement.close();

        int code = 404;

        if (rowsAffected==1 ){
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
    public DataAccess.Response removeCollaborator(DataAccess.AddToProjectDto user)  {
        try(Connection connection=DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("DELETE from worksOn where  username = ? and project_id = ?");
            statement.setString(1,user.getUsername());
            statement.setInt(2,user.getProjectId());

            int rowsAffected = statement.executeUpdate();
            int code = 404;
            if (rowsAffected==1){
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
        try(Connection connection=DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO userStory( project_id,body, priority, status, storyPoint) VALUES (?,?,?,?,?) returning id");
            statement.setString(2,userStory.getTaskBody());
            statement.setInt(1,userStory.getProjectId());
            statement.setString(3, userStory.getPriority());
            statement.setInt(4, userStory.getStatus());
            statement.setInt(5, userStory.getStoryPoint());

            ResultSet resultSet = statement.executeQuery();

            int code = 404;
            int id = -1;
            if (resultSet.next()){
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
    public DataAccess.UserStoriesResponse getProductBacklog(DataAccess.Id id)  {
        try(Connection connection=DatabaseDriver.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from userStory where id=?;");
            statement.setInt(1,id.getId());
            ResultSet rs = statement.executeQuery();
            DataAccess.UserStoriesResponse.Builder builder = DataAccess.UserStoriesResponse.newBuilder();

            int code = 404;
            while (rs.next()) {
                builder.addUserStories(DataAccess.UserStory.newBuilder()
                        .setProjectId(rs.getInt("project_id"))
                        .setId(rs.getInt("id"))
                        .setUserStory(rs.getString("body"))
                        .setPriority(rs.getString("priority"))
                        .build());
                code = 200;
            }
            statement.close();

            return builder.setCode(code).build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

