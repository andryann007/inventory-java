package code;

import java.sql.Statement;
import java.sql.ResultSet;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Andryan
 */
public final class formDashboardUser extends javax.swing.JFrame {
    clsLogin objLogin = new clsLogin();
    
    formMasuk masuk = new formMasuk();
    formKeluar keluar = new formKeluar();
    
    formLaporanMasuk laporanMasuk = new formLaporanMasuk();
    formLaporanKeluar laporanKeluar = new formLaporanKeluar();
    
    formProfile profil = new formProfile();
    
    clsMasuk objMasuk = new clsMasuk();
    clsKeluar objKeluar = new clsKeluar();
    
    public formDashboardUser() {
        initComponents();
        showCurrentDate();
        showCurrentTime();
        isiData();
        
        body.add(masuk);
        masuk.setVisible(false);
        
        body.add(keluar);
        keluar.setVisible(false);
        
        body.add(laporanMasuk);
        laporanMasuk.setVisible(false);
        
        body.add(laporanKeluar);
        laporanKeluar.setVisible(false);
        
        body.add(profil);
        profil.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebar = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        panelHome = new javax.swing.JPanel();
        btnHome = new javax.swing.JLabel();
        panelTransaksi = new javax.swing.JPanel();
        labelTransaksi = new javax.swing.JLabel();
        btnMasuk = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JLabel();
        panelProfile = new javax.swing.JPanel();
        labelLaporan = new javax.swing.JLabel();
        btnMyProfile = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        panelLaporan = new javax.swing.JPanel();
        btnMasukReport = new javax.swing.JLabel();
        btnKeluarReport = new javax.swing.JLabel();
        labelLaporan1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        body = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnToMasuk = new javax.swing.JButton();
        txtJumlahMasuk = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelMasuk = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnToKeluar = new javax.swing.JButton();
        txtJumlahKeluar = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        labelKeluar = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        txtDate = new javax.swing.JLabel();
        txtTime = new javax.swing.JLabel();
        txtNamaPengguna = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Inventory Toko Sukses");
        setMinimumSize(new java.awt.Dimension(1030, 680));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebar.setBackground(new java.awt.Color(255, 255, 255));
        sidebar.setPreferredSize(new java.awt.Dimension(250, 250));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        sidebar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 280, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        sidebar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 280, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        sidebar.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 280, 10));

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setBackground(new java.awt.Color(255, 255, 255));
        btnHome.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house-solid.png"))); // NOI18N
        btnHome.setText("Home / Dashboard");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setIconTextGap(15);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        panelHome.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 240, 50));

        sidebar.add(panelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        panelTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        panelTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelTransaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTransaksi.setText("Transaksi");
        panelTransaksi.add(labelTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnMasuk.setBackground(new java.awt.Color(255, 255, 255));
        btnMasuk.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        btnMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right-arrow.png"))); // NOI18N
        btnMasuk.setText("Data Barang Masuk");
        btnMasuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasuk.setIconTextGap(15);
        btnMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMasukMouseClicked(evt);
            }
        });
        panelTransaksi.add(btnMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 240, 50));

        btnKeluar.setBackground(new java.awt.Color(255, 255, 255));
        btnKeluar.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-arrow.png"))); // NOI18N
        btnKeluar.setText("Data Barang Keluar");
        btnKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKeluar.setIconTextGap(15);
        btnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeluarMouseClicked(evt);
            }
        });
        panelTransaksi.add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 50));

        sidebar.add(panelTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 280, 140));

        panelProfile.setBackground(new java.awt.Color(255, 255, 255));
        panelProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLaporan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelLaporan.setText("Profile");
        panelProfile.add(labelLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        btnMyProfile.setBackground(new java.awt.Color(255, 255, 255));
        btnMyProfile.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        btnMyProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        btnMyProfile.setText("My Profile");
        btnMyProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMyProfile.setIconTextGap(15);
        btnMyProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMyProfileMouseClicked(evt);
            }
        });
        panelProfile.add(btnMyProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 240, 50));

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/power-off-solid.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setIconTextGap(15);
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        panelProfile.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 240, 50));

        sidebar.add(panelProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 280, 120));

        panelLaporan.setBackground(new java.awt.Color(255, 255, 255));

        btnMasukReport.setBackground(new java.awt.Color(255, 255, 255));
        btnMasukReport.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        btnMasukReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clipboard.png"))); // NOI18N
        btnMasukReport.setText("Laporan Barang Masuk");
        btnMasukReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasukReport.setIconTextGap(15);
        btnMasukReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMasukReportMouseClicked(evt);
            }
        });

        btnKeluarReport.setBackground(new java.awt.Color(255, 255, 255));
        btnKeluarReport.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        btnKeluarReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clipboard.png"))); // NOI18N
        btnKeluarReport.setText("Laporan Barang Keluar");
        btnKeluarReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKeluarReport.setIconTextGap(15);
        btnKeluarReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeluarReportMouseClicked(evt);
            }
        });

        labelLaporan1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelLaporan1.setText("Laporan");

        javax.swing.GroupLayout panelLaporanLayout = new javax.swing.GroupLayout(panelLaporan);
        panelLaporan.setLayout(panelLaporanLayout);
        panelLaporanLayout.setHorizontalGroup(
            panelLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLaporanLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(panelLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLaporan1)
                    .addGroup(panelLaporanLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMasukReport, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKeluarReport, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addComponent(jSeparator3)
        );
        panelLaporanLayout.setVerticalGroup(
            panelLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLaporanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLaporan1)
                .addGap(4, 4, 4)
                .addComponent(btnMasukReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnKeluarReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sidebar.add(panelLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 280, 140));

        getContentPane().add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 680));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        body.setPreferredSize(new java.awt.Dimension(750, 650));
        body.setLayout(new javax.swing.BoxLayout(body, javax.swing.BoxLayout.LINE_AXIS));

        home.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        jLabel15.setText("Data Transaksi");

        btnToMasuk.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btnToMasuk.setText("More Info");
        btnToMasuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnToMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToMasukMouseClicked(evt);
            }
        });

        txtJumlahMasuk.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        txtJumlahMasuk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel17.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Data Masuk");

        labelMasuk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right-arrow_md.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnToMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtJumlahMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(labelMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtJumlahMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labelMasuk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnToMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnToKeluar.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btnToKeluar.setText("More Info");
        btnToKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnToKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToKeluarMouseClicked(evt);
            }
        });

        txtJumlahKeluar.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        txtJumlahKeluar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel20.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Data Keluar");

        labelKeluar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-arrow_md.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnToKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtJumlahKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(labelKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtJumlahKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labelKeluar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnToKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel15)
                        .addGap(168, 168, 168)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel15)
                .addGap(24, 24, 24)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(424, Short.MAX_VALUE))
        );

        body.add(home);

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 750, 630));

        header.setBackground(new java.awt.Color(0, 0, 0));
        header.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDate.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        txtDate.setForeground(new java.awt.Color(255, 255, 255));
        header.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 140, 30));

        txtTime.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        txtTime.setForeground(new java.awt.Color(255, 255, 255));
        header.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 130, 30));

        txtNamaPengguna.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        txtNamaPengguna.setForeground(new java.awt.Color(255, 255, 255));
        header.add(txtNamaPengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 280, 30));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 750, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        objLogin.logoutUser();
        dispose();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnMyProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMyProfileMouseClicked
        home.setVisible(false);
        
        masuk.setVisible(false);
        keluar.setVisible(false);
        
        laporanMasuk.setVisible(false);
        laporanKeluar.setVisible(false);
        
        profil.setVisible(true);
        
        Font fontRegular = new Font("Century", Font.PLAIN, 14);
        Font fontBold = new Font("Century", Font.BOLD, 14);
        
        btnHome.setFont(fontRegular);
        
        btnMasuk.setFont(fontRegular);
        btnKeluar.setFont(fontRegular);
        btnMasukReport.setFont(fontRegular);
        btnKeluarReport.setFont(fontRegular);
        btnMyProfile.setFont(fontBold);
    }//GEN-LAST:event_btnMyProfileMouseClicked

    private void btnMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseClicked
        home.setVisible(false);
        
        masuk.setVisible(true);
        keluar.setVisible(false);
        
        laporanMasuk.setVisible(false);
        laporanKeluar.setVisible(false);
        
        profil.setVisible(false);
        
        Font fontRegular = new Font("Century", Font.PLAIN, 14);
        Font fontBold = new Font("Century", Font.BOLD, 14);
        
        btnHome.setFont(fontRegular);
        
        btnMasuk.setFont(fontBold);
        btnKeluar.setFont(fontRegular);
        btnMasukReport.setFont(fontRegular);
        btnKeluarReport.setFont(fontRegular);
        btnMyProfile.setFont(fontRegular);
    }//GEN-LAST:event_btnMasukMouseClicked

    private void btnKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseClicked
        home.setVisible(false);
        
        masuk.setVisible(false);
        keluar.setVisible(true);
        
        laporanMasuk.setVisible(false);
        laporanKeluar.setVisible(false);
        
        profil.setVisible(false);
        
        Font fontRegular = new Font("Century", Font.PLAIN, 14);
        Font fontBold = new Font("Century", Font.BOLD, 14);
        
        btnHome.setFont(fontRegular);
        
        btnMasuk.setFont(fontRegular);
        btnKeluar.setFont(fontBold);
        btnMasukReport.setFont(fontRegular);
        btnKeluarReport.setFont(fontRegular);
        btnMyProfile.setFont(fontRegular);
    }//GEN-LAST:event_btnKeluarMouseClicked

    private void btnMasukReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukReportMouseClicked
        home.setVisible(false);
        
        masuk.setVisible(false);
        keluar.setVisible(false);
        
        laporanMasuk.setVisible(true);
        laporanKeluar.setVisible(false);
        
        profil.setVisible(false);
        
        Font fontRegular = new Font("Century", Font.PLAIN, 14);
        Font fontBold = new Font("Century", Font.BOLD, 14);
        
        btnHome.setFont(fontRegular);
        
        btnMasuk.setFont(fontRegular);
        btnKeluar.setFont(fontRegular);
        btnMasukReport.setFont(fontBold);
        btnKeluarReport.setFont(fontRegular);
        btnMyProfile.setFont(fontRegular);
    }//GEN-LAST:event_btnMasukReportMouseClicked

    private void btnKeluarReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarReportMouseClicked
        home.setVisible(false);
        
        masuk.setVisible(false);
        keluar.setVisible(false);
        
        laporanMasuk.setVisible(false);
        laporanKeluar.setVisible(true);
        
        profil.setVisible(false);
        
        Font fontRegular = new Font("Century", Font.PLAIN, 14);
        Font fontBold = new Font("Century", Font.BOLD, 14);
        
        btnHome.setFont(fontRegular);
        
        btnMasuk.setFont(fontRegular);
        btnKeluar.setFont(fontRegular);
        btnMasukReport.setFont(fontRegular);
        btnKeluarReport.setFont(fontBold);
        btnMyProfile.setFont(fontRegular);
    }//GEN-LAST:event_btnKeluarReportMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        home.setVisible(true);
        
        masuk.setVisible(false);
        keluar.setVisible(false);
        
        laporanMasuk.setVisible(false);
        laporanKeluar.setVisible(false);
        
        profil.setVisible(false);
        
        Font fontRegular = new Font("Century", Font.PLAIN, 14);
        Font fontBold = new Font("Century", Font.BOLD, 14);
        
        btnHome.setFont(fontBold);
        
        btnMasuk.setFont(fontRegular);
        btnKeluar.setFont(fontRegular);
        btnMasukReport.setFont(fontRegular);
        btnKeluarReport.setFont(fontRegular);
        btnMyProfile.setFont(fontRegular);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnToMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToMasukMouseClicked
        home.setVisible(false);
        
        masuk.setVisible(true);
        keluar.setVisible(false);
        
        laporanMasuk.setVisible(false);
        laporanKeluar.setVisible(false);
        
        profil.setVisible(false);
        
        Font fontRegular = new Font("Century", Font.PLAIN, 14);
        Font fontBold = new Font("Century", Font.BOLD, 14);
        
        btnHome.setFont(fontRegular);
        
        btnMasuk.setFont(fontBold);
        btnKeluar.setFont(fontRegular);
        btnMasukReport.setFont(fontRegular);
        btnKeluarReport.setFont(fontRegular);
        btnMyProfile.setFont(fontRegular);
    }//GEN-LAST:event_btnToMasukMouseClicked

    private void btnToKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToKeluarMouseClicked
        home.setVisible(false);
        
        masuk.setVisible(false);
        keluar.setVisible(true);
        
        laporanMasuk.setVisible(false);
        laporanKeluar.setVisible(false);
        
        profil.setVisible(false);
        
        Font fontRegular = new Font("Century", Font.PLAIN, 14);
        Font fontBold = new Font("Century", Font.BOLD, 14);
        
        btnHome.setFont(fontRegular);
        btnMasuk.setFont(fontRegular);
        btnKeluar.setFont(fontBold);
        btnMasukReport.setFont(fontRegular);
        btnKeluarReport.setFont(fontRegular);
        btnMyProfile.setFont(fontRegular);
    }//GEN-LAST:event_btnToKeluarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new formDashboardUser().setVisible(true);
            } catch (Exception e){
            }
        });
    }
    
    public void showCurrentTime(){
        new Timer(0, (ActionEvent evt) -> {
            SimpleDateFormat s1 = new SimpleDateFormat("hh:mm:ss a");
            Date d = new Date();
            txtTime.setText(s1.format(d));
        }).start();
    }
    
    public void showCurrentDate(){
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        txtDate.setText(s1.format(d));
    }
    
    public void isiData(){
        try{
            objMasuk.Access();
            String sqlMasuk = "SELECT COUNT(id_masuk) AS qty_data_masuk FROM data_barang_masuk";
            Statement stateMasuk = objMasuk.conn.createStatement();
            ResultSet resultMasuk = stateMasuk.executeQuery(sqlMasuk);
            while(resultMasuk.next()){
                txtJumlahMasuk.setText(resultMasuk.getString("qty_data_masuk"));
            }
            
            objKeluar.Access();
            String sqlKeluar = "SELECT COUNT(id_keluar) AS qty_data_keluar FROM data_barang_keluar";
            Statement stateKeluar = objKeluar.conn.createStatement();
            ResultSet resultKeluar = stateKeluar.executeQuery(sqlKeluar);
            while(resultKeluar.next()){
                txtJumlahKeluar.setText(resultKeluar.getString("qty_data_keluar"));
            }
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Proses Penampilan Data Dashboard Gagal");
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnKeluar;
    private javax.swing.JLabel btnKeluarReport;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnMasuk;
    private javax.swing.JLabel btnMasukReport;
    private javax.swing.JLabel btnMyProfile;
    private javax.swing.JButton btnToKeluar;
    private javax.swing.JButton btnToMasuk;
    private javax.swing.JPanel header;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelKeluar;
    private javax.swing.JLabel labelLaporan;
    private javax.swing.JLabel labelLaporan1;
    private javax.swing.JLabel labelMasuk;
    private javax.swing.JLabel labelTransaksi;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelLaporan;
    private javax.swing.JPanel panelProfile;
    private javax.swing.JPanel panelTransaksi;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtJumlahKeluar;
    private javax.swing.JLabel txtJumlahMasuk;
    public javax.swing.JLabel txtNamaPengguna;
    private javax.swing.JLabel txtTime;
    // End of variables declaration//GEN-END:variables
}