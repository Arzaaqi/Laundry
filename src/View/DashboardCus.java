/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author belli
 */
public class DashboardCus extends javax.swing.JFrame {

    /**
     * Creates new form DashboardCus
     */
    public DashboardCus() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStatusOrder = new javax.swing.JButton();
        btn_Kalkulator = new javax.swing.JButton();
        btn_Order = new javax.swing.JButton();
        btn_Kembali = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnStatusOrder.setBackground(new java.awt.Color(0, 204, 204));
        btnStatusOrder.setFont(new java.awt.Font("Stencil Std", 1, 14)); // NOI18N
        btnStatusOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnStatusOrder.setText("Status Order");
        btnStatusOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btnStatusOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnStatusOrder);
        btnStatusOrder.setBounds(40, 280, 210, 50);

        btn_Kalkulator.setBackground(new java.awt.Color(255, 153, 153));
        btn_Kalkulator.setFont(new java.awt.Font("Stencil Std", 1, 14)); // NOI18N
        btn_Kalkulator.setForeground(new java.awt.Color(255, 255, 255));
        btn_Kalkulator.setText("Kalkulator laundry");
        btn_Kalkulator.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        btn_Kalkulator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KalkulatorActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Kalkulator);
        btn_Kalkulator.setBounds(280, 280, 220, 50);

        btn_Order.setBackground(new java.awt.Color(255, 153, 0));
        btn_Order.setFont(new java.awt.Font("Stencil Std", 1, 14)); // NOI18N
        btn_Order.setForeground(new java.awt.Color(255, 255, 255));
        btn_Order.setText("order to pick up");
        btn_Order.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btn_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OrderActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Order);
        btn_Order.setBounds(530, 280, 220, 50);

        btn_Kembali.setBackground(new java.awt.Color(102, 0, 102));
        btn_Kembali.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 18)); // NOI18N
        btn_Kembali.setForeground(new java.awt.Color(255, 255, 255));
        btn_Kembali.setText("KEMBALI");
        btn_Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Kembali);
        btn_Kembali.setBounds(310, 420, 170, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/BARU GUYS.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 790, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KalkulatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KalkulatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_KalkulatorActionPerformed

    private void btn_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_OrderActionPerformed

    private void btn_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_KembaliActionPerformed

    private void btnStatusOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStatusOrderActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardCus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardCus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardCus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardCus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardCus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStatusOrder;
    private javax.swing.JButton btn_Kalkulator;
    private javax.swing.JButton btn_Kembali;
    private javax.swing.JButton btn_Order;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
