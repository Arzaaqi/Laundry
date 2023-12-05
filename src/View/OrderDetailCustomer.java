package View;

import Controller.*;
import Logic.*;

public class OrderDetailCustomer extends ViewController {

    private Order order;

    public OrderDetailCustomer(Order order) {
        initComponents();
        this.order = order;

        txt_nama.setText(order.getNamaPelanggan());
        txt_telepon.setText(order.getNomorTeleponPelanggan());
        txt_harga.setText(" " + order.getTotalHarga());
        txt_alamat.setText(order.getAlamatPelanggan());
        boolean orderStatus = order.isStatusOrderan();
        if (!orderStatus == false) {
            txt_status.setText("Selesai");
        } else {
            txt_status.setText("Belum Selesai");
        }

        viewdetail();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_alamat = new javax.swing.JLabel();
        txt_nama = new javax.swing.JLabel();
        txt_telepon = new javax.swing.JLabel();
        txt_harga = new javax.swing.JLabel();
        txt_status = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_brpakaian = new javax.swing.JLabel();
        txt_jcpakaian = new javax.swing.JLabel();
        txt_pkpakaian = new javax.swing.JLabel();
        txt_jmlsepatu = new javax.swing.JLabel();
        txt_pktsepatu = new javax.swing.JLabel();
        txt_jmlselimut = new javax.swing.JLabel();
        txt_jcselimut = new javax.swing.JLabel();
        txt_pkselimut = new javax.swing.JLabel();
        txt_jmlkarpet = new javax.swing.JLabel();
        txt_pktkarpet = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        txt_alamat.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        txt_alamat.setForeground(new java.awt.Color(255, 255, 255));
        txt_alamat.setText("Alamat");
        getContentPane().add(txt_alamat);
        txt_alamat.setBounds(260, 240, 230, 20);

        txt_nama.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        txt_nama.setForeground(new java.awt.Color(255, 255, 255));
        txt_nama.setText("Nama");
        getContentPane().add(txt_nama);
        txt_nama.setBounds(260, 190, 230, 20);

        txt_telepon.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        txt_telepon.setForeground(new java.awt.Color(255, 255, 255));
        txt_telepon.setText("No.telp");
        getContentPane().add(txt_telepon);
        txt_telepon.setBounds(260, 210, 240, 30);

        txt_harga.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        txt_harga.setForeground(new java.awt.Color(255, 255, 255));
        txt_harga.setText("nama");
        getContentPane().add(txt_harga);
        txt_harga.setBounds(260, 260, 230, 30);

        txt_status.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        txt_status.setForeground(new java.awt.Color(255, 255, 255));
        txt_status.setText("Status");
        getContentPane().add(txt_status);
        txt_status.setBounds(260, 290, 230, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Kembali");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 660, 80, 20);

        txt_brpakaian.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        txt_brpakaian.setText("Berat");
        getContentPane().add(txt_brpakaian);
        txt_brpakaian.setBounds(180, 399, 140, 30);

        txt_jcpakaian.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        txt_jcpakaian.setText("Berat");
        getContentPane().add(txt_jcpakaian);
        txt_jcpakaian.setBounds(150, 430, 170, 30);

        txt_pkpakaian.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        txt_pkpakaian.setText("Berat");
        getContentPane().add(txt_pkpakaian);
        txt_pkpakaian.setBounds(150, 460, 170, 30);

        txt_jmlsepatu.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        txt_jmlsepatu.setText("Berat");
        getContentPane().add(txt_jmlsepatu);
        txt_jmlsepatu.setBounds(170, 550, 100, 30);

        txt_pktsepatu.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        txt_pktsepatu.setText("Berat");
        getContentPane().add(txt_pktsepatu);
        txt_pktsepatu.setBounds(110, 570, 170, 50);

        txt_jmlselimut.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        txt_jmlselimut.setText("Berat");
        getContentPane().add(txt_jmlselimut);
        txt_jmlselimut.setBounds(490, 400, 120, 20);

        txt_jcselimut.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        txt_jcselimut.setText("Berat");
        getContentPane().add(txt_jcselimut);
        txt_jcselimut.setBounds(480, 420, 140, 40);

        txt_pkselimut.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        txt_pkselimut.setText("Berat");
        getContentPane().add(txt_pkselimut);
        txt_pkselimut.setBounds(470, 460, 140, 15);

        txt_jmlkarpet.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        txt_jmlkarpet.setText("Berat");
        getContentPane().add(txt_jmlkarpet);
        txt_jmlkarpet.setBounds(470, 540, 100, 40);

        txt_pktkarpet.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        txt_pktkarpet.setText("Berat");
        getContentPane().add(txt_pktkarpet);
        txt_pktkarpet.setBounds(430, 569, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/orderDetailCustomer.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 700);

        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kembali);
        btn_kembali.setBounds(270, 650, 100, 40);

        setSize(new java.awt.Dimension(663, 735));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void viewdetail() {
        for (OrderItem item : order.getOrderItems()) {
            switch (item.getItemType()) {
                case PAKAIAN:
                    if (item.getBerat() == 0 && item.getJenisCuci() == null) {
                        txt_brpakaian.setText("-");
                        txt_jcpakaian.setText("-");
                        txt_pkpakaian.setText("-");
                    } else {
                        txt_brpakaian.setText("" + item.getBerat());
                        txt_jcpakaian.setText(item.getJenisCuci());
                        txt_pkpakaian.setText("" + item.getWaktuPengerjaan());
                    }
                    break;
                case SELIMUT:
                    if (item.getJumlah() == 0) {
                        txt_jmlselimut.setText("-");
                        txt_jcselimut.setText("-");
                        txt_pkselimut.setText("-");
                    } else {
                        txt_jmlselimut.setText("" + item.getJumlah());
                        txt_jcselimut.setText(item.getJenisCuci());
                        txt_pkselimut.setText("" + item.getWaktuPengerjaan());
                    }
                    break;
                case SEPATU:
                    if (item.getJumlah() == 0) {
                        txt_jmlsepatu.setText("-");
                        txt_pktsepatu.setText("-");
                    } else {
                        txt_jmlsepatu.setText("" + item.getJumlah());
                        txt_pktsepatu.setText("" + item.getWaktuPengerjaan());
                    }
                    break;
                case KARPET:
                    if (item.getJumlah() == 0) {
                        txt_jmlkarpet.setText("-");
                        txt_pktkarpet.setText("-");
                    } else {
                        txt_jmlkarpet.setText("" + item.getJumlah());
                        txt_pktkarpet.setText("" + item.getWaktuPengerjaan());
                    }
                    break;
            }
        }
    }

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        openFrame("order_status_customer");
    }//GEN-LAST:event_btn_kembaliActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel txt_alamat;
    private javax.swing.JLabel txt_brpakaian;
    private javax.swing.JLabel txt_harga;
    private javax.swing.JLabel txt_jcpakaian;
    private javax.swing.JLabel txt_jcselimut;
    private javax.swing.JLabel txt_jmlkarpet;
    private javax.swing.JLabel txt_jmlselimut;
    private javax.swing.JLabel txt_jmlsepatu;
    private javax.swing.JLabel txt_nama;
    private javax.swing.JLabel txt_pkpakaian;
    private javax.swing.JLabel txt_pkselimut;
    private javax.swing.JLabel txt_pktkarpet;
    private javax.swing.JLabel txt_pktsepatu;
    private javax.swing.JLabel txt_status;
    private javax.swing.JLabel txt_telepon;
    // End of variables declaration//GEN-END:variables
}
