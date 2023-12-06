package View;

import Controller.*;
import Logic.ItemType;
import Logic.KalkulatorHarga;
import Logic.Order;
import Logic.OrderItem;

import javax.swing.table.DefaultTableModel;

public class OrderStatusCustomer extends ViewController {

    public OrderStatusCustomer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt_telepon = new javax.swing.JLabel();
        txt_nama = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDetail = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Harga", "Status"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 180, 452, 250);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Kembali");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(550, 446, 70, 20);

        txt_telepon.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txt_telepon.setText("Telepon");
        getContentPane().add(txt_telepon);
        txt_telepon.setBounds(350, 140, 210, 40);

        txt_nama.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txt_nama.setText("Nama");
        getContentPane().add(txt_nama);
        txt_nama.setBounds(350, 110, 220, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Detail");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(690, 446, 50, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/status_order_cs.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 490);

        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });
        getContentPane().add(btnDetail);
        btnDetail.setBounds(655, 443, 120, 30);

        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali);
        btnKembali.setBounds(525, 443, 110, 30);

        setSize(new java.awt.Dimension(801, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        openFrame("dashboard_customer");
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabel.getModel();
        int selectedRow = tabel.getSelectedRow();

        if (selectedRow != -1) {
            Order order = getOrderController().getOrder(selectedRow);
            openFrame(new OrderDetailCustomer(order));
        }

    }//GEN-LAST:event_btnDetailActionPerformed

    public void menampilkanTabel() {
        DefaultTableModel model = (DefaultTableModel) tabel.getModel();
        System.out.println("halo");

        for (int i = 0; i < getOrderController().getOrderSize(); i++) {
            Order currentOrder = getOrderController().getOrder(i);

            if (currentOrder.getNamaPelanggan().equals(getUserController().getCurrentUser().getName())
                    && currentOrder.getNomorTeleponPelanggan().equals(getUserController().getCurrentUser().getPhoneNumber())) {

                boolean statusPesanan = currentOrder.isStatusOrderan();
                String statusText = statusPesanan ? "Sudah" : "Belum";

                boolean pakaiItemFound = false;

                for (OrderItem item : currentOrder.getOrderItems()) {
                    if (item.getBerat() == 0 && item.getJenisCuci() != null && item.getItemType() == ItemType.PAKAIAN) {
                        pakaiItemFound = true;
                        break;
                    }
                }

                if (pakaiItemFound) {
                    model.addRow(new Object[]{
                        getUserController().getCurrentUser().getName(),
                        "Sedang dihitung",
                        statusText
                    });
                } else {
                    double totalHarga = currentOrder.getTotalHarga();
                    model.addRow(new Object[]{
                        getUserController().getCurrentUser().getName(),
                        totalHarga,
                        statusText
                    });
                }
            }
        }

        txt_nama.setText(getUserController().getCurrentUser().getName());
        txt_telepon.setText(getUserController().getCurrentUser().getPhoneNumber());
    }

    public void afterOpen() {
        menampilkanTabel();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    private javax.swing.JLabel txt_nama;
    private javax.swing.JLabel txt_telepon;
    // End of variables declaration//GEN-END:variables
}
