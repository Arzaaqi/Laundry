package View;

import javax.swing.JOptionPane;

import Controller.*;
import Logic.*;

public class Login extends ViewController {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputNama = new javax.swing.JTextField();
        inputPassword = new javax.swing.JTextField();
        lblRegist = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRegist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });
        getContentPane().add(inputNama);
        inputNama.setBounds(560, 260, 110, 30);
        getContentPane().add(inputPassword);
        inputPassword.setBounds(560, 320, 110, 30);

        lblRegist.setForeground(new java.awt.Color(255, 255, 255));
        lblRegist.setText("Register?");
        getContentPane().add(lblRegist);
        lblRegist.setBounds(560, 350, 60, 16);

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(670, 390, 72, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 490);

        btnRegist.setText("jButton1");
        btnRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegist);
        btnRegist.setBounds(560, 350, 75, 23);

        setSize(new java.awt.Dimension(801, 525));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed

    }//GEN-LAST:event_inputNamaActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        User user = getUserController().login(inputNama.getText(), inputPassword.getText());

        if (user == null) {
            JOptionPane.showMessageDialog(this, "Email atau password salah!", "Login gagal", JOptionPane.WARNING_MESSAGE);
        } else {
            if (user.getRole().equals("pelanggan")) {
                openFrame("dashboard_customer");
            } else if (user.getRole().equals("pegawai")) {
                openFrame("dashboard");
            } else {
                JOptionPane.showMessageDialog(this, "Role tidak valid", "Login gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistActionPerformed
        openFrame("register");
    }//GEN-LAST:event_btnRegistActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegist;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblRegist;
    // End of variables declaration//GEN-END:variables
}
