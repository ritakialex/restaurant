package com.dbses.restaurant.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    private static final String driverClassName = "driver";
    private static final String url = "url";
    private static final String username = "username";
    private static final String password = "password";

    public static Connection getConnection() throws DatabaseConnectionException {
        try {
            Class.forName(driverClassName);
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e){
            final String message = "Couldnt connect:" + e;
            System.out.print(message);
            throw new DatabaseConnectionException(message);
        } catch (ClassNotFoundException e){
            final String message = "Couldnt find driver class" + e;
            System.out.println(message);
            throw new DatabaseConnectionException(message);
        }

    }

}
