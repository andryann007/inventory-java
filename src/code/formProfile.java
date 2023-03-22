package code;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Andryan
 */
public final class formProfile extends javax.swing.JPanel {
    
    public formProfile() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        labelHakAksesUser = new javax.swing.JLabel();
        labelNamaLengkapUser = new javax.swing.JLabel();
        labelEmailUser = new javax.swing.JLabel();
        labelPasswordUser = new javax.swing.JLabel();
        txtNamaLengkapUser = new javax.swing.JLabel();
        txtEmailUser = new javax.swing.JLabel();
        txtHakAksesUser = new javax.swing.JLabel();
        txtPasswordUser = new javax.swing.JPasswordField();
        labelTelpUser = new javax.swing.JLabel();
        txtTelpUser = new javax.swing.JLabel();
        labelAlamatUser = new javax.swing.JLabel();
        txtAlamatUser = new javax.swing.JLabel();
        panelFooter = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        labelTitle.setText("My Profile");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(labelTitle)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addGap(45, 45, 45))
        );

        add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        panelBody.setBackground(new java.awt.Color(255, 255, 255));

        labelHakAksesUser.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelHakAksesUser.setText("Hak Akses :");

        labelNamaLengkapUser.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelNamaLengkapUser.setText("Nama Lengkap :");

        labelEmailUser.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelEmailUser.setText("Email :");

        labelPasswordUser.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelPasswordUser.setText("Password :");

        txtNamaLengkapUser.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        txtEmailUser.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        txtHakAksesUser.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtHakAksesUser.setText("Hak Akses");

        txtPasswordUser.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtPasswordUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordUserActionPerformed(evt);
            }
        });

        labelTelpUser.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelTelpUser.setText("Nomor Telepon :");

        txtTelpUser.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        labelAlamatUser.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelAlamatUser.setText("Alamat :");

        txtAlamatUser.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(labelHakAksesUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtHakAksesUser)
                .addGap(26, 26, 26)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmailUser, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNamaLengkapUser, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailUser)
                            .addComponent(txtNamaLengkapUser)))
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(labelPasswordUser)
                        .addGap(18, 18, 18)
                        .addComponent(txtPasswordUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTelpUser)
                            .addComponent(labelAlamatUser))
                        .addGap(18, 18, 18)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlamatUser)
                            .addComponent(txtTelpUser))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamaLengkapUser)
                    .addComponent(txtNamaLengkapUser))
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailUser)
                    .addComponent(txtEmailUser))
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPasswordUser)
                    .addComponent(txtPasswordUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelpUser)
                    .addComponent(txtTelpUser))
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlamatUser)
                    .addComponent(txtAlamatUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHakAksesUser)
                    .addComponent(txtHakAksesUser))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        add(panelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 430));

        panelFooter.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelFooterLayout = new javax.swing.GroupLayout(panelFooter);
        panelFooter.setLayout(panelFooterLayout);
        panelFooterLayout.setHorizontalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        panelFooterLayout.setVerticalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        add(panelFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 750, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordUserActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelAlamatUser;
    private javax.swing.JLabel labelEmailUser;
    private javax.swing.JLabel labelHakAksesUser;
    private javax.swing.JLabel labelNamaLengkapUser;
    private javax.swing.JLabel labelPasswordUser;
    private javax.swing.JLabel labelTelpUser;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelFooter;
    private javax.swing.JPanel panelHeader;
    public javax.swing.JLabel txtAlamatUser;
    public javax.swing.JLabel txtEmailUser;
    public javax.swing.JLabel txtHakAksesUser;
    public javax.swing.JLabel txtNamaLengkapUser;
    public javax.swing.JPasswordField txtPasswordUser;
    public javax.swing.JLabel txtTelpUser;
    // End of variables declaration//GEN-END:variables
}
