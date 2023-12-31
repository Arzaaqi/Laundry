package View;

import Controller.*;
import Logic.LogicKeranjang;

public class MenuItem extends ViewController {

    private LogicKeranjang keranjang;
    
    public MenuItem() {
        initComponents();
        this.keranjang = new LogicKeranjang();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnKeranjang = new javax.swing.JButton();
        btnSelimut = new javax.swing.JButton();
        btnSepatu = new javax.swing.JButton();
        btnKarpet = new javax.swing.JButton();
        btnBaju = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Kembali");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 430, 80, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/menu item.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 490);

        btnKeranjang.setText("Keranjang");
        btnKeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeranjangActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeranjang);
        btnKeranjang.setBounds(650, 80, 110, 40);

        btnSelimut.setText("Selimut");
        btnSelimut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelimutActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelimut);
        btnSelimut.setBounds(430, 300, 160, 110);

        btnSepatu.setText("Sepatu");
        btnSepatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSepatuActionPerformed(evt);
            }
        });
        getContentPane().add(btnSepatu);
        btnSepatu.setBounds(430, 150, 160, 110);

        btnKarpet.setText("Karpet");
        btnKarpet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKarpetActionPerformed(evt);
            }
        });
        getContentPane().add(btnKarpet);
        btnKarpet.setBounds(200, 300, 160, 110);

        btnBaju.setText("Baju");
        btnBaju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajuActionPerformed(evt);
            }
        });
        getContentPane().add(btnBaju);
        btnBaju.setBounds(200, 150, 160, 110);

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali);
        btnKembali.setBounds(20, 430, 110, 23);

        setSize(new java.awt.Dimension(801, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajuActionPerformed
        ItemPakaian itemBaju = new ItemPakaian(this, true, keranjang);
        itemBaju.setVisible(true);
    }//GEN-LAST:event_btnBajuActionPerformed

    private void btnSepatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSepatuActionPerformed
        ItemSepatu itemSepatu = new ItemSepatu(this, true, keranjang);
        itemSepatu.setVisible(true);
    }//GEN-LAST:event_btnSepatuActionPerformed

    private void btnKarpetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKarpetActionPerformed
        ItemKarpet itemKarpet = new ItemKarpet(this, true, keranjang);
        itemKarpet.setVisible(true);
    }//GEN-LAST:event_btnKarpetActionPerformed

    private void btnSelimutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelimutActionPerformed
        ItemSelimut itemSelimut = new ItemSelimut(this, true, keranjang);
        itemSelimut.setVisible(true);
    }//GEN-LAST:event_btnSelimutActionPerformed

    private void btnKeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeranjangActionPerformed
        openFrame(new ViewKeranjang(keranjang));
    }//GEN-LAST:event_btnKeranjangActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        openFrame("dashboard");
    }//GEN-LAST:event_btnKembaliActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaju;
    private javax.swing.JButton btnKarpet;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnKeranjang;
    private javax.swing.JButton btnSelimut;
    private javax.swing.JButton btnSepatu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
