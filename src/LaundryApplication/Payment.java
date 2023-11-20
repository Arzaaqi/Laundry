package LaundryApplication;

import Source.*;
import javax.swing.JOptionPane;

public class Payment extends javax.swing.JFrame {
    private Order order;
    private ListTransactions listTransactions;
    
    public Payment(Order order, ListTransactions listTrans) {
        initComponents();
        this.order = order;
        total_label.setText("Rp"+Double.toString(order.getTotalPrice()));
        this.listTransactions = listTrans;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pay_btn = new javax.swing.JButton();
        txt_telp = new javax.swing.JTextField();
        total_label = new javax.swing.JLabel();
        txt_pay = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pembayaran");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Atas nama   :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 30));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Bayar          :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("No. Telepon :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 30));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("Total harga  :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 30));

        pay_btn.setText("Bayar");
        pay_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_btnActionPerformed(evt);
            }
        });
        jPanel1.add(pay_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 90, 30));

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

        total_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(total_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 120, 30));

        txt_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_payActionPerformed(evt);
            }
        });
        txt_pay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_payKeyReleased(evt);
            }
        });
        jPanel1.add(txt_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 120, 30));

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

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 270, 320);

        setSize(new java.awt.Dimension(286, 334));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pay_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_btnActionPerformed
        String name = txt_name.getText();
        String telp = txt_telp.getText();
        String text = txt_pay.getText();
        Double money = Double.parseDouble(text);
        
        if(!name.isEmpty() && !telp.isEmpty() && !text.isEmpty()){
            // Masukin data customer
            Customer customer = new Customer(name, telp, order);
            // Masukin data transaksi
            Transaction trans = new Transaction(customer);
            // Hitung kembalian
            Double change = trans.countPayment(money);
            if(change >= 0){
                if(change > 0)
                    JOptionPane.showMessageDialog(null, "Kembalian "
                            + "Anda Rp" + change);
                JOptionPane.showMessageDialog(null, "Terimakasih "
                            + name + "\nPesanan Anda akan diproses");
                trans.setStatus(true);
               
                listTransactions.addTransaction(trans);
                
                CustomerMenu custMen = new CustomerMenu();
                custMen.setListTransactions(listTransactions);
                custMen.setVisible(true);
                this.setVisible(false);
            }else
                JOptionPane.showMessageDialog(null, "Uang Anda "
                        +   "kurang");
        }else
            JOptionPane.showMessageDialog(null, "Harap isi semua "
                        +   "data");
    }//GEN-LAST:event_pay_btnActionPerformed

    private void txt_telpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telpActionPerformed

    }//GEN-LAST:event_txt_telpActionPerformed

    private void txt_telpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telpKeyReleased
        
    }//GEN-LAST:event_txt_telpKeyReleased

    private void txt_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_payActionPerformed

    private void txt_payKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_payKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_payKeyReleased

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyReleased
        
    }//GEN-LAST:event_txt_nameKeyReleased

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pay_btn;
    private javax.swing.JLabel total_label;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_pay;
    private javax.swing.JTextField txt_telp;
    // End of variables declaration//GEN-END:variables
}
