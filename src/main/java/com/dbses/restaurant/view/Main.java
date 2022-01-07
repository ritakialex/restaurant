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
import java.util.Iterator;

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

        Stock = new javax.swing.JTabbedPane();
        Main = new javax.swing.JPanel();
        NameMagaziou = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        KratiseisManagement = new javax.swing.JPanel();
        labKrat = new javax.swing.JLabel();
        exitButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_ShowKrat = new javax.swing.JTable();
        NameMagaziou_Kratiseis = new javax.swing.JLabel();
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
        labAddKrat_ID = new javax.swing.JLabel();
        txtKrat_hour = new javax.swing.JTextField();
        ParaggeliesManagement = new javax.swing.JPanel();
        NameMagaziou_Paragg = new javax.swing.JLabel();
        exitButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Paragg = new javax.swing.JTable();
        addButtonPARAG = new javax.swing.JButton();
        deleteButtonPARAG = new javax.swing.JButton();
        txtParagg_Trapezi = new javax.swing.JTextField();
        txtParagg_Wra = new javax.swing.JTextField();
        labParagg_Wra = new javax.swing.JLabel();
        txtParagg_ParagId = new javax.swing.JTextField();
        labParagg_ParaggId = new javax.swing.JLabel();
        labParaggelies = new javax.swing.JLabel();
        labParagg_Trapezi = new javax.swing.JLabel();
        txtParagg_ID = new javax.swing.JTextField();
        labParagg_ID = new javax.swing.JLabel();
        txtParagg_Trapezi1 = new javax.swing.JTextField();
        menouButton = new javax.swing.JPanel();
        labName = new javax.swing.JLabel();
        labKatigoria = new javax.swing.JLabel();
        labMenu_ID = new javax.swing.JLabel();
        txtMenu_Id = new javax.swing.JTextField();
        txtMenu_Name = new javax.swing.JTextField();
        txtMenu_Katigoria = new javax.swing.JTextField();
        addButtonMenu = new javax.swing.JButton();
        deleteButtonMenu = new javax.swing.JButton();
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
        jScrollPane5 = new javax.swing.JScrollPane();
        Table_SP = new javax.swing.JTable();
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

        Stock.addTab("Αρχική", Main);

        labKrat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labKrat.setForeground(new java.awt.Color(153, 0, 0));
        labKrat.setText("ΚΡΑΤΗΣΕΙΣ");

        exitButton1.setText("Exit");
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });

        Table_ShowKrat.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                "ΟΝΟΜΑ/ΕΠΙΘΕΤΟ", "ΗΜΕΡΟΜΗΝΙΑ", "ΩΡΑ", "ΑΤΟΜΑ ", "ΤΡΑΠΕΖΙ"
            }
        ));
        jScrollPane2.setViewportView(Table_ShowKrat);

        NameMagaziou_Kratiseis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameMagaziou_Kratiseis.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");

        javax.swing.GroupLayout KratiseisManagementLayout = new javax.swing.GroupLayout(KratiseisManagement);
        KratiseisManagement.setLayout(KratiseisManagementLayout);
        KratiseisManagementLayout.setHorizontalGroup(
            KratiseisManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(KratiseisManagementLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(KratiseisManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(KratiseisManagementLayout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(KratiseisManagementLayout.createSequentialGroup()
                            .addGroup(KratiseisManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labKrat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NameMagaziou_Kratiseis))
                            .addGap(417, 417, 417)
                            .addComponent(exitButton1)
                            .addContainerGap())))
        );
        KratiseisManagementLayout.setVerticalGroup(
            KratiseisManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(KratiseisManagementLayout.createSequentialGroup()
                    .addGroup(KratiseisManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(KratiseisManagementLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(KratiseisManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(exitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NameMagaziou_Kratiseis)))
                        .addGroup(KratiseisManagementLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(labKrat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(153, 153, 153)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 140, Short.MAX_VALUE))
        );

        Stock.addTab("Κρατήσεις", KratiseisManagement);

        AddKratish.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_AddKrat.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                "ID", "ΗΜΕΡΟΜΗΝΙΑ", "ΟΝΟΜΑ", "ΑΤΟΜΑ", "ΩΡΑ", "ΤΡΑΠΕΖΙ"
            }
        ));
        jScrollPane4.setViewportView(Table_AddKrat);

        AddKratish.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 610, 150));

        txtKrat_atoma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AddKratish.add(txtKrat_atoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 100, 30));

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
        AddKratish.add(txtKrat_onoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 180, 30));

        labOnoma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labOnoma.setText("ΟΝΟΜΑ");
        AddKratish.add(labOnoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        labWra.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labWra.setText("ΩΡΑ");
        AddKratish.add(labWra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        labAtoma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labAtoma.setText("ΑΤΟΜΑ");
        AddKratish.add(labAtoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

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
        AddKratish.add(txtKrat_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 180, 30));

        labDate.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labDate.setText("ΗΜΕΡΟΜΗΝΙΑ");
        AddKratish.add(labDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        txtKrat_id.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtKrat_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKrat_idActionPerformed(evt);
            }
        });
        AddKratish.add(txtKrat_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 180, 30));

        labAddKrat_ID.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labAddKrat_ID.setText("Id");
        AddKratish.add(labAddKrat_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        txtKrat_hour.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtKrat_hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKrat_hourActionPerformed(evt);
            }
        });
        AddKratish.add(txtKrat_hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 101, 30));

        Stock.addTab("Πρόσθεση Κράτησης", AddKratish);

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
            new Object[][]{

            },
            new String[]{
                "ID", "ΤΡΑΠΕΖΙ", "ΩΡΑ", "ΠΑΡΑΓΓΕΛΙΑ"
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

        deleteButtonPARAG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteButtonPARAG.setText("ΔΙΑΓΡΑΦΗ");
        deleteButtonPARAG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonPARAGActionPerformed(evt);
            }
        });
        ParaggeliesManagement.add(deleteButtonPARAG, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 110, -1));

        txtParagg_Trapezi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtParagg_Trapezi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParagg_TrapeziActionPerformed(evt);
            }
        });
        ParaggeliesManagement.add(txtParagg_Trapezi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 180, 30));

        txtParagg_Wra.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ParaggeliesManagement.add(txtParagg_Wra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 180, 30));

        labParagg_Wra.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labParagg_Wra.setText("ΩΡΑ");
        ParaggeliesManagement.add(labParagg_Wra, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        txtParagg_ParagId.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ParaggeliesManagement.add(txtParagg_ParagId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 180, 30));

        labParagg_ParaggId.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labParagg_ParaggId.setText("ΠΑΡΑΓΓΕΛΊΑ");
        ParaggeliesManagement.add(labParagg_ParaggId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

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
        ParaggeliesManagement.add(txtParagg_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 180, 30));

        labParagg_ID.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labParagg_ID.setText("ID");
        ParaggeliesManagement.add(labParagg_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        txtParagg_Trapezi1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtParagg_Trapezi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParagg_Trapezi1ActionPerformed(evt);
            }
        });
        ParaggeliesManagement.add(txtParagg_Trapezi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 180, 30));

        Stock.addTab("Παραγγελίες", ParaggeliesManagement);

        labName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labName.setText("Όνομα Πιάτου");

        labKatigoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labKatigoria.setText("Κατηγορία");

        labMenu_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labMenu_ID.setText("Id");

        txtMenu_Id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMenu_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenu_IdActionPerformed(evt);
            }
        });

        txtMenu_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMenu_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenu_NameActionPerformed(evt);
            }
        });

        txtMenu_Katigoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMenu_Katigoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenu_KatigoriaActionPerformed(evt);
            }
        });

        addButtonMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButtonMenu.setText("ΠΡΟΣΘΕΣΗ");
        addButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonMenuActionPerformed(evt);
            }
        });

        deleteButtonMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteButtonMenu.setText("ΔΙΑΓΡΑΦΗ");
        deleteButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonMenuActionPerformed(evt);
            }
        });

        Table_Menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                "ID", "ΟΝΟΜΑ ΠΙΑΤΟΥ", "ΚΑΤΗΓΟΡΙΑ", "ΤΙΜΉ", "STOCK", "ΠΕΡΙΓΡΑΦΗ"
            }
        ));
        jScrollPane3.setViewportView(Table_Menu);

        exitButton4.setText("Exit");
        exitButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton4ActionPerformed(evt);
            }
        });

        NameMagaziou_Menu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameMagaziou_Menu.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");

        labMenou.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labMenou.setForeground(new java.awt.Color(153, 0, 0));
        labMenou.setText("ΜΕΝΟΥ");

        txtMenu_Timi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labTimi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labTimi.setText("Τιμή");

        txtMenu_Stock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMenu_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenu_StockActionPerformed(evt);
            }
        });

        labStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labStock.setText("Stock");

        txtMenu_Perigrafh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMenu_Perigrafh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenu_PerigrafhActionPerformed(evt);
            }
        });

        labPerigrafh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labPerigrafh.setText("Περιγραφή");

        javax.swing.GroupLayout menouButtonLayout = new javax.swing.GroupLayout(menouButton);
        menouButton.setLayout(menouButtonLayout);
        menouButtonLayout.setHorizontalGroup(
            menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menouButtonLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(menouButtonLayout.createSequentialGroup()
                            .addComponent(NameMagaziou_Menu)
                            .addGap(45, 45, 45))
                        .addGroup(menouButtonLayout.createSequentialGroup()
                            .addComponent(labMenou)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labMenu_ID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addComponent(txtMenu_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(189, 189, 189)
                    .addComponent(exitButton4))
                .addGroup(menouButtonLayout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(labName)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtMenu_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(menouButtonLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(menouButtonLayout.createSequentialGroup()
                    .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(menouButtonLayout.createSequentialGroup()
                            .addComponent(labPerigrafh)
                            .addGap(18, 18, 18)
                            .addComponent(txtMenu_Perigrafh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(menouButtonLayout.createSequentialGroup()
                            .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(menouButtonLayout.createSequentialGroup()
                                    .addGap(165, 165, 165)
                                    .addComponent(labKatigoria)
                                    .addGap(10, 10, 10))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menouButtonLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(labTimi)
                                    .addGap(18, 18, 18)))
                            .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMenu_Katigoria, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMenu_Timi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(menouButtonLayout.createSequentialGroup()
                            .addComponent(labStock)
                            .addGap(18, 18, 18)
                            .addComponent(txtMenu_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(50, 50, 50)
                    .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        menouButtonLayout.setVerticalGroup(
            menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menouButtonLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menouButtonLayout.createSequentialGroup()
                            .addComponent(NameMagaziou_Menu)
                            .addGap(8, 8, 8)
                            .addComponent(labMenou))
                        .addGroup(menouButtonLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMenu_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labMenu_ID)))
                        .addComponent(exitButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5)
                    .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMenu_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labName))
                    .addGap(8, 8, 8)
                    .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menouButtonLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(addButtonMenu)
                            .addGap(15, 15, 15)
                            .addComponent(deleteButtonMenu))
                        .addGroup(menouButtonLayout.createSequentialGroup()
                            .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMenu_Katigoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labKatigoria))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMenu_Timi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labTimi))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMenu_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labStock))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMenu_Perigrafh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labPerigrafh))
                    .addGap(24, 24, 24)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Stock.addTab("Μενού", menouButton);

        StockPrice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameMagaziou_SP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameMagaziou_SP.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");
        StockPrice.add(NameMagaziou_SP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        labSP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labSP.setForeground(new java.awt.Color(153, 0, 0));
        labSP.setText("STOCK & PRICE");
        StockPrice.add(labSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 41, -1, -1));

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

        Table_SP.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                "ID", "STOCK", "PRICE"
            }
        ));
        jScrollPane5.setViewportView(Table_SP);

        StockPrice.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 271, 580, 150));

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

        Stock.addTab("Stock", StockPrice);

        getContentPane().add(Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButton1ActionPerformed

    private void exitButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButton3ActionPerformed

    //PARAGGELIES
    private void getOrder() {  //ΕΔΩ TOTAL PRICE
        DefaultTableModel tblModel = (DefaultTableModel) Table_Paragg.getModel();
        try {
            ArrayList<Order> getOrderWithItems = Order.getOrderWithItems();
            for (Order Order : getOrderWithItems) {
                String[] data = {
                    String.valueOf(Order.getOrderId()),
                    String.valueOf(Order.getBookingId()),
                    String.valueOf(Order.getTableId()),
                    String.valueOf(Order.getTime()),

                };
                tblModel.addRow(data);
            }
            JOptionPane.showMessageDialog(this, "Ολα πηγαν ΟΚ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ολα Λαθος Order");
        }
    }   //EXW KAI LISTA PIATAS & TOTAL PRICE EDW LGK

    //PROS8ESH PARAGGELIAS
    private void addButtonPARAGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonPARAGActionPerformed

        if (txtParagg_ID.getText().equals("") || txtKrat_id.getText().equals("") ||
            txtParagg_Trapezi.getText().equals("") || txtParagg_Wra.getText().equals("") ||
            txtParagg_ParagId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Παρακαλώ βάλτε τα δεδομένα! ");
        } else if (txtKrat_id.getText().equals("")) {
//            Order.createOrder(Integer.parseInt(txtParagg_Trapezi.getText()),
//                Integer.parseInt(txtParagg_ParagId.getText()),
//                Integer.parseInt(txtKrat_id.getText()));
        } else {
//            Order.createOrderWithBooking(Integer.parseInt(txtParagg_Trapezi.getText()),
//                Integer.parseInt(txtParagg_ParagId.getText()));

            /*  String data[] = {txtParagg_ID.getText(),txtParagg_Krat.getText(),txtParagg_Trapezi.getText(),
                               txtParagg_Wra.getText(),txtParagg_Ttimi.getText(),};
                DefaultTableModel tblModel = (DefaultTableModel)Table_Paragg.getModel();
                tblModel.addRow(data);    */

            JOptionPane.showMessageDialog(this, "Ολα πηγαν ΟΚ");
            txtParagg_ID.setText("");
            txtKrat_id.setText("");
            txtParagg_Trapezi.setText("");
            txtParagg_Wra.setText("");
            txtParagg_ParagId.setText("");

        }
    }//GEN-LAST:event_addButtonPARAGActionPerformed

    //DIAGARFH PARAGGELIAS
    private void deleteButtonPARAGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonPARAGActionPerformed

        DefaultTableModel tblModel = (DefaultTableModel) Table_Paragg.getModel();

        if (Table_Paragg.getSelectedRowCount() == 1) {
            tblModel.removeRow(Table_Paragg.getSelectedRow());
        } else {
            if (Table_Paragg.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Ο πινακας ειναι κενός");
            } else {
                JOptionPane.showMessageDialog(this, "Παρακαλώ διαλέξτε κάτι για διαγραφή!");
            }
        }
    }//GEN-LAST:event_deleteButtonPARAGActionPerformed

    private void txtParagg_TrapeziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParagg_TrapeziActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParagg_TrapeziActionPerformed

    private void txtMenu_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenu_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenu_IdActionPerformed

    //MENOΥ +-
    private void getMenuItem() {
        DefaultTableModel tblModel = (DefaultTableModel) Table_Menu.getModel();
        try {
            ArrayList<MenuItem> MenuItems = MenuItem.getMenuItems();
            for (MenuItem MenuItem : MenuItems) {
                String[] data = {String.valueOf(MenuItem.getMenuItemId()),
                    MenuItem.getMenuItemName(),
                    MenuItem.getCategory(),
                    String.valueOf(MenuItem.getPrice()),
                    String.valueOf(MenuItem.getStockNumber()),
                    MenuItem.getMenuItemDescription()};
                tblModel.addRow(data);
            }
            JOptionPane.showMessageDialog(this, "Ολα πηγαν ΟΚ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ολα Λαθος Menu Item" + e);
        }
    }

    //PROS8ESH MENU
    private void addButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonMenuActionPerformed

        if (txtMenu_Id.getText().equals("") || txtMenu_Name.getText().equals("") ||
            txtMenu_Katigoria.getText().equals("") || txtMenu_Timi.getText().equals("") ||
            txtMenu_Stock.getText().equals("") || txtMenu_Perigrafh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Παρακαλώ βάλτε τα δεδομένα!");
        } else {
            MenuItem.createNewMenuItem(txtMenu_Name.getText(),
                txtMenu_Perigrafh.getText(),
                txtMenu_Katigoria.getText(),
                Float.parseFloat(txtMenu_Timi.getText()),
                Integer.parseInt(txtMenu_Stock.getText()));
//            MenuItem.updateStock(txtMenu_Id, txtMenu_Stock); //ΛΟΓΙΚΑ ΑΛΛΑΓΗ ΓΙΑΤΙ ΕΧΩ ΚΑΙ ΑΛΛΟΥ ΤΟ ΣΤΟΚ. (ΧΩΡΙΑ)
//            MenuItem.updatePrice(txtMenu_Id, txtMenu_Timi);

            // String data[] = {txtCode.getText(),txtKatigoria.getText(),txtName.getText()};
            // DefaultTableModel tblModel = (DefaultTableModel)jTable4.getModel();
            // tblModel.addRow(data);

            JOptionPane.showMessageDialog(this, "Ολα πήγαν ΟΚ! ");
            txtMenu_Id.setText("");
            txtMenu_Name.setText("");
            txtMenu_Katigoria.setText("");
            txtMenu_Timi.setText("");
            txtMenu_Stock.setText("");
            txtMenu_Perigrafh.setText("");
        }

    }//GEN-LAST:event_addButtonMenuActionPerformed

    //DIAGRAFH MENU
    private void deleteButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonMenuActionPerformed

        DefaultTableModel tblModel = (DefaultTableModel) Table_Menu.getModel();
        if (Table_Menu.getSelectedRowCount() == 1) {
            tblModel.removeRow(Table_Menu.getSelectedRow());
        } else {
            if (Table_Menu.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Ο Πίνακας είναι κενός");
            } else {
                JOptionPane.showMessageDialog(this, "Παρακαλώ διαλέξτε κάτι για διαγραφή!");
            }
        }
    }//GEN-LAST:event_deleteButtonMenuActionPerformed

    private void exitButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButton4ActionPerformed

    private void txtKrat_TrapeziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKrat_TrapeziActionPerformed
    }//GEN-LAST:event_txtKrat_TrapeziActionPerformed

    private void txtKrat_onomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKrat_onomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKrat_onomaActionPerformed

    //ΚΡΑΤΉΣΕΙΣ 
    private void getBooking() {

        DefaultTableModel tblModel = (DefaultTableModel) Table_AddKrat.getModel();
        try {
            ArrayList<Booking> bookings = Booking.getBookings();
            for (Booking booking : bookings) {
                String[] data = {String.valueOf(booking.getId()),
                    booking.getCustomerName(),
                    new SimpleDateFormat("dd-mm-yyyy").format(booking.getBookingDate()),
                    String.valueOf(booking.getHour()),
                    String.valueOf(booking.getCustomerCount()),
                    String.valueOf(booking.getTableId())};
                tblModel.addRow(data);
            }
            JOptionPane.showMessageDialog(this, "Ολα πηγαν ΟΚ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ολα πηγαν Λαθος Bookings");
        }
    }

    //PROS8ESH KRATHSH
    private void deleteButtonKRATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonKRATActionPerformed

        DefaultTableModel tblModel = (DefaultTableModel) Table_AddKrat.getModel();
        if (Table_AddKrat.getSelectedRowCount() == 1) {
            try {
                Booking.deleteBooking(Integer.parseInt(txtKrat_id.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ολα Λαθος");
            }
        } else {
            if (Table_AddKrat.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Ο πινακας ειναι κενός");
            } else {
                JOptionPane.showMessageDialog(this, "Παρακαλώ διαλέξτε κάτι για διαγραφή!");
            }
        }
    }//GEN-LAST:event_deleteButtonKRATActionPerformed

    //DIAGRAFH KRATHSH
    private void addButtonKRATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonKRATActionPerformed

        if (txtKrat_id.getText().equals("") || txtKrat_date.getText().equals("") || txtKrat_onoma.getText().equals("") ||
            txtKrat_atoma.getText().equals("") || txtKrat_Trapezi.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Παρακαλώ βάλτε τα δεδομένα! ");
        } else {
            // String data[] = {txtOnoma.getText(),txtEpitheto.getText(),txtDate.getText(),
            // txtTime.getText(),txtAtoma.getText(),txtPro.getText(),};
            // DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
            // tblModel.addRow(data);
            try {
                Booking.createNewBooking(Integer.parseInt(txtKrat_Trapezi.getText()),
                    txtKrat_date.getText(),
                    txtKrat_onoma.getText(),
                    Integer.parseInt(txtKrat_atoma.getText()),
                    Integer.parseInt(txtKrat_hour.getText()));

                JOptionPane.showMessageDialog(this, "Ολα πηγαν ΟΚ");
                txtKrat_id.setText("");
                txtKrat_onoma.setText("");
                txtKrat_date.setText("");
                txtKrat_atoma.setText("");
                txtKrat_Trapezi.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ολα πηγαν Λαθος");
            }
        }
    }//GEN-LAST:event_addButtonKRATActionPerformed

    private void exitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButton2ActionPerformed

    private void txtMenu_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenu_StockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenu_StockActionPerformed

    private void txtMenu_KatigoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenu_KatigoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenu_KatigoriaActionPerformed

    private void txtMenu_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenu_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenu_NameActionPerformed

    private void txtKrat_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKrat_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKrat_idActionPerformed

    private void txtMenu_PerigrafhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenu_PerigrafhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenu_PerigrafhActionPerformed

    private void txtParagg_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParagg_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParagg_IDActionPerformed

    private void txtKrat_hourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKrat_hourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKrat_hourActionPerformed

    private void txtParagg_Trapezi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParagg_Trapezi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParagg_Trapezi1ActionPerformed

    private void exitButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButton5ActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void txtStock_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStock_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStock_IDActionPerformed

    //PROS8ESH STOCK

    private void addButtonStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonStockActionPerformed

        if (txtStock_ID.getText().equals("") || txtStock.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Παρακαλώ βάλτε τα δεδομένα!");
        } else {
            try {
                MenuItem.updateStock(Integer.parseInt(txtStock_ID.getText()),
                    Integer.parseInt(txtStock.getText()));
                JOptionPane.showMessageDialog(this, "Ολα πήγαν ΟΚ! ");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ολα πηγαν Λαθος");
            }

            //MenuItem.updatePrice(txtStock_ID,txtS_price);

            // String data[] = {txtCode.getText(),txtKatigoria.getText(),txtName.getText()};
            // DefaultTableModel tblModel = (DefaultTableModel)jTable4.getModel();
            // tblModel.addRow(data);

        }

    }//GEN-LAST:event_addButtonStockActionPerformed

    //PROS8ESH STOCK

    private void addButtonPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonPriceActionPerformed

        if (txtPrice_ID.getText().equals("") || txtPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Παρακαλώ βάλτε τα δεδομένα!");
        } else {
            try {
                MenuItem.updatePrice(Integer.parseInt(txtStock_ID.getText()),
                    Float.parseFloat(txtPrice.getText()));
                JOptionPane.showMessageDialog(this, "Ολα πήγαν ΟΚ! ");
                txtPrice_ID.setText("");
                txtPrice.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ολα πηγαν Λαθος");
            }

            // String data[] = {txtCode.getText(),txtKatigoria.getText(),txtName.getText()};
            // DefaultTableModel tblModel = (DefaultTableModel)jTable4.getModel();
            // tblModel.addRow(data);

        }
    }//GEN-LAST:event_addButtonPriceActionPerformed

    private void txtPrice_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice_IDActionPerformed

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
    private javax.swing.JPanel KratiseisManagement;
    private javax.swing.JPanel Main;
    private javax.swing.JLabel NameMagaziou;
    private javax.swing.JLabel NameMagaziou_AddKrat;
    private javax.swing.JLabel NameMagaziou_Kratiseis;
    private javax.swing.JLabel NameMagaziou_Menu;
    private javax.swing.JLabel NameMagaziou_Paragg;
    private javax.swing.JLabel NameMagaziou_SP;
    private javax.swing.JPanel ParaggeliesManagement;
    private javax.swing.JTabbedPane Stock;
    private javax.swing.JPanel StockPrice;
    private javax.swing.JTable Table_AddKrat;
    private javax.swing.JTable Table_Menu;
    private javax.swing.JTable Table_Paragg;
    private javax.swing.JTable Table_SP;
    private javax.swing.JTable Table_ShowKrat;
    private javax.swing.JButton addButtonKRAT;
    private javax.swing.JButton addButtonMenu;
    private javax.swing.JButton addButtonPARAG;
    private javax.swing.JButton addButtonPrice;
    private javax.swing.JButton addButtonStock;
    private javax.swing.JButton deleteButtonKRAT;
    private javax.swing.JButton deleteButtonMenu;
    private javax.swing.JButton deleteButtonPARAG;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButton1;
    private javax.swing.JButton exitButton2;
    private javax.swing.JButton exitButton3;
    private javax.swing.JButton exitButton4;
    private javax.swing.JButton exitButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labAddKrat;
    private javax.swing.JLabel labAddKratTrapezi;
    private javax.swing.JLabel labAddKrat_ID;
    private javax.swing.JLabel labAtoma;
    private javax.swing.JLabel labDate;
    private javax.swing.JLabel labKatigoria;
    private javax.swing.JLabel labKrat;
    private javax.swing.JLabel labMenou;
    private javax.swing.JLabel labMenu_ID;
    private javax.swing.JLabel labName;
    private javax.swing.JLabel labOnoma;
    private javax.swing.JLabel labParagg_ID;
    private javax.swing.JLabel labParagg_ParaggId;
    private javax.swing.JLabel labParagg_Trapezi;
    private javax.swing.JLabel labParagg_Wra;
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
    private javax.swing.JTextField txtParagg_Trapezi1;
    private javax.swing.JTextField txtParagg_Wra;
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