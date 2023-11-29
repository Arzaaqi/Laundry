package View;

import Controller.*;

import javax.swing.table.DefaultTableModel;

public class Orderlist_cs extends ViewController {

    public Orderlist_cs() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_kembali = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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
        jScrollPane1.setBounds(170, 170, 452, 250);

        jLabel2.setFont(new java.awt.Font("Myriad Pro", 1, 15)); // NOI18N
        jLabel2.setText("Kembali");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 430, 60, 30);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel4.setText("Nama pokok");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 110, 80, 20);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel5.setText("no.telepon");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 140, 80, 20);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 490);

        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kembali);
        btn_kembali.setBounds(340, 430, 110, 30);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 140, 38, 16);

        setSize(new java.awt.Dimension(799, 497));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        openFrame("dashboard_customer");
    }//GEN-LAST:event_btn_kembaliActionPerformed

    public void menampilkanTabel() {
        DefaultTableModel model = (DefaultTableModel) tabel.getModel();
        System.out.println("halo");
        for (int i = 0; i < getOrderController().getOrderSize(); i++) {

            if (getOrderController().getOrder(i).getNamaPelanggan().equals(getUserController().getCurrentUser().getName())
                    || getOrderController().getOrder(i).getNomorTeleponPelanggan().equals(getUserController().getCurrentUser().getPhoneNumber())) {

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
        jLabel4.setText(getUserController().getCurrentUser().getName());
    }

    public void afterOpen() {
        menampilkanTabel();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
