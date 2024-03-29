package code;

import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Andryan
 */
public final class formUser extends javax.swing.JPanel {

    clsUser objUser = new clsUser();
    
    public formUser() {
        initComponents();
        isiTabel();
        isiComboTipe();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        labelSearch = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelUser = new javax.swing.JTable();
        labelIdUser = new javax.swing.JLabel();
        txtIdUser = new javax.swing.JTextField();
        labelNama = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        labelAlamat = new javax.swing.JLabel();
        cboAkun = new javax.swing.JComboBox<>();
        labelTipe = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        labelTelp = new javax.swing.JLabel();
        txtTelp = new javax.swing.JTextField();
        panelFooter = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        labelTitle.setText("Data User");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        labelSearch.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelSearch.setText("Search Data :");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap(489, Short.MAX_VALUE)
                .addComponent(labelSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(labelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                        .addComponent(labelTitle)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelSearch))))
        );

        add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        panelBody.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(738, 250));

        tabelUser.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        tabelUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID User", "Nama Lengkap", "Email", "Password", "No. Telp", "Alamat", "Tipe Akun"
            }
        ));
        tabelUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelUser);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );

        labelIdUser.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelIdUser.setText("ID User :");

        txtIdUser.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtIdUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdUserKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdUserKeyTyped(evt);
            }
        });

        labelNama.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelNama.setText("Nama Lengkap :");

        labelEmail.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelEmail.setText("Email :");

        txtNama.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaKeyTyped(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        labelPassword.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelPassword.setText("Password :");

        txtAlamat.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtAlamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAlamatKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlamatKeyTyped(evt);
            }
        });

        labelAlamat.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelAlamat.setText("Alamat :");

        cboAkun.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        cboAkun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAkunActionPerformed(evt);
            }
        });

        labelTipe.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelTipe.setText("Tipe Akun :");

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

        labelTelp.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelTelp.setText("No. Telp :");

        txtTelp.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtTelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelpKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelpKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(labelIdUser))
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelTelp)
                        .addComponent(labelEmail)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEmail)
                        .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelAlamat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNama, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(labelTipe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNama)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAlamat)))
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIdUser))
                        .addGap(26, 26, 26)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTelp))))
                .addGap(32, 32, 32)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTipe))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        add(panelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 430));

        panelFooter.setBackground(new java.awt.Color(255, 255, 255));

        btnDelete.setBackground(new java.awt.Color(255, 102, 51));
        btnDelete.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash-solid.png"))); // NOI18N
        btnDelete.setText(" DELETE");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(102, 255, 102));
        btnAdd.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus-solid.png"))); // NOI18N
        btnAdd.setText(" ADD");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 255, 153));
        btnEdit.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pen-to-square-solid.png"))); // NOI18N
        btnEdit.setText(" EDIT");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFooterLayout = new javax.swing.GroupLayout(panelFooter);
        panelFooter.setLayout(panelFooterLayout);
        panelFooterLayout.setHorizontalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFooterLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        panelFooterLayout.setVerticalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFooterLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        add(panelFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 750, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdUserKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(((txtIdUser.getText().isEmpty())))
            {
                JOptionPane.showMessageDialog(this, "ID User Tidak Boleh Kosong !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtIdUser.requestFocus();
            }
            else
            {
            } 
        }
    }//GEN-LAST:event_txtIdUserKeyPressed

    private void txtIdUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdUserKeyTyped

    }//GEN-LAST:event_txtIdUserKeyTyped

    private void txtNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(((txtNama.getText().isEmpty())))
            {
                JOptionPane.showMessageDialog(this, "Nama User Tidak Boleh Kosong !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtNama.requestFocus();
            }
            else
            {
            } 
        }
    }//GEN-LAST:event_txtNamaKeyPressed

    private void txtNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaKeyTyped

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtAlamatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlamatKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatKeyPressed

    private void txtAlamatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlamatKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatKeyTyped

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        objUser.Access();
        
        try{
            objUser.idUser = txtIdUser.getText();
            objUser.deleteUserData(objUser.idUser);
                try {
                    objUser.res.executeUpdate(objUser.sql);
                    objUser.conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(formUser.class.getName()).log(Level.SEVERE, null, ex);
                }
                cleanData();
                isiTabel();
        
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Proses penghapusan data gagal");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        objUser.Access();
        
        if(txtIdUser.getText().equals(""))
        {
            JOptionPane.showMessageDialog( null, "ID User Tidak Boleh Kosong!!!");
        } else {
            try{
                objUser.idUser = txtIdUser.getText();
                objUser.namaUser = txtNama.getText();
                objUser.email = txtEmail.getText();
                objUser.password = txtPassword.getText();
                objUser.telp = txtTelp.getText();
                objUser.alamat = txtAlamat.getText();
                objUser.tipeAkun = cboAkun.getSelectedItem().toString();
        
                objUser.saveUserData();
                try {
                    objUser.res.executeUpdate(objUser.sql);
                    objUser.conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(formUser.class.getName()).log(Level.SEVERE, null, ex);
                }
                cleanData();
                isiTabel();
        
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            } 
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Proses penyimpanan data gagal");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        objUser.Access();
        
        try{
            objUser.idUser = txtIdUser.getText();
            objUser.namaUser = txtNama.getText();
            objUser.email = txtEmail.getText();
            objUser.password = txtPassword.getText();
            objUser.telp = txtTelp.getText();
            objUser.alamat = txtAlamat.getText();
            objUser.tipeAkun = cboAkun.getSelectedItem().toString();
        
            objUser.editUserData();
            try {
                objUser.res.executeUpdate(objUser.sql);
                objUser.conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(formUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            cleanData();
            isiTabel();
        
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Proses pengeditan gagal");
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void cboAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAkunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAkunActionPerformed

    private void tabelUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelUserMouseClicked
        int baris = tabelUser.getSelectedRow();
        String id = tabelUser.getValueAt(baris, 0).toString();
        String nama = tabelUser.getValueAt(baris, 1).toString();
        String email = tabelUser.getValueAt(baris, 2).toString();
        String password = tabelUser.getValueAt(baris, 3).toString();
        String telp = tabelUser.getValueAt(baris, 4).toString();
        String alamat = tabelUser.getValueAt(baris, 5).toString();
        
        txtIdUser.setText(id);
        txtNama.setText(nama);
        txtEmail.setText(email);
        txtPassword.setText(password);
        txtTelp.setText(telp);
        txtAlamat.setText(alamat);
    }//GEN-LAST:event_tabelUserMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(((txtPassword.getText().isEmpty())))
            {
                JOptionPane.showMessageDialog(this, "Password Tidak Boleh Kosong !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtPassword.requestFocus();
            }
            else
            {
            } 
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtTelpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelpKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelpKeyPressed

    private void txtTelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelpKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelpKeyTyped

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchQuery = txtSearch.getText();
        searchQuery(searchQuery);
    }//GEN-LAST:event_txtSearchKeyReleased

    public void isiComboTipe(){
        cboAkun.removeAllItems();
        cboAkun.addItem("Owner");
        cboAkun.addItem("Admin");
        cboAkun.addItem("User");
    }
    
    public void isiTabel(){
        DefaultTableModel tabelDataAkun = new DefaultTableModel();
        
        tabelDataAkun.addColumn("ID User");
        tabelDataAkun.addColumn("Nama Lengkap");
        tabelDataAkun.addColumn("Email");
        tabelDataAkun.addColumn("Password");
        tabelDataAkun.addColumn("No. Telp");
        tabelDataAkun.addColumn("Alamat");
        tabelDataAkun.addColumn("Tipe Akun");
        
        try{
            objUser.Access();
            objUser.getUserData();
            
            Statement state = objUser.conn.createStatement();
            ResultSet result = state.executeQuery(objUser.sql);
            
            while(result.next()){
                tabelDataAkun.addRow(new Object[] {result.getString(1),
                    result.getString(2), result.getString(3),
                    result.getString(4), result.getString(5),
                    result.getString(6), result.getString(7)});
            }
            tabelUser.setModel(tabelDataAkun);
            ;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan pada penampilan data !!!");
            System.out.println(e.getMessage());
        }
    }
    
    public void cleanData()
    {
        txtIdUser.setText("");
        txtNama.setText("");
        txtPassword.setText("");
        txtEmail.setText("");
        txtAlamat.setText("");
        txtTelp.setText("");
        isiComboTipe();
    }
    
    public void searchQuery(String query){
        DefaultTableModel tabelDataAkun;
        tabelDataAkun = (DefaultTableModel) tabelUser.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tabelDataAkun);
        tabelUser.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + query));
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cboAkun;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelIdUser;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelTelp;
    private javax.swing.JLabel labelTipe;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelFooter;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tabelUser;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdUser;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTelp;
    // End of variables declaration//GEN-END:variables
}
