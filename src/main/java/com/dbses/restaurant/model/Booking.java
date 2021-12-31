package com.dbses.restaurant.model;

import java.util.Date;

public class Booking {

    private int bookingId;
    private int tableId;
    private Date bookingDate;
    private String customerName;
    private int customerCount;

    public Booking(int bookingId,
                   int tableId,
                   Date bookingDate,
                   String customerName,
                   int customerCount) {
        this.bookingId = bookingId;
        this.tableId = tableId;
        this.bookingDate = bookingDate;
        this.customerName = customerName;
        this.customerCount = customerCount;
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
}
