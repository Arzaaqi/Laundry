package View;

import Logic.*;

public class Kalkulator extends javax.swing.JFrame {

    public Kalkulator() {
        initComponents();
        
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PindahPanel = new javax.swing.JTabbedPane();
        pnlBaju = new javax.swing.JPanel();
        inpBeratPakaian = new javax.swing.JTextField();
        cmbJenisCucianPakaian = new javax.swing.JComboBox<>();
        cmbLamaPengerjaanPakaian = new javax.swing.JComboBox<>();
        inpHargaPakaian = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pnlSelimut = new javax.swing.JPanel();
        inpJumlahSelimut = new javax.swing.JTextField();
        cmbJenisCucianSelimut = new javax.swing.JComboBox<>();
        cmbLamaPengerjaanSelimut = new javax.swing.JComboBox<>();
        inpHargaSelimut = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pnlSepatu = new javax.swing.JPanel();
        inpJumlahSepatu = new javax.swing.JTextField();
        cmbWaktuPengerjaanSepatu = new javax.swing.JComboBox<>();
        inpHargaSepatu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pnlKarpet = new javax.swing.JPanel();
        inpJumlahKarpet = new javax.swing.JTextField();
        cmbWaktuPengerjaanKarpet = new javax.swing.JComboBox<>();
        inpHargaKarpet = new javax.swing.JTextField();
        bgrKarpet = new javax.swing.JLabel();
        lblKembali = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        btnHitung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        PindahPanel.setBackground(new java.awt.Color(102, 153, 255));
        PindahPanel.setForeground(new java.awt.Color(255, 255, 255));
        PindahPanel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        pnlBaju.setBackground(new java.awt.Color(255, 255, 255));
        pnlBaju.setPreferredSize(new java.awt.Dimension(610, 230));
        pnlBaju.setLayout(null);
        pnlBaju.add(inpBeratPakaian);
        inpBeratPakaian.setBounds(340, 30, 220, 30);

        cmbJenisCucianPakaian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuci Kering", "Cuci Kering + Setrika", "Setrika" }));
        cmbJenisCucianPakaian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJenisCucianPakaianActionPerformed(evt);
            }
        });
        pnlBaju.add(cmbJenisCucianPakaian);
        cmbJenisCucianPakaian.setBounds(340, 80, 220, 30);

        cmbLamaPengerjaanPakaian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Express", "Standar", "Hemat" }));
        pnlBaju.add(cmbLamaPengerjaanPakaian);
        cmbLamaPengerjaanPakaian.setBounds(340, 130, 220, 30);

        inpHargaPakaian.setEnabled(false);
        pnlBaju.add(inpHargaPakaian);
        inpHargaPakaian.setBounds(340, 180, 220, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\Kuliah 2023\\OOP\\UAS_Laundry\\src\\Image\\KalkulatorBaju.png")); // NOI18N
        pnlBaju.add(jLabel3);
        jLabel3.setBounds(0, 0, 610, 230);

        PindahPanel.addTab("Pakaian", pnlBaju);
        pnlBaju.getAccessibleContext().setAccessibleDescription("");

        pnlSelimut.setLayout(null);
        pnlSelimut.add(inpJumlahSelimut);
        inpJumlahSelimut.setBounds(340, 80, 220, 30);

        cmbJenisCucianSelimut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuci Kering", "Cuci Kering + Setrika", "Setrika" }));
        pnlSelimut.add(cmbJenisCucianSelimut);
        cmbJenisCucianSelimut.setBounds(340, 40, 220, 30);

        cmbLamaPengerjaanSelimut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Express", "Standar", "Hemat" }));
        pnlSelimut.add(cmbLamaPengerjaanSelimut);
        cmbLamaPengerjaanSelimut.setBounds(340, 120, 220, 30);

        inpHargaSelimut.setEnabled(false);
        pnlSelimut.add(inpHargaSelimut);
        inpHargaSelimut.setBounds(340, 160, 220, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\Kuliah 2023\\OOP\\UAS_Laundry\\src\\Image\\KalkulatorSelimut.png")); // NOI18N
        pnlSelimut.add(jLabel4);
        jLabel4.setBounds(0, 0, 610, 230);

        PindahPanel.addTab("Selimut", pnlSelimut);

        pnlSepatu.setLayout(null);
        pnlSepatu.add(inpJumlahSepatu);
        inpJumlahSepatu.setBounds(340, 50, 220, 30);

        cmbWaktuPengerjaanSepatu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Express", "Standar", "Hemat" }));
        cmbWaktuPengerjaanSepatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWaktuPengerjaanSepatuActionPerformed(evt);
            }
        });
        pnlSepatu.add(cmbWaktuPengerjaanSepatu);
        cmbWaktuPengerjaanSepatu.setBounds(340, 110, 220, 30);

        inpHargaSepatu.setEnabled(false);
        pnlSepatu.add(inpHargaSepatu);
        inpHargaSepatu.setBounds(340, 160, 220, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\Kuliah 2023\\OOP\\UAS_Laundry\\src\\Image\\KalkulatorSepatu.png")); // NOI18N
        pnlSepatu.add(jLabel5);
        jLabel5.setBounds(0, 0, 610, 230);

        PindahPanel.addTab("Sepatu", pnlSepatu);

        pnlKarpet.setPreferredSize(new java.awt.Dimension(610, 230));
        pnlKarpet.setLayout(null);

        inpJumlahKarpet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpJumlahKarpetActionPerformed(evt);
            }
        });
        pnlKarpet.add(inpJumlahKarpet);
        inpJumlahKarpet.setBounds(340, 50, 220, 30);

        cmbWaktuPengerjaanKarpet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Express", "Standar", "Hemat" }));
        pnlKarpet.add(cmbWaktuPengerjaanKarpet);
        cmbWaktuPengerjaanKarpet.setBounds(340, 100, 220, 30);

        inpHargaKarpet.setEnabled(false);
        pnlKarpet.add(inpHargaKarpet);
        inpHargaKarpet.setBounds(340, 150, 220, 30);

        bgrKarpet.setIcon(new javax.swing.ImageIcon("E:\\Kuliah 2023\\OOP\\UAS_Laundry\\src\\Image\\KalkulatorKarpet.png")); // NOI18N
        pnlKarpet.add(bgrKarpet);
        bgrKarpet.setBounds(0, 0, 610, 230);

        PindahPanel.addTab("Karpet", pnlKarpet);

        getContentPane().add(PindahPanel);
        PindahPanel.setBounds(80, 140, 610, 260);

        lblKembali.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblKembali.setForeground(new java.awt.Color(255, 255, 255));
        lblKembali.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKembali.setText("Kembali");
        lblKembali.setToolTipText("");
        lblKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblKembali.setPreferredSize(new java.awt.Dimension(61, 25));
        getContentPane().add(lblKembali);
        lblKembali.setBounds(50, 420, 90, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hitung");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(660, 425, 80, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Kuliah 2023\\OOP\\UAS_Laundry\\src\\Image\\KalkulatorLaundry.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, -4, 790, 490);

        btnKembali.setText("Kembali");
        getContentPane().add(btnKembali);
        btnKembali.setBounds(40, 420, 110, 40);

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnHitung);
        btnHitung.setBounds(640, 420, 110, 40);

        setSize(new java.awt.Dimension(797, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbJenisCucianPakaianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJenisCucianPakaianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJenisCucianPakaianActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        int selectedIndex = PindahPanel.getSelectedIndex();

        if (selectedIndex == 0) { // pnlBaju
            KalkulatorBaju baju = new KalkulatorBaju();
            int berat = Integer.parseInt(inpBeratPakaian.getText());
            String jenisCucian = (String) cmbJenisCucianPakaian.getSelectedItem();
            String waktuPengerjaan = (String) cmbLamaPengerjaanPakaian.getSelectedItem();
            
            baju.setBerat(berat);
            baju.setJenisCucian(jenisCucian);
            baju.setJenisPengerjaan(waktuPengerjaan);
            inpHargaPakaian.setText(String.valueOf(baju.hitung()));
        } else if (selectedIndex == 1) {
            KalkulatorSelimut selimut = new KalkulatorSelimut();
            int jumlah = Integer.parseInt(inpJumlahSelimut.getText());
            String jenisCucian = (String) cmbJenisCucianSelimut.getSelectedItem();
            String waktuPengerjaan = (String) cmbLamaPengerjaanSelimut.getSelectedItem();
            
            selimut.setJumlah(jumlah);
            selimut.setJenisCucian(jenisCucian);
            selimut.setJenisPengerjaan(waktuPengerjaan);
            inpHargaSelimut.setText(String.valueOf(selimut.hitung()));
        } else if (selectedIndex == 2) {
            KalkulatorSepatu sepatu = new KalkulatorSepatu();
            int jumlah = Integer.parseInt(inpJumlahSepatu.getText());
            String waktuPengerjaan = (String) cmbWaktuPengerjaanSepatu.getSelectedItem();
            
            sepatu.setJumlah(jumlah);
            sepatu.setJenisPengerjaan(waktuPengerjaan);
            inpHargaSepatu.setText(String.valueOf(sepatu.hitung()));
        }else if (selectedIndex == 3) {
            KalkulatorKarpet karpet = new KalkulatorKarpet();
            int jumlah = Integer.parseInt(inpJumlahKarpet.getText());
            String waktuPengerjaan = (String) cmbWaktuPengerjaanKarpet.getSelectedItem();
            
            karpet.setJumlah(jumlah);
            karpet.setJenisPengerjaan(waktuPengerjaan);
            inpHargaKarpet.setText(String.valueOf(karpet.hitung()));
        }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void inpJumlahKarpetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpJumlahKarpetActionPerformed
        
    }//GEN-LAST:event_inpJumlahKarpetActionPerformed

    private void cmbWaktuPengerjaanSepatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWaktuPengerjaanSepatuActionPerformed
        
    }//GEN-LAST:event_cmbWaktuPengerjaanSepatuActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PindahPanel;
    private javax.swing.JLabel bgrKarpet;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKembali;
    private javax.swing.JComboBox<String> cmbJenisCucianPakaian;
    private javax.swing.JComboBox<String> cmbJenisCucianSelimut;
    private javax.swing.JComboBox<String> cmbLamaPengerjaanPakaian;
    private javax.swing.JComboBox<String> cmbLamaPengerjaanSelimut;
    private javax.swing.JComboBox<String> cmbWaktuPengerjaanKarpet;
    private javax.swing.JComboBox<String> cmbWaktuPengerjaanSepatu;
    private javax.swing.JTextField inpBeratPakaian;
    private javax.swing.JTextField inpHargaKarpet;
    private javax.swing.JTextField inpHargaPakaian;
    private javax.swing.JTextField inpHargaSelimut;
    private javax.swing.JTextField inpHargaSepatu;
    private javax.swing.JTextField inpJumlahKarpet;
    private javax.swing.JTextField inpJumlahSelimut;
    private javax.swing.JTextField inpJumlahSepatu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblKembali;
    private javax.swing.JPanel pnlBaju;
    private javax.swing.JPanel pnlKarpet;
    private javax.swing.JPanel pnlSelimut;
    private javax.swing.JPanel pnlSepatu;
    // End of variables declaration//GEN-END:variables
}
