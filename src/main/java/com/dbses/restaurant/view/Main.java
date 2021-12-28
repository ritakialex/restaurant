package com.dbses.restaurant.view;



import java.awt.Toolkit;
import java.awt.event.WindowEvent;

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

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
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
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

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
    private javax.swing.JButton EisodosButt;
    private javax.swing.JButton KratiseisManagementButton;
    private javax.swing.JButton ParaggeliesManagementButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mainButton;
    private javax.swing.JButton menouButton;
    // End of variables declaration//GEN-END:variables
         private void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
}
