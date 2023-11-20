package LaundryApplication;

import javax.swing.JOptionPane;
import Source.*;

public class CustomerMenu extends javax.swing.JFrame {
    private ListTransactions listTrans;
    
    public CustomerMenu() {
        initComponents();
    }
    
    public void setListTransactions(ListTransactions listTrans) {
        this.listTrans = listTrans;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        type_box = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_weight = new javax.swing.JTextField();
        backToMenu_btn = new javax.swing.JButton();
        goToValidation_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pesanan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Berat (kg)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 30));

        type_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis", "Cuci Kering", "Cuci + setrika" }));
        type_box.setToolTipText("");
        type_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_boxActionPerformed(evt);
            }
        });
        jPanel1.add(type_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 200, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Cuci");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 30));

        txt_weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_weightActionPerformed(evt);
            }
        });
        txt_weight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_weightKeyReleased(evt);
            }
        });
        jPanel1.add(txt_weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 200, 30));

        backToMenu_btn.setText("Batal");
        backToMenu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenu_btnActionPerformed(evt);
            }
        });
        jPanel1.add(backToMenu_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, 30));

        goToValidation_btn.setText("Lanjut");
        goToValidation_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToValidation_btnActionPerformed(evt);
            }
        });
        jPanel1.add(goToValidation_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 90, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 330, 300);

        setSize(new java.awt.Dimension(340, 301));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_weightActionPerformed

    }//GEN-LAST:event_txt_weightActionPerformed

    private void backToMenu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenu_btnActionPerformed
        dispose();
    }//GEN-LAST:event_backToMenu_btnActionPerformed

    private void goToValidation_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToValidation_btnActionPerformed
        String weight = txt_weight.getText();
        String serviceType = type_box.getSelectedItem().toString();
        
        if(!weight.isEmpty() && serviceType != "Pilih Jenis"){
            Validation valid = new Validation(serviceType, weight, this);
            valid.setListTransactions(listTrans);
            valid.setVisible(true);
            this.setVisible(false);
        }else
            JOptionPane.showMessageDialog(null, "Data belum lengkap!");
    }//GEN-LAST:event_goToValidation_btnActionPerformed

    private void type_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_boxActionPerformed

    }//GEN-LAST:event_type_boxActionPerformed

    private void txt_weightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_weightKeyReleased
        
    }//GEN-LAST:event_txt_weightKeyReleased

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
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMenu_btn;
    private javax.swing.JButton goToValidation_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_weight;
    private javax.swing.JComboBox<String> type_box;
    // End of variables declaration//GEN-END:variables
}
