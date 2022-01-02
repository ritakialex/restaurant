package com.dbses.restaurant.database;

import java.sql.*;


public class DatabaseConfig {
    private static final String driverClassName = "org.postgresql.Driver";
//<<<<<<< rita
    private static final String url = "jdbc:postgresql://localhost:5432/restaurantdb";
    private static final String username = "postgres";
    private static final String password = "zxcvasdf!";
//=======
    /*private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String username = "postgres";
    private static final String password = "postgres";*/
//>>>>>>> master

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

    public static void main(String[] args) {
        try {
            Connection conn = getConnection();
            System.out.println(conn.createStatement().executeQuery("SELECT * FROM TABLES").first());
        }catch (Exception e) {

        }
    }

}
