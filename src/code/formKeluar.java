package code;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Andryan
 */
public final class formKeluar extends javax.swing.JPanel {

    clsKeluar objKeluar = new clsKeluar();
    
    public formKeluar() {
        initComponents();
        isiTabel(0);
        isiComboBarang();
        isiComboCustomer();
        isiComboJenisTransaksi();
        isiComboPilihTransaksi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        labelSearch = new javax.swing.JLabel();
        cboSelectTransaksi = new javax.swing.JComboBox<>();
        labelSearch1 = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelBarangKeluar = new javax.swing.JTable();
        labelIdKeluar = new javax.swing.JLabel();
        txtIdKeluar = new javax.swing.JTextField();
        labelBarang = new javax.swing.JLabel();
        labelCustomer = new javax.swing.JLabel();
        txtHargaSatuanKeluar = new javax.swing.JTextField();
        labelKeluar = new javax.swing.JLabel();
        txtQTYKeluar = new javax.swing.JTextField();
        cboBarangKeluar = new javax.swing.JComboBox<>();
        labelHarga = new javax.swing.JLabel();
        txtKeteranganKeluar = new javax.swing.JTextField();
        labelKeterangan = new javax.swing.JLabel();
        labelQTY = new javax.swing.JLabel();
        dateKeluar = new com.toedter.calendar.JDateChooser();
        cboCustomer = new javax.swing.JComboBox<>();
        cboJenisTransaksi = new javax.swing.JComboBox<>();
        labelKeterangan1 = new javax.swing.JLabel();
        panelFooter = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        labelTitle.setText("Data Barang Keluar");

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

        cboSelectTransaksi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSelectTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboSelectTransaksiMouseClicked(evt);
            }
        });
        cboSelectTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSelectTransaksiActionPerformed(evt);
            }
        });

        labelSearch1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelSearch1.setText("Pilih Transaksi :");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(labelTitle)
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSearch1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboSelectTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelSearch1)
                        .addComponent(cboSelectTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelSearch)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        panelBody.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(738, 250));

        tabelBarangKeluar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Keluar", "Tgl Keluar", "Nama Barang", "Nama Customer", "Harga Satuan", "QTY Keluar", "Total Harga", "Keterangan"
            }
        ));
        tabelBarangKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangKeluarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelBarangKeluar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        labelIdKeluar.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelIdKeluar.setText("ID Keluar :");

        txtIdKeluar.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtIdKeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeluarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeluarKeyTyped(evt);
            }
        });

        labelBarang.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelBarang.setText("Nama Barang :");

        labelCustomer.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelCustomer.setText("Nama Customer :");

        txtHargaSatuanKeluar.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtHargaSatuanKeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHargaSatuanKeluarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHargaSatuanKeluarKeyTyped(evt);
            }
        });

        labelKeluar.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelKeluar.setText("Tanggal Keluar :");

        txtQTYKeluar.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtQTYKeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQTYKeluarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQTYKeluarKeyTyped(evt);
            }
        });

        cboBarangKeluar.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        cboBarangKeluar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboBarangKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBarangKeluarActionPerformed(evt);
            }
        });

        labelHarga.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelHarga.setText("Harga / Pcs :");

        txtKeteranganKeluar.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N

        labelKeterangan.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelKeterangan.setText("Keterangan :");

        labelQTY.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelQTY.setText("QTY Keluar  :");

        dateKeluar.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N

        cboCustomer.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        cboCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboJenisTransaksi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelKeterangan1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelKeterangan1.setText("Jenis Transaksi :");

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(labelKeterangan1)
                        .addGap(18, 18, 18)
                        .addComponent(cboJenisTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBodyLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelBarang)
                                .addComponent(labelHarga))
                            .addGap(18, 18, 18)
                            .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHargaSatuanKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboBarangKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(labelIdKeluar)
                            .addGap(18, 18, 18)
                            .addComponent(txtIdKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCustomer, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelQTY, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelKeluar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelKeterangan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtKeteranganKeluar)
                    .addComponent(txtQTYKeluar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(dateKeluar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboCustomer, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelIdKeluar)
                        .addComponent(txtIdKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelKeluar))
                    .addComponent(dateKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboBarangKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelBarang))
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCustomer)))
                .addGap(23, 23, 23)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHargaSatuanKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHarga)
                    .addComponent(labelQTY)
                    .addComponent(txtQTYKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboJenisTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelKeterangan1))
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtKeteranganKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelKeterangan)))
                .addGap(20, 20, 20))
        );

        add(panelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 440));

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
                .addGap(46, 46, 46)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
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

    private void txtIdKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeluarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(((txtIdKeluar.getText().isEmpty())))
            {
                JOptionPane.showMessageDialog(this, "ID Keluar Tidak Boleh Kosong !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtIdKeluar.requestFocus();
            }
            else
            {
            } 
        }
    }//GEN-LAST:event_txtIdKeluarKeyPressed

    private void txtIdKeluarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeluarKeyTyped

    }//GEN-LAST:event_txtIdKeluarKeyTyped

    private void txtHargaSatuanKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaSatuanKeluarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaSatuanKeluarKeyPressed

    private void txtHargaSatuanKeluarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaSatuanKeluarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaSatuanKeluarKeyTyped

    private void txtQTYKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeluarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTYKeluarKeyPressed

    private void txtQTYKeluarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeluarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTYKeluarKeyTyped

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        objKeluar.Access();
        
        try{
            Statement state = objKeluar.conn.createStatement();
            objKeluar.conn.setAutoCommit(false);
            
            objKeluar.idKeluar = txtIdKeluar.getText();
            
            Object keyBarang = cboBarangKeluar.getSelectedItem();
            String valueBarang = ((clsComboBarang)keyBarang).getValue();
            objKeluar.idBarang = valueBarang;
            
            String SQL = "SELECT qty_stock, qty_keluar FROM `data_stock` s, `data_barang_keluar` k "
                    + "WHERE s.id_barang = '" + objKeluar.idBarang + "'"
                    + "AND id_keluar = '" + objKeluar.idKeluar + "'";
            ResultSet result = state.executeQuery(SQL);
            
            if(result.next()){
                String SQL2 = "DELETE FROM data_barang_keluar WHERE id_keluar = '" + objKeluar.idKeluar + "'";
                state.addBatch(SQL2);
                
                String mQtyStock = result.getString("qty_stock");
                int qty_stock_lama = Integer.parseInt(mQtyStock);
                 
                String mQtyOutcoming = result.getString("qty_keluar");
                int qty_keluar = Integer.parseInt(mQtyOutcoming);
                
                if(qty_stock_lama > qty_keluar){
                    int qty_stock_baru = qty_stock_lama + qty_keluar;
                    
                    if(qty_stock_baru > 0){
                        String SQL3 = "UPDATE data_stock SET qty_stock = '" + qty_stock_baru + "' WHERE id_barang = '" + objKeluar.idBarang +"'";
                        state.addBatch(SQL3);
                        
                        try {
                            int[] count = state.executeBatch();
                            objKeluar.conn.commit();
                            objKeluar.conn.close();
                        }
                        catch (SQLException ex) {
                            Logger.getLogger(formKeluar.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                    JOptionPane.showMessageDialog(null, "Data " + objKeluar.idKeluar + " berhasil dihapus");
                    }
                } else if(qty_stock_lama < qty_keluar) {
                    JOptionPane.showMessageDialog(null, "Error, qty_stock harus lebih besar dari qty_keluar !!!");
                }
            }
            cleanData();
            isiTabel(0);
        }
        catch(HeadlessException e){
            JOptionPane.showMessageDialog(null, "Proses penghapusan data gagal");
            System.out.println(e.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(formKeluar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        objKeluar.Access();
        
        if(txtIdKeluar.getText().equals(""))
        {
            JOptionPane.showMessageDialog( null, "ID Keluar Tidak Boleh Kosong!!!");
        }
        else {
            try{
                Statement state = objKeluar.conn.createStatement();
                objKeluar.conn.setAutoCommit(false);
                
                objKeluar.idKeluar = txtIdKeluar.getText();
            
                SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                objKeluar.tglKeluar = date.format(dateKeluar.getDate());
                
                Object keyBarang = cboBarangKeluar.getSelectedItem();
                String valueBarang = ((clsComboBarang)keyBarang).getValue();
                objKeluar.idBarang = valueBarang;
                
                Object keyCustomer = cboCustomer.getSelectedItem();
                String valueCustomer = ((clsComboCustomer)keyCustomer).getValue();
                objKeluar.idCustomer = valueCustomer;
            
                String mHargaSatuan = txtHargaSatuanKeluar.getText();
                objKeluar.hargaSatuan = Float.parseFloat(mHargaSatuan);
                
                String mQty = txtQTYKeluar.getText();
                objKeluar.qty = Integer.parseInt(mQty);
                
                float totalHarga = objKeluar.qty * objKeluar.hargaSatuan;
                objKeluar.totalHarga = totalHarga;
            
                objKeluar.keterangan = txtKeteranganKeluar.getText();
                
                String jenisTransaksi = cboJenisTransaksi.getSelectedItem().toString();
                
                if(jenisTransaksi.equalsIgnoreCase("Penjualan")){
                    objKeluar.jenisTransaksi = "penjualan";
                } else if(jenisTransaksi.equalsIgnoreCase("Retur Penjualan")){
                    objKeluar.jenisTransaksi = "retur_penjualan";
                }
                
                String SQL = "SELECT qty_stock, qty_keluar FROM `data_stock` s, `data_barang_keluar` k "
                        + "WHERE s.id_barang = '" + objKeluar.idBarang + "'";
                ResultSet result = state.executeQuery(SQL);
                
                if(result.next()){
                    if(jenisTransaksi.equalsIgnoreCase("Penjualan")){
                        String mQtyStock = result.getString("qty_stock");
                        int qty_stock_lama = Integer.parseInt(mQtyStock);
                    
                        String mQtyOutcomingLama = result.getString("qty_keluar");
                        int qty_keluar_lama = Integer.parseInt(mQtyOutcomingLama);
                
                        if(qty_stock_lama > qty_keluar_lama){
                            int qty_stock_baru = qty_stock_lama - objKeluar.qty;
                    
                            if(qty_stock_baru > 0){
                                String SQL2 = "INSERT INTO data_barang_keluar(id_keluar, id_barang, id_customer, tgl_keluar, qty_keluar,"
                                    + "harga_satuan, total_harga, keterangan, jenis_transaksi) VALUE ('" + objKeluar.idKeluar + "', '" + objKeluar.idBarang
                                    + "', '" + objKeluar.idCustomer + "', '" + objKeluar.tglKeluar + "', '" + objKeluar.qty + "', '"
                                    + objKeluar.hargaSatuan + "', '" + objKeluar.totalHarga + "', '" + objKeluar.keterangan + "', '"
                                    + objKeluar.jenisTransaksi + "')";
                                state.addBatch(SQL2);
                    
                                String SQL3 = "UPDATE data_stock SET qty_stock = '" + qty_stock_baru + "' WHERE id_barang = '" + objKeluar.idBarang + "'";
                                state.addBatch(SQL3);
                        
                                try {
                                    int[] count = state.executeBatch();
                                    objKeluar.conn.commit();
                                    objKeluar.conn.close();
                                }
                                catch (SQLException ex) {
                                    Logger.getLogger(formKeluar.class.getName()).log(Level.SEVERE, null, ex);
                                    JOptionPane.showMessageDialog(null, ex.getMessage());
                                }
                                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Error, qty_keluar harus lebih kecil dari qty_stock !!!");
                        }
                    }
                    
                    else if(jenisTransaksi.equalsIgnoreCase("Retur Penjualan")){
                        String mQtyStock = result.getString("qty_stock");
                        int qty_stock_lama = Integer.parseInt(mQtyStock);
                    
                        String mQtyOutcomingLama = result.getString("qty_keluar");
                        int qty_keluar_lama = Integer.parseInt(mQtyOutcomingLama);
                
                        if(qty_stock_lama > qty_keluar_lama){
                            int qty_stock_baru = qty_stock_lama + objKeluar.qty;
                    
                            if(qty_stock_baru > 0){
                                String SQL2 = "INSERT INTO data_barang_keluar(id_keluar, id_barang, id_customer, tgl_keluar, qty_keluar,"
                                    + "harga_satuan, total_harga, keterangan, jenis_transaksi) VALUE ('" + objKeluar.idKeluar + "', '" + objKeluar.idBarang
                                    + "', '" + objKeluar.idCustomer + "', '" + objKeluar.tglKeluar + "', '" + objKeluar.qty + "', '"
                                    + objKeluar.hargaSatuan + "', '" + objKeluar.totalHarga + "', '" + objKeluar.keterangan + "', '"
                                    + objKeluar.jenisTransaksi + "')";
                                state.addBatch(SQL2);
                    
                                String SQL3 = "UPDATE data_stock SET qty_stock = '" + qty_stock_baru + "' WHERE id_barang = '" + objKeluar.idBarang + "'";
                                state.addBatch(SQL3);
                        
                                try {
                                    int[] count = state.executeBatch();
                                    objKeluar.conn.commit();
                                    objKeluar.conn.close();
                                }
                                catch (SQLException ex) {
                                    Logger.getLogger(formKeluar.class.getName()).log(Level.SEVERE, null, ex);
                                    JOptionPane.showMessageDialog(null, ex.getMessage());
                                }
                                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Error, qty_keluar harus lebih kecil dari qty_stock !!!");
                        }
                    }
                    
                    cleanData();
                    isiTabel(0);
                }
            } 
            catch(HeadlessException | NumberFormatException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(formKeluar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        objKeluar.Access();
        
        try{
            Statement state = objKeluar.conn.createStatement();
            objKeluar.conn.setAutoCommit(false);
            
            objKeluar.idKeluar = txtIdKeluar.getText();
            
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            objKeluar.tglKeluar = date.format(dateKeluar.getDate());
            
            Object keyBarang = cboBarangKeluar.getSelectedItem();
            String valueBarang = ((clsComboBarang)keyBarang).getValue();
            objKeluar.idBarang = valueBarang;
                
            Object keyCustomer = cboCustomer.getSelectedItem();
            String valueCustomer = ((clsComboCustomer)keyCustomer).getValue();
            objKeluar.idCustomer = valueCustomer;
            
            String mHargaSatuan = txtHargaSatuanKeluar.getText();
            objKeluar.hargaSatuan = Float.parseFloat(mHargaSatuan);
                
            String mQty = txtQTYKeluar.getText();
            objKeluar.qty = Integer.parseInt(mQty);
                
            float totalHarga = objKeluar.qty * objKeluar.hargaSatuan;
            objKeluar.totalHarga = totalHarga;
            
            objKeluar.keterangan = txtKeteranganKeluar.getText();
            
            String jenisTransaksi = cboJenisTransaksi.getSelectedItem().toString();
                
            if(jenisTransaksi.equalsIgnoreCase("Penjualan")){
                objKeluar.jenisTransaksi = "penjualan";
            } else if(jenisTransaksi.equalsIgnoreCase("Retur Penjualan")){
                objKeluar.jenisTransaksi = "retur_penjualan";
            }
        
            String SQL = "SELECT qty_stock, qty_keluar FROM `data_stock` s, `data_barang_keluar` k "
                    + "WHERE s.id_barang = '" + objKeluar.idBarang + "' "
                    + "AND id_keluar = '" + objKeluar.idKeluar + "'";
            ResultSet result = state.executeQuery(SQL);
            
            if(result.next()){
                if(jenisTransaksi.equalsIgnoreCase("Penjualan")){
                    String mQtyStock = result.getString("qty_stock");
                    int qty_stock_lama = Integer.parseInt(mQtyStock);
                    
                    String mQtyOutcomingLama = result.getString("qty_keluar");
                    int qty_keluar_lama = Integer.parseInt(mQtyOutcomingLama);
                
                    if(qty_stock_lama > qty_keluar_lama){
                        int qty_stock_baru = qty_stock_lama + qty_keluar_lama - objKeluar.qty;
                    
                        if(qty_stock_baru > 0){
                            String SQL2 = "UPDATE data_stock SET qty_stock = '" + qty_stock_baru + "' WHERE id_barang = '" + objKeluar.idBarang + "'";
                            state.addBatch(SQL2);
                
                            String SQL3 = "UPDATE data_barang_keluar SET id_barang = '"
                                + objKeluar.idBarang + "', id_customer = '" + objKeluar.idCustomer 
                                + "', tgl_keluar = '" + objKeluar.tglKeluar + "', qty_keluar = '" + objKeluar.qty
                                + "', harga_satuan = '" + objKeluar.hargaSatuan + "', total_harga = '" + objKeluar.totalHarga
                                + "', keterangan = '" + objKeluar.keterangan +"', jenis_transaksi = '" + objKeluar.jenisTransaksi + "' WHERE id_keluar = '" + objKeluar.idKeluar + "'";
                            state.addBatch(SQL3);
                        
                            try {
                                int[] count = state.executeBatch();
                                objKeluar.conn.commit();
                                objKeluar.conn.close();
                            }
                            catch (SQLException ex) {
                                Logger.getLogger(formKeluar.class.getName()).log(Level.SEVERE, null, ex);
                                JOptionPane.showMessageDialog(null, ex.getMessage());
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
                    } else if (qty_stock_lama < qty_keluar_lama){
                        JOptionPane.showMessageDialog(null, "Error, qty_keluar harus lebih kecil dari qty_stock !!!");
                    }
                }
                
                else if(jenisTransaksi.equalsIgnoreCase("Retur Penjualan")){
                    String mQtyStock = result.getString("qty_stock");
                    int qty_stock_lama = Integer.parseInt(mQtyStock);
                    
                    int qty_stock_baru = qty_stock_lama + objKeluar.qty;
                    
                    if(qty_stock_baru > 0){
                        String SQL2 = "UPDATE data_stock SET qty_stock = '" + qty_stock_baru + "' WHERE id_barang = '" + objKeluar.idBarang + "'";
                        state.addBatch(SQL2);
                
                        String SQL3 = "UPDATE data_barang_keluar SET id_barang = '"
                            + objKeluar.idBarang + "', id_customer = '" + objKeluar.idCustomer 
                            + "', tgl_keluar = '" + objKeluar.tglKeluar + "', qty_keluar = '" + objKeluar.qty
                            + "', harga_satuan = '" + objKeluar.hargaSatuan + "', total_harga = '" + objKeluar.totalHarga
                            + "', keterangan = '" + objKeluar.keterangan + "', jenis_transaksi = '" + objKeluar.jenisTransaksi + "' WHERE id_keluar = '" + objKeluar.idKeluar + "'";
                            state.addBatch(SQL3);
                        
                        try {
                            int[] count = state.executeBatch();
                            objKeluar.conn.commit();
                            objKeluar.conn.close();
                        }
                        catch (SQLException ex) {
                            Logger.getLogger(formKeluar.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
                }
                
                cleanData();
                isiTabel(0);
            }
        } catch(HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Proses pengeditan gagal");
            System.out.println(e.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(formKeluar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void cboBarangKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBarangKeluarActionPerformed
       
    }//GEN-LAST:event_cboBarangKeluarActionPerformed

    private void tabelBarangKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangKeluarMouseClicked
        int baris = tabelBarangKeluar.getSelectedRow();
        String id = tabelBarangKeluar.getValueAt(baris, 0).toString();
        String tglKeluar = tabelBarangKeluar.getValueAt(baris, 1).toString();
        String namaBarang = tabelBarangKeluar.getValueAt(baris, 2).toString();
        String namaCustomer = tabelBarangKeluar.getValueAt(baris, 3).toString();
        String harga = tabelBarangKeluar.getValueAt(baris, 4).toString();
        String qty = tabelBarangKeluar.getValueAt(baris, 5).toString();
        String keterangan = tabelBarangKeluar.getValueAt(baris, 7).toString();
        String jenis = tabelBarangKeluar.getValueAt(baris, 8).toString();
        
        txtIdKeluar.setText(id);
        txtHargaSatuanKeluar.setText(harga);
        txtQTYKeluar.setText(qty);
        txtKeteranganKeluar.setText(keterangan);
        
        cboBarangKeluar.setSelectedItem(namaBarang);
        cboCustomer.setSelectedItem(namaCustomer);
        cboJenisTransaksi.setSelectedItem(jenis);
        
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateKeluar.setDate(date.parse(tglKeluar));
        } catch (ParseException ex) {
            Logger.getLogger(formKeluar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelBarangKeluarMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchQuery = txtSearch.getText();
        searchQuery(searchQuery);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void cboSelectTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboSelectTransaksiMouseClicked

    }//GEN-LAST:event_cboSelectTransaksiMouseClicked

    private void cboSelectTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSelectTransaksiActionPerformed
        int index = cboSelectTransaksi.getSelectedIndex();
        isiTabel(index);
    }//GEN-LAST:event_cboSelectTransaksiActionPerformed
    
    public void isiComboCustomer() {
        try{
            cboCustomer.removeAllItems();
            objKeluar.Access();
            String sql = "SELECT `id_customer`, `nama_customer` FROM data_customer";
            Statement state = objKeluar.conn.createStatement();
            ResultSet result = state.executeQuery(sql);
            
            DefaultComboBoxModel model = new DefaultComboBoxModel();
        
            while(result.next())
            {
                model.addElement(new clsComboCustomer(result.getString(2), result.getString(1)));
            }
            cboCustomer.setModel(model);
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void isiComboBarang(){
        try{
            cboBarangKeluar.removeAllItems();
            objKeluar.Access();
            String sql = "SELECT `id_barang`, `nama_barang` FROM data_stock";
            Statement state = objKeluar.conn.createStatement();
            ResultSet result = state.executeQuery(sql);
            
            DefaultComboBoxModel model = new DefaultComboBoxModel();
        
            while(result.next())
            {
                model.addElement(new clsComboBarang(result.getString(2), result.getString(1)));
            }
            cboBarangKeluar.setModel(model);
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void isiTabel(int index){
        DefaultTableModel tabelDataKeluar = new DefaultTableModel();
        
        tabelDataKeluar.addColumn("ID Keluar");
        tabelDataKeluar.addColumn("Tanggal Keluar");
        tabelDataKeluar.addColumn("Nama Barang");
        tabelDataKeluar.addColumn("Nama Customer");
        tabelDataKeluar.addColumn("Harga Satuan");
        tabelDataKeluar.addColumn("QTY Keluar");
        tabelDataKeluar.addColumn("Total Harga");
        tabelDataKeluar.addColumn("Keterangan");
        tabelDataKeluar.addColumn("Jenis Transaksi");
        
        try{
            objKeluar.Access();
            objKeluar.getOutcomingData();
            
            switch (cboSelectTransaksi.getSelectedIndex()) {
                case 0 ->{
                    String sql = "SELECT id_keluar, nama_barang, nama_customer, tgl_keluar,"
                        + " k.harga_satuan, qty_keluar, k.total_harga, keterangan, jenis_transaksi"
                            + " FROM `data_barang_keluar` k, `data_customer` cs, `data_stock` s "
                            + "WHERE cs.id_customer = k.id_customer AND s.id_barang = k.id_barang";
                    Statement state = objKeluar.conn.createStatement();
                    ResultSet result = state.executeQuery(sql);
            
                    while(result.next()){
                        tabelDataKeluar.addRow(new Object[] {result.getString(1),
                        result.getString(4), result.getString(2),
                        result.getString(3), result.getString(5),
                        result.getString(6), result.getString(7),
                        result.getString(8), result.getString(9)});
                    }
                    tabelBarangKeluar.setModel(tabelDataKeluar);
                }
                case 1 ->{
                    String jenis_transaksi = "penjualan";
                    String sql = "SELECT id_keluar, nama_barang, nama_customer, tgl_keluar,"
                            + " k.harga_satuan, qty_keluar, k.total_harga, keterangan, jenis_transaksi"
                            + " FROM `data_barang_keluar` k, `data_customer` cs, `data_stock` s "
                            + "WHERE cs.id_customer = k.id_customer AND s.id_barang = k.id_barang"
                            + " AND jenis_transaksi = '" + jenis_transaksi + "'";
                    Statement state = objKeluar.conn.createStatement();
                    ResultSet result = state.executeQuery(sql);
            
                    while(result.next()){
                        tabelDataKeluar.addRow(new Object[] {result.getString(1),
                        result.getString(4), result.getString(2),
                        result.getString(3), result.getString(5),
                        result.getString(6), result.getString(7),
                        result.getString(8), result.getString(9)});
                    }
                    tabelBarangKeluar.setModel(tabelDataKeluar);
                }
                
                case 2 ->{
                    String jenis_transaksi = "retur_penjualan";
                    String sql = "SELECT id_keluar, nama_barang, nama_customer, tgl_keluar,"
                            + " k.harga_satuan, qty_keluar, k.total_harga, keterangan, jenis_transaksi"
                            + " FROM `data_barang_keluar` k, `data_customer` cs, `data_stock` s "
                            + "WHERE cs.id_customer = k.id_customer AND s.id_barang = k.id_barang"
                            + " AND jenis_transaksi = '" + jenis_transaksi + "'";
                    Statement state = objKeluar.conn.createStatement();
                    ResultSet result = state.executeQuery(sql);
            
                    while(result.next()){
                        tabelDataKeluar.addRow(new Object[] {result.getString(1),
                        result.getString(4), result.getString(2),
                        result.getString(3), result.getString(5),
                        result.getString(6), result.getString(7),
                        result.getString(8), result.getString(9)});
                    }
                    tabelBarangKeluar.setModel(tabelDataKeluar);
                }
                default ->{
                    String sql = "SELECT id_keluar, nama_barang, nama_customer, tgl_keluar,"
                        + " k.harga_satuan, qty_keluar, k.total_harga, keterangan, jenis_transaksi"
                            + " FROM `data_barang_keluar` k, `data_customer` cs, `data_stock` s "
                            + "WHERE cs.id_customer = k.id_customer AND s.id_barang = k.id_barang";
                    Statement state = objKeluar.conn.createStatement();
                    ResultSet result = state.executeQuery(sql);
            
                    while(result.next()){
                        tabelDataKeluar.addRow(new Object[] {result.getString(1),
                        result.getString(4), result.getString(2),
                        result.getString(3), result.getString(5),
                        result.getString(6), result.getString(7),
                        result.getString(8), result.getString(9)});
                    }
                    tabelBarangKeluar.setModel(tabelDataKeluar);
                }
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan pada penampilan data !!!");
            System.out.println(e.getMessage());
        }
    }
    
    public void isiComboJenisTransaksi(){
        cboJenisTransaksi.removeAllItems();
        cboJenisTransaksi.addItem("Penjualan");
        cboJenisTransaksi.addItem("Retur Penjualan");
    }
    
    public void isiComboPilihTransaksi(){
        cboSelectTransaksi.removeAllItems();
        cboSelectTransaksi.addItem("Semua Transaksi");
        cboSelectTransaksi.addItem("Penjualan");
        cboSelectTransaksi.addItem("Retur Penjualan");
    }
    
    public void cleanData()
    {
        txtIdKeluar.setText("");
        txtHargaSatuanKeluar.setText("");
        txtQTYKeluar.setText("");
        txtKeteranganKeluar.setText("");
        isiComboBarang();
        isiComboCustomer();
        isiComboPilihTransaksi();
        isiComboJenisTransaksi();
    }
    
    public void searchQuery(String query){
        DefaultTableModel tabelDataKeluar;
        tabelDataKeluar = (DefaultTableModel) tabelBarangKeluar.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tabelDataKeluar);
        tabelBarangKeluar.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + query));
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cboBarangKeluar;
    private javax.swing.JComboBox<String> cboCustomer;
    private javax.swing.JComboBox<String> cboJenisTransaksi;
    private javax.swing.JComboBox<String> cboSelectTransaksi;
    private com.toedter.calendar.JDateChooser dateKeluar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelBarang;
    private javax.swing.JLabel labelCustomer;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelIdKeluar;
    private javax.swing.JLabel labelKeluar;
    private javax.swing.JLabel labelKeterangan;
    private javax.swing.JLabel labelKeterangan1;
    private javax.swing.JLabel labelQTY;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelSearch1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelFooter;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tabelBarangKeluar;
    private javax.swing.JTextField txtHargaSatuanKeluar;
    private javax.swing.JTextField txtIdKeluar;
    private javax.swing.JTextField txtKeteranganKeluar;
    private javax.swing.JTextField txtQTYKeluar;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
