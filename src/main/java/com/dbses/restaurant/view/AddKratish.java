package com.dbses.restaurant.view;


import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author georg
 */
public class AddKratish extends javax.swing.JFrame {

    /**
     * Creates new form AddKratish
     */
    public AddKratish() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtOnoma = new javax.swing.JTextField();
        txtEpitheto = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtAtoma = new javax.swing.JTextField();
        txtPro = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        menouButton = new javax.swing.JButton();
        ParaggeliesManagementButton = new javax.swing.JButton();
        KratiseisManagementButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mainButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(680, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("ΟΝΟΜΑ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("ΕΠΙΘΕΤΟ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setText("ΗΜΕΡΟΜΗΝΙΑ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("ΩΡΑ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 20, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("ΑΤΟΜΑ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("ΠΡΟ-ΠΑΡΑΓΓΕΛΙΑ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        txtOnoma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtOnoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOnomaActionPerformed(evt);
            }
        });
        getContentPane().add(txtOnoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 83, 180, 30));

        txtEpitheto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(txtEpitheto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 180, 30));

        txtTime.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });
        getContentPane().add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 101, 30));

        txtAtoma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(txtAtoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 100, 30));

        txtPro.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(txtPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 180, 30));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 50, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ΟΝΟΜΑ", "ΕΠΙΘΕΤΟ", "ΩΡΑ", "ΑΤΟΜΑ", "ΠΡΟΠΑΡΑΓΓΕΛΙΑ"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 610, 150));

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 180, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ΟΝΟΜΑ ΜΑΓΑΖΙΟΥ ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("ΠΡΟΣΘΗΚΗ ΚΡΑΤΗΣΗΣ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        mainButton.setText("ΑΡΧΙΚΗ");
        mainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainButtonActionPerformed(evt);
            }
        });
        getContentPane().add(mainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 90, -1));

        addButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButton.setText("ΠΡΟΣΘΕΣΗ");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 110, -1));

        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteButton.setText("ΔΙΑΓΡΑΦΗ");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    private void txtOnomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOnomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOnomaActionPerformed

    private void menouButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menouButtonActionPerformed
       // close();
        
        Menouu om = new Menouu();
        om.setVisible(true);    
    }//GEN-LAST:event_menouButtonActionPerformed

    private void ParaggeliesManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaggeliesManagementButtonActionPerformed
    //    close();
        
        Paraggelies am = new Paraggelies();
        am.setVisible(true);   
    }//GEN-LAST:event_ParaggeliesManagementButtonActionPerformed

    private void KratiseisManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KratiseisManagementButtonActionPerformed
     //   close();
        
        Kratiseis im = new Kratiseis();
        im.setVisible(true);      
    }//GEN-LAST:event_KratiseisManagementButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void mainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainButtonActionPerformed
        // TODO add your handling code here:
        //close();
        
        Main ma = new Main();
        ma.setVisible(true);

    }//GEN-LAST:event_mainButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:.

        if(txtOnoma.getText().equals("")||txtEpitheto.getText().equals("")||txtDate.getText().equals("")||
           txtTime.getText().equals("")||txtAtoma.getText().equals("")||txtPro.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Παρακαλώ βάλτε τα δεδομένα! ");
        }
        else{
            String data[] = {txtOnoma.getText(),txtEpitheto.getText(),txtDate.getText(),
                                txtTime.getText(),txtAtoma.getText(),txtPro.getText(),};
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(this, "Ολα πηγαν ΟΚ");
            txtOnoma.setText("");
            txtEpitheto.setText("");
            txtDate.setText("");
            txtTime.setText("");
            txtAtoma.setText("");
            txtPro.setText("");

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
            java.util.logging.Logger.getLogger(AddKratish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddKratish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddKratish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddKratish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddKratish().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton mainButton;
    private javax.swing.JButton menouButton;
    private javax.swing.JTextField txtAtoma;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEpitheto;
    private javax.swing.JTextField txtOnoma;
    private javax.swing.JTextField txtPro;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
    private void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
}
