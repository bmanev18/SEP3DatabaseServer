package com.database;

import com.protobuf.DataAccess;

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
    public DataAccess.Response createUser(DataAccess.UserCreationDto dto) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO user(username, firstname, lastname, password, role) VALUES (?,?,?,?,?);");
        statement.setString(1, dto.getUsername());
        statement.setString(2, dto.getFirstName());
        statement.setString(3, dto.getLastName());
        statement.setString(4, dto.getPassword());
        statement.setString(5, dto.getRole());

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
}
