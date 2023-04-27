package com.database;

import com.protobuf.DataAccess;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOImpl implements DAO {
    private Connection connection;

    public DAOImpl() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:identifier.sqlite");
    }

    @Override
    public DataAccess.Response createUser(DataAccess.UserDto dto) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO user(username, firstname, lastname, password, role) VALUES (?,?,?,?,?);");
        statement.setString(1, dto.getUsername());
        statement.setString(2, dto.getFirstName());
        statement.setString(3, dto.getLastName());
        statement.setString(4, dto.getPassword());
        statement.setString(5, dto.getRoleId());

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
        PreparedStatement statement = connection.prepareStatement("INSERT INTO projectParticipating(username, project_id) VALUES (?,?)");

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

    public DataAccess.Response addScrumMaster(DataAccess.AddToProjectDto dto) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("INSERT INTO projectScrumMaster(username, project_id) VALUES (?,?)");
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
    public DataAccess.LoginResponse loginUser(DataAccess.UserLoginDto dto) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO user(username, password) VALUES (?,?);");
        statement.setString(1, dto.getUsername());
        statement.setString(2, dto.getPassword());

        int rowsAffected = statement.executeUpdate();
        statement.close();

        int code = 404;
        if (rowsAffected==1){
            code = 200;
        }
        return DataAccess.LoginResponse.newBuilder()
                .setCode(code)
                .build();
    }

    @Override
    public DataAccess.FilteredUsersResponse getUsersByRole(DataAccess.Role dto) throws SQLException {
//        PreparedStatement statement = connection.prepareStatement("INSERT INTO role(username, firstname, lastname, password, role) VALUES (?,?,?,?,?);");
//        statement.setString(1, dto.getUsername());
//        statement.setString(2, dto.getFirstName());
//        statement.setString(3, dto.getLastName());
//        statement.setString(4, dto.getPassword());
//        statement.setString(5, dto.getRoleId());
//
//        int rowsAffected = statement.executeUpdate();
//        statement.close();
//
//        int code = 404;
//        if (rowsAffected==1){
//            code = 200;
//        }
//        return DataAccess.Response.newBuilder()
//                .setCode(code)
//                .build();
        return null;
    }

    @Override
    public DataAccess.FilteredUsersResponse getUsersByName(DataAccess.UserSearchDto dto) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO user(username, firstname, lastname) VALUES (?,?,?,?,?);");
        statement.setString(1, dto.getUsername());
        statement.setString(2, dto.getFirstName());
        statement.setString(3, dto.getLastName());


        int rowsAffected = statement.executeUpdate();
        statement.close();

        int code = 404;
        if (rowsAffected==1){
            code = 200;
        }
        return DataAccess.FilteredUsersResponse.newBuilder()
                .setCode(code)
                .build();
    }

    @Override
    public DataAccess.UpdatedUserResponse updateUser(DataAccess.UserDto dto) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO user(username, firstname, lastname, password, role) VALUES (?,?,?,?,?);");
        statement.setString(1, dto.getUsername());
        statement.setString(2, dto.getFirstName());
        statement.setString(3, dto.getLastName());
        statement.setString(4, dto.getPassword());
        statement.setString(5, dto.getRoleId());

        int rowsAffected = statement.executeUpdate();
        statement.close();

        int code = 404;
        if (rowsAffected==1){
            code = 200;
        }
        return DataAccess.UpdatedUserResponse.newBuilder()
                .setCode(code)
                .build();
    }

    @Override
    public DataAccess.Response deleteUser(DataAccess.Username dto) throws SQLException {
        return null;
    }

    public DataAccess.Response addOwner(DataAccess.AddToProjectDto dto) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("INSERT INTO userOwns(username, project_id) VALUES (?,?)");
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
}
