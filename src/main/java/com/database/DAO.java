package com.database;

import com.protobuf.DataAccess;

import java.sql.SQLException;

public interface DAO {
    DataAccess.UserCreationResponse createUser(DataAccess.UserCreationDto dto) throws SQLException;
}
