package View;

import Logic.LogicKeranjang;

public class ItemSelimut extends Item {

    LogicKeranjang keranjang;

    public ItemSelimut(java.awt.Frame parent, boolean modal, LogicKeranjang keranjang) {
        super(parent, modal);
        initComponents();
        this.keranjang = keranjang;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inpJumlah = new javax.swing.JTextField();
        cmbJenis = new javax.swing.JComboBox<>();
        cmbWaktu = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        inpJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpJumlahActionPerformed(evt);
            }
        });
        getContentPane().add(inpJumlah);
        inpJumlah.setBounds(430, 180, 210, 50);

        cmbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuci Kering", "Cuci Kering + Setrika" }));
        cmbJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJenisActionPerformed(evt);
            }
        });
        getContentPane().add(cmbJenis);
        cmbJenis.setBounds(430, 250, 210, 60);

        cmbWaktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hemat (5 Hari)", "Standar (3 Hari)", "Express (1 Hari)" }));
        cmbWaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWaktuActionPerformed(evt);
            }
        });
        getContentPane().add(cmbWaktu);
        cmbWaktu.setBounds(430, 330, 210, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/itemSelimut.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 790, 490);

        setSize(new java.awt.Dimension(801, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJenisActionPerformed

    private void inpJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpJumlahActionPerformed

    private void cmbWaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWaktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbWaktuActionPerformed

    @Override
    public void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {
        keranjang.setJumlahCucianSelimut(Integer.parseInt(inpJumlah.getText()));
        keranjang.setJenisCuciSelimut(cmbJenis.getSelectedItem().toString());
        keranjang.setWaktuPengerjaanSelimut(cmbWaktu.getSelectedItem().toString());
        System.out.println("" + keranjang.getJumlahCucianSelimut());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbJenis;
    private javax.swing.JComboBox<String> cmbWaktu;
    private javax.swing.JTextField inpJumlah;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
