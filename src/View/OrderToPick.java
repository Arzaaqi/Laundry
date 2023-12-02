package View;

import Controller.*;
import Logic.LogicKeranjang;

public class OrderToPick extends ViewController {

    private LogicKeranjang keranjang;
    
    public OrderToPick() {
        initComponents();
        this.keranjang = new LogicKeranjang();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKeranjang = new javax.swing.JButton();
        btnSelimut = new javax.swing.JButton();
        btnSepatu = new javax.swing.JButton();
        btnKarpet = new javax.swing.JButton();
        btnPakaian = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnKeranjang.setText("Keranjang");
        btnKeranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeranjangActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeranjang);
        btnKeranjang.setBounds(650, 30, 110, 40);

        btnSelimut.setText("Selimut");
        btnSelimut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelimutActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelimut);
        btnSelimut.setBounds(430, 260, 160, 110);

        btnSepatu.setText("Sepatu");
        btnSepatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSepatuActionPerformed(evt);
            }
        });
        getContentPane().add(btnSepatu);
        btnSepatu.setBounds(430, 110, 160, 110);

        btnKarpet.setText("Karpet");
        btnKarpet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKarpetActionPerformed(evt);
            }
        });
        getContentPane().add(btnKarpet);
        btnKarpet.setBounds(200, 260, 160, 110);

        btnPakaian.setText("Pakaian");
        btnPakaian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPakaianActionPerformed(evt);
            }
        });
        getContentPane().add(btnPakaian);
        btnPakaian.setBounds(200, 110, 160, 110);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 490);

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali);
        btnKembali.setBounds(40, 410, 120, 40);

        setSize(new java.awt.Dimension(804, 525));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPakaianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPakaianActionPerformed
        OtpItemPakaian itemPakaian = new OtpItemPakaian(this, true, keranjang);
        itemPakaian.setVisible(true);
    }//GEN-LAST:event_btnPakaianActionPerformed

    private void btnSepatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSepatuActionPerformed
        OtpItemSepatu ItemSepatu = new OtpItemSepatu(this, true, keranjang);
        ItemSepatu.setVisible(true);
    }//GEN-LAST:event_btnSepatuActionPerformed

    private void btnKarpetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKarpetActionPerformed
        OtpItemKarpet ItemKarpet = new OtpItemKarpet(this, true, keranjang);
        ItemKarpet.setVisible(true);
    }//GEN-LAST:event_btnKarpetActionPerformed

    private void btnSelimutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelimutActionPerformed
        OtpItemSelimut ItemSelimut = new OtpItemSelimut(this, true, keranjang);
        ItemSelimut.setVisible(true);
    }//GEN-LAST:event_btnSelimutActionPerformed

    private void btnKeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeranjangActionPerformed
        openFrame(new OtpViewKeranjang(keranjang));
    }//GEN-LAST:event_btnKeranjangActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        openFrame("dashboard_customer");
    }//GEN-LAST:event_btnKembaliActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKarpet;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnKeranjang;
    private javax.swing.JButton btnPakaian;
    private javax.swing.JButton btnSelimut;
    private javax.swing.JButton btnSepatu;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
