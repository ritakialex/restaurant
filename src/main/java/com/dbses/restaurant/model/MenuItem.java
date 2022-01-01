package com.dbses.restaurant.model;

import com.dbses.restaurant.database.DatabaseConfig;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;

public class MenuItem {

    private int menuItemId;
    private String menuItemName;
    private String menuItemDescription;
    private String category;
    private double price;
    private int stockNumber;

    public MenuItem(int menuItemId,
                    String menuItemName,
                    String menuItemDescription,
                    String category,
                    double price,
                    int stockNumber) {
        this.menuItemId = menuItemId;
        this.menuItemName = menuItemName;
        this.menuItemDescription = menuItemDescription;
        this.category = category;
        this.price = price;
        this.stockNumber = stockNumber;
    }

    public int getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public String getMenuItemDescription() {
        return menuItemDescription;
    }

    public void setMenuItemDescription(String menuItemDescription) {
        this.menuItemDescription = menuItemDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "menuItemId=" + menuItemId +
                ", menuItemName='" + menuItemName + '\'' +
                ", menuItemDescription='" + menuItemDescription + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", stockNumber=" + stockNumber +
                '}';
    }

    //βγάζει τα αποτελέσματα ανά γραμμή -- δε θα το χρησιμοποιήσουμε
    public static void getMenuItemsToString() throws Exception{
        try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();
            String getMenuItems = "select get_menu_items(null, null)";
            ResultSet rs = stmt.executeQuery(getMenuItems);
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
    //Δημιουργεί αντικείμενα τύπου MenuItem
    public static ArrayList<MenuItem> getMenuItems() throws Exception {
        try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();
            String getMenuItems = "select * from get_menu_items(null, null)";
            ResultSet rs = stmt.executeQuery(getMenuItems);
            final ArrayList<MenuItem> menuItems = new ArrayList();
            while (rs.next()) {
                menuItems.add(new MenuItem(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getFloat(5),
                        rs.getInt(6))
                );
            }
            return menuItems;
        }catch (Exception e){
            System.out.println(e);
            throw new Exception();
        }
    }

    //
    public static float totalPrice() throws Exception {
        try (Connection conn = DatabaseConfig.getConnection()) {
            Statement stmt = conn.createStatement();
            int[] items;
            //το array[1,2,3] είναι σαν παράδειγμα, θα πρέπει να το παίρνει από τον χρήστη
            //δηλαδή για items θέλει σύνολο τιμής
            String totalPrice = "select total_price(array[1,2,3])";
            ResultSet rs = stmt.executeQuery(totalPrice);
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();
            float price = rs.getFloat(1);
            return price;
        } catch (Exception e) {
            System.out.println(e);
            throw new Exception();
        }
    }

    //menu item with id = ? -- update price +/- ?
    public static void updatePrice() throws Exception {
        try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String updatePrice = "call update_menu_item_price(?, ?)";
            pstmt = conn.prepareStatement(updatePrice);
            try {
                //στο πρώτο θα παίρνει από το χρήστη ποιο id από menu item
                //θέλει να αλλάξει τιμή, και στο 2ο θα παίρνει την αλλαγή τιμής
                //κατά πόσο θα αυξηθει ή θα μειωθεί
                pstmt.setInt(1, 6);
                pstmt.setFloat(2, -1f);
                int changes = pstmt.executeUpdate();
                //System.out.println(changes + " records updated");
            }catch(SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n"+ ex.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }


    //menu item with id = ? - update stock number +/- ?
    public static void updateStock() throws Exception {
        try (Connection conn = DatabaseConfig.getConnection()) {
            PreparedStatement pstmt = null;
            String updateStock = "call update_menu_item_stock(?, ?)";
            pstmt = conn.prepareStatement(updateStock);
            try {
                pstmt.setInt(1, 5);
                pstmt.setInt(2, -10);
                int changes = pstmt.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("\n -- SQL Exception --- \n" + ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }






}//end class
