package com.dbses.restaurant.view;



import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author georg
 */
public class Paraggelies extends javax.swing.JFrame {

    /**
     * Creates new form Paraggelies
     */
    public Paraggelies() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        menouButton = new javax.swing.JButton();
        ParaggeliesManagementButton = new javax.swing.JButton();
        KratiseisManagementButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        txtKpiata = new javax.swing.JTextField();
        txtSalates = new javax.swing.JTextField();
        txtOrektika = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAnaps = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPota = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mainButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(680, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ΣΥΝΟΛΙΚΕΣ ΚΡΑΤΗΣΕΙΣ:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 185, 38));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ΟΡΕΚΤΙΚΑ", "ΚΥΡΙΩΣ ΠΙΑΤΑ", "ΣΑΛΑΤΕΣ", "ΑΝΑΨΥΚΤΙΚΑ", "ΠΟΤΑ"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 580, 150));

        addButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButton.setText("ΠΡΟΣΘΕΣΗ");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 110, -1));

        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteButton.setText("ΔΙΑΓΡΑΦΗ");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 110, -1));

        txtKpiata.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtKpiata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKpiataActionPerformed(evt);
            }
        });
        getContentPane().add(txtKpiata, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 180, 30));

        txtSalates.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(txtSalates, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 180, 30));

        txtOrektika.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtOrektika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrektikaActionPerformed(evt);
            }
        });
        getContentPane().add(txtOrektika, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 180, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setText("ΟΡΕΚΤΙΚΑ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("ΚΥΡΙΩΣ ΠΙΑΤΑ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("ΣΑΛΑΤΕΣ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        txtAnaps.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(txtAnaps, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 180, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("ΑΝΑΨΥΚΤΙΚΑ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        txtPota.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(txtPota, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 180, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("ΠΟΤΑ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("ΠΑΡΑΓΓΕΛΙΕΣ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        mainButton.setText("ΑΡΧΙΚΗ");
        mainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainButtonActionPerformed(evt);
            }
        });
        getContentPane().add(mainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 104, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menouButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menouButtonActionPerformed
       // close();
        
        Menouu om = new Menouu();
        om.setVisible(true);

    }//GEN-LAST:event_menouButtonActionPerformed

    private void ParaggeliesManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaggeliesManagementButtonActionPerformed
      //  close();
        
        Paraggelies am = new Paraggelies();
        am.setVisible(true);

    }//GEN-LAST:event_ParaggeliesManagementButtonActionPerformed

    private void KratiseisManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KratiseisManagementButtonActionPerformed
      //  close();

        Kratiseis im = new Kratiseis();
        im.setVisible(true);
    }//GEN-LAST:event_KratiseisManagementButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:.

        if(txtOrektika.getText().equals("")||txtKpiata.getText().equals("")||txtSalates.getText().equals("")||
           txtAnaps.getText().equals("")||txtPota.getText().equals(""))        {
        
            JOptionPane.showMessageDialog(this, "Παρακαλώ βάλτε τα δεδομένα! ");
            }
        else{
            String data[] = {txtOrektika.getText(),txtKpiata.getText(),txtSalates.getText(),txtAnaps.getText(),txtPota.getText(),};
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(this, "Ολα πηγαν ΟΚ");
            txtOrektika.setText("");
            txtKpiata.setText("");
            txtSalates.setText("");
            txtAnaps.setText("");
            txtPota.setText("");
        }

        
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:

        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

        if(jTable1.getSelectedRowCount()==1){
            tblModel.removeRow(jTable1.getSelectedRow());
        }
        else{
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Ο πινακας ειναι κενός"); 
                }
            else{
                JOptionPane.showMessageDialog(this,"Παρακαλώ διαλέξτε κάτι για διαγραφή!");
            }
        }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void txtOrektikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrektikaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrektikaActionPerformed

    private void mainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainButtonActionPerformed
        // TODO add your handling code here:
        //close();
        
        Main ma = new Main();
        ma.setVisible(true);
    }//GEN-LAST:event_mainButtonActionPerformed

    private void txtKpiataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKpiataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKpiataActionPerformed

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
            java.util.logging.Logger.getLogger(Paraggelies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paraggelies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paraggelies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paraggelies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paraggelies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KratiseisManagementButton;
    private javax.swing.JButton ParaggeliesManagementButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton mainButton;
    private javax.swing.JButton menouButton;
    private javax.swing.JTextField txtAnaps;
    private javax.swing.JTextField txtKpiata;
    private javax.swing.JTextField txtOrektika;
    private javax.swing.JTextField txtPota;
    private javax.swing.JTextField txtSalates;
    // End of variables declaration//GEN-END:variables
     private void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
}
