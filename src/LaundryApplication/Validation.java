package LaundryApplication;

import Source.*;
import javax.swing.JOptionPane;

public class Validation extends javax.swing.JFrame {
    private String serviceType;
    private String weight;
    private double totalPrice;
    private CustomerMenu custMen;
    private ListTransactions listTrans;
    
    public Validation(String serviceType, String weight, CustomerMenu custMen) {
        initComponents();
        this.serviceType = serviceType;
        this.weight = weight;
        this.custMen = custMen;
        
        type_label.setText(serviceType);
        if(serviceType=="Cuci Kering"){
            price_per_weight_label.setText("Rp8000");
            totalPrice = 8000 * Double.parseDouble(weight);
        }else{
            price_per_weight_label.setText("Rp10000");
            totalPrice = 10000 * Double.parseDouble(weight);
        }
        weight_label.setText(weight);
        total_label.setText("Rp"+Double.toString(totalPrice));
    }
    
    public void setListTransactions(ListTransactions listTransactions) {
        this.listTrans = listTransactions;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_weight = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backToReservation_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        type_label = new javax.swing.JLabel();
        price_per_weight_label = new javax.swing.JLabel();
        weight_label = new javax.swing.JLabel();
        goToPayment_btn = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Detail Transaksi");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        total_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(total_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 140, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Total Harga :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Harga/kilo   :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, 30));

        backToReservation_btn.setText("Batal");
        backToReservation_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToReservation_btnActionPerformed(evt);
            }
        });
        jPanel1.add(backToReservation_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 90, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Berat (kg)   :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Jenis  Cuci   :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 30));

        type_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(type_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 140, 30));

        price_per_weight_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(price_per_weight_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 140, 30));

        weight_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(weight_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 140, 30));

        goToPayment_btn.setText("Bayar");
        goToPayment_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToPayment_btnActionPerformed(evt);
            }
        });
        jPanel1.add(goToPayment_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 90, 30));
        goToPayment_btn.getAccessibleContext().setAccessibleName("Bayar");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 290, 350);

        setSize(new java.awt.Dimension(300, 352));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backToReservation_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToReservation_btnActionPerformed
        custMen.setVisible(true);
        dispose();
    }//GEN-LAST:event_backToReservation_btnActionPerformed

    private void txt_weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_weightActionPerformed

    }//GEN-LAST:event_txt_weightActionPerformed

    private void txt_weightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_weightKeyReleased
        
    }//GEN-LAST:event_txt_weightKeyReleased

    private void goToPayment_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToPayment_btnActionPerformed
        int result = JOptionPane.showOptionDialog(
                this, 
                "Pilih waktu bayar", 
                "Waktu Pembayaran", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                new String[]{"Bayar Sekarang", "Bayar Nanti"}, 
                "Bayar Sekarang"
        );
        Order order = new Order(serviceType, Double.parseDouble(weight), 
                totalPrice);
        order.setStatus(false); // Artinya status orderan belum
        if(result == JOptionPane.YES_OPTION){
            Payment pay = new Payment(order, listTrans);
            pay.setVisible(true);
            dispose();
        }else{
            Reservation resr = new Reservation(order, listTrans);
            resr.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_goToPayment_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Validation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Validation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Validation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Validation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToReservation_btn;
    private javax.swing.JButton goToPayment_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel price_per_weight_label;
    private javax.swing.JLabel total_label;
    private javax.swing.JTextField txt_weight;
    private javax.swing.JLabel type_label;
    private javax.swing.JLabel weight_label;
    // End of variables declaration//GEN-END:variables
}
