package com.dbses.restaurant;
import com.dbses.restaurant.database.DatabaseConfig;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import com.dbses.restaurant.database.DatabaseConfig;
import com.dbses.restaurant.model.Booking;
import com.dbses.restaurant.model.MenuItem;
import com.dbses.restaurant.model.Table;

public class ex_con_postgres {
    static String     driverClassName = "org.postgresql.Driver" ;
    static String     url = "jdbc:postgresql://localhost:5432/restaurantdb" ;
    static Connection conn = null;
    static String     username = "postgres";
    static String     password = "zxcvasdf!";



    public static void main(String[] args) {

        //εμφάνιση πληροφοριών στηλών πίνακα
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt    = conn.createStatement();
            String selectString = "select * From bookings ";
            ResultSet rs = stmt.executeQuery(selectString);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            System.out.println("Number of columns: " + numberOfColumns);

            for (int i=1; i <= numberOfColumns; i++) {
                String label = rsmd.getColumnLabel(i);
                int jdbcType = rsmd.getColumnType(i);
                String DbmsType = rsmd.getColumnTypeName(i);
                String Typeclassname = rsmd.getColumnClassName(i);
                System.out.print("Η "+i+ "η στήλη με όνομα " + label);
                System.out.print(" έχει JDBC τύπο " + jdbcType);
                System.out.print(", DBMS τύπο " + DbmsType);
                System.out.println(", ο οποίος έχει classtype " + Typeclassname);
            }
        }catch(Exception e){
            System.out.println(e);
        }*/


