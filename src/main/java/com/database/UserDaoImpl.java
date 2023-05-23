package com.database;

import com.protobuf.DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements IUserDao{
    private final DatabaseDriver driver = DatabaseDriver.getInstance();

    @Override
    public DataAccess.Response createUser(DataAccess.UserCreationDto dto)  {
        try(Connection connection=driver.getConnection()) {

        PreparedStatement statement = connection.prepareStatement("INSERT INTO user(username, firstname, lastname, password, role_id) VALUES (?,?,?,?,?);");

        statement.setString(1, dto.getUsername());
        statement.setString(2, dto.getFirstName());
        statement.setString(3, dto.getLastName());
        statement.setString(4, dto.getPassword());
        statement.setInt(5, getRoleId(dto.getRole()));

        int rowsAffected = statement.executeUpdate();
        statement.close();

        int code = 404;
        if (rowsAffected==1){
            code = 200;
        }
        return DataAccess.Response.newBuilder()
                .setCode(code)
                .build();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private int getRoleId(String role)
    {
        int id = 0;
        try(Connection connection=driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("Select id from role where name = ?");
            statement.setString(1, role);
            ResultSet result= statement.executeQuery();
            if(result.next())
            {
                id  =  result.getInt("id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    private String getRoleName(int roleId)
    {
       String role="null";
        try(Connection connection=driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("Select name from role where id = ?");
            statement.setInt(1, roleId);
            ResultSet result= statement.executeQuery();
            if(result.next())
            {
                role  =  result.getString("name");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return role;
    }

    @Override
    public DataAccess.UserCreationDto getUserByUsername(DataAccess.Username username)  {

        try(Connection connection= driver.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * from user where username=?;");
            statement.setString(1, username.getUsername());

            ResultSet rs = statement.executeQuery();
            DataAccess.UserCreationDto.Builder builder = DataAccess.UserCreationDto.newBuilder();
            if (rs.next()) {
                builder.setUsername(rs.getString("username"));
                builder.setPassword(rs.getString("password"));
                builder.setFirstName(rs.getString("firstname"));
                builder.setLastName(rs.getString("lastname"));
                builder.setRole(getRoleName(rs.getInt("role_id")));
            }
            statement.close();
            return builder.build();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public DataAccess.UpdatedUserResponse updateUser(DataAccess.UserCreationDto dto)  {
        //todo
        return null;
    }

    @Override
    public DataAccess.Response deleteUser(DataAccess.Username dto)  {
        //todo
        return null;
    }

    @Override
    public DataAccess.FilteredUsersResponse lookForUsers(DataAccess.Username username) {

        try (Connection connection=driver.getConnection()){
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

}
