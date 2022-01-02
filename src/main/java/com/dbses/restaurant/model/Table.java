package com.dbses.restaurant.model;

import com.dbses.restaurant.database.DatabaseConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Table {

    private int tableId;
    private int capacity;
    private boolean isAvailable;

    public Table(int tableId, int capacity, boolean isAvailable) {
        this.tableId = tableId;
        this.capacity = capacity;
        this.isAvailable = isAvailable;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableId=" + tableId +
                ", capacity=" + capacity +
                ", isAvailable=" + isAvailable +
                '}';
    }

    //εμφανίζει τραπέζια που είναι διαθέσιμα και έχουν χωρητικότητα πάνω από ?
    public static ArrayList<Table> getTables(int capacity) throws Exception {
        try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            String getTables = "select * from get_tables(?, true)";
            pstmt = conn.prepareStatement(getTables);
            try {
                //θα πρέπει να παίρνει τιμές από το χρήστη. η τιμή που θα πάρει θα
                //πρέπει να είναι int και να μπαίνει στη θέση του 6
                pstmt.setInt(1, capacity);
                //pstmt.setBoolean(2, true);
                rs = pstmt.executeQuery();
                final ArrayList<Table> tables = new ArrayList();
                while (rs.next()) {
                    tables.add(new Table(
                            rs.getInt(1),
                            rs.getInt(2),
                            rs.getBoolean(3)));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            //connection catch + return
            System.out.println(e);
            throw new Exception();
        }
        return null;
    }


    //αλλάζει τη διαθεσιμότητα στο τραπέζι με id = ?
    public static void toggleAvailability(int tableId) throws Exception {
        try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String toggle = "call toggle_availability(?)";
            pstmt = conn.prepareStatement(toggle);
            try {
                //θα παίρνει από τον χρήστη το id και θα το βάζει στη θέση του 10
                pstmt.setInt(1, tableId);
                pstmt.executeUpdate();
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }



}
