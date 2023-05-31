package com.database;

import java.sql.*;

public class DatabaseDriver {

    private static DatabaseDriver instance;

    private DatabaseDriver () throws SQLException {

    }

    public Connection getConnection () throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:identifier.sqlite");
    }

    public static DatabaseDriver getInstance() {
        if (instance == null) {
            try {
                instance = new DatabaseDriver();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return instance;


//    private final Connection connection;
//
//
//    public DatabaseDriver() {
//        try {
//            this.connection = DriverManager.getConnection("jdbc:sqlite:identifier.sqlite");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public ResultSet executeQuery(String sql) {
//        PreparedStatement statement = prepareStatement(sql);
//        try {
//            ResultSet result = statement.executeQuery();
//            statement.close();
//            return result;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    private PreparedStatement prepareStatement(String sql) {
//        try {
//            return connection.prepareStatement(sql);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public int executeUpdate(String sql) {
//        PreparedStatement statement = prepareStatement(sql);
//        try {
//            int affectedRows = statement.executeUpdate();
//            statement.close();
//            return affectedRows;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
    }

}
