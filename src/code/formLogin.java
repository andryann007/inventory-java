package code;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Andryan
 */
public class formLogin extends javax.swing.JFrame {

    clsLogin objLogin = new clsLogin();
    formDashboard dashboard = new formDashboard();
    
    public formLogin() {
        initComponents();
        objLogin.Access();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        secondPanel = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Inventory Toko Sukses");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstPanel.setBackground(new java.awt.Color(0, 0, 0));
        firstPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout firstPanelLayout = new javax.swing.GroupLayout(firstPanel);
        firstPanel.setLayout(firstPanelLayout);
        firstPanelLayout.setHorizontalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        firstPanelLayout.setVerticalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(firstPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 450));

        secondPanel.setBackground(new java.awt.Color(255, 255, 255));
        secondPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelLogin.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        labelLogin.setText("Login Menu");

        labelEmail.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelEmail.setText("Email :");

        txtEmail.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        labelPassword.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelPassword.setText("Password :");

        txtPassword.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right-to-bracket-solid.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circle-xmark-solid (1).png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setPreferredSize(new java.awt.Dimension(36, 36));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout secondPanelLayout = new javax.swing.GroupLayout(secondPanel);
        secondPanel.setLayout(secondPanelLayout);
        secondPanelLayout.setHorizontalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(secondPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(labelLogin))
                    .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(secondPanelLayout.createSequentialGroup()
                            .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelPassword)
                                .addComponent(labelEmail))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmail)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        secondPanelLayout.setVerticalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(labelLogin)
                .addGap(40, 40, 40)
                .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        getContentPane().add(secondPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 510, 450));

        setSize(new java.awt.Dimension(1004, 442));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            if(txtEmail.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Masukkan Email!!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtEmail.requestFocus();
            }
            else
            {
                txtPassword.requestFocus();
            }
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            if(txtPassword.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Masukkan Password!!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtPassword.requestFocus();
            }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try
        {
            objLogin.Access();
            objLogin.mEmail = txtEmail.getText();
            objLogin.mPassword = txtPassword.getText();
            objLogin.confirmUser();
            objLogin.sql = "select * from data_user where email = '" + txtEmail.getText() + "' and password = '" + txtPassword.getText() + "'";
            Statement stat = objLogin.conn.createStatement();
            ResultSet res = stat.executeQuery(objLogin.sql);
            res.last();
          
            int i = res.getRow();
            if(i>0)
            {
                formDashboard dashboard = new formDashboard();
                txtEmail.setText("");
                txtPassword.setText("");
                dashboard.txtNamaPengguna.setText("Halo, " + (res.getString(2).toUpperCase()));
                dispose();
                
                dashboard.setVisible(true);
                
                JOptionPane.showMessageDialog(null, "Berhasil login !!!");
            }
          
            else if(i==0)
            {
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan !!!");
                System.out.println();
            }
            stat.close();
            //dispose();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Tidak bisa login, Coba Lagi Nanti !!!");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        dispose();
    }//GEN-LAST:event_btnExitMouseClicked

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
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel secondPanel;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
