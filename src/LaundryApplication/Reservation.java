package LaundryApplication;

import Source.*;
import javax.swing.JOptionPane;

public class Reservation extends javax.swing.JFrame {
    private Order order;
    ListTransactions listTrans;
    
    public Reservation(Order order, ListTransactions listTrans) {
        initComponents();
        this.order = order;
        this.listTrans = listTrans;
        total_label.setText("Rp"+Double.toString(order.getTotalPrice()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_telp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        payLater_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(270, 320));
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pemesanan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Atas nama   :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 30));

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
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 120, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("No. Telepon :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 30));

        txt_telp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telpActionPerformed(evt);
            }
        });
        txt_telp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_telpKeyReleased(evt);
            }
        });
        jPanel1.add(txt_telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 120, 30));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("Total harga  :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 30));

        total_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(total_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 120, 30));

        payLater_btn.setText("Pesan");
        payLater_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payLater_btnActionPerformed(evt);
            }
        });
        jPanel1.add(payLater_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 90, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 270, 300);

        setSize(new java.awt.Dimension(286, 306));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyReleased

    }//GEN-LAST:event_txt_nameKeyReleased

    private void txt_telpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telpActionPerformed

    }//GEN-LAST:event_txt_telpActionPerformed

    private void txt_telpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telpKeyReleased

    }//GEN-LAST:event_txt_telpKeyReleased

    private void payLater_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payLater_btnActionPerformed
        String name = txt_name.getText();
        String telp = txt_telp.getText();

        if(!name.isEmpty() && !telp.isEmpty()){
            Customer cust = new Customer(name, telp, order);
            
            Transaction trans = new Transaction(cust);
            trans.setStatus(false);
            listTrans.addTransaction(trans);

            
            JOptionPane.showMessageDialog(null, "Terimakasih "
                            + name + "\nPesanan Anda akan diproses");
            
            CustomerMenu custMen = new CustomerMenu();
            custMen.setListTransactions(listTrans);
            custMen.setVisible(true);
            dispose();
        }else
            JOptionPane.showMessageDialog(null, "Harap isi semua "
                        +   "data");
    }//GEN-LAST:event_payLater_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton payLater_btn;
    private javax.swing.JLabel total_label;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_telp;
    // End of variables declaration//GEN-END:variables
}
