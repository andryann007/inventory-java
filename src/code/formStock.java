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
public final class formStock extends javax.swing.JPanel {

    clsStock objStock = new clsStock();
    private TableColumn column;
    
    public formStock() {
        initComponents();
        isiTabel(0);
        isiComboKategori();
        isiComboStatus();
        isiPilihKategori();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cboSelectKategori = new javax.swing.JComboBox<>();
        labelSearch1 = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        labelIdBarang = new javax.swing.JLabel();
        txtIdBarang = new javax.swing.JTextField();
        labelNama = new javax.swing.JLabel();
        labelKategori = new javax.swing.JLabel();
        txtNamaBarang = new javax.swing.JTextField();
        txtHargaSatuan = new javax.swing.JTextField();
        labelQTY = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        cboKategori = new javax.swing.JComboBox<>();
        labelHarga = new javax.swing.JLabel();
        txtQTY = new javax.swing.JTextField();
        cboStatus = new javax.swing.JComboBox<>();
        panelFooter = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        labelTitle.setText("Data Stock Barang");

        labelSearch.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelSearch.setText("Search Data :");

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

        cboSelectKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSelectKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboSelectKategoriMouseClicked(evt);
            }
        });
        cboSelectKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSelectKategoriActionPerformed(evt);
            }
        });

        labelSearch1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelSearch1.setText("Pilih  Kategori :");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSearch1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboSelectKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(labelTitle)
                .addContainerGap(272, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addGap(20, 20, 20)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSearch1)
                    .addComponent(cboSelectKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSearch)))
        );

        add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        panelBody.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(738, 250));

        tabelBarang.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Barang", "Nama Barang", "Kategori", "QTY", "Harga Satuan", "Total Harga", "Status"
            }
        ));
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );

        labelIdBarang.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelIdBarang.setText("ID Barang :");

        txtIdBarang.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtIdBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdBarangKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdBarangKeyTyped(evt);
            }
        });

        labelNama.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelNama.setText("Nama Barang :");

        labelKategori.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelKategori.setText("Kategori :");

        txtNamaBarang.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtNamaBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaBarangKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaBarangKeyTyped(evt);
            }
        });

        txtHargaSatuan.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtHargaSatuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHargaSatuanKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHargaSatuanKeyTyped(evt);
            }
        });

        labelQTY.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelQTY.setText("QTY Stock :");

        labelStatus.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelStatus.setText("Status  Barang :");

        cboKategori.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        cboKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKategoriActionPerformed(evt);
            }
        });

        labelHarga.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelHarga.setText("Harga / Pcs :");

        txtQTY.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N

        cboStatus.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        cboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboStatusActionPerformed(evt);
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
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                        .addComponent(labelIdBarang)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHarga)
                            .addComponent(labelKategori, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHargaSatuan)
                            .addComponent(cboKategori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelStatus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNama, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelQTY, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(txtQTY))
                    .addComponent(cboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNama)
                        .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelIdBarang)
                        .addComponent(txtIdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKategori)
                    .addComponent(cboKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStatus)
                    .addComponent(cboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelHarga)
                        .addComponent(txtHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelQTY)
                        .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
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
                .addGap(22, 22, 22)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        panelFooterLayout.setVerticalGroup(
            panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        add(panelFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 750, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdBarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdBarangKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(((txtIdBarang.getText().isEmpty())))
            {
                JOptionPane.showMessageDialog(this, "ID Stock Tidak Boleh Kosong !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtIdBarang.requestFocus();
            }
            else
            {
            } 
        }
    }//GEN-LAST:event_txtIdBarangKeyPressed

    private void txtIdBarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdBarangKeyTyped

    }//GEN-LAST:event_txtIdBarangKeyTyped

    private void txtNamaBarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaBarangKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(((txtNamaBarang.getText().isEmpty())))
            {
                JOptionPane.showMessageDialog(this, "Nama Stock Tidak Boleh Kosong !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtNamaBarang.requestFocus();
            }
            else
            {
            } 
        }
    }//GEN-LAST:event_txtNamaBarangKeyPressed

    private void txtNamaBarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaBarangKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaBarangKeyTyped

    private void txtHargaSatuanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaSatuanKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaSatuanKeyPressed

    private void txtHargaSatuanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaSatuanKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaSatuanKeyTyped

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        objStock.Access();
        
        try{
            objStock.idBarang = txtIdBarang.getText();
            objStock.deleteStockData(objStock.idBarang);
                try {
                    objStock.res.executeUpdate(objStock.sql);
                    objStock.conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(formStock.class.getName()).log(Level.SEVERE, null, ex);
                }
                cleanData();
                isiTabel(0);
        
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Proses penghapusan data gagal");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        objStock.Access();
        
        if(txtIdBarang.getText().equals(""))
        {
            JOptionPane.showMessageDialog( null, "ID Stock Tidak Boleh Kosong!!!");
        }
        else {
            try{
                objStock.idBarang = txtIdBarang.getText();
                objStock.namaBarang = txtNamaBarang.getText();
                
                String mHargaSatuan = txtHargaSatuan.getText();
                objStock.hargaSatuan = Float.parseFloat(mHargaSatuan);
                
                String mQty = txtQTY.getText();
                objStock.qty = Integer.parseInt(mQty);
                
                float totalHarga = objStock.qty * objStock.hargaSatuan;
                objStock.totalHarga = totalHarga;
                
                objStock.kategori = cboKategori.getSelectedItem().toString();
                
                objStock.status = cboStatus.getSelectedItem().toString();
        
                objStock.saveStockData();
                try {
                    objStock.res.executeUpdate(objStock.sql);
                    objStock.conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(formStock.class.getName()).log(Level.SEVERE, null, ex);
                }
                cleanData();
                isiTabel(0);
        
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            } 
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Proses penyimpanan data gagal");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        objStock.Access();
        
        try{
            objStock.idBarang = txtIdBarang.getText();
            objStock.namaBarang = txtNamaBarang.getText();
                
            String mHargaSatuan = txtHargaSatuan.getText();
            objStock.hargaSatuan = Float.parseFloat(mHargaSatuan);
                
            String mQty = txtQTY.getText();
            objStock.qty = Integer.parseInt(mQty);
                
            float totalHarga = objStock.qty * objStock.hargaSatuan;
            objStock.totalHarga = totalHarga;
  
            objStock.kategori = cboKategori.getSelectedItem().toString();
            
            objStock.status = cboStatus.getSelectedItem().toString();
        
            objStock.editStockData();
            try {
                objStock.res.executeUpdate(objStock.sql);
                objStock.conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(formStock.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            cleanData();
            isiTabel(0);
        
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Proses pengeditan gagal");
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void cboKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboKategoriActionPerformed

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        int baris = tabelBarang.getSelectedRow();
        String id = tabelBarang.getValueAt(baris, 0).toString();
        String nama = tabelBarang.getValueAt(baris, 1).toString();
        String qty = tabelBarang.getValueAt(baris, 3).toString();
        String hargaSatuan = tabelBarang.getValueAt(baris, 4).toString();
        String kategori = tabelBarang.getValueAt(baris, 2).toString();
        String status = tabelBarang.getValueAt(baris, 6).toString();
        
        txtIdBarang.setText(id);
        txtNamaBarang.setText(nama);
        txtQTY.setText(qty);
        txtHargaSatuan.setText(hargaSatuan);
        cboKategori.setSelectedItem(kategori);
        cboStatus.setSelectedItem(status);
    }//GEN-LAST:event_tabelBarangMouseClicked

    private void cboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboStatusActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchQuery = txtSearch.getText();
        searchQuery(searchQuery);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void cboSelectKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboSelectKategoriMouseClicked

    }//GEN-LAST:event_cboSelectKategoriMouseClicked

    private void cboSelectKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSelectKategoriActionPerformed
        int index = cboSelectKategori.getSelectedIndex();
        isiTabel(index);
    }//GEN-LAST:event_cboSelectKategoriActionPerformed

    public void isiComboKategori(){
        cboKategori.removeAllItems();
        cboKategori.addItem("Sembako");
        cboKategori.addItem("Makanan Ringan");
        cboKategori.addItem("Makanan Instan");
        cboKategori.addItem("Minuman");
        cboKategori.addItem("Bumbu Dapur");
        cboKategori.addItem("Perlengkapan Mandi & Mencuci");
        cboKategori.addItem("Perlengkapan Rumah Tangga");
    }
    
     public void isiPilihKategori(){
        cboSelectKategori.removeAllItems();
        cboSelectKategori.addItem("Semua Kategori");
        cboSelectKategori.addItem("Sembako");
        cboSelectKategori.addItem("Makanan Ringan");
        cboSelectKategori.addItem("Makanan Instan");
        cboSelectKategori.addItem("Minuman");
        cboSelectKategori.addItem("Bumbu Dapur");
        cboSelectKategori.addItem("Perlengkapan Mandi & Mencuci");
        cboSelectKategori.addItem("Perlengkapan Rumah Tangga");
    }
    
    public void isiComboStatus(){
        cboStatus.removeAllItems();
        cboStatus.addItem("Tersedia");
        cboStatus.addItem("Habis");
    }
    
    public void isiTabel(int index){
        DefaultTableModel tabelDataStock = new DefaultTableModel();
        
        tabelDataStock.addColumn("ID Barang");
        tabelDataStock.addColumn("Nama Barang");
        tabelDataStock.addColumn("Kategori");
        tabelDataStock.addColumn("QTY");
        tabelDataStock.addColumn("Harga Satuan");
        tabelDataStock.addColumn("Total Harga");
        tabelDataStock.addColumn("Status");
        
        try{
            objStock.Access();
            objStock.getStockData();
            
            switch (cboSelectKategori.getSelectedIndex()) {
                case 0 ->{
                    String sql = "SELECT id_barang, nama_barang, kategori,"
                            + " qty_stock, harga_satuan, total_harga, status"
                            + " FROM `data_stock`";
                    Statement state = objStock.conn.createStatement();
                    ResultSet result = state.executeQuery(sql);
            
                     while(result.next()){
                        tabelDataStock.addRow(new Object[] {result.getString(1),
                        result.getString(2), result.getString(3),
                        result.getString(4), result.getString(5),
                        result.getString(6), result.getString(7)});
                    }
                    tabelBarang.setModel(tabelDataStock);
                }
                case 1 ->{
                    String kategori = "Sembako";
                    
                    String sql = "SELECT id_barang, nama_barang, kategori,"
                            + " qty_stock, harga_satuan, total_harga, status"
                            + " FROM `data_stock` WHERE kategori = '" + kategori + "'";
                    Statement state = objStock.conn.createStatement();
                    ResultSet result = state.executeQuery(sql);
            
                     while(result.next()){
                        tabelDataStock.addRow(new Object[] {result.getString(1),
                        result.getString(2), result.getString(3),
                        result.getString(4), result.getString(5),
                        result.getString(6), result.getString(7)});
                    }
                    tabelBarang.setModel(tabelDataStock);
                }
                
                case 2 ->{
                    String kategori = "Makanan Ringan";
                    
                    String sql = "SELECT id_barang, nama_barang, kategori,"
                            + " qty_stock, harga_satuan, total_harga, status"
                            + " FROM `data_stock` WHERE kategori = '" + kategori + "'";
                    Statement state = objStock.conn.createStatement();
                    ResultSet result = state.executeQuery(sql);
            
                    while(result.next()){
                        tabelDataStock.addRow(new Object[] {result.getString(1),
                        result.getString(2), result.getString(3),
                        result.getString(4), result.getString(5),
                        result.getString(6), result.getString(7)});
                    }
                    tabelBarang.setModel(tabelDataStock);
                }
                
                case 3 ->{
                    String kategori = "Makanan Instan";
                    
                    String sql = "SELECT id_barang, nama_barang, kategori,"
                            + " qty_stock, harga_satuan, total_harga, status"
                            + " FROM `data_stock` WHERE kategori = '" + kategori + "'";
                    Statement state = objStock.conn.createStatement();
                    ResultSet result = state.executeQuery(sql);
            
                     while(result.next()){
                        tabelDataStock.addRow(new Object[] {result.getString(1),
                        result.getString(2), result.getString(3),
                        result.getString(4), result.getString(5),
                        result.getString(6), result.getString(7)});
                    }
                    tabelBarang.setModel(tabelDataStock);
                }
                case 4 ->{
                    String kategori = "Minuman";
                    
                    String sql = "SELECT id_barang, nama_barang, kategori,"
                            + " qty_stock, harga_satuan, total_harga, status"
                            + " FROM `data_stock` WHERE kategori = '" + kategori + "'";
                    Statement state = objStock.conn.createStatement();
                    ResultSet result = state.executeQuery(sql);
            
                     while(result.next()){
                        tabelDataStock.addRow(new Object[] {result.getString(1),
                        result.getString(2), result.getString(3),
                        result.getString(4), result.getString(5),
                        result.getString(6), result.getString(7)});
                    }
                    tabelBarang.setModel(tabelDataStock);
                }
                
                case 5 ->{
                    String kategori = "Bumbu Dapur";
                    
                    String sql = "SELECT id_barang, nama_barang, kategori,"
                            + " qty_stock, harga_satuan, total_harga, status"
                            + " FROM `data_stock` WHERE kategori = '" + kategori + "'";
                    Statement state = objStock.conn.createStatement();
                    ResultSet result = state.executeQuery(sql);
            
                    while(result.next()){
                        tabelDataStock.addRow(new Object[] {result.getString(1),
                        result.getString(2), result.getString(3),
                        result.getString(4), result.getString(5),
                        result.getString(6), result.getString(7)});
                    }
                    tabelBarang.setModel(tabelDataStock);
                }
                
                case 6 ->{
                    String kategori = "Perlengkapan Mandi & Mencuci";
                    
                    String sql = "SELECT id_barang, nama_barang, kategori,"
                            + " qty_stock, harga_satuan, total_harga, status"
                            + " FROM `data_stock` WHERE kategori = '" + kategori + "'";
                    Statement state = objStock.conn.createStatement();
                    ResultSet result = state.executeQuery(sql);
            
                    while(result.next()){
                        tabelDataStock.addRow(new Object[] {result.getString(1),
                        result.getString(2), result.getString(3),
                        result.getString(4), result.getString(5),
                        result.getString(6), result.getString(7)});
                    }
                    tabelBarang.setModel(tabelDataStock);
                }
                
                case 7 ->{
                    String kategori = "Perlengkapan Rumah Tangga";
                    
                    String sql = "SELECT id_barang, nama_barang, kategori,"
                            + " qty_stock, harga_satuan, total_harga, status"
                            + " FROM `data_stock` WHERE kategori = '" + kategori + "'";
                    Statement state = objStock.conn.createStatement();
                    ResultSet result = state.executeQuery(sql);
            
                    while(result.next()){
                        tabelDataStock.addRow(new Object[] {result.getString(1),
                        result.getString(2), result.getString(3),
                        result.getString(4), result.getString(5),
                        result.getString(6), result.getString(7)});
                    }
                    tabelBarang.setModel(tabelDataStock);
                }
                default ->{
                    String sql = "SELECT id_barang, nama_barang, kategori,"
                            + " qty_stock, harga_satuan, total_harga, status"
                            + " FROM `data_stock`";
                    Statement state = objStock.conn.createStatement();
                    ResultSet result = state.executeQuery(sql);
            
                    while(result.next()){
                        tabelDataStock.addRow(new Object[] {result.getString(1),
                        result.getString(2), result.getString(3),
                        result.getString(4), result.getString(5),
                        result.getString(6), result.getString(7)});
                    }
                    tabelBarang.setModel(tabelDataStock);
                }
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan pada penampilan data !!!");
            System.out.println(e.getMessage());
        }
    }
    
    public void cleanData()
    {
        txtIdBarang.setText("");
        txtNamaBarang.setText("");
        txtQTY.setText("");
        txtHargaSatuan.setText("");
        isiComboKategori();
        isiComboStatus();
        isiPilihKategori();
    }
    
    public void searchQuery(String query){
        DefaultTableModel tabelDataStock;
        tabelDataStock = (DefaultTableModel) tabelBarang.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tabelDataStock);
        tabelBarang.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + query));
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cboKategori;
    private javax.swing.JComboBox<String> cboSelectKategori;
    private javax.swing.JComboBox<String> cboStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelIdBarang;
    private javax.swing.JLabel labelKategori;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelQTY;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelSearch1;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelFooter;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTextField txtHargaSatuan;
    private javax.swing.JTextField txtIdBarang;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtQTY;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
