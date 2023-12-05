package View;

import Controller.*;
import Logic.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class ViewKeranjang extends ViewController {

    public LogicKeranjang keranjang;

    public ViewKeranjang(LogicKeranjang keranjang) {
        initComponents();
        javax.swing.text.Document doc = inpNomor.getDocument();
        if (doc instanceof javax.swing.text.AbstractDocument) {
            ((javax.swing.text.AbstractDocument) doc).setDocumentFilter(new NumericFilter());
        }
        this.keranjang = keranjang;
        menampilkanTabel();

        inpTotalHarga.setText("" + keranjang.getTotalHarga());
    }

    private void menampilkanTabel() {

        DefaultTableModel model1 = (DefaultTableModel) tblKeranjangPakain.getModel();
        model1.addRow(new Object[]{keranjang.getBeratCucianPakaian(), keranjang.getJenisCuciPakaian(), keranjang.getWaktuPengerjaanPakaian()});

        DefaultTableModel model2 = (DefaultTableModel) tblKeranjangSepatu.getModel();
        model2.addRow(new Object[]{keranjang.getJumlahCucianSepatu(), keranjang.getWaktuPengerjaanSepatu()});

        DefaultTableModel model3 = (DefaultTableModel) tblKeranjangSelimut.getModel();
        model3.addRow(new Object[]{keranjang.getJumlahCucianSelimut(), keranjang.getJenisCuciSelimut(), keranjang.getWaktuPengerjaanSelimut()});

        DefaultTableModel model4 = (DefaultTableModel) tblKeranjangKarpet.getModel();
        model4.addRow(new Object[]{keranjang.getJumlahCucianKarpet(), keranjang.getWaktuPengerjaanKarpet()});

    }

    private static class NumericFilter extends DocumentFilter {

        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                throws BadLocationException {
            if (string.matches("\\d+")) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                throws BadLocationException {
            if (text.matches("\\d+")) {
                super.replace(fb, offset, length, text, attrs);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKeranjangPakain = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblKeranjangSepatu = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblKeranjangSelimut = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblKeranjangKarpet = new javax.swing.JTable();
        inpAlamat = new javax.swing.JTextField();
        inpNama = new javax.swing.JTextField();
        inpNomor = new javax.swing.JTextField();
        inpTotalHarga = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        btnPesan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(102, 51, 255));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        tblKeranjangPakain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Berat", "Jenis Cucian", "Waktu Pengerjaan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblKeranjangPakain);
        if (tblKeranjangPakain.getColumnModel().getColumnCount() > 0) {
            tblKeranjangPakain.getColumnModel().getColumn(0).setResizable(false);
            tblKeranjangPakain.getColumnModel().getColumn(1).setResizable(false);
            tblKeranjangPakain.getColumnModel().getColumn(2).setResizable(false);
        }

        jTabbedPane1.addTab("Pakaian", jScrollPane2);

        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));

        tblKeranjangSepatu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jumlah", "Jenis Pengerjaan"
            }
        ));
        jScrollPane4.setViewportView(tblKeranjangSepatu);
        if (tblKeranjangSepatu.getColumnModel().getColumnCount() > 0) {
            tblKeranjangSepatu.getColumnModel().getColumn(0).setResizable(false);
            tblKeranjangSepatu.getColumnModel().getColumn(1).setResizable(false);
        }

        jTabbedPane1.addTab("Sepatu", jScrollPane4);

        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));

        tblKeranjangSelimut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jumlah", "Jenis Cucian", "Waktu Pengerjaan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblKeranjangSelimut);
        if (tblKeranjangSelimut.getColumnModel().getColumnCount() > 0) {
            tblKeranjangSelimut.getColumnModel().getColumn(0).setResizable(false);
            tblKeranjangSelimut.getColumnModel().getColumn(1).setResizable(false);
            tblKeranjangSelimut.getColumnModel().getColumn(2).setResizable(false);
        }

        jTabbedPane1.addTab("Selimut", jScrollPane3);

        jScrollPane5.setForeground(new java.awt.Color(255, 255, 255));

        tblKeranjangKarpet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jumlah", "Jenis Pengerjaan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblKeranjangKarpet);
        if (tblKeranjangKarpet.getColumnModel().getColumnCount() > 0) {
            tblKeranjangKarpet.getColumnModel().getColumn(0).setResizable(false);
            tblKeranjangKarpet.getColumnModel().getColumn(1).setResizable(false);
        }

        jTabbedPane1.addTab("Karpet", jScrollPane5);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(100, 210, 600, 160);

        inpAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpAlamatActionPerformed(evt);
            }
        });
        getContentPane().add(inpAlamat);
        inpAlamat.setBounds(280, 170, 270, 25);
        getContentPane().add(inpNama);
        inpNama.setBounds(280, 100, 270, 25);
        getContentPane().add(inpNomor);
        inpNomor.setBounds(280, 135, 270, 25);

        inpTotalHarga.setEnabled(false);
        getContentPane().add(inpTotalHarga);
        inpTotalHarga.setBounds(340, 385, 160, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Keranjang.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 480);

        btnKembali.setText("kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali);
        btnKembali.setBounds(20, 420, 120, 30);

        btnPesan.setText("Pesan");
        btnPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesanActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesan);
        btnPesan.setBounds(645, 420, 120, 30);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus);
        btnHapus.setBounds(505, 420, 130, 30);

        setSize(new java.awt.Dimension(802, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanActionPerformed
        if (inpNama.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nama Pelanggan Harus Diisi!",
                    "Nama", JOptionPane.WARNING_MESSAGE);
        } else if (inpNomor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nomor Telepon Harus Diisi!",
                    "Nomor", JOptionPane.WARNING_MESSAGE);
        } else if (inpAlamat.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Alamat Pelanggan Harus Diisi!",
                    "Alamat", JOptionPane.WARNING_MESSAGE);
        } else if (keranjang.getJenisCuciPakaian() == null && keranjang.getJenisCuciSelimut() == null
                && keranjang.getJumlahCucianSepatu() == 0 && keranjang.getJumlahCucianKarpet() == 0) {
            JOptionPane.showMessageDialog(this, "Tidak ada Pesanan!",
                    "Pesanan Kosong", JOptionPane.WARNING_MESSAGE);
        } else {
            getOrderController().buatOrder(inpNama.getText(), inpNomor.getText(), inpAlamat.getText());
            getOrderController().addItemToOrder("Pakaian", keranjang.getBeratCucianPakaian(), keranjang.getJenisCuciPakaian(), keranjang.getWaktuPengerjaanPakaian(), 0);
            getOrderController().addItemToOrder("Selimut", 0, keranjang.getJenisCuciSelimut(), keranjang.getWaktuPengerjaanSelimut(), keranjang.getJumlahCucianSelimut());
            getOrderController().addItemToOrder("Sepatu", 0, null, keranjang.getWaktuPengerjaanSepatu(), keranjang.getJumlahCucianSepatu());
            getOrderController().addItemToOrder("Karpet", 0, null, keranjang.getWaktuPengerjaanKarpet(), keranjang.getJumlahCucianKarpet());
            getOrderController().addHarga(keranjang.getTotalHarga());
            getOrderController().addOrder();
            getUserController().addCustomer(inpNama.getText(), inpNomor.getText());
            JOptionPane.showMessageDialog(this, "Berhasil Memesan", "Pesan", JOptionPane.INFORMATION_MESSAGE);

            openFrame("menu_item");
            this.dispose();
            
        }
        
    }//GEN-LAST:event_btnPesanActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        openFrame("menu_item");
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed

        DefaultTableModel modell = (DefaultTableModel) tblKeranjangPakain.getModel();
        DefaultTableModel model2 = (DefaultTableModel) tblKeranjangSepatu.getModel();
        DefaultTableModel model3 = (DefaultTableModel) tblKeranjangSelimut.getModel();
        DefaultTableModel model4 = (DefaultTableModel) tblKeranjangKarpet.getModel();

        int selectedRow1 = tblKeranjangPakain.getSelectedRow();
        int selectedRow2 = tblKeranjangSepatu.getSelectedRow();
        int selectedRow3 = tblKeranjangSelimut.getSelectedRow();
        int selectedRow4 = tblKeranjangKarpet.getSelectedRow();

        if (selectedRow1 != -1) {
            keranjang.setBeratCucianPakaian(0);
            keranjang.setJenisCuciPakaian(null);
            keranjang.setWaktuPengerjaanPakaian(null);
            modell.removeRow(selectedRow1);
            modell.fireTableDataChanged();
        } else if (selectedRow2 != -1) {
            keranjang.setJumlahCucianSepatu(0);
            keranjang.setWaktuPengerjaanSepatu(null);
            model2.removeRow(selectedRow2);
            model2.fireTableDataChanged();
        } else if (selectedRow3 != -1) {
            keranjang.setJumlahCucianSelimut(0);
            keranjang.setJenisCuciSelimut(null);
            keranjang.setWaktuPengerjaanSelimut(null);
            model3.removeRow(selectedRow3);
            model3.fireTableDataChanged();
        } else if (selectedRow4 != -1) {
            keranjang.setJumlahCucianKarpet(0);
            keranjang.setWaktuPengerjaanKarpet(null);
            model4.removeRow(selectedRow4);
            model4.fireTableDataChanged();
        } else {
            JOptionPane.showMessageDialog(this, "Kesalahan",
                    "Hapus", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void inpAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpAlamatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnPesan;
    private javax.swing.JTextField inpAlamat;
    private javax.swing.JTextField inpNama;
    private javax.swing.JTextField inpNomor;
    private javax.swing.JTextField inpTotalHarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblKeranjangKarpet;
    private javax.swing.JTable tblKeranjangPakain;
    private javax.swing.JTable tblKeranjangSelimut;
    private javax.swing.JTable tblKeranjangSepatu;
    // End of variables declaration//GEN-END:variables
}
