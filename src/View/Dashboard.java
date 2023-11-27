package View;

import Controller.*;
import View.*;

public class Dashboard extends ViewController {

    public Dashboard() {
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

        btnInputOrder = new javax.swing.JButton();
        btnOrderList = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(780, 490));
        getContentPane().setLayout(null);

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
        btnInputOrder.setBounds(120, 350, 180, 40);

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
        btnOrderList.setBounds(480, 360, 170, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Tugas\\Semester 3\\Pemrograman Berorientasi Objek\\Laundry\\src\\Image\\dashboard.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 790, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputOrderActionPerformed

    }//GEN-LAST:event_btnInputOrderActionPerformed

    private void btnOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderListActionPerformed

    }//GEN-LAST:event_btnOrderListActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInputOrder;
    private javax.swing.JButton btnOrderList;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
