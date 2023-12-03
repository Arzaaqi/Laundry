package View;

import Logic.LogicKeranjang;

public class ItemKarpet extends Item {

    LogicKeranjang keranjang;

    public ItemKarpet(java.awt.Frame parent, boolean modal, LogicKeranjang keranjang) {
        super(parent, modal);
        initComponents();
        this.keranjang = keranjang;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inpJumlah = new javax.swing.JTextField();
        cmbWaktu = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        inpJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpJumlahActionPerformed(evt);
            }
        });
        getContentPane().add(inpJumlah);
        inpJumlah.setBounds(430, 190, 190, 50);

        cmbWaktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hemat (5 Hari)", "Standar (3 Hari)", "Express (1 Hari)" }));
        cmbWaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWaktuActionPerformed(evt);
            }
        });
        getContentPane().add(cmbWaktu);
        cmbWaktu.setBounds(430, 290, 190, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/itemKarpet.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 490);

        setSize(new java.awt.Dimension(801, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inpJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpJumlahActionPerformed

    private void cmbWaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWaktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbWaktuActionPerformed

    @Override
    public void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {
        keranjang.setJumlahCucianKarpet(Integer.parseInt(inpJumlah.getText()));
        keranjang.setWaktuPengerjaanKarpet(cmbWaktu.getSelectedItem().toString());
        System.out.println("" + keranjang.getJumlahCucianKarpet());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbWaktu;
    private javax.swing.JTextField inpJumlah;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
