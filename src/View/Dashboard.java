package View;

import Controller.*;

public class Dashboard extends ViewController {

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnOrderList = new javax.swing.JButton();
        btnInputOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Input Order");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 330, 130, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Status Order");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 330, 130, 25);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 0, 490);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dashboard.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 790, 490);

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout);
        btnLogout.setBounds(350, 420, 100, 40);

        btnOrderList.setBackground(new java.awt.Color(94, 23, 235));
        btnOrderList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnOrderList.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderList.setText("Order List");
        btnOrderList.setBorder(null);
        btnOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderListActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrderList);
        btnOrderList.setBounds(470, 320, 210, 50);

        btnInputOrder.setBackground(new java.awt.Color(94, 23, 235));
        btnInputOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInputOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnInputOrder.setText("Input Order");
        btnInputOrder.setBorder(null);
        btnInputOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnInputOrder);
        btnInputOrder.setBounds(120, 320, 220, 50);

        setSize(new java.awt.Dimension(802, 521));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputOrderActionPerformed
        openFrame("menu_item");
    }//GEN-LAST:event_btnInputOrderActionPerformed

    private void btnOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderListActionPerformed
        openFrame("order_status");
    }//GEN-LAST:event_btnOrderListActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        getUserController().logout();
        openFrame("login");
    }//GEN-LAST:event_btnLogoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInputOrder;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOrderList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
