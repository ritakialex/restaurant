package com.dbses.restaurant.model;
import com.dbses.restaurant.database.DatabaseConfig;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;

import com.dbses.restaurant.database.DatabaseConfig;
import com.dbses.restaurant.model.Booking;
import com.dbses.restaurant.model.MenuItem;
import com.dbses.restaurant.model.Table;

public class ex_con_postgres {

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



        //delete booking with id =?
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String deleteBooking = "call delete_booking(?)";
            pstmt = conn.prepareStatement(deleteBooking);
            try {
                pstmt.setInt(1, 5);
                int changes = pstmt.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n" + ex.getMessage());
            }
        } catch (Exception e) {
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
            String str="2022-01-31";
            Booking book = new Booking(10, Date.valueOf(str),
                    "You know who",5, 21 );

            PreparedStatement pstmt = null;
            String insertBooking = "call create_booking(?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(insertBooking);
            try {
                pstmt.setInt(1, book.getTableId());
                *//*String str="2015-03-31";
                Date date=Date.valueOf(str);*//*
                pstmt.setDate(2, (Date) book.getBookingDate());
                pstmt.setInt(3, book.getHour());
                pstmt.setString(4, book.getCustomerName());
                pstmt.setInt(5, book.getCustomerCount());
                pstmt.executeUpdate();
                System.out.println("ok");
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }*/

        //call stored procedure create_booking --  READY
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            //create object
            MenuItem newItem = new MenuItem("Brand new", "you have to try that", "Alcoholic Drinks", 9.50f, 66);
            PreparedStatement pstmt = null;
            String insertMenuItem = "call create_menu_item(?, ?, ?::FOOD_CATEGORY, ?, ?)";
            pstmt = conn.prepareStatement(insertMenuItem);
            try {
                pstmt.setString(1, newItem.getMenuItemName());
                pstmt.setString(2, newItem.getMenuItemDescription());
                pstmt.setString(3, newItem.getCategory());
                pstmt.setFloat(4, newItem.getPrice());
                pstmt.setInt(5, newItem.getStockNumber());
                pstmt.executeUpdate();
                System.out.println("ok");
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }*/

        //insert create_menu_item OK
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String insertMenuItem = "call create_menu_item(?, ?, ?::FOOD_CATEGORY, ?, ?)";
            pstmt = conn.prepareStatement(insertMenuItem);
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


        //call create_order - 2 params -- OK
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String newOrder = "call create_order(?, ?)";
            pstmt = conn.prepareStatement(newOrder);
            try {
                pstmt.setInt(1, 5);
                int[] items = {6,7};
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
                pstmt.setInt(1, 2);
                int[] items = {1, 2, 8};
                pstmt.setObject(2, items);
                pstmt.setInt(3, 6);
                pstmt.executeUpdate();
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }*/


        //call create_order - 2 params table id + items[]
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String newOrder = "call create_order(?, ?)";
            pstmt = conn.prepareStatement(newOrder);
            try {
                pstmt.setInt(1, 3);
                int[] items = {1, 2, 5};
                pstmt.setObject(2, items);
                pstmt.executeUpdate();
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }*/

        /*  -- SQL Exception --- (αλλά έκανε καταχώρηση)
                ERROR: null value in column "booking_id" of relation "orders_logs" violates not-null constraint
        Detail: Failing row contains (1, 2022-01-02 17:58:37.750929, INSERT, postgres, 2, 7, null, 2022-01-02 17:58:37.750929).
        Where: SQL statement "INSERT INTO orders_logs(operation,
        userid,
                order_id,
                table_id,
                booking_id,
                time)
        SELECT TG_OP, user, NEW.*"
        PL/pgSQL function orders_log_event() line 13 at SQL statement
        SQL statement "INSERT INTO Orders(table_id, time)
        VALUES (t_table_id, t_current_time)
        RETURNING id"
        PL/pgSQL function create_order(integer,integer[]) line 16 at SQL statement  */



        //make table with id=?  (un)available --toggle_availability -- OK
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




        // NOT USED -- OK
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



        //κάλεσμα αποθηκευμένη select get bookings - sql function ---- getBookings() -- OK
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






        //Get menu items  ---- getMenuItemsToString() - NOT USED  -- OK
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


        // Get menu items ArrayList  ---- getMenuItems() --- OK
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





        //get order with items -- OK (NOT USED)
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




        //get_tables πάνω από χ αριθμό -- OK
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



        //public static float totalPrice(int id) throws Exception {
        /*try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();

            //το array[1,2,3] είναι σαν παράδειγμα, θα πρέπει να το παίρνει από τον χρήστη
            //δηλαδή για items θέλει σύνολο τιμής
            String totalPrice = "select total_price(array[1,2,3])";
            ResultSet rs = stmt.executeQuery(totalPrice);
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();
            float price = rs.getFloat(1);
            System.out.println(price);
            //return price;
        } catch (Exception e) {
            System.out.println(e);
            //throw new Exception();
        }*/
    //}




        //total_price περιμένει array με αριθμούς κρατήσεων
        //δε θα υλοποιήσουμε αυτή τελικά

       /* try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            Integer[] items = {1,2,3};
            //Integer[] ever = IntStream.of( items ).boxed().toArray( Integer[]::new );
            //Integer[] what = Arrays.stream(items).boxed().toArray( Integer[]::new );

            *//*Integer[] newArray = new Integer[oldArray.length];
            int i = 0;
            for (...) {
                newArray[i++] = Integer.valueOf(value);
            }*//*

            conn.createArrayOf("int", items);
            String updatePrice = "select total_price(?)";
            pstmt = conn.prepareStatement(updatePrice);
            *//*try{

            }*//*
            //String getBookings = "select total_price()";
            ResultSet rs = stmt.executeQuery(getBookings);
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();
            float price = rs.getFloat(1);
            System.out.println(price);

        }catch (Exception e){
            System.out.println(e);
        }*/





        //total_price_order - expects order_id
       /* int a = 1;
        try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt;
            ResultSet rs;
            String totalPriceOr = "select total_price_order(?)";
            pstmt = conn.prepareStatement(totalPriceOr);
            try {
                pstmt.setInt(1, a);
                rs = pstmt.executeQuery();
                rs.next();
                float total = rs.getFloat(1);
                System.out.println(total);
            }catch (Exception e){
                System.out.println("\n -- SQL Exception --- \n"+ e.getMessage());
            }

        }catch (Exception e){
            System.out.println(e);
        }*/

   /* String str = "2022-01-03";
    Booking testBook = new Booking(10, str., "Πάλι εγώ", 4,21);
    */







    }//end main
}
