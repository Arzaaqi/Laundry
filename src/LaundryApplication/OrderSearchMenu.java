package LaundryApplication;

import Source.ListTransactions;
import javax.swing.JOptionPane;

public class OrderSearchMenu extends javax.swing.JFrame {
    private ListTransactions listTrans;

    public OrderSearchMenu(ListTransactions listTrans) {
        initComponents();
        
        this.listTrans = listTrans;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_phoneNumber = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        btn_backToMainMenu = new javax.swing.JButton();
        btn_goToOrderPickupMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pencarian Pesanan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("No.Telepon :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Nama         :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 30));

        txt_phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneNumberActionPerformed(evt);
            }
        });
        txt_phoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_phoneNumberKeyReleased(evt);
            }
        });
        jPanel1.add(txt_phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 140, 30));

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nameKeyReleased(evt);
            }
        });
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 140, 30));

        btn_backToMainMenu.setText("Kembali");
        btn_backToMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backToMainMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_backToMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, 30));

        btn_goToOrderPickupMenu.setText("Cari");
        btn_goToOrderPickupMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goToOrderPickupMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_goToOrderPickupMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 90, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 280, 270);

        setSize(new java.awt.Dimension(293, 275));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneNumberActionPerformed

    private void txt_phoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneNumberKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneNumberKeyReleased

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameKeyReleased

    private void btn_backToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backToMainMenuActionPerformed
        dispose();
    }//GEN-LAST:event_btn_backToMainMenuActionPerformed

    private void btn_goToOrderPickupMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goToOrderPickupMenuActionPerformed
        String name = txt_name.getText();
        String phone = txt_phoneNumber.getText();
        boolean matchFound = false;
        int matchedIndex = -1;
        
        for(int i=0; i<listTrans.getTransactionCount(); i++){
            String nameInList = listTrans.getTransaction(i).getCustomer().getName();
            String phoneInList = listTrans.getTransaction(i).getCustomer().getPhoneNumber();
            
            if(name.equals(nameInList) && phone.equals(phoneInList)){
                matchFound = true;
                matchedIndex = i;
                break;
            }

        }
        
        if(!name.isEmpty() || !phone.isEmpty()){
            if(matchFound){
                OrderPickupMenu pickup = new OrderPickupMenu(listTrans, matchedIndex);
                pickup.setVisible(true);
                dispose();
            }else
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        }else
            JOptionPane.showMessageDialog(null, "Data belum lengkap!");
    }//GEN-LAST:event_btn_goToOrderPickupMenuActionPerformed

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
            java.util.logging.Logger.getLogger(OrderSearchMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderSearchMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderSearchMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderSearchMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_backToMainMenu;
    private javax.swing.JButton btn_goToOrderPickupMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phoneNumber;
    // End of variables declaration//GEN-END:variables
}
