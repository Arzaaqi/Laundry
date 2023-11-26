/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Logic.*;
import Controller.*;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 62811
 */
public class OrderStatus extends javax.swing.JFrame {
    private UserController userController; 
    
    /**
     * Creates new form OrderStatus
     */
    public OrderStatus() {
        initComponents();
        tampilkanData();
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
        table = new javax.swing.JTable();
        goToDetail_btn = new javax.swing.JButton();
        goBack_btn = new javax.swing.JButton();
        deleteData_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 90, 530, 300);

        goToDetail_btn.setBackground(new java.awt.Color(0,0,0,0));
        goToDetail_btn.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        goToDetail_btn.setForeground(new java.awt.Color(240, 240, 240));
        goToDetail_btn.setText("Detail");
        goToDetail_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToDetail_btnActionPerformed(evt);
            }
        });
        getContentPane().add(goToDetail_btn);
        goToDetail_btn.setBounds(655, 440, 119, 34);

        goBack_btn.setBackground(new java.awt.Color(0,0,0,0)
        );
        goBack_btn.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        goBack_btn.setForeground(new java.awt.Color(240, 240, 240));
        goBack_btn.setText("Kembali");
        goBack_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBack_btnActionPerformed(evt);
            }
        });
        getContentPane().add(goBack_btn);
        goBack_btn.setBounds(391, 440, 121, 34);

        deleteData_btn.setBackground(new java.awt.Color(0,0,0,0));
        deleteData_btn.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        deleteData_btn.setForeground(new java.awt.Color(240, 240, 240));
        deleteData_btn.setText("Hapus");
        deleteData_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteData_btnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteData_btn);
        deleteData_btn.setBounds(525, 440, 118, 34);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Kuliah\\Semester 3\\OOP\\Tugas\\UAS-Project\\Laundry\\img\\Alin Status Order.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 490);

        setSize(new java.awt.Dimension(801, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tampilkanData(){
        DefaultTableModel model = (DefaultTableModel)table.getModel();    

        for (int i = 0; i < userController.getJumlahUser(); i++) {
            model.addRow(new Object[] {
                userController.getUser(i).getName(),
                userController.getUser(i).getPhoneNumber(),
            });
        }
    }   
    
    private void goToDetail_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToDetail_btnActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int selectedRow = table.getSelectedRow();
        
        if(selectedRow != -1){
            
        }
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setVisible(true);
        dispose();
    }//GEN-LAST:event_goToDetail_btnActionPerformed

    private void goBack_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBack_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goBack_btnActionPerformed

    private void deleteData_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteData_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteData_btnActionPerformed

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
            java.util.logging.Logger.getLogger(OrderStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteData_btn;
    private javax.swing.JButton goBack_btn;
    private javax.swing.JButton goToDetail_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
