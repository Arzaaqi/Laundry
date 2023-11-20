package LaundryApplication;

import Source.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminMenu extends javax.swing.JFrame {
    private ListTransactions listTransactions;
    
    public AdminMenu(ListTransactions listTransactions) {
        initComponents();
    
        this.listTransactions = listTransactions;
        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        bacToMainMenu_btn = new javax.swing.JButton();
        test = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Daftar Pesanan");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 20, 170, 23);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "No. Telepon", "Status Pembayaran"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 360, 310);

        bacToMainMenu_btn.setText("Kembali");
        bacToMainMenu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bacToMainMenu_btnActionPerformed(evt);
            }
        });
        jPanel1.add(bacToMainMenu_btn);
        bacToMainMenu_btn.setBounds(150, 430, 90, 30);
        jPanel1.add(test);
        test.setBounds(300, 420, 0, 0);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(415, 525));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
    }//GEN-LAST:event_TableMouseClicked

    private void TableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMousePressed

    }//GEN-LAST:event_TableMousePressed

    private void bacToMainMenu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bacToMainMenu_btnActionPerformed
        dispose();
    }//GEN-LAST:event_bacToMainMenu_btnActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel)Table.getModel();    

        // Dapatkan data transaksi dari objek ListTransactions dan tambahkan ke tabel
        for (int i = 0; i < listTransactions.getTransactionCount(); i++) {
            boolean status = listTransactions.getTransaction(i).isStatus();
            String statusText = status ? "Sudah" : "Belum";

            model.addRow(new Object[] {
                listTransactions.getTransaction(i).getCustomer().getName(),
                listTransactions.getTransaction(i).getCustomer().getPhoneNumber(),
                statusText
            });
        }

        Table.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // Double-click event
                    int selectedRow = Table.getSelectedRow();

                    ReservationDetail detail = new ReservationDetail(
                            listTransactions.getTransaction(selectedRow), AdminMenu.this);
                    detail.setVisible(true);
                }
            }
        });
    }



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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton bacToMainMenu_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel test;
    // End of variables declaration//GEN-END:variables
}
