package View;

import Controller.*;
import Logic.*;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class OrderStatus extends ViewController {

    public OrderStatus() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_detail = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "No. Telepon", "Status Pesanan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 90, 530, 300);

        btn_detail.setBackground(new java.awt.Color(0,0,0,0));
        btn_detail.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        btn_detail.setForeground(new java.awt.Color(240, 240, 240));
        btn_detail.setText("Detail");
        btn_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detailActionPerformed(evt);
            }
        });
        getContentPane().add(btn_detail);
        btn_detail.setBounds(655, 440, 120, 33);

        btn_kembali.setBackground(new java.awt.Color(0,0,0,0));
        btn_kembali.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        btn_kembali.setForeground(new java.awt.Color(240, 240, 240));
        btn_kembali.setText("Kembali");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kembali);
        btn_kembali.setBounds(394, 440, 118, 33);

        btn_hapus.setBackground(new java.awt.Color(0,0,0,0));
        btn_hapus.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        btn_hapus.setForeground(new java.awt.Color(240, 240, 240));
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus);
        btn_hapus.setBounds(525, 440, 118, 33);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/orderList.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 490);

        setSize(new java.awt.Dimension(801, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detailActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int selectedRow = table.getSelectedRow();

        if (selectedRow != -1) {
            Order order = getOrderController().getOrder(selectedRow);
            openFrame(new OrderDetail(order));
        }
    }//GEN-LAST:event_btn_detailActionPerformed

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        openFrame("dashboard");
    }//GEN-LAST:event_btn_kembaliActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int selectedRow = table.getSelectedRow();
        int result = JOptionPane.showConfirmDialog(null,
                "Yakin ingin hapus?", null, JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION && selectedRow != -1) {
            getOrderController().hapusOrder(selectedRow);
            model.removeRow(selectedRow);
            model.fireTableDataChanged();
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void menampilkanTabel() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        for (int i = 0; i < getOrderController().getOrderSize(); i++) {
            boolean statusPesanan = getOrderController().getOrder(i).isStatusOrderan();
            String statusText = statusPesanan ? "Sudah" : "Belum";

            model.addRow(new Object[]{
                getOrderController().getOrder(i).getNamaPelanggan(),
                getOrderController().getOrder(i).getNomorTeleponPelanggan(),
                statusText,});
        }
    }

    public void afterOpen() {
        menampilkanTabel();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_detail;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
