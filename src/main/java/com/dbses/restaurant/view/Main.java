package com.dbses.restaurant.view;


<<<<<<< HEAD
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
=======

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
>>>>>>> 5ebbb6b02e71c5772a64b296c8f985f2444bebf7

/**
 *
 * @author georg
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
        All = new javax.swing.JTabbedPane();
        Main = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        KratiseisManagement = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        exitButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        AddKratish = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtPro = new javax.swing.JTextField();
        txtAtoma = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtOnoma = new javax.swing.JTextField();
        txtEpitheto = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        deleteButtonKRAT = new javax.swing.JButton();
        addButtonKRAT = new javax.swing.JButton();
        exitButton4 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        ParaggeliesManagement = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        exitButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        addButtonPARAG = new javax.swing.JButton();
        deleteButtonPARAG = new javax.swing.JButton();
        txtKpiata = new javax.swing.JTextField();
        txtSalates = new javax.swing.JTextField();
        txtOrektika = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAnaps = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPota = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTrapezi = new javax.swing.JTextField();
        menouButton = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtKatigoria = new javax.swing.JTextField();
        addButtonMenu = new javax.swing.JButton();
        deleteButtonMenu = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        exitButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurant");
        setMinimumSize(new java.awt.Dimension(680, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");
        Main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
=======
        jLabel3 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        menouButton = new javax.swing.JButton();
        ParaggeliesManagementButton = new javax.swing.JButton();
        KratiseisManagementButton = new javax.swing.JButton();
        mainButton = new javax.swing.JButton();
        EisodosButt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(680, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 12, -1, -1));
>>>>>>> 5ebbb6b02e71c5772a64b296c8f985f2444bebf7

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        Main.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, 30));

        All.addTab("Αρχική", Main);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("ΚΡΑΤΗΣΕΙΣ");

        exitButton1.setText("Exit");
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ΟΝΟΜΑ/ΕΠΙΘΕΤΟ", "ΗΜΕΡΟΜΗΝΙΑ", "ΩΡΑ", "ΑΤΟΜΑ ", "ΤΡΑΠΕΖΙ", "ΠΡΟ-ΠΑΡΑΓΓΕΛΙΑ"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");

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
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
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
                            .addComponent(jLabel1)))
                    .addGroup(KratiseisManagementLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(153, 153, 153)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 140, Short.MAX_VALUE))
        );

        All.addTab("Κρατήσεις", KratiseisManagement);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ΟΝΟΜΑ", "ΕΠΙΘΕΤΟ", "ΩΡΑ", "ΑΤΟΜΑ", "ΠΡΟΠΑΡΑΓΓΕΛΙΑ"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        txtPro.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtAtoma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtTime.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtOnoma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtOnoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOnomaActionPerformed(evt);
            }
        });

        txtEpitheto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel18.setText("ΟΝΟΜΑ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel19.setText("ΕΠΙΘΕΤΟ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel20.setText("ΗΜΕΡΟΜΗΝΙΑ");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel21.setText("ΩΡΑ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel22.setText("ΑΤΟΜΑ");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel23.setText("ΠΡΟ-ΠΑΡΑΓΓΕΛΙΑ");

        deleteButtonKRAT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteButtonKRAT.setText("ΔΙΑΓΡΑΦΗ");
        deleteButtonKRAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonKRATActionPerformed(evt);
            }
        });

        addButtonKRAT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButtonKRAT.setText("ΠΡΟΣΘΕΣΗ");
        addButtonKRAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonKRATActionPerformed(evt);
            }
        });

        exitButton4.setText("Exit");
        exitButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton4ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 0, 0));
        jLabel24.setText("ΠΡΟΣΘΗΚΗ ΚΡΑΤΗΣΗΣ");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");

        javax.swing.GroupLayout AddKratishLayout = new javax.swing.GroupLayout(AddKratish);
        AddKratish.setLayout(AddKratishLayout);
        AddKratishLayout.setHorizontalGroup(
            AddKratishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddKratishLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(AddKratishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24))
                .addGap(44, 44, 44)
                .addComponent(jLabel18)
                .addGap(12, 12, 12)
                .addComponent(txtOnoma, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(exitButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(AddKratishLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel19)
                .addGap(5, 5, 5)
                .addComponent(txtEpitheto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(AddKratishLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel20)
                .addGap(12, 12, 12)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(AddKratishLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel21)
                .addGap(20, 20, 20)
                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(AddKratishLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel22)
                .addGap(14, 14, 14)
                .addComponent(txtAtoma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(addButtonKRAT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(AddKratishLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel23)
                .addGap(14, 14, 14)
                .addComponent(txtPro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(deleteButtonKRAT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(AddKratishLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AddKratishLayout.setVerticalGroup(
            AddKratishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddKratishLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(AddKratishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddKratishLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel24))
                    .addGroup(AddKratishLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel18))
                    .addGroup(AddKratishLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtOnoma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(exitButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AddKratishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddKratishLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel19))
                    .addComponent(txtEpitheto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AddKratishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddKratishLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel20))
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AddKratishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddKratishLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel21))
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AddKratishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddKratishLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel22))
                    .addComponent(txtAtoma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButtonKRAT))
                .addGroup(AddKratishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddKratishLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel23))
                    .addComponent(txtPro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButtonKRAT))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        All.addTab("Πρόσθεση Κράτησης", AddKratish);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ΣΥΝΟΛΙΚΕΣ ΚΡΑΤΗΣΕΙΣ:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");

        exitButton2.setText("Exit");
        exitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton2ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ΟΡΕΚΤΙΚΑ", "ΚΥΡΙΩΣ ΠΙΑΤΑ", "ΣΑΛΑΤΕΣ", "ΑΝΑΨΥΚΤΙΚΑ", "ΠΟΤΑ", "ΤΡΑΠΕΖΙ"
            }
        ));
        jScrollPane1.setViewportView(jTable3);

        addButtonPARAG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButtonPARAG.setText("ΠΡΟΣΘΕΣΗ");
        addButtonPARAG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonPARAGActionPerformed(evt);
            }
        });

        deleteButtonPARAG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteButtonPARAG.setText("ΔΙΑΓΡΑΦΗ");
        deleteButtonPARAG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonPARAGActionPerformed(evt);
            }
        });

        txtKpiata.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtKpiata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKpiataActionPerformed(evt);
            }
        });

        txtSalates.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txtOrektika.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtOrektika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrektikaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("ΟΡΕΚΤΙΚΑ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("ΚΥΡΙΩΣ ΠΙΑΤΑ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("ΣΑΛΑΤΕΣ");

        txtAnaps.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("ΑΝΑΨΥΚΤΙΚΑ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("ΠΑΡΑΓΓΕΛΙΕΣ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setText("ΠΟΤΑ");

        txtPota.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setText("ΤΡΑΠΕΖΙ");

        txtTrapezi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        javax.swing.GroupLayout ParaggeliesManagementLayout = new javax.swing.GroupLayout(ParaggeliesManagement);
        ParaggeliesManagement.setLayout(ParaggeliesManagementLayout);
        ParaggeliesManagementLayout.setHorizontalGroup(
            ParaggeliesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                .addGroup(ParaggeliesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addGap(414, 414, 414)
                        .addComponent(exitButton2))
                    .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel6)
                        .addGap(21, 21, 21)
                        .addComponent(txtOrektika, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(ParaggeliesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8))
                            .addComponent(jLabel9))
                        .addGap(21, 21, 21)
                        .addGroup(ParaggeliesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKpiata, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalates, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnaps, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(ParaggeliesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                                .addGroup(ParaggeliesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(32, 32, 32)
                                        .addComponent(txtPota, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTrapezi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(ParaggeliesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addButtonPARAG, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteButtonPARAG, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );
        ParaggeliesManagementLayout.setVerticalGroup(
            ParaggeliesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ParaggeliesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(exitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ParaggeliesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(ParaggeliesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtOrektika, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(ParaggeliesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel9))
                    .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                        .addComponent(txtKpiata, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtSalates, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtAnaps, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(ParaggeliesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                        .addGroup(ParaggeliesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtPota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ParaggeliesManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtTrapezi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ParaggeliesManagementLayout.createSequentialGroup()
                        .addComponent(addButtonPARAG)
                        .addGap(5, 5, 5)
                        .addComponent(deleteButtonPARAG)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        All.addTab("Παραγγελίες", ParaggeliesManagement);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Όνομα Πιάτου");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Κατηγορία");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Code");

        txtCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtKatigoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ΚΑΤΗΓΟΡΙΑ", "ΟΝΟΜΑ ΠΙΑΤΟΥ"
            }
        ));
        jScrollPane3.setViewportView(jTable4);

        exitButton3.setText("Exit");
        exitButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton3ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("ΜΕΝΟΥ");

        javax.swing.GroupLayout menouButtonLayout = new javax.swing.GroupLayout(menouButton);
        menouButton.setLayout(menouButtonLayout);
        menouButtonLayout.setHorizontalGroup(
            menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menouButtonLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(414, 414, 414)
                .addComponent(exitButton3))
            .addGroup(menouButtonLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menouButtonLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel14)
                .addGap(15, 15, 15)
                .addComponent(txtKatigoria, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(addButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menouButtonLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel13)
                .addGap(11, 11, 11)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(deleteButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menouButtonLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menouButtonLayout.setVerticalGroup(
            menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menouButtonLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menouButtonLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel17))
                    .addComponent(exitButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menouButtonLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15))
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menouButtonLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14))
                    .addComponent(txtKatigoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menouButtonLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(addButtonMenu)))
                .addGap(5, 5, 5)
                .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menouButtonLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(menouButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(deleteButtonMenu))))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        All.addTab("Μενού", menouButton);

        getContentPane().add(All, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 520));

        pack();
        setLocationRelativeTo(null);
=======
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 11, -1, 30));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        menouButton.setText("ΜΕΝΟΥ");
        menouButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menouButtonActionPerformed(evt);
            }
        });

        ParaggeliesManagementButton.setText("ΠΑΡΑΓΓΕΛΙΕΣ");
        ParaggeliesManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaggeliesManagementButtonActionPerformed(evt);
            }
        });

        KratiseisManagementButton.setText("ΚΡΑΤΗΣΕΙΣ");
        KratiseisManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KratiseisManagementButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ParaggeliesManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(KratiseisManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menouButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(KratiseisManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ParaggeliesManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menouButton, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 37, -1, -1));

        mainButton.setText("ΑΡΧΙΚΗ");
        mainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainButtonActionPerformed(evt);
            }
        });
        getContentPane().add(mainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 8, 104, -1));

        EisodosButt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EisodosButt.setText("ΕΙΣΟΔΟΣ");
        EisodosButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EisodosButtActionPerformed(evt);
            }
        });
        getContentPane().add(EisodosButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 140, 40));

        pack();
>>>>>>> 5ebbb6b02e71c5772a64b296c8f985f2444bebf7
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

<<<<<<< HEAD
    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButton1ActionPerformed

    private void exitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButton2ActionPerformed

    private void addButtonPARAGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonPARAGActionPerformed

        if(txtOrektika.getText().equals("")||txtKpiata.getText().equals("")||txtSalates.getText().equals("")||
           txtAnaps.getText().equals("")||txtPota.getText().equals("")||txtTrapezi.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Παρακαλώ βάλτε τα δεδομένα! ");
        }
        else{
            String data[] = {txtOrektika.getText(),txtKpiata.getText(),txtSalates.getText(),
                                txtAnaps.getText(),txtPota.getText(),txtTrapezi.getText(),};
            DefaultTableModel tblModel = (DefaultTableModel)jTable3.getModel();
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(this, "Ολα πηγαν ΟΚ");
            txtOrektika.setText("");
            txtKpiata.setText("");
            txtSalates.setText("");
            txtAnaps.setText("");
            txtPota.setText("");     
            txtTrapezi.setText("");
        }

    }//GEN-LAST:event_addButtonPARAGActionPerformed

    private void deleteButtonPARAGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonPARAGActionPerformed
    
    DefaultTableModel tblModel = (DefaultTableModel) jTable3.getModel();

        if(jTable3.getSelectedRowCount()==1){
            tblModel.removeRow(jTable3.getSelectedRow());
        }
        else{
            if(jTable3.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Ο πινακας ειναι κενός");
            }
            else{
                JOptionPane.showMessageDialog(this,"Παρακαλώ διαλέξτε κάτι για διαγραφή!");
            }
        }
        
    }//GEN-LAST:event_deleteButtonPARAGActionPerformed

    private void txtKpiataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKpiataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKpiataActionPerformed

    private void txtOrektikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrektikaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrektikaActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void addButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonMenuActionPerformed

        if(txtCode.getText().equals("")||txtKatigoria.getText().equals("")||txtName.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Παρακαλώ βάλτε τα δεδομένα!");
        }
        else{
            String data[] = {txtCode.getText(),txtKatigoria.getText(),txtName.getText()};
            DefaultTableModel tblModel = (DefaultTableModel)jTable4.getModel();
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(this, "Ολα πήγαν ΟΚ! ");
            txtCode.setText("");
            txtKatigoria.setText("");
            txtName.setText("");
        }

    }//GEN-LAST:event_addButtonMenuActionPerformed

    private void deleteButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonMenuActionPerformed
     
        DefaultTableModel tblModel = (DefaultTableModel) jTable4.getModel();

        if(jTable4.getSelectedRowCount()==1){
            tblModel.removeRow(jTable4.getSelectedRow());
        }
        else{
            if(jTable4.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Ο Πίνακας είναι κενός");
            }
            else{
                JOptionPane.showMessageDialog(this,"Παρακαλώ διαλέξτε κάτι για διαγραφή!");
            }
        }

    }//GEN-LAST:event_deleteButtonMenuActionPerformed

    private void exitButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButton3ActionPerformed

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    private void txtOnomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOnomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOnomaActionPerformed

    private void deleteButtonKRATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonKRATActionPerformed
    
        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();

        if(jTable2.getSelectedRowCount()==1){
            tblModel.removeRow(jTable2.getSelectedRow());
        }
        else{
            if(jTable2.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Ο πινακας ειναι κενός");
            }
            else{
                JOptionPane.showMessageDialog(this,"Παρακαλώ διαλέξτε κάτι για διαγραφή!");
            }
        }
    }//GEN-LAST:event_deleteButtonKRATActionPerformed

    private void addButtonKRATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonKRATActionPerformed

        if(txtOnoma.getText().equals("")||txtEpitheto.getText().equals("")||txtDate.getText().equals("")||
           txtTime.getText().equals("")||txtAtoma.getText().equals("")||txtPro.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Παρακαλώ βάλτε τα δεδομένα! ");
        }
        else{
            String data[] = {txtOnoma.getText(),txtEpitheto.getText(),txtDate.getText(),
            txtTime.getText(),txtAtoma.getText(),txtPro.getText(),};
            DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(this, "Ολα πηγαν ΟΚ");
            txtOnoma.setText("");
            txtEpitheto.setText("");
            txtDate.setText("");
            txtTime.setText("");
            txtAtoma.setText("");
            txtPro.setText("");

        }
    }//GEN-LAST:event_addButtonKRATActionPerformed

    private void exitButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButton4ActionPerformed
=======
    private void menouButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menouButtonActionPerformed
        // close();

        Menouu om = new Menouu();
        om.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_menouButtonActionPerformed

    private void ParaggeliesManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaggeliesManagementButtonActionPerformed
        //  close();

        Paraggelies am = new Paraggelies();
        am.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_ParaggeliesManagementButtonActionPerformed

    private void KratiseisManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KratiseisManagementButtonActionPerformed
        //  close();

        Kratiseis im = new Kratiseis();
        im.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_KratiseisManagementButtonActionPerformed

    private void mainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainButtonActionPerformed
        // TODO add your handling code here:
        //close();
        
        Main ma = new Main();
        ma.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_mainButtonActionPerformed

    private void EisodosButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EisodosButtActionPerformed
        // TODO add your handling code here:
        
        log lo = new log();
        lo.setVisible(true);
        
        
    }//GEN-LAST:event_EisodosButtActionPerformed
>>>>>>> 5ebbb6b02e71c5772a64b296c8f985f2444bebf7

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
<<<<<<< HEAD
    private javax.swing.JPanel AddKratish;
    private javax.swing.JTabbedPane All;
    private javax.swing.JPanel KratiseisManagement;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel ParaggeliesManagement;
    private javax.swing.JButton addButtonKRAT;
    private javax.swing.JButton addButtonMenu;
    private javax.swing.JButton addButtonPARAG;
    private javax.swing.JButton deleteButtonKRAT;
    private javax.swing.JButton deleteButtonMenu;
    private javax.swing.JButton deleteButtonPARAG;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButton1;
    private javax.swing.JButton exitButton2;
    private javax.swing.JButton exitButton3;
    private javax.swing.JButton exitButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JPanel menouButton;
    private javax.swing.JTextField txtAnaps;
    private javax.swing.JTextField txtAtoma;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEpitheto;
    private javax.swing.JTextField txtKatigoria;
    private javax.swing.JTextField txtKpiata;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOnoma;
    private javax.swing.JTextField txtOrektika;
    private javax.swing.JTextField txtPota;
    private javax.swing.JTextField txtPro;
    private javax.swing.JTextField txtSalates;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTrapezi;
=======
    private javax.swing.JButton EisodosButt;
    private javax.swing.JButton KratiseisManagementButton;
    private javax.swing.JButton ParaggeliesManagementButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mainButton;
    private javax.swing.JButton menouButton;
>>>>>>> 5ebbb6b02e71c5772a64b296c8f985f2444bebf7
    // End of variables declaration//GEN-END:variables
         private void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
}
