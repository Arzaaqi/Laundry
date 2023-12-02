package View;

import Controller.*;
import Logic.Order;

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_telepon = new javax.swing.JLabel();
        txt_nama = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_detail = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Detail");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(680, 446, 60, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
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

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Tugas\\Semester 3\\Pemrograman Berorientasi Objek\\Laundry\\src\\Image\\status_order_cs.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 788, 490);

        btn_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detailActionPerformed(evt);
            }
        });
        getContentPane().add(btn_detail);
        btn_detail.setBounds(665, 443, 100, 30);

        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kembali);
        btn_kembali.setBounds(525, 443, 110, 30);

        setSize(new java.awt.Dimension(799, 497));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        openFrame("dashboard_customer");
    }//GEN-LAST:event_btn_kembaliActionPerformed

    private void btn_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detailActionPerformed
          DefaultTableModel model = (DefaultTableModel) tabel.getModel();
        int selectedRow = tabel.getSelectedRow();
        
        if(selectedRow != -1){
            Order order = getOrderController().getOrder(selectedRow);
            openFrame(new OrderDetailCustomer(order));
        }
        
    }//GEN-LAST:event_btn_detailActionPerformed

    public void menampilkanTabel() {
        DefaultTableModel model = (DefaultTableModel) tabel.getModel();
        System.out.println("halo");
        for (int i = 0; i < getOrderController().getOrderSize(); i++) {

            if (getOrderController().getOrder(i).getNamaPelanggan().equals(getUserController().getCurrentUser().getName())
                    && getOrderController().getOrder(i).getNomorTeleponPelanggan().equals(getUserController().getCurrentUser().getPhoneNumber())) {

                boolean statusPesanan = getOrderController().getOrder(i).isStatusOrderan();
                String statusText = statusPesanan ? "Sudah" : "Belum";
                if (getOrderController().getOrder(i).getBeratCucianBaju() == 0
                        && getOrderController().getOrder(i).getJenisCuciBaju() != null) {
                    model.addRow(new Object[]{
                        getUserController().getCurrentUser().getName(),
                        "Sedang dihitung",
                        statusText,});
                } else {
                model.addRow(new Object[]{
                    getUserController().getCurrentUser().getName(),
                    getOrderController().getOrder(i).getTotalHarga(),
                    statusText,});
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
    private javax.swing.JButton btn_detail;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    private javax.swing.JLabel txt_nama;
    private javax.swing.JLabel txt_telepon;
    // End of variables declaration//GEN-END:variables
}
