package LaundryApplication;

import Source.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainMenu extends javax.swing.JFrame {
    private ListTransactions listTrans;
    
    public MainMenu() {
        initComponents();
        
        listTrans = new ListTransactions();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_goToLogin = new javax.swing.JButton();
        btn_goToPemesanan = new javax.swing.JButton();
        btn_goToCek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Plystarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        btn_goToLogin.setText("Login Admin");
        btn_goToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goToLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_goToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 200, 30));

        btn_goToPemesanan.setText("Pemesanan");
        btn_goToPemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goToPemesananActionPerformed(evt);
            }
        });
        jPanel1.add(btn_goToPemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 30));

        btn_goToCek.setText("Cek Pesanan");
        btn_goToCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goToCekActionPerformed(evt);
            }
        });
        jPanel1.add(btn_goToCek, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 200, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(273, 305));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_goToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goToLoginActionPerformed
        LoginAdmin admin = new LoginAdmin(listTrans);
        admin.setVisible(true);
    }//GEN-LAST:event_btn_goToLoginActionPerformed

    private void btn_goToPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goToPemesananActionPerformed
        CustomerMenu custMen = new CustomerMenu();
        custMen.setListTransactions(listTrans);
        custMen.setVisible(true);
        custMen.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosed(WindowEvent e) {
                setVisible(true);
            }
        
        });
    }//GEN-LAST:event_btn_goToPemesananActionPerformed

    private void btn_goToCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goToCekActionPerformed
        OrderSearchMenu searcher = new OrderSearchMenu(listTrans);
        searcher.setVisible(true);
    }//GEN-LAST:event_btn_goToCekActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_goToCek;
    private javax.swing.JButton btn_goToLogin;
    private javax.swing.JButton btn_goToPemesanan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
