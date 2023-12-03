package View;

import Logic.LogicKeranjang;

public class OtpItemSepatu extends OtpItem {

    private LogicKeranjang keranjang;
    
    public OtpItemSepatu(java.awt.Frame parent, boolean modal, LogicKeranjang keranjang) {
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
        cmbWaktu = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        inpJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpJumlahActionPerformed(evt);
            }
        });
        getContentPane().add(inpJumlah);
        inpJumlah.setBounds(430, 210, 160, 40);

        cmbWaktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hemat (5 Hari)", "Standar (3 Hari)", "Express (1 Hari)" }));
        cmbWaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWaktuActionPerformed(evt);
            }
        });
        getContentPane().add(cmbWaktu);
        cmbWaktu.setBounds(430, 300, 160, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/itemSepatu.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 790, 480);

        setSize(new java.awt.Dimension(801, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inpJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpJumlahActionPerformed
        
    }//GEN-LAST:event_inpJumlahActionPerformed

    private void cmbWaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWaktuActionPerformed
        
    }//GEN-LAST:event_cmbWaktuActionPerformed

    @Override
    public void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        keranjang.setJumlahCucianSepatu(Integer.parseInt(inpJumlah.getText()));
        keranjang.setWaktuPengerjaanSepatu(cmbWaktu.getSelectedItem().toString());
        System.out.println("" + keranjang.getJumlahCucianSepatu());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbWaktu;
    private javax.swing.JTextField inpJumlah;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
