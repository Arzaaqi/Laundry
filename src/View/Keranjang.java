/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class Keranjang extends javax.swing.JDialog {

    public Keranjang(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        javax.swing.text.Document doc = inpNomor.getDocument();
        if (doc instanceof javax.swing.text.AbstractDocument) {
            ((javax.swing.text.AbstractDocument) doc).setDocumentFilter(new NumericFilter());
        }
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
        jScrollPane3 = new javax.swing.JScrollPane();
        tblKeranjangSelimut = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblKeranjangSepatu = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblKeranjangKarpet = new javax.swing.JTable();
        inpNama = new javax.swing.JTextField();
        inpNomor = new javax.swing.JTextField();
        inpTotalHarga = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        btnPesan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        jTabbedPane1.setBounds(100, 180, 600, 190);
        getContentPane().add(inpNama);
        inpNama.setBounds(280, 105, 270, 25);
        getContentPane().add(inpNomor);
        inpNomor.setBounds(280, 140, 270, 25);

        inpTotalHarga.setEnabled(false);
        getContentPane().add(inpTotalHarga);
        inpTotalHarga.setBounds(340, 385, 160, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Kuliah 2023\\OOP\\UAS_Laundry\\src\\Image\\Keranjang.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 480);

        btnKembali.setText("kembali");
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
        getContentPane().add(btnHapus);
        btnHapus.setBounds(505, 420, 130, 30);

        setSize(new java.awt.Dimension(802, 517));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanActionPerformed
        if (inpNama.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nama Harus Diisi!",
                    "Nama", JOptionPane.WARNING_MESSAGE);
        } else if (inpNomor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nomor Harus Diisi!",
                    "Nomor", JOptionPane.WARNING_MESSAGE);
        } else {
            
        }
    }//GEN-LAST:event_btnPesanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Keranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Keranjang dialog = new Keranjang(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnPesan;
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
