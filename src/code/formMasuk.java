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
public final class formMasuk extends javax.swing.JPanel {

    clsMasuk objMasuk = new clsMasuk();
    notifikasiSukses sukses = new notifikasiSukses();
    
    public formMasuk() {
        initComponents();
        isiTabel(0);
        isiComboBarang();
        isiComboSupplier();
        isiComboJenisTransaksi();
        isiComboPilihTransaksi();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        panelHeader = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        labelSearch1 = new javax.swing.JLabel();
        cboSelectTransaksi = new javax.swing.JComboBox<>();
        panelBody = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarangMasuk = new javax.swing.JTable();
        labelIdBarang = new javax.swing.JLabel();
        txtIdMasuk = new javax.swing.JTextField();
        labelBarang = new javax.swing.JLabel();
        labelSupplier = new javax.swing.JLabel();
        txtHargaSatuan = new javax.swing.JTextField();
        labelMasuk = new javax.swing.JLabel();
        txtQTYMasuk = new javax.swing.JTextField();
        cboBarang = new javax.swing.JComboBox<>();
        labelHarga = new javax.swing.JLabel();
        txtKeterangan = new javax.swing.JTextField();
        labelKeterangan = new javax.swing.JLabel();
        labelQTY = new javax.swing.JLabel();
        dateMasuk = new com.toedter.calendar.JDateChooser();
        cboSupplier = new javax.swing.JComboBox<>();
        labelKeterangan1 = new javax.swing.JLabel();
        cboJenisTransaksi = new javax.swing.JComboBox<>();
        panelFooter = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        labelTitle.setText("Data Barang Masuk");

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

        labelSearch1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelSearch1.setText("Pilih Transaksi :");

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

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(labelTitle)
                .addContainerGap(256, Short.MAX_VALUE))
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
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSearch1)
                    .addComponent(cboSelectTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        panelBody.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(738, 250));

        tabelBarangMasuk.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        tabelBarangMasuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Masuk", "Tanggal Masuk", "Nama Barang", "Nama Supplier", "Harga Satuan", "QTY Masuk", "Total Harga", "Keterangan", "Jenis Transaksi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelBarangMasuk.setColumnSelectionAllowed(true);
        tabelBarangMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMasukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarangMasuk);
        tabelBarangMasuk.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );

        labelIdBarang.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelIdBarang.setText("ID Masuk :");

        txtIdMasuk.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtIdMasuk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdMasukKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdMasukKeyTyped(evt);
            }
        });

        labelBarang.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelBarang.setText("Nama Barang :");

        labelSupplier.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelSupplier.setText("Nama Supplier :");

        txtHargaSatuan.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtHargaSatuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHargaSatuanKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHargaSatuanKeyTyped(evt);
            }
        });

        labelMasuk.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelMasuk.setText("Tanggal Masuk :");

        txtQTYMasuk.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtQTYMasuk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQTYMasukKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQTYMasukKeyTyped(evt);
            }
        });

        cboBarang.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        cboBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBarangActionPerformed(evt);
            }
        });

        labelHarga.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelHarga.setText("Harga / Pcs :");

        txtKeterangan.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtKeterangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKeteranganActionPerformed(evt);
            }
        });

        labelKeterangan.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelKeterangan.setText("Keterangan :");

        labelQTY.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelQTY.setText("QTY Masuk :");

        dateMasuk.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N

        cboSupplier.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        cboSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSupplierActionPerformed(evt);
            }
        });

        labelKeterangan1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelKeterangan1.setText("Jenis Transaksi :");

        cboJenisTransaksi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBodyLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelBarang)
                                    .addComponent(labelHarga)
                                    .addComponent(labelKeterangan1))
                                .addGap(18, 18, 18)
                                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboJenisTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(labelIdBarang)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSupplier, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelQTY, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMasuk, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelKeterangan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtKeterangan)
                    .addComponent(txtQTYMasuk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(dateMasuk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboSupplier, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(labelIdBarang)
                        .addComponent(txtIdMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelMasuk))
                    .addComponent(dateMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelBarang))
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelSupplier)))
                .addGap(23, 23, 23)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHarga)
                    .addComponent(labelQTY)
                    .addComponent(txtQTYMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKeterangan)
                    .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboJenisTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKeterangan1))
                .addGap(16, 16, 16))
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

    private void txtIdMasukKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdMasukKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(((txtIdMasuk.getText().isEmpty())))
            {
                JOptionPane.showMessageDialog(this, "ID Masuk Tidak Boleh Kosong !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtIdMasuk.requestFocus();
            }
            else
            {
            } 
        }
    }//GEN-LAST:event_txtIdMasukKeyPressed

    private void txtIdMasukKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdMasukKeyTyped

    }//GEN-LAST:event_txtIdMasukKeyTyped

    private void txtHargaSatuanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaSatuanKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaSatuanKeyPressed

    private void txtHargaSatuanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaSatuanKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaSatuanKeyTyped

    private void txtQTYMasukKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYMasukKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTYMasukKeyPressed

    private void txtQTYMasukKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYMasukKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTYMasukKeyTyped

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        objMasuk.Access();
        
        try{
            Statement state = objMasuk.conn.createStatement();
            objMasuk.conn.setAutoCommit(false);
                
            objMasuk.idMasuk = txtIdMasuk.getText();
            
            Object keyBarang = cboBarang.getSelectedItem();
            String valueBarang = ((clsComboBarang)keyBarang).getValue();
            objMasuk.idBarang = valueBarang;
            
            String SQL = "SELECT qty_stock, qty_masuk FROM `data_stock` s, `data_barang_masuk` m "
                    + "WHERE s.id_barang = '" + objMasuk.idBarang + "'"
                    + "AND id_masuk = '" + objMasuk.idMasuk + "'";
            ResultSet result = state.executeQuery(SQL);
            
            if(result.next()){
                String SQL2 = "DELETE FROM data_barang_masuk WHERE id_masuk = '" + objMasuk.idMasuk + "'";
                state.addBatch(SQL2);
                
                String mQtyStock = result.getString("qty_stock");
                int qty_stock_lama = Integer.parseInt(mQtyStock);
                 
                String mQtyIncoming = result.getString("qty_masuk");
                int qty_masuk = Integer.parseInt(mQtyIncoming);
                
                if(qty_stock_lama > qty_masuk){
                    int qty_stock_baru = qty_stock_lama - qty_masuk;
                    
                    if(qty_stock_baru > 0){
                        String SQL3 = "UPDATE data_stock SET qty_stock = '" + qty_stock_baru + "' WHERE id_barang = '" + objMasuk.idBarang +"'";
                        state.addBatch(SQL3);
                        
                        try {
                            int[] count = state.executeBatch();
                            objMasuk.conn.commit();
                            objMasuk.conn.close();
                        }
                        catch (SQLException ex) {
                            Logger.getLogger(formMasuk.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                    }
                    sukses.setMessage("Data Berhasil di Hapus !!!");
                    sukses.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Error, qty_stock harus lebih besar dari qty_masuk !!!");
                }
            }
            cleanData();
            isiTabel(0);
        }
        catch(HeadlessException e){
            JOptionPane.showMessageDialog(null, "Proses penghapusan data gagal");
            System.out.println(e.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(formMasuk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        objMasuk.Access();
        
        if(txtIdMasuk.getText().equals(""))
        {
            JOptionPane.showMessageDialog( null, "ID Masuk Tidak Boleh Kosong!!!");
        }
        else {
            try{
                Statement state = objMasuk.conn.createStatement();
                objMasuk.conn.setAutoCommit(false);
                
                objMasuk.idMasuk = txtIdMasuk.getText();
            
                SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                objMasuk.tglMasuk = date.format(dateMasuk.getDate());
                
                Object keyBarang = cboBarang.getSelectedItem();
                String valueBarang = ((clsComboBarang)keyBarang).getValue();
                objMasuk.idBarang = valueBarang;
                
                Object keySupplier = cboSupplier.getSelectedItem();
                String valueSupplier = ((clsComboSupplier)keySupplier).getValue();
                objMasuk.idSupplier = valueSupplier;
            
                String mHargaSatuan = txtHargaSatuan.getText();
                objMasuk.hargaSatuan = Float.parseFloat(mHargaSatuan);
                
                String mQty = txtQTYMasuk.getText();
                objMasuk.qty = Integer.parseInt(mQty);
                
                float totalHarga = objMasuk.qty * objMasuk.hargaSatuan;
                objMasuk.totalHarga = totalHarga;
            
                objMasuk.keterangan = txtKeterangan.getText();
                
                String jenisTransaksi = cboJenisTransaksi.getSelectedItem().toString();
                
                if(jenisTransaksi.equalsIgnoreCase("Pembelian")){
                    objMasuk.jenisTransaksi = "pembelian";
                } else if(jenisTransaksi.equalsIgnoreCase("Retur Pembelian")){
                    objMasuk.jenisTransaksi = "retur_pembelian";
                }
                
                String SQL = "SELECT qty_stock, qty_masuk FROM `data_stock` s, `data_barang_masuk` m "
                        + "WHERE s.id_barang = '" + objMasuk.idBarang + "'";
                ResultSet result = state.executeQuery(SQL);
                
                if(result.next()){
                    if(jenisTransaksi.equalsIgnoreCase("Pembelian")){
                        String mQtyStock = result.getString("qty_stock");
                        int qty_stock = Integer.parseInt(mQtyStock);
                        qty_stock = objMasuk.qty + qty_stock;
                        
                        String SQL2 = "INSERT INTO data_barang_masuk(id_masuk, id_barang, id_supplier, tgl_masuk, qty_masuk,"
                                + "harga_satuan, total_harga, keterangan, jenis_transaksi) VALUE ('" + objMasuk.idMasuk + "', '" + objMasuk.idBarang
                                + "', '" + objMasuk.idSupplier + "', '" + objMasuk.tglMasuk + "', '" + objMasuk.qty + "', '"
                                + objMasuk.hargaSatuan + "', '" + objMasuk.totalHarga + "', '" + objMasuk.keterangan + "', '"
                                + objMasuk.jenisTransaksi + "')";
                        state.addBatch(SQL2);
                        
                        String SQL3 = "UPDATE data_stock SET qty_stock = '" + qty_stock + "' WHERE id_barang = '" + objMasuk.idBarang + "'";
                        state.addBatch(SQL3);
                        
                        try {
                            int[] count = state.executeBatch();
                            objMasuk.conn.commit();
                            objMasuk.conn.close();
                        }
                        catch (SQLException ex) {
                            Logger.getLogger(formMasuk.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                    } else if (jenisTransaksi.equalsIgnoreCase("Retur Pembelian")){
                        String mQtyStock = result.getString("qty_stock");
                        int qty_stock = Integer.parseInt(mQtyStock);
                        qty_stock = objMasuk.qty - qty_stock;
                        
                        String SQL2 = "INSERT INTO data_barang_masuk(id_masuk, id_barang, id_supplier, tgl_masuk, qty_masuk,"
                                + "harga_satuan, total_harga, keterangan, jenis_transaksi) VALUE ('" + objMasuk.idMasuk + "', '" + objMasuk.idBarang
                                + "', '" + objMasuk.idSupplier + "', '" + objMasuk.tglMasuk + "', '" + objMasuk.qty + "', '"
                                + objMasuk.hargaSatuan + "', '" + objMasuk.totalHarga + "', '" + objMasuk.keterangan + "', '"
                                + objMasuk.jenisTransaksi + "')";
                        state.addBatch(SQL2);
                        
                        String SQL3 = "UPDATE data_stock SET qty_stock = '" + qty_stock + "' WHERE id_barang = '" + objMasuk.idBarang + "'";
                        state.addBatch(SQL3);
                        
                        try {
                            int[] count = state.executeBatch();
                            objMasuk.conn.commit();
                            objMasuk.conn.close();
                        }
                        catch (SQLException ex) {
                            Logger.getLogger(formMasuk.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                    }
                    cleanData();
                    isiTabel(0);
                }
                sukses.setMessage("Data Berhasil di Simpan !!!");
                sukses.setVisible(true);
            } 
            catch(HeadlessException | NumberFormatException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(formMasuk.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        objMasuk.Access();
        
        try{
            Statement state = objMasuk.conn.createStatement();
            objMasuk.conn.setAutoCommit(false);
            
            objMasuk.idMasuk = txtIdMasuk.getText();
            
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            objMasuk.tglMasuk = date.format(dateMasuk.getDate());
            
            Object keyBarang = cboBarang.getSelectedItem();
            String valueBarang = ((clsComboBarang)keyBarang).getValue();
            objMasuk.idBarang = valueBarang;
                
            Object keySupplier = cboSupplier.getSelectedItem();
            String valueSupplier = ((clsComboSupplier)keySupplier).getValue();
            objMasuk.idSupplier = valueSupplier;
            
            String mHargaSatuan = txtHargaSatuan.getText();
            objMasuk.hargaSatuan = Float.parseFloat(mHargaSatuan);
                
            String mQty = txtQTYMasuk.getText();
            objMasuk.qty = Integer.parseInt(mQty);
                
            float totalHarga = objMasuk.qty * objMasuk.hargaSatuan;
            objMasuk.totalHarga = totalHarga;
            
            objMasuk.keterangan = txtKeterangan.getText();
            
            String jenisTransaksi = cboJenisTransaksi.getSelectedItem().toString();
                
            if(jenisTransaksi.equalsIgnoreCase("Pembelian")){
                objMasuk.jenisTransaksi = "pembelian";
            } else if(jenisTransaksi.equalsIgnoreCase("Retur Pembelian")){
                objMasuk.jenisTransaksi = "retur_pembelian";
            }
            
            String SQL = "SELECT qty_stock, qty_masuk FROM `data_stock` s, `data_barang_masuk` m "
                    + "WHERE s.id_barang = '" + objMasuk.idBarang + "' "
                    + "AND id_masuk = '" + objMasuk.idMasuk + "'";
            ResultSet result = state.executeQuery(SQL);
            
            if(result.next()){
                if(jenisTransaksi.equalsIgnoreCase("Pembelian")){
                    String mQtyStock = result.getString("qty_stock");
                    int qty_stock = Integer.parseInt(mQtyStock);
                    
                    String mQtyIncomingLama = result.getString("qty_masuk");
                    int qty_masuk_lama = Integer.parseInt(mQtyIncomingLama);
                    
                    int qty_stock_baru = (qty_stock - qty_masuk_lama) + objMasuk.qty;
                    
                    String SQL2 = "UPDATE data_stock SET qty_stock = '" + qty_stock_baru + "' WHERE id_barang = '" + objMasuk.idBarang + "'";
                    state.addBatch(SQL2);
                
                    String SQL3 = "UPDATE data_barang_masuk SET id_barang = '"
                        + objMasuk.idBarang + "', id_supplier = '" + objMasuk.idSupplier 
                        + "', tgl_masuk = '" + objMasuk.tglMasuk + "', qty_masuk = '" + objMasuk.qty
                        + "', harga_satuan = '" + objMasuk.hargaSatuan + "', total_harga = '" + objMasuk.totalHarga
                        + "', keterangan = '" + objMasuk.keterangan + "', jenis_transaksi ='" + objMasuk.jenisTransaksi
                        + "' WHERE id_masuk = '" + objMasuk.idMasuk + "'";
                    state.addBatch(SQL3);
                
                    try {
                        int[] count = state.executeBatch();
                        objMasuk.conn.commit();
                        objMasuk.conn.close();
                    }
                    catch (SQLException ex) {
                        Logger.getLogger(formMasuk.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                } else if (jenisTransaksi.equalsIgnoreCase("Retur Pembelian")){
                    String mQtyStock = result.getString("qty_stock");
                    int qty_stock = Integer.parseInt(mQtyStock);
                    
                    String mQtyIncomingLama = result.getString("qty_masuk");
                    int qty_masuk_lama = Integer.parseInt(mQtyIncomingLama);
                    
                    int qty_stock_baru = (qty_stock + qty_masuk_lama) - objMasuk.qty;
                    
                    String SQL2 = "UPDATE data_stock SET qty_stock = '" + qty_stock_baru + "' WHERE id_barang = '" + objMasuk.idBarang + "'";
                    state.addBatch(SQL2);
                
                    String SQL3 = "UPDATE data_barang_masuk SET id_barang = '"
                        + objMasuk.idBarang + "', id_supplier = '" + objMasuk.idSupplier 
                        + "', tgl_masuk = '" + objMasuk.tglMasuk + "', qty_masuk = '" + objMasuk.qty
                        + "', harga_satuan = '" + objMasuk.hargaSatuan + "', total_harga = '" + objMasuk.totalHarga
                        + "', keterangan = '" + objMasuk.keterangan + "', jenis_transaksi ='" + objMasuk.jenisTransaksi
                        + "' WHERE id_masuk = '" + objMasuk.idMasuk + "'";
                    state.addBatch(SQL3);
                
                    try {
                        int[] count = state.executeBatch();
                        objMasuk.conn.commit();
                        objMasuk.conn.close();
                    }
                    catch (SQLException ex) {
                        Logger.getLogger(formMasuk.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
                cleanData();
                isiTabel(0);
            }
            sukses.setMessage("Data Berhasil di Edit !!!");
            sukses.setVisible(true);
        } catch(HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Proses pengeditan gagal");
            System.out.println(e.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(formMasuk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void cboBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBarangActionPerformed
       
    }//GEN-LAST:event_cboBarangActionPerformed

    private void tabelBarangMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMasukMouseClicked
        int baris = tabelBarangMasuk.getSelectedRow();
        String id = tabelBarangMasuk.getValueAt(baris, 0).toString();
        String tglMasuk = tabelBarangMasuk.getValueAt(baris, 1).toString();
        String namaBarang = tabelBarangMasuk.getValueAt(baris, 2).toString();
        String namaSupplier = tabelBarangMasuk.getValueAt(baris, 3).toString();
        String harga = tabelBarangMasuk.getValueAt(baris, 4).toString();
        String qty = tabelBarangMasuk.getValueAt(baris, 5).toString();
        String keterangan = tabelBarangMasuk.getValueAt(baris, 7).toString();
        String jenis = tabelBarangMasuk.getValueAt(baris, 8).toString();
        
        txtIdMasuk.setText(id);
        txtHargaSatuan.setText(harga);
        txtQTYMasuk.setText(qty);
        txtKeterangan.setText(keterangan);
        
        cboBarang.setSelectedItem(namaBarang);
        cboSupplier.setSelectedItem(namaSupplier);
        cboJenisTransaksi.setSelectedItem(jenis);
        
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateMasuk.setDate(date.parse(tglMasuk));
        } catch (ParseException ex) {
            Logger.getLogger(formMasuk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelBarangMasukMouseClicked

    private void cboSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSupplierActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchQuery = txtSearch.getText();
        searchQuery(searchQuery);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtKeteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeteranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeteranganActionPerformed

    private void cboSelectTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboSelectTransaksiMouseClicked
       
    }//GEN-LAST:event_cboSelectTransaksiMouseClicked

    private void cboSelectTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSelectTransaksiActionPerformed
        int index = cboSelectTransaksi.getSelectedIndex();
        isiTabel(index);
    }//GEN-LAST:event_cboSelectTransaksiActionPerformed
    
    public void isiComboSupplier() {
        cboSupplier.removeAllItems();
        try{
            objMasuk.Access();
            String sql = "SELECT `id_supplier`, `nama_supplier` FROM data_supplier";
            Statement state = objMasuk.conn.createStatement();
            ResultSet result = state.executeQuery(sql);
            
            DefaultComboBoxModel model = new DefaultComboBoxModel();
        
            while(result.next())
            {
                model.addElement(new clsComboSupplier(result.getString(2), result.getString(1)));
            }
            cboSupplier.setModel(model);
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void isiComboBarang(){
        cboBarang.removeAllItems();
        try{
            objMasuk.Access();
            String sql = "SELECT `id_barang`, `nama_barang` FROM data_stock";
            Statement state = objMasuk.conn.createStatement();
            ResultSet result = state.executeQuery(sql);
            
            DefaultComboBoxModel model = new DefaultComboBoxModel();
        
            while(result.next())
            {
                model.addElement(new clsComboBarang(result.getString(2), result.getString(1)));
            }
            cboBarang.setModel(model);
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void isiComboJenisTransaksi(){
        cboJenisTransaksi.removeAllItems();
        cboJenisTransaksi.addItem("Pembelian");
        cboJenisTransaksi.addItem("Retur Pembelian");
    }
    
    public void isiComboPilihTransaksi(){
        cboSelectTransaksi.removeAllItems();
        cboSelectTransaksi.addItem("Semua Transaksi");
        cboSelectTransaksi.addItem("Pembelian");
        cboSelectTransaksi.addItem("Retur Pembelian");
    }
    
    public void isiTabel(int index){
        DefaultTableModel tabelDataMasuk = new DefaultTableModel();
        
        tabelDataMasuk.addColumn("ID Masuk");
        tabelDataMasuk.addColumn("Tanggal Masuk");
        tabelDataMasuk.addColumn("Nama Barang");
        tabelDataMasuk.addColumn("Nama Supplier");
        tabelDataMasuk.addColumn("Harga Satuan");
        tabelDataMasuk.addColumn("QTY Masuk");
        tabelDataMasuk.addColumn("Total Harga");
        tabelDataMasuk.addColumn("Keterangan");
        tabelDataMasuk.addColumn("Jenis Transaksi");
        
        try{
            objMasuk.Access();
            objMasuk.getIncomingData();
            
            switch (cboSelectTransaksi.getSelectedIndex()) {
                case 0 ->{
                        String sql = "SELECT id_masuk, nama_barang, nama_supplier, tgl_masuk,"
                                + " m.harga_satuan, qty_masuk, m.total_harga, keterangan, jenis_transaksi FROM `data_barang_masuk` m,"
                                + " `data_supplier` s, `data_stock` st WHERE s.id_supplier = m.id_supplier AND st.id_barang = m.id_barang";
                        Statement state = objMasuk.conn.createStatement();
                        ResultSet result = state.executeQuery(sql);
                        while(result.next()){
                            tabelDataMasuk.addRow(new Object[] {result.getString(1),
                                result.getString(4), result.getString(2),
                                result.getString(3), result.getString(5),
                                result.getString(6), result.getString(7),
                                result.getString(8), result.getString(9)});
                        }      
                        tabelBarangMasuk.setModel(tabelDataMasuk);
                    }
                case 1 ->{
                        String jenis_transaksi = "pembelian";
                        String sql = "SELECT id_masuk, nama_barang, nama_supplier, tgl_masuk,"
                                + " m.harga_satuan, qty_masuk, m.total_harga, keterangan, jenis_transaksi FROM `data_barang_masuk` m,"
                                + " `data_supplier` s, `data_stock` st WHERE s.id_supplier = m.id_supplier AND st.id_barang = m.id_barang"
                                + " AND m.jenis_transaksi = '" + jenis_transaksi + "'";
                        Statement state = objMasuk.conn.createStatement();
                        ResultSet result = state.executeQuery(sql);
                        while(result.next()){
                            tabelDataMasuk.addRow(new Object[] {result.getString(1),
                                result.getString(4), result.getString(2),
                                result.getString(3), result.getString(5),
                                result.getString(6), result.getString(7),
                                result.getString(8), result.getString(9)});
                        }       tabelBarangMasuk.setModel(tabelDataMasuk);
                    }
                
                case 2 ->{
                        String jenis_transaksi = "retur_pembelian";
                        String sql = "SELECT id_masuk, nama_barang, nama_supplier, tgl_masuk,"
                                + " m.harga_satuan, qty_masuk, m.total_harga, keterangan, jenis_transaksi FROM `data_barang_masuk` m,"
                                + " `data_supplier` s, `data_stock` st WHERE s.id_supplier = m.id_supplier AND st.id_barang = m.id_barang"
                                + " AND m.jenis_transaksi = '" + jenis_transaksi + "'";
                        Statement state = objMasuk.conn.createStatement();
                        ResultSet result = state.executeQuery(sql);
                        while(result.next()){
                            tabelDataMasuk.addRow(new Object[] {result.getString(1),
                                result.getString(4), result.getString(2),
                                result.getString(3), result.getString(5),
                                result.getString(6), result.getString(7),
                                result.getString(8), result.getString(9)});
                        }       tabelBarangMasuk.setModel(tabelDataMasuk);
                    }
                default ->                     {
                        String sql = "SELECT id_masuk, nama_barang, nama_supplier, tgl_masuk,"
                                + " m.harga_satuan, qty_masuk, m.total_harga, keterangan, jenis_transaksi FROM `data_barang_masuk` m,"
                                + " `data_supplier` s, `data_stock` st WHERE s.id_supplier = m.id_supplier AND st.id_barang = m.id_barang";
                        Statement state = objMasuk.conn.createStatement();
                        ResultSet result = state.executeQuery(sql);
                        while(result.next()){
                            tabelDataMasuk.addRow(new Object[] {result.getString(1),
                                result.getString(4), result.getString(2),
                                result.getString(3), result.getString(5),
                                result.getString(6), result.getString(7),
                                result.getString(8), result.getString(9)});
                        }      
                        tabelBarangMasuk.setModel(tabelDataMasuk);
                    }
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan pada penampilan data !!!");
            System.out.println(e.getMessage());
        }
    }
    
    public void cleanData()
    {
        txtIdMasuk.setText("");
        txtHargaSatuan.setText("");
        txtQTYMasuk.setText("");
        txtKeterangan.setText("");
        isiComboBarang();
        isiComboSupplier();
        isiComboJenisTransaksi();
        isiComboPilihTransaksi();
    }
    
    public void searchQuery(String query){
        DefaultTableModel tabelDataMasuk;
        tabelDataMasuk = (DefaultTableModel) tabelBarangMasuk.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tabelDataMasuk);
        tabelBarangMasuk.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + query));
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cboBarang;
    private javax.swing.JComboBox<String> cboJenisTransaksi;
    private javax.swing.JComboBox<String> cboSelectTransaksi;
    private javax.swing.JComboBox<String> cboSupplier;
    private com.toedter.calendar.JDateChooser dateMasuk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelBarang;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelIdBarang;
    private javax.swing.JLabel labelKeterangan;
    private javax.swing.JLabel labelKeterangan1;
    private javax.swing.JLabel labelMasuk;
    private javax.swing.JLabel labelQTY;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelSearch1;
    private javax.swing.JLabel labelSupplier;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelFooter;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tabelBarangMasuk;
    private javax.swing.JTextField txtHargaSatuan;
    private javax.swing.JTextField txtIdMasuk;
    private javax.swing.JTextField txtKeterangan;
    private javax.swing.JTextField txtQTYMasuk;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}