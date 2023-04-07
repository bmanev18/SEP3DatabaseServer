package com.database;

import com.protobuf.DataAccess;

import java.sql.Connection;
import java.sql.SQLException;

public class DAOImpl implements DAO{
    private Connection dataBaseCon;

    public DAOImpl() throws SQLException {
        /*dataBaseCon = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres?currentSchema=sep3",
                "postgres", "2121");
*/
    }

    @Override
    public DataAccess.UserCreationResponse createUser(DataAccess.UserCreationDto dto) throws SQLException {
        return DataAccess.UserCreationResponse.newBuilder()
                .setCreatedUser(dto)
                .setCode(200)
                .build();
    }
}
