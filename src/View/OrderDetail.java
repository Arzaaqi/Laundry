package View;

import Logic.*;
import Controller.*;
import javax.swing.JOptionPane;

public class OrderDetail extends ViewController {

    private Order order;

    public OrderDetail(Order order) {
        initComponents();
        this.order = order;
        boolean orderStatus = order.isStatusOrderan();
        if (!orderStatus == false) {
            cmbStatus.setSelectedItem("Selesai");
        } else {
            cmbStatus.setSelectedItem("Belum Selesai");
        }

        inpNama.setText(order.getNamaPelanggan());
        inpNoTelp.setText(order.getNomorTeleponPelanggan());
        lblHarga.setText(" " + order.getTotalHarga());
        inpAlamat.setText(order.getAlamatPelanggan());

        tampilData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        lblCarpetDuration = new javax.swing.JLabel();
        lblShoesDuration = new javax.swing.JLabel();
        lblTipeCuciSelimut = new javax.swing.JLabel();
        lblLamaPengerjaanSelimut = new javax.swing.JLabel();
        lblTipeCuciBaju = new javax.swing.JLabel();
        lblLamaPengerjaanBaju = new javax.swing.JLabel();
        inpNama = new javax.swing.JTextField();
        inpAlamat = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox<>();
        btnProses = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        inpNoTelp = new javax.swing.JTextField();
        inpBeratPakaian = new javax.swing.JTextField();
        inpJumlahSepatu = new javax.swing.JTextField();
        inpJumlahSelimut = new javax.swing.JTextField();
        inpJumlahKarpet = new javax.swing.JTextField();
        lblHarga = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblCarpetDuration.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        lblCarpetDuration.setText("12");
        getContentPane().add(lblCarpetDuration);
        lblCarpetDuration.setBounds(450, 541, 110, 26);

        lblShoesDuration.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        lblShoesDuration.setText("2");
        getContentPane().add(lblShoesDuration);
        lblShoesDuration.setBounds(150, 544, 140, 26);

        lblTipeCuciSelimut.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        lblTipeCuciSelimut.setText("Setrika");
        getContentPane().add(lblTipeCuciSelimut);
        lblTipeCuciSelimut.setBounds(470, 397, 90, 26);

        lblLamaPengerjaanSelimut.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 12)); // NOI18N
        lblLamaPengerjaanSelimut.setText("12");
        getContentPane().add(lblLamaPengerjaanSelimut);
        lblLamaPengerjaanSelimut.setBounds(470, 425, 90, 26);

        lblTipeCuciBaju.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        lblTipeCuciBaju.setText("Setrika");
        getContentPane().add(lblTipeCuciBaju);
        lblTipeCuciBaju.setBounds(188, 397, 100, 26);

        lblLamaPengerjaanBaju.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 12)); // NOI18N
        lblLamaPengerjaanBaju.setText("1");
        getContentPane().add(lblLamaPengerjaanBaju);
        lblLamaPengerjaanBaju.setBounds(180, 425, 110, 26);
        getContentPane().add(inpNama);
        inpNama.setBounds(260, 165, 260, 22);
        getContentPane().add(inpAlamat);
        inpAlamat.setBounds(260, 215, 260, 22);

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belum Selesai", "Selesai", "" }));
        getContentPane().add(cmbStatus);
        cmbStatus.setBounds(260, 270, 140, 22);

        btnProses.setBackground(new java.awt.Color(0,0,0,0));
        btnProses.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        btnProses.setForeground(new java.awt.Color(240, 240, 240));
        btnProses.setText("Proses");
        btnProses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });
        getContentPane().add(btnProses);
        btnProses.setBounds(468, 618, 110, 34);

        btnKembali.setBackground(new java.awt.Color(0,0,0,0));
        btnKembali.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(240, 240, 240));
        btnKembali.setText("Kembali");
        btnKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali);
        btnKembali.setBounds(336, 618, 110, 34);
        getContentPane().add(inpNoTelp);
        inpNoTelp.setBounds(260, 190, 260, 22);
        getContentPane().add(inpBeratPakaian);
        inpBeratPakaian.setBounds(190, 372, 90, 22);
        getContentPane().add(inpJumlahSepatu);
        inpJumlahSepatu.setBounds(150, 520, 132, 22);
        getContentPane().add(inpJumlahSelimut);
        inpJumlahSelimut.setBounds(470, 370, 80, 22);
        getContentPane().add(inpJumlahKarpet);
        inpJumlahKarpet.setBounds(450, 515, 100, 22);

        lblHarga.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        lblHarga.setForeground(new java.awt.Color(240, 240, 240));
        lblHarga.setText("Rp");
        getContentPane().add(lblHarga);
        lblHarga.setBounds(260, 243, 260, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\Kuliah 2023\\OOP\\UAS_Laundry\\src\\Image\\gambarDetailPesanan.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 670);

        setSize(new java.awt.Dimension(617, 709));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        openFrame("order_status");
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        if (inpNama.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nama belum diisi",
                    "Nama", JOptionPane.WARNING_MESSAGE);
        } else if (inpNoTelp.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nomor Telepon belum diisi",
                    "Nomor", JOptionPane.WARNING_MESSAGE);
        } else {
            if (lblTipeCuciBaju.getText() == "-") {
                order.setNamaPelanggan(inpNama.getText());
                order.setNomorTeleponPelanggan(inpNoTelp.getText());
                order.setStatusOrderan(cmbStatus.getSelectedItem().toString());

                lblHarga.setText("" + order.getTotalHarga());

                JOptionPane.showMessageDialog(this,
                        "Pesanan atas nama "
                        + order.getNamaPelanggan() + " telah selesai.", "Pesanan", JOptionPane.INFORMATION_MESSAGE);
            } else {
                order.setBeratCucianBaju(Double.parseDouble(inpBeratPakaian.getText()));
                LogicKeranjang keranjang = new LogicKeranjang();

                order.setTotalHarga(keranjang.updateHarga(order));

                order.setNamaPelanggan(inpNama.getText());
                order.setNomorTeleponPelanggan(inpNoTelp.getText());
                order.setStatusOrderan(cmbStatus.getSelectedItem().toString());

                lblHarga.setText("" + order.getTotalHarga());

                JOptionPane.showMessageDialog(this,
                        "Pesanan atas nama "
                        + order.getNamaPelanggan() + " telah selesai.", "Pesanan", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnProsesActionPerformed

    private void tampilData() {
        if (order.getBeratCucianBaju() == 0 && order.getJenisCuciBaju() == null) {
            inpBeratPakaian.setText("-");
            lblTipeCuciBaju.setText("-");
            lblLamaPengerjaanBaju.setText("-");
        } else {
            inpBeratPakaian.setText("" + order.getBeratCucianBaju());
            lblTipeCuciBaju.setText(order.getJenisCuciBaju());
            lblLamaPengerjaanBaju.setText("" + order.getWaktuPengerjaanBaju());
        }

        if (order.getJumlahCucianSelimut() == 0) {
            inpJumlahSelimut.setText("-");
            lblTipeCuciSelimut.setText("-");
            lblLamaPengerjaanSelimut.setText("-");
        } else {
            inpJumlahSelimut.setText("" + order.getJumlahCucianSelimut());
            lblTipeCuciSelimut.setText(order.getJenisCuciSelimut());
            lblLamaPengerjaanSelimut.setText("" + order.getWaktuPengerjaanSelimut());
        }

        if (order.getJumlahCucianSepatu() == 0) {
            inpJumlahSepatu.setText("-");
            lblShoesDuration.setText("-");
        } else {
            inpJumlahSepatu.setText("" + order.getJumlahCucianSepatu());
            lblShoesDuration.setText("" + order.getWaktuPengerjaanSepatu());
        }

        if (order.getJumlahCucianKarpet() == 0) {
            inpJumlahKarpet.setText("-");
            lblCarpetDuration.setText("-");
        } else {
            inpJumlahKarpet.setText("" + order.getJumlahCucianKarpet());
            lblCarpetDuration.setText("" + order.getWaktuPengerjaanKarpet());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnProses;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JTextField inpAlamat;
    private javax.swing.JTextField inpBeratPakaian;
    private javax.swing.JTextField inpJumlahKarpet;
    private javax.swing.JTextField inpJumlahSelimut;
    private javax.swing.JTextField inpJumlahSepatu;
    private javax.swing.JTextField inpNama;
    private javax.swing.JTextField inpNoTelp;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCarpetDuration;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblLamaPengerjaanBaju;
    private javax.swing.JLabel lblLamaPengerjaanSelimut;
    private javax.swing.JLabel lblShoesDuration;
    private javax.swing.JLabel lblTipeCuciBaju;
    private javax.swing.JLabel lblTipeCuciSelimut;
    // End of variables declaration//GEN-END:variables
}
