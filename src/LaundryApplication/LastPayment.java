package LaundryApplication;

import Source.ListTransactions;
import javax.swing.JOptionPane;

public class LastPayment extends javax.swing.JFrame {
    private ListTransactions listTrans;
    private int matchedIndex;
    
    public LastPayment(ListTransactions listTrans, int matchedIndex) {
        initComponents();
        
        this.listTrans = listTrans;
        this.matchedIndex = matchedIndex;
        
        total_label.setText("Rp"+listTrans.getTransaction(matchedIndex).getCustomer().getOrder().getTotalPrice());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_pay = new javax.swing.JTextField();
        pay_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pembayaran");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("Total harga  :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 30));

        total_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(total_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 120, 30));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Bayar          :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 30));

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
        jPanel1.add(txt_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 120, 30));

        pay_btn.setText("Bayar");
        pay_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_btnActionPerformed(evt);
            }
        });
        jPanel1.add(pay_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 90, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 270, 260);

        setSize(new java.awt.Dimension(286, 263));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_payActionPerformed

    }//GEN-LAST:event_txt_payActionPerformed

    private void txt_payKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_payKeyReleased

    }//GEN-LAST:event_txt_payKeyReleased

    private void pay_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_btnActionPerformed
        String text = txt_pay.getText();
        Double money = Double.parseDouble(text);

        if(!text.isEmpty()){
            Double change = listTrans.getTransaction(matchedIndex).countPayment(money);
            if(change >= 0){
                if(change > 0)
                JOptionPane.showMessageDialog(null, "Kembalian "
                    + "Anda Rp" + change);
                JOptionPane.showMessageDialog(null, "Terima kasih "
                    +listTrans.getTransaction(matchedIndex).getCustomer().getName()
                    +" telah mempercayai jasa Laundry Plystarios\nSemoga hari Anda menyenangkan :)");
                listTrans.deleteTransaction(matchedIndex);
                dispose();
            }else
            JOptionPane.showMessageDialog(null, "Uang Anda "
                +   "kurang");
        }else
        JOptionPane.showMessageDialog(null, "Harap isi semua "
            +   "data");
    }//GEN-LAST:event_pay_btnActionPerformed

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
            java.util.logging.Logger.getLogger(LastPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LastPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LastPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LastPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pay_btn;
    private javax.swing.JLabel total_label;
    private javax.swing.JTextField txt_pay;
    // End of variables declaration//GEN-END:variables
}
