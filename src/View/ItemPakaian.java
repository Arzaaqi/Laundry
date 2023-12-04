package View;

import Logic.LogicKeranjang;

public class ItemPakaian extends Item {

    LogicKeranjang keranjang;
    public ItemPakaian(java.awt.Frame parent, boolean modal, LogicKeranjang keranjang) {
        super(parent, modal);
        initComponents();
        this.keranjang = keranjang;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbWaktu = new javax.swing.JComboBox<>();
        inpBerat = new javax.swing.JTextField();
        cmbJenis = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        cmbWaktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hemat (5 Hari)", "Standar (3 Hari)", "Express (1 Hari)" }));
        cmbWaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWaktuActionPerformed(evt);
            }
        });
        getContentPane().add(cmbWaktu);
        cmbWaktu.setBounds(440, 320, 160, 40);

        inpBerat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpBeratActionPerformed(evt);
            }
        });
        getContentPane().add(inpBerat);
        inpBerat.setBounds(440, 170, 160, 35);

        cmbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Setrika", "Cuci Kering", "Cuci Kering + Setrika" }));
        cmbJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJenisActionPerformed(evt);
            }
        });
        getContentPane().add(cmbJenis);
        cmbJenis.setBounds(440, 240, 160, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/itemPakaian.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 790, 490);

        setSize(new java.awt.Dimension(801, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJenisActionPerformed

    private void cmbWaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWaktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbWaktuActionPerformed

    private void inpBeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpBeratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpBeratActionPerformed

    @Override
    public void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        keranjang.setBeratCucianPakaian(Integer.parseInt(inpBerat.getText()));
        keranjang.setJenisCuciPakaian(cmbJenis.getSelectedItem().toString());
        keranjang.setWaktuPengerjaanPakaian(cmbWaktu.getSelectedItem().toString());
        System.out.println("" + keranjang.getBeratCucianPakaian());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbJenis;
    private javax.swing.JComboBox<String> cmbWaktu;
    private javax.swing.JTextField inpBerat;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
