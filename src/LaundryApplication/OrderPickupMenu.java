package LaundryApplication;

import Source.ListTransactions;

import javax.swing.JOptionPane;
public class OrderPickupMenu extends javax.swing.JFrame {
    private ListTransactions listTrans;
    private int matchedIndex;
    
    public OrderPickupMenu(ListTransactions listTrans, int matchedIndex) {
        initComponents();
        
        this.listTrans = listTrans;
        this.matchedIndex = matchedIndex;
        
        boolean status = listTrans.getTransaction(matchedIndex).isStatus();
        String statusText = status ? "Sudah" : "Belum";
        boolean orderStatus = listTrans.getTransaction(matchedIndex).getCustomer().getOrder().isStatus();
        String orderStatusText = orderStatus ? "Sudah" : "Belum";
        
        name_label.setText(listTrans.getTransaction(matchedIndex).getCustomer().getName());
        phone_label.setText(listTrans.getTransaction(matchedIndex).getCustomer().getPhoneNumber());
        type_label.setText(listTrans.getTransaction(matchedIndex).getCustomer().getOrder().getServiceType());
        weight_label.setText(listTrans.getTransaction(matchedIndex).getCustomer().getOrder().getWeight() + " kg");
        price_label.setText("Rp"+listTrans.getTransaction(matchedIndex).getCustomer().getOrder().getTotalPrice());
        pay_label.setText(statusText+" Bayar");
        order_label.setText(orderStatusText+" Selesai");
        
        if(!orderStatus)
            proccess_btn.setEnabled(false);
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        order_label = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        phone_label = new javax.swing.JLabel();
        type_label = new javax.swing.JLabel();
        weight_label = new javax.swing.JLabel();
        price_label = new javax.swing.JLabel();
        pay_label = new javax.swing.JLabel();
        proccess_btn = new javax.swing.JButton();
        backToAdminMenu_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Detail Pemesanan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Status Pesanan        :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 170, 30));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Nama Pemesan   :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("No. Telepon         :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, 30));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("Jenis Pesanan      :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 30));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("Berat Cucian        :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, 30));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("Total Harga             :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 170, 30));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setText("Status Pembayaran :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 170, 30));

        order_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(order_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 140, 30));

        name_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 140, 30));

        phone_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(phone_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, 30));

        type_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(type_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 140, 30));

        weight_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(weight_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 140, 30));

        price_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(price_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 140, 30));

        pay_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jPanel1.add(pay_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 140, 30));

        proccess_btn.setText("Selesaikan");
        proccess_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proccess_btnActionPerformed(evt);
            }
        });
        jPanel1.add(proccess_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 90, 30));

        backToAdminMenu_btn.setText("Kembali");
        backToAdminMenu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToAdminMenu_btnActionPerformed(evt);
            }
        });
        jPanel1.add(backToAdminMenu_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 90, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 360);

        setSize(new java.awt.Dimension(684, 367));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void proccess_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proccess_btnActionPerformed
        // Kondisi jika sudah bayar
        if(listTrans.getTransaction(matchedIndex).isStatus()){
            JOptionPane.showMessageDialog(null, "Terima kasih "
                    +listTrans.getTransaction(matchedIndex).getCustomer().getName()
                    +" telah mempercayai jasa Laundry Plystarios\nSemoga hari Anda menyenangkan :)");
            listTrans.deleteTransaction(matchedIndex);
            dispose();
        }else{
            LastPayment pay = new LastPayment(listTrans, matchedIndex)          ;
            pay.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_proccess_btnActionPerformed

    private void backToAdminMenu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToAdminMenu_btnActionPerformed
        dispose();
    }//GEN-LAST:event_backToAdminMenu_btnActionPerformed

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
            java.util.logging.Logger.getLogger(OrderPickupMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderPickupMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderPickupMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderPickupMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToAdminMenu_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel order_label;
    private javax.swing.JLabel pay_label;
    private javax.swing.JLabel phone_label;
    private javax.swing.JLabel price_label;
    private javax.swing.JButton proccess_btn;
    private javax.swing.JLabel type_label;
    private javax.swing.JLabel weight_label;
    // End of variables declaration//GEN-END:variables
}
