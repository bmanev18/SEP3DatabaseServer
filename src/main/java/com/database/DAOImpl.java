package com.database;

import com.protobuf.DataAccess;

import javax.xml.crypto.Data;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOImpl implements DAO {
    private Connection connection;

    public DAOImpl() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:identifier.sqlite");
    }

    @Override
    public DataAccess.Response createUser(DataAccess.UserDto dto) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO user(username, firstname, lastname, password, role_id) VALUES (?,?,?,?,?);");

        statement.setString(1, dto.getUsername());
        statement.setString(2, dto.getFirstName());
        statement.setString(3, dto.getLastName());
        statement.setString(4, dto.getPassword());
        statement.setInt(5, Integer.parseInt(dto.getRoleId()));

        int rowsAffected = statement.executeUpdate();
        statement.close();

        int code = 404;
        if (rowsAffected==1){
            code = 200;
        }
        return DataAccess.Response.newBuilder()
                .setCode(code)
                .build();
    }

    @Override
    public DataAccess.Response createProject(DataAccess.ProjectDto dto) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO project(title) VALUES(?);");

        statement.setString(1, dto.getTitle());
        int rowsAffected = statement.executeUpdate();
        statement.close();

        int code = 404;

        if (rowsAffected==1){
            code = 200;
        }
        return DataAccess.Response.newBuilder()
                .setCode(code)
                .build();
    }

    public DataAccess.Response addDeveloper(DataAccess.AddToProjectDto dto) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("INSERT INTO worksOn(username, project_id) VALUES (?,?)");
        statement.setString(1, dto.getUser().getUsername());
        statement.setInt(2, dto.getProjectId());

        int rowsAffected = statement.executeUpdate();
        statement.close();

        int code = 404;

        if (rowsAffected==1){
            code = 200;
        }
        return DataAccess.Response.newBuilder()
                .setCode(code)
                .build();

    }

    public DataAccess.Response addScrumMaster(DataAccess.AddToProjectDto dto) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("INSERT INTO worksOn(username, project_id) VALUES (?,?)");
        statement.setString(1, dto.getUser().getUsername());
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
    }

    @Override
    public DataAccess.FilteredUsersResponse getUsersByRole(DataAccess.Role dto) throws SQLException {

        String sql = "SELECT username, firstName, lastName FROM user INNER JOIN role ON user.role_id = id WHERE name = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, dto.getRoleName());

        ResultSet result = statement.executeQuery();

        DataAccess.FilteredUsersResponse.Builder builder = DataAccess.FilteredUsersResponse.newBuilder();
        int code = 404;

        while (result.next()){
            builder.addUsers(DataAccess.UserSearchDto.newBuilder()
                    .setUsername(result.getString("username"))
                    .setFirstName(result.getString("firstName"))
                    .setLastName(result.getString("lastName"))
                    .build());
            code = 200;
        }
        statement.close();

        return builder.setCode(code).build();
    }

    @Override
    public DataAccess.FilteredUsersResponse getUsersByName(DataAccess.UserSearchDto dto) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT username, firstname, lastname from user where username=? and firstname=? and lastname=?;");
        statement.setString(1, dto.getUsername());
        statement.setString(2, dto.getFirstName());
        statement.setString(3, dto.getLastName());

        ResultSet result = statement.executeQuery();

        DataAccess.FilteredUsersResponse.Builder builder = DataAccess.FilteredUsersResponse.newBuilder();
        int code = 404;

        while (result.next()){
            builder.addUsers(DataAccess.UserSearchDto.newBuilder()
                    .setUsername(result.getString("username"))
                    .setFirstName(result.getString("firstName"))
                    .setLastName(result.getString("lastName"))
                    .build());
            code = 200;
        }
        statement.close();

        return builder.setCode(code).build();
    }


    @Override
    public DataAccess.UpdatedUserResponse updateUser(DataAccess.UserDto dto) throws SQLException {
//        PreparedStatement statement = connection.prepareStatement("UPDATE user SET username = ? ," +
//                             "firstname = ?, " + "lastname = ?,"+"password =?,"+ " role_id = ?");
//        statement.setString(1, dto.getUsername());
//        statement.setString(2, dto.getFirstName());
//        statement.setString(3, dto.getLastName());
//        statement.setString(4, dto.getPassword());
//        statement.setString(5, dto.getRoleId());
//
//        ResultSet result = statement.executeQuery();
//
//        DataAccess.UpdatedUserResponse.Builder builder = DataAccess.UpdatedUserResponse.newBuilder();
//        int code = 404;
//
//        while
//            code = 200;
//
//        statement.close();
//
//        return builder.setCode(code).build();

//        ResultSetMetaData metaData = connection.createStatement().executeQuery("SELECT * FROM user").getMetaData();
//        for (int i = 1; i <= metaData.getColumnCount(); i++) {
//
//            connection.createStatement().executeUpdate("ALTER TABLE user ADD COLUMN `ARTIFACTSDELETED` Boolean DEFAULT FALSE NOT NULL");
//
//        }
        return null;


    }
    
    @Override
    public DataAccess.Response deleteUser(DataAccess.Username dto) throws SQLException {
//        PreparedStatement statement = connection.prepareStatement("DELETE FROM user WHERE username = ?");
//        statement.setString(1, dto.getUsername());
//
//        statement.executeQuery();
//        ResultSet result = statement.executeQuery();
//
//
//        DataAccess.Response.Builder builder = DataAccess.Response.newBuilder();
//        int code = 404;
//
//            code = 200;
//
//        while (result.next()){
////            builder.clear(DataAccess.Username.newBuilder().getUsername());
//            code = 200;
//        }
//
//        statement.close();
//
//        return builder.setCode(code).build();
        return null;
    }

    @Override
    public DataAccess.Password getPassword(DataAccess.Username username) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT password from user where username=?;");
        statement.setString(1, username.getUsername());

        ResultSet rs  = statement.executeQuery();
        DataAccess.Password.Builder builder = DataAccess.Password.newBuilder();
        if (rs.next()){
            builder.setPassword(rs.getString("password"));
        }
        statement.close();
        return builder.build();
    }

    @Override
    public DataAccess.UserDto getUserByUsername(DataAccess.Username username) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * from user where username=?;");
        statement.setString(1, username.getUsername());

        ResultSet rs  = statement.executeQuery();
        DataAccess.UserDto.Builder builder = DataAccess.UserDto.newBuilder();
        if (rs.next()){
            builder.setUsername(rs.getString("username"));
            builder.setPassword(rs.getString("password"));
            builder.setFirstName(rs.getString("firstname"));
            builder.setLastName(rs.getString("lastname"));
            builder.setRoleId(String.valueOf(rs.getString("role_id")));
        }
        statement.close();
        return builder.build();
    }

}
