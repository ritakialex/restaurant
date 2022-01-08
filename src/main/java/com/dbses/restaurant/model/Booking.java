package com.dbses.restaurant.model;

import com.dbses.restaurant.database.DatabaseCallException;
import com.dbses.restaurant.database.DatabaseConfig;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.sql.*;
import javax.swing.JTextField;

public class Booking {

    private int bookingId;
    private int tableId;
    private Date bookingDate;
    private String customerName;
    private int customerCount;
    private int hour;

    public Booking(int bookingId,
                   int tableId,
                   Date bookingDate,
                   String customerName,
                   int customerCount,
                   int hour) {
        this.bookingId = bookingId;
        this.tableId = tableId;
        this.bookingDate = bookingDate;
        this.customerName = customerName;
        this.customerCount = customerCount;
        this.hour = hour;
    }

    //without bookingId
    public Booking(int tableId, Date bookingDate, String customerName,
                   int customerCount, int hour) {
        this.tableId = tableId;
        this.bookingDate = (Date) bookingDate;
        this.customerName = customerName;
        this.customerCount = customerCount;
        this.hour = hour;
    }

    public int getId() {
        return bookingId;
    }

    public void setId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(int customerCount) {
        this.customerCount = customerCount;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", tableId=" + tableId +
                ", bookingDate=" + bookingDate +
                ", customerName='" + customerName + '\'' +
                ", customerCount=" + customerCount +
                ", hour=" + hour +
                '}';
    }

    //εμφανίζει αντικείμενα τύπου Booking
    public static ArrayList<Booking> getBookings() throws DatabaseCallException {
        try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();
            String getBookings = "select * from get_bookings(null, null, null, null)";
            ResultSet rs = stmt.executeQuery(getBookings);
            final ArrayList<Booking> bookings = new ArrayList();
            while (rs.next()) {
                bookings.add(new Booking(
                        rs.getInt(1), rs.getInt(2),
                        rs.getDate(3), rs.getString(4),
                        rs.getInt(5), rs.getInt(6))
                );
            }
            return bookings;
        } catch (Exception e) {
            throw new DatabaseCallException("Exception while calling getBookings. Original " +
                "exception: " + e);
        }
    }


    //delete booking with id =?
    public static void deleteBooking(int id) throws Exception {
        try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String deleteBooking = "call delete_booking(?)";
            pstmt = conn.prepareStatement(deleteBooking);
            try {
                //θα παίρνει το id από το χρήστη
                pstmt.setInt(1, id);
                int changes = pstmt.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n" + ex.getMessage());
            }
        } catch (Exception e) {
            throw new DatabaseCallException("Exception while calling deleteBooking. Original " +
                "exception: " + e);
        }
    }


    //call stored procedure create_booking - Δημιουργεί νέο booking
    //θα πρέπει να πάρει από τον χρήστη int(boooking id) - Strind (που θα μετατρέψει σε αντικείμενο Date)
    //String (ονομα πελάτη), int (πόσοι πελάτες) και int (ώρα, πχ 12 ή 18, ή 20)
    public static void createNewBooking(int tableId, String date, String custName, int count,
                                        int hour) throws DatabaseCallException {
        try (Connection conn = DatabaseConfig.getConnection()) {
            //String str = date;
            Booking book = new Booking(tableId, java.sql.Date.valueOf(date),
                    custName, count, hour);
            PreparedStatement pstmt = null;
            String insertBooking = "call create_booking(?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(insertBooking);
            try {
                pstmt.setInt(1, book.getTableId());
                pstmt.setDate(2, (java.sql.Date) book.getBookingDate());
                pstmt.setInt(3, book.getHour());
                pstmt.setString(4, book.getCustomerName());
                pstmt.setInt(5, book.getCustomerCount());
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n" + ex.getMessage());
            }
        } catch (Exception e) {
            throw new DatabaseCallException("Exception while calling deleteBooking. Original " +
                "exception: " + e);
        }
    }


}
