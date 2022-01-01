package com.dbses.restaurant.model;

import com.dbses.restaurant.database.DatabaseConfig;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.sql.*;

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

    //Δημιουργεί αντικείμενα τύπου Booking
    public static ArrayList<Booking> getBookings() throws Exception {
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
            System.out.println(e);
            throw new Exception();
        }
    }


    //βγάζει τα αποτελέσματα ανά γραμμή - δε θα το χρησιμοποιήσουμε
    public static void getBookingsToString() throws Exception{
        try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();
            String getBookings = "select get_bookings(null, null, null, null)";
            ResultSet rs = stmt.executeQuery(getBookings);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            //System.out.println("αριθμός στηλών:" + numberOfColumns);
            while (rs.next()) {
                for(int i=1; i <=numberOfColumns; i++) {
                    String data = rs.getString(i);
                    System.out.println(data);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }


}
