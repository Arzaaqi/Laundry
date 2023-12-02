package View;

import Controller.*;

public class Register extends ViewController {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputUsername = new javax.swing.JTextField();
        inputNomorhp = new javax.swing.JTextField();
        btnRegist = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        inputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(inputUsername);
        inputUsername.setBounds(330, 280, 140, 22);
        getContentPane().add(inputNomorhp);
        inputNomorhp.setBounds(330, 330, 140, 20);

        btnRegist.setText("Regist");
        btnRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegist);
        btnRegist.setBounds(480, 400, 72, 23);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(250, 400, 72, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Tugas\\Semester 3\\Pemrograman Berorientasi Objek\\Laundry\\src\\Image\\register.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 790, 490);

        setSize(new java.awt.Dimension(804, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsernameActionPerformed

    }//GEN-LAST:event_inputUsernameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        openFrame("login");
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistActionPerformed
        getUserController().addCustomer(inputUsername.getText(), inputNomorhp.getText());
        openFrame("login");
    }//GEN-LAST:event_btnRegistActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegist;
    private javax.swing.JTextField inputNomorhp;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
