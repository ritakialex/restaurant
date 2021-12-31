package com.dbses.restaurant.database;

import java.sql.*;


public class DatabaseConfig {
    private static final String driverClassName = "org.postgresql.Driver";
    private static final String url = "jdbc:postgresql://localhost:5432/restaurantdb";
    private static final String username = "postgres";
    private static final String password = "zxcvasdf!";

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
