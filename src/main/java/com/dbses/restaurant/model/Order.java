package com.dbses.restaurant.model;

import com.dbses.restaurant.database.DatabaseCallException;
import com.dbses.restaurant.database.DatabaseConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JTextField;

//Για δοκιμή κώδικα
/*class Main {
    public static void main(String[] args) {

        try {
            ArrayList<Order> theorders = Order.getOrderWithItems();
            Iterator iter = theorders.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
        } catch (Exception e){
            System.out.println(e);
        }

    }
}*/

public class Order {
        private int orderId;
        private int tableId;
        private int bookingId;
        private Timestamp time;
        private Integer[] item;

    public Order( int orderId, int tableId, int bookingId, Timestamp time, Integer[] item){
            this.orderId = orderId;
            this.tableId = tableId;
            this.bookingId = bookingId;
            this.time = time;
            this.item = item;
        }

    public Order( int orderId, int tableId, int bookingId, Timestamp time){
            this.orderId = orderId;
            this.tableId = tableId;
            this.bookingId = bookingId;
            this.time = time;
        }

    public int getOrderId () {
        return orderId;
    }

    public void setOrderId ( int orderId){
        this.orderId = orderId;
    }

    public int getTableId () {
        return tableId;
    }

    public void setTableId ( int tableId){
        this.tableId = tableId;
    }

    public int getBookingId () {
        return bookingId;
    }

    public void setBookingId ( int bookingId){
        this.bookingId = bookingId;
    }

    public Timestamp getTime () {
        return time;
    }

    public void setTime (Timestamp time){
        this.time = time;
    }

    public Integer[] getItem() {
        return item;
    }

    @Override
    public String toString () {
        return "Order{" +
                "orderId=" + orderId +
                ", tableId=" + tableId +
                ", bookingId=" + bookingId +
                ", time=" + time +
                ", item=" + item +
                '}';
    }

    //Δημιουργεί αντικείμενα τύπου Order με ArrayList items
    public static ArrayList<Order> getOrderWithItems () throws Exception {
        try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();
            String getOrders = "select * from get_order_with_items(null)";
            ResultSet rs = stmt.executeQuery(getOrders);
            final ArrayList<Order> orders = new ArrayList<Order>();
            while (rs.next()) {
                final Integer[] intrs = (Integer[])rs.getArray(5).getArray();

                orders.add(new Order(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getTimestamp(4),
                        intrs)
                );
            }

            return orders;
        } catch (Exception e) {
            throw new DatabaseCallException("Exception while calling getOrderWithItems. Original " +
                "exception: " + e);
        }
    }


    //περιμένει το orderId από τον χρήστη και επιστρέφει float το σύνολο της παραγγελίας
    public static float getTotalPriceOrder(int orderId) throws DatabaseCallException {
        float totalPrice = 0;
        try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt;
            ResultSet rs;
            String totalPriceOr = "select total_price_order(?)";
            pstmt = conn.prepareStatement(totalPriceOr);
            try {
                pstmt.setInt(1, orderId);
                rs = pstmt.executeQuery();
                rs.next();
                totalPrice = rs.getFloat(1);
                return totalPrice;
            } catch (Exception e) {
                System.out.println("\n -- SQL Exception --- \n" + e.getMessage());
            }

        } catch (Exception e) {
            throw new DatabaseCallException("Exception while calling getTotalPriceOrder. Original " +
                "exception: " + e);
        }
        return totalPrice; //αν επιστρέψει 0 σημαίνει ότι κάτι δεν πήγε καλά και δεν επέστρεψε
        //την τιμή μέσα στο try
    }

    //call create_order with booking id - 3 params
    //αν δεν γίνεται την ώρα της κράτησης εμφανίζει error
    public static void createOrder(int tableId, int[] items, int bookId) throws Exception {
        try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String newOrder = "call create_order(?, ?, ?)";
            pstmt = conn.prepareStatement(newOrder);
            try {
                pstmt.setInt(1, tableId);
                //int[] items = {6, 7};
                pstmt.setObject(2, items);
                pstmt.setInt(3, bookId);
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n" + ex.getMessage());
            }
        } catch (Exception e) {
            throw new DatabaseCallException("Exception while calling createOrder. Original " +
                "exception: " + e);
        }
    }

    //call create_order - 2 params
    public static void createOrderWithoutBooking(int tableId, int[] items) throws Exception {
        try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String newOrder = "call create_order(?, ?)";
            pstmt = conn.prepareStatement(newOrder);
            try {
                pstmt.setInt(1, tableId);
                //int[] items = {6, 7};
                pstmt.setObject(2, items);
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n" + ex.getMessage());
            }
        } catch (Exception e) {
            throw new DatabaseCallException("Exception while calling createOrderWithBooking. Original " +
                "exception: " + e);
        }
    }
}
