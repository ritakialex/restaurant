package com.dbses.restaurant.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    private static final String driverClassName = "org.postgresql.Driver";
    private static final String url = "url";
    private static final String username = "user";
    private static final String password = "password";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(driverClassName);
        return DriverManager.getConnection(url, username, password);
    }

}
