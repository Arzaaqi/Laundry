/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author 62811
 */
public class OrderDetail extends javax.swing.JFrame {

    /**
     * Creates new form OrderDetail
     */
    public OrderDetail() {
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        lblCarpetTotal = new javax.swing.JLabel();
        lblCarpetDuration = new javax.swing.JLabel();
        lblShoesTotal = new javax.swing.JLabel();
        lblShoesDuration = new javax.swing.JLabel();
        lblBlanketWeight = new javax.swing.JLabel();
        lblBlanketWashType = new javax.swing.JLabel();
        lblBlanketDuration = new javax.swing.JLabel();
        lblClothesWeight = new javax.swing.JLabel();
        lblClothesWashType = new javax.swing.JLabel();
        lblClothesDuration = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNoTelp = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnKembali = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton3.setBackground(new java.awt.Color(0, 0, 0, 0)
        );
        jButton3.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(240, 240, 240));
        jButton3.setText("Proses");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(468, 620, 110, 40);
        jButton3.getAccessibleContext().setAccessibleName("Proses");

        lblCarpetTotal.setText("tes");
        getContentPane().add(lblCarpetTotal);
        lblCarpetTotal.setBounds(460, 510, 100, 26);

        lblCarpetDuration.setText("12");
        getContentPane().add(lblCarpetDuration);
        lblCarpetDuration.setBounds(490, 540, 60, 26);

        lblShoesTotal.setText("1");
        getContentPane().add(lblShoesTotal);
        lblShoesTotal.setBounds(150, 520, 127, 26);

        lblShoesDuration.setText("2");
        getContentPane().add(lblShoesDuration);
        lblShoesDuration.setBounds(230, 550, 50, 26);

        lblBlanketWeight.setText("20");
        getContentPane().add(lblBlanketWeight);
        lblBlanketWeight.setBounds(490, 360, 60, 26);

        lblBlanketWashType.setText("Setrika");
        getContentPane().add(lblBlanketWashType);
        lblBlanketWashType.setBounds(470, 390, 80, 26);

        lblBlanketDuration.setText("12");
        getContentPane().add(lblBlanketDuration);
        lblBlanketDuration.setBounds(490, 430, 60, 26);

        lblClothesWeight.setText("20");
        getContentPane().add(lblClothesWeight);
        lblClothesWeight.setBounds(190, 370, 90, 26);

        lblClothesWashType.setText("Setrika");
        getContentPane().add(lblClothesWashType);
        lblClothesWashType.setBounds(190, 400, 90, 26);

        lblClothesDuration.setText("1");
        getContentPane().add(lblClothesDuration);
        lblClothesDuration.setBounds(220, 430, 60, 26);
        getContentPane().add(txtName);
        txtName.setBounds(260, 190, 260, 22);
        getContentPane().add(txtNoTelp);
        txtNoTelp.setBounds(260, 230, 260, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belum Selesai", "Selesaikan", " " }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(260, 270, 150, 22);

        btnKembali.setBackground(new java.awt.Color(0, 0, 0, 0)
        );
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
        btnKembali.setBounds(336, 620, 110, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\Kuliah\\Semester 3\\OOP\\Tugas\\UAS-Project\\Laundry\\img\\ALIF DETAIL PEMESANAN.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 680);

        setSize(new java.awt.Dimension(617, 718));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        OrderStatus orderStatus = new OrderStatus();
        orderStatus.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(OrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBlanketDuration;
    private javax.swing.JLabel lblBlanketWashType;
    private javax.swing.JLabel lblBlanketWeight;
    private javax.swing.JLabel lblCarpetDuration;
    private javax.swing.JLabel lblCarpetTotal;
    private javax.swing.JLabel lblClothesDuration;
    private javax.swing.JLabel lblClothesWashType;
    private javax.swing.JLabel lblClothesWeight;
    private javax.swing.JLabel lblShoesDuration;
    private javax.swing.JLabel lblShoesTotal;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNoTelp;
    // End of variables declaration//GEN-END:variables
}
