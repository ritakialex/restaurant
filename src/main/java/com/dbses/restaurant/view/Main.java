package com.dbses.restaurant.view;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.dbses.restaurant.model.Booking;
import com.dbses.restaurant.model.MenuItem;
import com.dbses.restaurant.model.Order;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author georg
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        getOrder();
        getBooking();
        getMenuItem();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Arxikh = new javax.swing.JTabbedPane();
        Main = new javax.swing.JPanel();
        NameMagaziou = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        AddKratish = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table_AddKrat = new javax.swing.JTable();
        txtKrat_atoma = new javax.swing.JTextField();
        txtKrat_Trapezi = new javax.swing.JTextField();
        txtKrat_onoma = new javax.swing.JTextField();
        labOnoma = new javax.swing.JLabel();
        labWra = new javax.swing.JLabel();
        labAtoma = new javax.swing.JLabel();
        labAddKratTrapezi = new javax.swing.JLabel();
        deleteButtonKRAT = new javax.swing.JButton();
        addButtonKRAT = new javax.swing.JButton();
        exitButton2 = new javax.swing.JButton();
        labAddKrat = new javax.swing.JLabel();
        NameMagaziou_AddKrat = new javax.swing.JLabel();
        txtKrat_date = new javax.swing.JTextField();
        labDate = new javax.swing.JLabel();
        txtKrat_id = new javax.swing.JTextField();
        txtKrat_hour = new javax.swing.JTextField();
        menouButton = new javax.swing.JPanel();
        labName = new javax.swing.JLabel();
        labKatigoria = new javax.swing.JLabel();
        txtMenu_Id = new javax.swing.JTextField();
        txtMenu_Name = new javax.swing.JTextField();
        txtMenu_Katigoria = new javax.swing.JTextField();
        addButtonMenu = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_Menu = new javax.swing.JTable();
        exitButton4 = new javax.swing.JButton();
        NameMagaziou_Menu = new javax.swing.JLabel();
        labMenou = new javax.swing.JLabel();
        txtMenu_Timi = new javax.swing.JTextField();
        labTimi = new javax.swing.JLabel();
        txtMenu_Stock = new javax.swing.JTextField();
        labStock = new javax.swing.JLabel();
        txtMenu_Perigrafh = new javax.swing.JTextField();
        labPerigrafh = new javax.swing.JLabel();
        ParaggeliesManagement = new javax.swing.JPanel();
        NameMagaziou_Paragg = new javax.swing.JLabel();
        exitButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Paragg = new javax.swing.JTable();
        addButtonPARAG = new javax.swing.JButton();
        txtParagg_Trapezi = new javax.swing.JTextField();
        txtParagg_ParagId = new javax.swing.JTextField();
        labParagg_ParaggId = new javax.swing.JLabel();
        labParaggelies = new javax.swing.JLabel();
        labParagg_Trapezi = new javax.swing.JLabel();
        txtParagg_ID = new javax.swing.JTextField();
        txtParagg_piat = new javax.swing.JTextField();
        StockPrice = new javax.swing.JPanel();
        NameMagaziou_SP = new javax.swing.JLabel();
        labSP = new javax.swing.JLabel();
        exitButton5 = new javax.swing.JButton();
        labS_ID = new javax.swing.JLabel();
        labS_stock = new javax.swing.JLabel();
        labS_price = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        txtStock_ID = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        addButtonStock = new javax.swing.JButton();
        addButtonPrice = new javax.swing.JButton();
        txtPrice_ID = new javax.swing.JTextField();
        labS_ID1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurant");
        setMinimumSize(new java.awt.Dimension(680, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameMagaziou.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameMagaziou.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");
        Main.add(NameMagaziou, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        Main.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, 30));

        Arxikh.addTab("Αρχική", Main);

        AddKratish.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_AddKrat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ΟΝΟΜΑ", "ΗΜΕΡΟΜΗΝΙΑ", "ΩΡΑ", "ΑΤΟΜΑ", "ΤΡΑΠΕΖΙ"
            }
        ));
        jScrollPane4.setViewportView(Table_AddKrat);

        AddKratish.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 610, 150));

        txtKrat_atoma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AddKratish.add(txtKrat_atoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 100, 30));

        txtKrat_Trapezi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtKrat_Trapezi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKrat_TrapeziActionPerformed(evt);
            }
        });
        AddKratish.add(txtKrat_Trapezi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 101, 30));

        txtKrat_onoma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtKrat_onoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKrat_onomaActionPerformed(evt);
            }
        });
        AddKratish.add(txtKrat_onoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 180, 30));

        labOnoma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labOnoma.setText("ΟΝΟΜΑ");
        AddKratish.add(labOnoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        labWra.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labWra.setText("ΩΡΑ");
        AddKratish.add(labWra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        labAtoma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labAtoma.setText("ΑΤΟΜΑ");
        AddKratish.add(labAtoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        labAddKratTrapezi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labAddKratTrapezi.setText("ΤΡΑΠΈΖΙ");
        AddKratish.add(labAddKratTrapezi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        deleteButtonKRAT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteButtonKRAT.setText("ΔΙΑΓΡΑΦΗ");
        deleteButtonKRAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonKRATActionPerformed(evt);
            }
        });
        AddKratish.add(deleteButtonKRAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 110, -1));

        addButtonKRAT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButtonKRAT.setText("ΠΡΟΣΘΕΣΗ");
        addButtonKRAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonKRATActionPerformed(evt);
            }
        });
        AddKratish.add(addButtonKRAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 110, -1));

        exitButton2.setText("Exit");
        exitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton2ActionPerformed(evt);
            }
        });
        AddKratish.add(exitButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 50, 30));

        labAddKrat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labAddKrat.setForeground(new java.awt.Color(153, 0, 0));
        labAddKrat.setText("ΠΡΟΣΘΗΚΗ ΚΡΑΤΗΣΗΣ");
        AddKratish.add(labAddKrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        NameMagaziou_AddKrat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameMagaziou_AddKrat.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");
        AddKratish.add(NameMagaziou_AddKrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtKrat_date.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AddKratish.add(txtKrat_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 180, 30));

        labDate.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labDate.setText("ΗΜΕΡΟΜΗΝΙΑ");
        AddKratish.add(labDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        txtKrat_id.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtKrat_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKrat_idActionPerformed(evt);
            }
        });
        AddKratish.add(txtKrat_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 30, 0, -1));

        txtKrat_hour.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtKrat_hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKrat_hourActionPerformed(evt);
            }
        });
        AddKratish.add(txtKrat_hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 101, 30));

        Arxikh.addTab("Πρόσθεση Κράτησης", AddKratish);

        menouButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labName.setText("Όνομα Πιάτου");
        menouButton.add(labName, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 68, -1, -1));

        labKatigoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labKatigoria.setText("Κατηγορία");
        menouButton.add(labKatigoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 104, -1, -1));

        txtMenu_Id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMenu_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenu_IdActionPerformed(evt);
            }
        });
        menouButton.add(txtMenu_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 30, 0, -1));

        txtMenu_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMenu_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenu_NameActionPerformed(evt);
            }
        });
        menouButton.add(txtMenu_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 63, 180, 27));

        txtMenu_Katigoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMenu_Katigoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenu_KatigoriaActionPerformed(evt);
            }
        });
        menouButton.add(txtMenu_Katigoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 98, 180, 30));

        addButtonMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButtonMenu.setText("ΠΡΟΣΘΕΣΗ");
        addButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonMenuActionPerformed(evt);
            }
        });
        menouButton.add(addButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 110, -1));

        Table_Menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ΟΝΟΜΑ ΠΙΑΤΟΥ", "ΚΑΤΗΓΟΡΙΑ", "ΤΙΜΉ", "STOCK", "ΠΕΡΙΓΡΑΦΗ"
            }
        ));
        jScrollPane3.setViewportView(Table_Menu);

        menouButton.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 260, 622, 120));

        exitButton4.setText("Exit");
        exitButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton4ActionPerformed(evt);
            }
        });
        menouButton.add(exitButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, 34));

        NameMagaziou_Menu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameMagaziou_Menu.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");
        menouButton.add(NameMagaziou_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        labMenou.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labMenou.setForeground(new java.awt.Color(153, 0, 0));
        labMenou.setText("ΜΕΝΟΥ");
        menouButton.add(labMenou, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtMenu_Timi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menouButton.add(txtMenu_Timi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 134, 180, 30));

        labTimi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labTimi.setText("Τιμή");
        menouButton.add(labTimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 140, -1, -1));

        txtMenu_Stock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMenu_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenu_StockActionPerformed(evt);
            }
        });
        menouButton.add(txtMenu_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 180, 30));

        labStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labStock.setText("Stock");
        menouButton.add(labStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 176, -1, -1));

        txtMenu_Perigrafh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMenu_Perigrafh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenu_PerigrafhActionPerformed(evt);
            }
        });
        menouButton.add(txtMenu_Perigrafh, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 206, 180, 30));

        labPerigrafh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labPerigrafh.setText("Περιγραφή");
        menouButton.add(labPerigrafh, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 212, -1, -1));

        Arxikh.addTab("Μενού", menouButton);

        ParaggeliesManagement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameMagaziou_Paragg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameMagaziou_Paragg.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");
        ParaggeliesManagement.add(NameMagaziou_Paragg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        exitButton3.setText("Exit");
        exitButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton3ActionPerformed(evt);
            }
        });
        ParaggeliesManagement.add(exitButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, 30));

        Table_Paragg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ΤΡΑΠΕΖΙ", "ΩΡΑ", "ΠΑΡΑΓΓΕΛΙΑ", "ΠΙΑΤΑ", "ΤΕΛΙΚΗ ΤΙΜΗ "
            }
        ));
        jScrollPane1.setViewportView(Table_Paragg);
        if (Table_Paragg.getColumnModel().getColumnCount() > 0) {
            Table_Paragg.getColumnModel().getColumn(1).setResizable(false);
            Table_Paragg.getColumnModel().getColumn(3).setResizable(false);
        }

        ParaggeliesManagement.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 580, 150));

        addButtonPARAG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButtonPARAG.setText("ΠΡΟΣΘΕΣΗ");
        addButtonPARAG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonPARAGActionPerformed(evt);
            }
        });
        ParaggeliesManagement.add(addButtonPARAG, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 110, -1));

        txtParagg_Trapezi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtParagg_Trapezi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParagg_TrapeziActionPerformed(evt);
            }
        });
        ParaggeliesManagement.add(txtParagg_Trapezi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 180, 30));

        txtParagg_ParagId.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ParaggeliesManagement.add(txtParagg_ParagId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 180, 30));

        labParagg_ParaggId.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labParagg_ParaggId.setText("ΠΙΑΤΑ");
        ParaggeliesManagement.add(labParagg_ParaggId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        labParaggelies.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labParaggelies.setForeground(new java.awt.Color(153, 0, 0));
        labParaggelies.setText("ΠΑΡΑΓΓΕΛΙΕΣ");
        ParaggeliesManagement.add(labParaggelies, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        labParagg_Trapezi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labParagg_Trapezi.setText("ΤΡΑΠΕΖΙ");
        ParaggeliesManagement.add(labParagg_Trapezi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        txtParagg_ID.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtParagg_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParagg_IDActionPerformed(evt);
            }
        });
        ParaggeliesManagement.add(txtParagg_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        txtParagg_piat.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtParagg_piat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParagg_piatActionPerformed(evt);
            }
        });
        ParaggeliesManagement.add(txtParagg_piat, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 30, 0, -1));

        Arxikh.addTab("Παραγγελίες", ParaggeliesManagement);

        StockPrice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameMagaziou_SP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameMagaziou_SP.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");
        StockPrice.add(NameMagaziou_SP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        labSP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labSP.setForeground(new java.awt.Color(153, 0, 0));
        labSP.setText("STOCK & PRICE");
        StockPrice.add(labSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        exitButton5.setText("Exit");
        exitButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton5ActionPerformed(evt);
            }
        });
        StockPrice.add(exitButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 11, -1, 30));

        labS_ID.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labS_ID.setText("ID");
        StockPrice.add(labS_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        labS_stock.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labS_stock.setText("STOCK");
        StockPrice.add(labS_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        labS_price.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labS_price.setText("PRICE");
        StockPrice.add(labS_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        txtStock.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        StockPrice.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 180, 31));

        txtStock_ID.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtStock_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStock_IDActionPerformed(evt);
            }
        });
        StockPrice.add(txtStock_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 180, 30));

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        StockPrice.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 180, 30));

        addButtonStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButtonStock.setText("ΠΡΟΣΘΕΣΗ STOCK");
        addButtonStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonStockActionPerformed(evt);
            }
        });
        StockPrice.add(addButtonStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 162, -1));

        addButtonPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButtonPrice.setText("ΠΡΟΣΘΕΣΗ PRICE");
        addButtonPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonPriceActionPerformed(evt);
            }
        });
        StockPrice.add(addButtonPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 192, 162, -1));

        txtPrice_ID.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtPrice_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice_IDActionPerformed(evt);
            }
        });
        StockPrice.add(txtPrice_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 180, 30));

        labS_ID1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labS_ID1.setText("ID");
        StockPrice.add(labS_ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        Arxikh.addTab("Stock", StockPrice);

        getContentPane().add(Arxikh, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 690, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrice_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice_IDActionPerformed

    //PROS8ESH PRICE

    private void addButtonPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonPriceActionPerformed

        if (txtPrice_ID.getText().equals("") || txtPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Παρακαλώ βάλτε τα δεδομένα!");
        } else {
            try {
                MenuItem.updatePrice(Integer.parseInt(txtPrice_ID.getText()), Float.parseFloat(txtPrice.getText()));
                getMenuItem();
                txtPrice_ID.setText("");
                txtPrice.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ολα πήγαν ΟΚ! ");
            }
        }
    }//GEN-LAST:event_addButtonPriceActionPerformed

    //PROS8ESH STOCK

    private void addButtonStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonStockActionPerformed

        if (txtStock_ID.getText().equals("") || txtStock.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Παρακαλώ βάλτε τα δεδομένα!");
        } else {
            try {
                MenuItem.updateStock(Integer.parseInt(txtStock_ID.getText()), Integer.parseInt(txtStock.getText()));
                getMenuItem();
                txtStock_ID.setText("");
                txtStock.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ολα Ok");
            }
        }
    }//GEN-LAST:event_addButtonStockActionPerformed

    private void txtStock_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStock_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStock_IDActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void exitButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButton5ActionPerformed

    private void txtMenu_PerigrafhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenu_PerigrafhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenu_PerigrafhActionPerformed

    private void txtMenu_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenu_StockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenu_StockActionPerformed

    private void exitButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButton4ActionPerformed

    //PROS8ESH MENU

    private void addButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonMenuActionPerformed

        //ΣΤΟΙΧΕΙΑ ΠΟΥ ΘΑ ΓΡΑΨΕΙ Ο ΧΡΗΣΤΗΣ ΣΤΑ ΚΕΝΑ ΠΕΔΙΑ.
        if (txtMenu_Name.getText().equals("") || txtMenu_Katigoria.getText().equals("") ||
            txtMenu_Timi.getText().equals("") || txtMenu_Stock.getText().equals("") ||
            txtMenu_Perigrafh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Παρακαλώ βάλτε τα δεδομένα!");
        } else {
            //ΠΙΝΑΚΑΣ ΚΑΙ ΤΒΜΟΝΤΕΛ ΓΙΑ ΝΑ ΓΡΑΦΤΟΥΝ-ΕΜΦΑΝ. ΣΤΟΝ ΠΙΝΑΚΑ
            try {  //ΚΑΛΩ ΤΗΝ MENYITEM.CREATNEWMENUITEM ΚΑΙ ΒΑΖΩ ΤΑ ΣΤΟΙΧΕΙΑ ΠΟΥ ΘΕΛΕΙ.
                MenuItem.createNewMenuItem(txtMenu_Name.getText(), txtMenu_Perigrafh.getText(),
                    txtMenu_Katigoria.getText(), Float.parseFloat(txtMenu_Timi.getText()),
                    Integer.parseInt(txtMenu_Stock.getText()));

                getMenuItem();
                //TΑ ΣΤΟΙΧΕΙΑ ΤΟΥ ΠΙΝΑΚΑ ΤΑ ΚΑΝΩ ΣΕΤ.
                txtMenu_Id.setText("");
                txtMenu_Name.setText("");
                txtMenu_Katigoria.setText("");
                txtMenu_Timi.setText("");
                txtMenu_Stock.setText("");
                txtMenu_Perigrafh.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ολα ok");
            }
        }
    }//GEN-LAST:event_addButtonMenuActionPerformed

    private void txtMenu_KatigoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenu_KatigoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenu_KatigoriaActionPerformed

    private void txtMenu_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenu_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenu_NameActionPerformed

    private void txtMenu_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenu_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenu_IdActionPerformed

    private void txtParagg_TrapeziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParagg_TrapeziActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParagg_TrapeziActionPerformed

    //PROS8ESH PARAGGELIAS
    //PIATA & TOTAL PRICE ORDER.

    private void addButtonPARAGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonPARAGActionPerformed

        final Function<String, int[]> stringToIntAr =
            str -> Arrays.stream(str.split(","))
                .map(Integer::parseInt)
                .mapToInt(Integer::intValue)
                .toArray();

        if (txtParagg_Trapezi.getText().equals("") || txtParagg_ParagId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Παρακαλώ βάλτε τα δεδομένα! ");
        } else {
            try {
                Order.createOrderWithoutBooking(Integer.parseInt(txtParagg_Trapezi.getText()),
                    stringToIntAr.apply(txtParagg_ParagId.getText()));

                getOrder();
                txtKrat_id.setText("");
                txtParagg_ID.setText("");
                txtParagg_Trapezi.setText("");
                txtParagg_ParagId.setText("");
                txtParagg_piat.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ολα Λαθος: " + e);
            }
        }
    }//GEN-LAST:event_addButtonPARAGActionPerformed

    private void exitButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButton3ActionPerformed

    private void txtKrat_hourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKrat_hourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKrat_hourActionPerformed

    private void exitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButton2ActionPerformed

    //PROS8ESH KRATHSH

    private void addButtonKRATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonKRATActionPerformed

        if (txtKrat_onoma.getText().equals("") || txtKrat_date.getText().equals("") || txtKrat_hour.getText().equals("") ||
            txtKrat_atoma.getText().equals("") || txtKrat_Trapezi.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Παρακαλώ βάλτε τα δεδομένα! ");
        } else {
            try {
                Booking.createNewBooking(Integer.parseInt(txtKrat_Trapezi.getText()),
                    txtKrat_date.getText(),
                    txtKrat_onoma.getText(),
                    Integer.parseInt(txtKrat_atoma.getText()),
                    Integer.parseInt(txtKrat_hour.getText()));

                txtKrat_id.setText("");
                txtKrat_onoma.setText("");
                txtKrat_date.setText("");
                txtKrat_hour.setText("");
                txtKrat_atoma.setText("");
                getBooking();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ολα ok");
            }

        }
    }//GEN-LAST:event_addButtonKRATActionPerformed

    //DIAGRAFH KRATHSH

    private void deleteButtonKRATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonKRATActionPerformed

        DefaultTableModel tblModel = (DefaultTableModel) Table_AddKrat.getModel();

        if (Table_AddKrat.getSelectedRowCount() == 1) {
            try {
                Booking.deleteBooking(
                    Integer.parseInt((String) tblModel.getValueAt(Table_AddKrat.getSelectedRow(), 0)));

                getBooking();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ολα λαθος " + e);
            }
        } else {
            if (Table_AddKrat.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Ο πινακας ειναι κενός");
            } else {
                JOptionPane.showMessageDialog(this, "Παρακαλώ διαλέξτε κάτι για διαγραφή!");
            }
        }
    }//GEN-LAST:event_deleteButtonKRATActionPerformed

    private void txtKrat_onomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKrat_onomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKrat_onomaActionPerformed

    private void txtKrat_TrapeziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKrat_TrapeziActionPerformed

    }//GEN-LAST:event_txtKrat_TrapeziActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void txtParagg_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParagg_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParagg_IDActionPerformed

    private void txtKrat_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKrat_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKrat_idActionPerformed

    private void txtParagg_piatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParagg_piatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParagg_piatActionPerformed

    //PARAGGELIES
    private void getOrder() {
        DefaultTableModel tblModel = (DefaultTableModel) Table_Paragg.getModel();

        try {
            ArrayList<Order> getOrderWithItems = Order.getOrderWithItems();

            tblModel.setRowCount(0);
            for (Order order : getOrderWithItems) {
                String[] data = {
                    String.valueOf(order.getOrderId()),
                    String.valueOf(order.getTableId()),
                    String.valueOf(order.getTime()),
                    String.valueOf(order.getBookingId()),
                    Arrays.stream(order.getItem())
                        .map(String::valueOf)
                        .collect(Collectors.joining(",")),
                    String.valueOf(Order.getTotalPriceOrder(order.getOrderId()))
                };
                tblModel.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ολα Λαθος Order");
        }
    }

    //MENOΥ
    private void getMenuItem() {
        DefaultTableModel tblModel = (DefaultTableModel) Table_Menu.getModel();
        try {
            ArrayList<MenuItem> MenuItems = MenuItem.getMenuItems();
            tblModel.setRowCount(0);
            for (MenuItem MenuItem : MenuItems) {
                String[] data = {String.valueOf(MenuItem.getMenuItemId()),
                    MenuItem.getMenuItemName(),
                    MenuItem.getCategory(),
                    String.valueOf(MenuItem.getPrice()),
                    String.valueOf(MenuItem.getStockNumber()),
                    MenuItem.getMenuItemDescription()};
                tblModel.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ολα Λαθος Menu Item" + e);
        }
    }

    //ΚΡΑΤΉΣΕΙΣ
    private void getBooking() {

        DefaultTableModel tblModel = (DefaultTableModel) Table_AddKrat.getModel();
        try {
            ArrayList<Booking> bookings = Booking.getBookings();
            tblModel.setRowCount(0);
            for (Booking booking : bookings) {
                System.out.println(booking);
                String[] data = {
                    String.valueOf(booking.getId()),
                    booking.getCustomerName(),
                    new SimpleDateFormat("dd-mm-yyyy").format(booking.getBookingDate()),
                    String.valueOf(booking.getHour()),
                    String.valueOf(booking.getCustomerCount()),
                    String.valueOf(booking.getTableId())};
                tblModel.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ολα πηγαν Λαθος Bookings");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddKratish;
    private javax.swing.JTabbedPane Arxikh;
    private javax.swing.JPanel Main;
    private javax.swing.JLabel NameMagaziou;
    private javax.swing.JLabel NameMagaziou_AddKrat;
    private javax.swing.JLabel NameMagaziou_Menu;
    private javax.swing.JLabel NameMagaziou_Paragg;
    private javax.swing.JLabel NameMagaziou_SP;
    private javax.swing.JPanel ParaggeliesManagement;
    private javax.swing.JPanel StockPrice;
    private javax.swing.JTable Table_AddKrat;
    private javax.swing.JTable Table_Menu;
    private javax.swing.JTable Table_Paragg;
    private javax.swing.JButton addButtonKRAT;
    private javax.swing.JButton addButtonMenu;
    private javax.swing.JButton addButtonPARAG;
    private javax.swing.JButton addButtonPrice;
    private javax.swing.JButton addButtonStock;
    private javax.swing.JButton deleteButtonKRAT;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButton2;
    private javax.swing.JButton exitButton3;
    private javax.swing.JButton exitButton4;
    private javax.swing.JButton exitButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labAddKrat;
    private javax.swing.JLabel labAddKratTrapezi;
    private javax.swing.JLabel labAtoma;
    private javax.swing.JLabel labDate;
    private javax.swing.JLabel labKatigoria;
    private javax.swing.JLabel labMenou;
    private javax.swing.JLabel labName;
    private javax.swing.JLabel labOnoma;
    private javax.swing.JLabel labParagg_ParaggId;
    private javax.swing.JLabel labParagg_Trapezi;
    private javax.swing.JLabel labParaggelies;
    private javax.swing.JLabel labPerigrafh;
    private javax.swing.JLabel labSP;
    private javax.swing.JLabel labS_ID;
    private javax.swing.JLabel labS_ID1;
    private javax.swing.JLabel labS_price;
    private javax.swing.JLabel labS_stock;
    private javax.swing.JLabel labStock;
    private javax.swing.JLabel labTimi;
    private javax.swing.JLabel labWra;
    private javax.swing.JPanel menouButton;
    private javax.swing.JTextField txtKrat_Trapezi;
    private javax.swing.JTextField txtKrat_atoma;
    private javax.swing.JTextField txtKrat_date;
    private javax.swing.JTextField txtKrat_hour;
    private javax.swing.JTextField txtKrat_id;
    private javax.swing.JTextField txtKrat_onoma;
    private javax.swing.JTextField txtMenu_Id;
    private javax.swing.JTextField txtMenu_Katigoria;
    private javax.swing.JTextField txtMenu_Name;
    private javax.swing.JTextField txtMenu_Perigrafh;
    private javax.swing.JTextField txtMenu_Stock;
    private javax.swing.JTextField txtMenu_Timi;
    private javax.swing.JTextField txtParagg_ID;
    private javax.swing.JTextField txtParagg_ParagId;
    private javax.swing.JTextField txtParagg_Trapezi;
    private javax.swing.JTextField txtParagg_piat;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPrice_ID;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtStock_ID;
    // End of variables declaration//GEN-END:variables
    private void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
}