        //εμφάνιση πίνακα bookings
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();
            String selectString = "select * From bookings ";
            ResultSet rs = stmt.executeQuery(selectString);
            while (rs.next()) {
                int id = rs.getInt("id");
                int tableId = rs.getInt("table_id");
                Date date = rs.getDate("date");
                String custName = rs.getString("customer_name");
                int custCount = rs.getInt("customer_count");
                int hour = rs.getInt("hour");
                System.out.println(id + " - " + tableId + " - " + date + " - " + custName + " - " + custCount + " - " + hour);
            }
        }catch (Exception e){
            System.out.println(e);
        }*/



        //Εμφάνιση κράτησης με βάση τον ? αριθμό τραπεζιού
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String selectTableId = "select * from bookings where table_id = ?;";
            pstmt = conn.prepareStatement(selectTableId);
            try {
                pstmt.setInt(1, 6);
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    int tableId = rs.getInt("table_id");
                    Date date = rs.getDate("date");
                    String custName = rs.getString("customer_name");
                    int custCount = rs.getInt("customer_count");
                    int hour = rs.getInt("hour");
                    System.out.println(id + " - " + tableId + " - " + date + " - " +
                                        custName + " - " + custCount + " - " + hour);
                }
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }*/

        //εμφανιση πίνακα τραπεζιών
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();
            String selectString = "select * From tables";
            ResultSet rs = stmt.executeQuery(selectString);
            while (rs.next()) {
                int id = rs.getInt("id");
                int capacity = rs.getInt("capacity");
                boolean available = rs.getBoolean("is_available");
                System.out.println(id + " - " + capacity + " - " + available);
            }
        }catch (Exception e){
            System.out.println(e);
        }*/



        //εμφανιση διαθέσιμων τραπεζιων με μέγεθος τουλάχιστον ?
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String selectTableId = "select * from tables where capacity >= ? and is_available = true;";
            pstmt = conn.prepareStatement(selectTableId);
            try {
                pstmt.setInt(1, 6);
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    int capacity = rs.getInt("capacity");
                    boolean available = rs.getBoolean("is_available");
                    System.out.println(id + " - " + capacity + " - " + available);
                }
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }*/


        //εμφάνιση πίνακα menu_items
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();
            String selectString = "select * From menu_items ";
            ResultSet rs = stmt.executeQuery(selectString);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String food_cat = rs.getString("category");
                float price = rs.getFloat("price");
                int stock = rs.getInt("stock_number");

                System.out.println(id + " - " + name + " - " + description + " - " + food_cat + " - " + price + " - " + stock);
            }
        }catch (Exception e){
            System.out.println(e);
        }*/

        //update price (on menu_item) αύξηση κατά ? όπου η τιμή είναι μικρότερη από ?
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;

            String selectTableId = "update menu_items set price = price + ? where price < ?;";
            pstmt = conn.prepareStatement(selectTableId);
            try {
                pstmt.setDouble(1, 0.6);
                pstmt.setDouble(2, 6);
                int changes = pstmt.executeUpdate();
                System.out.println(changes + " records updated");
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }*/



        //στο menu_item με id = ? βάλε τιμή ?
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String selectTableId = "call update_menu_item_price(?, ?)";
            pstmt = conn.prepareStatement(selectTableId);
            try {
                pstmt.setInt(1, 9);
                pstmt.setFloat(2, -2f);
                int changes = pstmt.executeUpdate();
                System.out.println(changes + " records updated");
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }*/


        //menu item with id = ? - update stock number +/- ?
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String updateStock = "call update_menu_item_stock(?, ?)";
            pstmt = conn.prepareStatement(updateStock);
            try {
                pstmt.setInt(1, 5);
                pstmt.setInt(2, -10);
                int changes = pstmt.executeUpdate();
                System.out.println(changes + " records updated");
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }*/





        //call stored procedure create_booking --  READY
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            //ResultSet rs = null;
            String insertBooking = "call create_booking(?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(insertBooking);
            try {
                pstmt.setInt(1, 6);
                String str="2015-03-31";
                Date date=Date.valueOf(str);
                pstmt.setDate(2, date);
                pstmt.setInt(3, 20);
                pstmt.setString(4, "Alexiou");
                pstmt.setInt(5, 2);
                pstmt.executeUpdate();
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }*/



        //insert create_menu_item OK
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String insertBooking = "call create_menu_item(?, ?, ?::FOOD_CATEGORY, ?, ?)";
            pstmt = conn.prepareStatement(insertBooking);
            try {
                pstmt.setString(1, "the super dish");
                pstmt.setString(2, "the most amazing dish");
                pstmt.setString(3, "Main Dishes");
                pstmt.setFloat(4, 12.90f);
                pstmt.setInt(5, 20);
                pstmt.executeUpdate();
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }*/



        //δοκιμή insert Sailor procedure
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String insertBooking = "call create_sailor(?, ?, ?)";
            pstmt = conn.prepareStatement(insertBooking);
            try {
                pstmt.setInt(1, 2);
                pstmt.setString(2, "test sailor");
                pstmt.setInt(3, 43);
                pstmt.executeUpdate();
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }*/


        //call create_order - 2 params
       /* try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String insertBooking = "call create_order(?, ?)";
            pstmt = conn.prepareStatement(insertBooking);
            try {
                pstmt.setInt(1, 10);
                int[] items = {2, 7, 10};
                pstmt.setObject(2, items);
                pstmt.executeUpdate();
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }*/


        //call create_order - 3 params with bookingid  ---output exception 'Customers havent arrived yet'
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String insertBooking = "call create_order(?, ?, ?)";
            pstmt = conn.prepareStatement(insertBooking);
            try {
                pstmt.setInt(1, 10);
                int[] items = {2, 7, 10};
                pstmt.setObject(2, items);
                pstmt.setInt(3, 6);
                pstmt.executeUpdate();
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }*/


        //make table with id=?  (un)available --toggle_availability
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String insertBooking = "call toggle_availability(?)";
            pstmt = conn.prepareStatement(insertBooking);
            try {
                pstmt.setInt(1, 10);
                pstmt.executeUpdate();
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }*/





        //κάλεσμα αποθηκευμένη select get bookings - sql function ---- getBookingsToString()
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();
            String getBookings = "select get_bookings(null, null, null, null)";
            ResultSet rs = stmt.executeQuery(getBookings);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            System.out.println("αριθμός στηλών:" + numberOfColumns);
            while (rs.next()) {
                for(int i=0; i <numberOfColumns; i++) {
                    String data = rs.getString(i);
                    System.out.println(data);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }*/



        //κάλεσμα αποθηκευμένη select get bookings - sql function ---- getBookings()
        /*ArrayList<Booking> bookings = new ArrayList<>();
        try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();
            String getBookings = "select * from get_bookings(null, null, null, null)";
            ResultSet rs = stmt.executeQuery(getBookings);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            System.out.println("αριθμός στηλών:" + numberOfColumns);
            while (rs.next()) {
                bookings.add(new Booking(rs.getInt("id"),
                                         rs.getInt("table_id"),
                                         rs.getDate("date"),
                                         rs.getString("customer_name"),
                                         rs.getInt("customer_count"),
                                         rs.getInt("hour"))
                    );
            }
        }catch (Exception e){
            System.out.println(e);
        }*/

        /*public ArrayList<Booking> get_bookings() throws Exception {
            try (Connection conn = DatabaseConfig.getConnection()) {
                Statement stmt = conn.createStatement();
                String selectString = "select * from get_bookings(null, null, null, null)";
                ResultSet rs = stmt.executeQuery(selectString);

                final ArrayList<Booking> bookings = new ArrayList();
                while (rs.next()) {
                    bookings.add(new Booking(
                            rs.getInt("id"), rs.getInt("table_id"),
                            rs.getDate("date"), rs.getString("customer_name"),
                            rs.getInt("customer_count"), rs.getInt("hour")));
                }
                return bookings;
            } catch (Exception e) {
                System.out.println(e);
                throw new Exception();
            }
        }*/






        //Get menu items  ---- getMenuItemsToString()
       /* try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();
            String getBookings = "select get_menu_items(null, null)";
            ResultSet rs = stmt.executeQuery(getBookings);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            System.out.println("αριθμός στηλών:" + numberOfColumns);
            while (rs.next()) {
                for(int i=1; i <=numberOfColumns; i++) {
                    String data = rs.getString(i);
                    System.out.println(data);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }*/


        // Get menu items ArrayList  ---- getMenuItems()
        //ERROR - org.postgresql.util.PSQLException: The column name id was not found in this ResultSet.
        /*ArrayList<MenuItem> menuItems = new ArrayList<>();
        try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();
            String getBookings = "select * from get_menu_items(null, null)";
            ResultSet rs = stmt.executeQuery(getBookings);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            System.out.println("αριθμός στηλών:" + numberOfColumns);
            while (rs.next()) {
                menuItems.add(new MenuItem(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getString("category"),
                        rs.getFloat("price"),
                        rs.getInt("stock_number"))
                );
                //menuItems.toString();
            }
        }catch (Exception e){
            System.out.println(e);
        }*/





        //get order with items
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();
            String getBookings = "select get_order_with_items(null)";
            ResultSet rs = stmt.executeQuery(getBookings);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            System.out.println("αριθμός στηλών:" + numberOfColumns);
            while (rs.next()) {
                for(int i=1; i <=numberOfColumns; i++) {
                    String data = rs.getString(i);
                    System.out.println(data);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }*/




        //get_tables πάνω από χ αριθμό
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            //Statement stmt = conn.createStatement();
            PreparedStatement pstmt = null;
            ResultSet rs = null;

            String getTables = "select * from get_tables(?, ?)";
            //ResultSet rs = stmt.executeQuery(getTables);
            pstmt = conn.prepareStatement(getTables);
            try{
                pstmt.setInt(1, 6);
                pstmt.setBoolean(2, true);
                rs = pstmt.executeQuery();
                final ArrayList<Table> tables = new ArrayList();
                while (rs.next()) {
                    tables.add(new Table(
                            rs.getInt(1),
                            rs.getInt(2),
                            rs.getBoolean(3)));
                }
                //testing output
                *//*try {
                    Iterator iter = tables.iterator();
                    while (iter.hasNext()) {
                        System.out.println(iter.next());
                    }
                } catch (Exception e){
                    System.out.println(e);
                }*//*
            }catch(Exception e){
                System.out.println(e);

            }
        }catch (Exception e){
            System.out.println(e);
        }*/




        //total_price περιμένει array με αριθμούς κρατήσεων
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();
            int[] items = {1,2,3};
            //String getBookings = "select total_price(array[1,2,3])";
            String getBookings = "select total_price()";
            ResultSet rs = stmt.executeQuery(getBookings);
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();
            float price = rs.getFloat(1);
            System.out.println(price);

        }catch (Exception e){
            System.out.println(e);
        }*/




    }//end main
}
