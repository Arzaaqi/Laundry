package View;

import Logic.LogicKeranjang;

public class OtpItemSelimut extends OtpItem {

    private LogicKeranjang keranjang;
    
    public OtpItemSelimut(java.awt.Frame parent, boolean modal, LogicKeranjang keranjang) {
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
        inpJumlah.setBounds(430, 170, 160, 40);

        cmbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuci Kering", "Cuci Kering + Setrika" }));
        cmbJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJenisActionPerformed(evt);
            }
        });
        getContentPane().add(cmbJenis);
        cmbJenis.setBounds(430, 230, 160, 40);

        cmbWaktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hemat (5 Hari)", "Standar (3 Hari)", "Express (1 Hari)" }));
        cmbWaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWaktuActionPerformed(evt);
            }
        });
        getContentPane().add(cmbWaktu);
        cmbWaktu.setBounds(430, 290, 160, 40);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 790, 460);

        setSize(new java.awt.Dimension(804, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJenisActionPerformed
        
    }//GEN-LAST:event_cmbJenisActionPerformed

    private void inpJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpJumlahActionPerformed
        
    }//GEN-LAST:event_inpJumlahActionPerformed

    private void cmbWaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWaktuActionPerformed
        
    }//GEN-LAST:event_cmbWaktuActionPerformed

    @Override
    public void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
