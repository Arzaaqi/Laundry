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
        inpNoTelp = new javax.swing.JTextField();
        inpBeratPakaian = new javax.swing.JTextField();
        inpJumlahSepatu = new javax.swing.JTextField();
        inpJumlahSelimut = new javax.swing.JTextField();
        inpJumlahKarpet = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnProses = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        lblCarpetDuration.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        lblCarpetDuration.setText("12");
        getContentPane().add(lblCarpetDuration);
        lblCarpetDuration.setBounds(420, 580, 190, 26);

        lblShoesDuration.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        lblShoesDuration.setText("2");
        getContentPane().add(lblShoesDuration);
        lblShoesDuration.setBounds(110, 586, 190, 20);

        lblTipeCuciSelimut.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        lblTipeCuciSelimut.setText("Setrika");
        getContentPane().add(lblTipeCuciSelimut);
        lblTipeCuciSelimut.setBounds(480, 430, 130, 20);

        lblLamaPengerjaanSelimut.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        lblLamaPengerjaanSelimut.setText("12");
        getContentPane().add(lblLamaPengerjaanSelimut);
        lblLamaPengerjaanSelimut.setBounds(470, 456, 140, 20);

        lblTipeCuciBaju.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        lblTipeCuciBaju.setText("Setrika");
        getContentPane().add(lblTipeCuciBaju);
        lblTipeCuciBaju.setBounds(150, 430, 150, 26);

        lblLamaPengerjaanBaju.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        lblLamaPengerjaanBaju.setText("1");
        getContentPane().add(lblLamaPengerjaanBaju);
        lblLamaPengerjaanBaju.setBounds(150, 460, 150, 30);
        getContentPane().add(inpNama);
        inpNama.setBounds(260, 185, 260, 25);
        getContentPane().add(inpAlamat);
        inpAlamat.setBounds(260, 245, 260, 25);

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belum Selesai", "Selesai", "" }));
        getContentPane().add(cmbStatus);
        cmbStatus.setBounds(260, 300, 140, 22);
        getContentPane().add(inpNoTelp);
        inpNoTelp.setBounds(260, 215, 260, 25);
        getContentPane().add(inpBeratPakaian);
        inpBeratPakaian.setBounds(180, 392, 130, 30);
        getContentPane().add(inpJumlahSepatu);
        inpJumlahSepatu.setBounds(170, 550, 132, 30);
        getContentPane().add(inpJumlahSelimut);
        inpJumlahSelimut.setBounds(490, 390, 120, 30);
        getContentPane().add(inpJumlahKarpet);
        inpJumlahKarpet.setBounds(470, 550, 140, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Proses");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 646, 60, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kembali");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(407, 646, 70, 30);

        lblHarga.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        lblHarga.setForeground(new java.awt.Color(240, 240, 240));
        lblHarga.setText("Rp");
        getContentPane().add(lblHarga);
        lblHarga.setBounds(260, 275, 260, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/orderDetail.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 650, 700);

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
        btnProses.setBounds(520, 650, 100, 30);

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
        btnKembali.setBounds(390, 650, 100, 30);

        setSize(new java.awt.Dimension(662, 732));
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
            if (order.getOrderItems().isEmpty()) {
                order.setNamaPelanggan(inpNama.getText());
                order.setNomorTeleponPelanggan(inpNoTelp.getText());
                order.setStatusOrderan(cmbStatus.getSelectedItem().toString());

                JOptionPane.showMessageDialog(this,
                        "Pesanan atas nama "
                        + order.getNamaPelanggan() + " telah selesai.", "Pesanan", JOptionPane.INFORMATION_MESSAGE);
            } else {
                order.getOrderItems().forEach(item -> {
                    if (item.getItemType() == ItemType.PAKAIAN) {
                        item.setBerat(Double.parseDouble(inpBeratPakaian.getText()));
                    }
                });

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
        order.getOrderItems().forEach(item -> {
            switch (item.getItemType()) {
                case PAKAIAN:
                    inpBeratPakaian.setText(String.valueOf(item.getBerat()));
                    lblTipeCuciBaju.setText(item.getJenisCuci());
                    lblLamaPengerjaanBaju.setText(item.getWaktuPengerjaan());
                    break;
                case SELIMUT:
                    inpJumlahSelimut.setText(String.valueOf(item.getJumlah()));
                    lblTipeCuciSelimut.setText(item.getJenisCuci());
                    lblLamaPengerjaanSelimut.setText(item.getWaktuPengerjaan());
                    break;
                case SEPATU:
                    inpJumlahSepatu.setText(String.valueOf(item.getJumlah()));
                    lblShoesDuration.setText(item.getWaktuPengerjaan());
                    break;
                case KARPET:
                    inpJumlahKarpet.setText(String.valueOf(item.getJumlah()));
                    lblCarpetDuration.setText(item.getWaktuPengerjaan());
                    break;
            }
        });
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
