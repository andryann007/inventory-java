package code;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Andryan
 */
public final class formLaporanMasuk extends javax.swing.JPanel {

    clsMasuk objMasuk = new clsMasuk();
    
    public formLaporanMasuk() {
        initComponents();
        isiComboJenisTransaksi();
        isiTabel(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cboJenisTransaksi = new javax.swing.JComboBox<>();
        labelSearch1 = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarangMasuk = new javax.swing.JTable();
        txtIdMasuk = new javax.swing.JLabel();
        labelNamaBarang = new javax.swing.JLabel();
        txtNamaBarang = new javax.swing.JLabel();
        labelHargaSatuan = new javax.swing.JLabel();
        txtHargaSatuan = new javax.swing.JLabel();
        labelIdMasuk = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JLabel();
        labelTotalHarga = new javax.swing.JLabel();
        labelKeterangan = new javax.swing.JLabel();
        txtKeterangan = new javax.swing.JLabel();
        txtQtyMasuk = new javax.swing.JLabel();
        labelQtyMasuk = new javax.swing.JLabel();
        txtNamaSupplier = new javax.swing.JLabel();
        labelNamaSupplier = new javax.swing.JLabel();
        txtTglMasuk = new javax.swing.JLabel();
        labelTglMasuk = new javax.swing.JLabel();
        labelJenisTransaksi = new javax.swing.JLabel();
        txtJenisTransaksi = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnPrint = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        labelTitle.setText("Laporan Barang Masuk");

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

        cboJenisTransaksi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboJenisTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboJenisTransaksiActionPerformed(evt);
            }
        });

        labelSearch1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelSearch1.setText("Jenis Transaksi :");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSearch1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboJenisTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(labelTitle)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelSearch1)
                        .addComponent(cboJenisTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelSearch)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelBody.setBackground(new java.awt.Color(255, 255, 255));

        tabelBarangMasuk.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        tabelBarangMasuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Masuk", "Tanggal Masuk", "Nama Barang", "Nama Supplier", "Harga Satuan", "QTY Masuk", "Total Harga", "Keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
        if (tabelBarangMasuk.getColumnModel().getColumnCount() > 0) {
            tabelBarangMasuk.getColumnModel().getColumn(0).setResizable(false);
            tabelBarangMasuk.getColumnModel().getColumn(1).setResizable(false);
            tabelBarangMasuk.getColumnModel().getColumn(2).setResizable(false);
            tabelBarangMasuk.getColumnModel().getColumn(3).setResizable(false);
            tabelBarangMasuk.getColumnModel().getColumn(4).setResizable(false);
            tabelBarangMasuk.getColumnModel().getColumn(5).setResizable(false);
            tabelBarangMasuk.getColumnModel().getColumn(6).setResizable(false);
            tabelBarangMasuk.getColumnModel().getColumn(7).setResizable(false);
        }

        txtIdMasuk.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtIdMasuk.setText("ID Masuk");

        labelNamaBarang.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelNamaBarang.setText("Nama Barang :");

        txtNamaBarang.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtNamaBarang.setText("Nama Barang");

        labelHargaSatuan.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelHargaSatuan.setText("Harga Satuan :");

        txtHargaSatuan.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtHargaSatuan.setText("Harga Satuan");

        labelIdMasuk.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelIdMasuk.setText("ID Masuk :");

        txtTotalHarga.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtTotalHarga.setText("Total Harga");

        labelTotalHarga.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelTotalHarga.setText("Total Harga :");

        labelKeterangan.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelKeterangan.setText("Keterangan :");

        txtKeterangan.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtKeterangan.setText("Keterangan");

        txtQtyMasuk.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtQtyMasuk.setText("Qty Masuk");

        labelQtyMasuk.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelQtyMasuk.setText("QTY Masuk :");

        txtNamaSupplier.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtNamaSupplier.setText("Nama Supplier");

        labelNamaSupplier.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelNamaSupplier.setText("Nama Supplier :");

        txtTglMasuk.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtTglMasuk.setText("Tgl Masuk");

        labelTglMasuk.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelTglMasuk.setText("Tgl Masuk :");

        labelJenisTransaksi.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        labelJenisTransaksi.setText("Jenis Transaksi :");

        txtJenisTransaksi.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelHargaSatuan)
                    .addComponent(labelIdMasuk)
                    .addComponent(labelNamaBarang)
                    .addComponent(labelTotalHarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamaBarang)
                    .addComponent(txtIdMasuk)
                    .addComponent(txtHargaSatuan)
                    .addComponent(txtTotalHarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(labelTglMasuk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTglMasuk))
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelQtyMasuk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtyMasuk))
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelKeterangan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKeterangan))
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addComponent(labelNamaSupplier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNamaSupplier)))
                .addGap(145, 145, 145))
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBodyLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(labelJenisTransaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJenisTransaksi))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJenisTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJenisTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdMasuk)
                            .addComponent(labelIdMasuk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNamaBarang)
                            .addComponent(txtNamaBarang))
                        .addGap(18, 18, 18)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelHargaSatuan)
                            .addComponent(txtHargaSatuan))
                        .addGap(18, 18, 18)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTotalHarga)
                            .addComponent(txtTotalHarga)))
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTglMasuk)
                            .addComponent(txtTglMasuk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNamaSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaSupplier))
                        .addGap(18, 18, 18)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelQtyMasuk)
                            .addComponent(txtQtyMasuk))
                        .addGap(18, 18, 18)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelKeterangan)
                            .addComponent(txtKeterangan))))
                .addGap(14, 14, 14))
        );

        add(panelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 430));

        btnPrint.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print-solid.png"))); // NOI18N
        btnPrint.setText("PRINT");
        btnPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintMouseClicked(evt);
            }
        });
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 200, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchQuery = txtSearch.getText();
        searchQuery(searchQuery);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tabelBarangMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMasukMouseClicked
        int baris = tabelBarangMasuk.getSelectedRow();
        String id = tabelBarangMasuk.getValueAt(baris, 0).toString();
        String tglMasuk = tabelBarangMasuk.getValueAt(baris, 1).toString();
        String namaBarang = tabelBarangMasuk.getValueAt(baris, 2).toString();
        String namaSupplier = tabelBarangMasuk.getValueAt(baris, 3).toString();
        String hargaSatuan = tabelBarangMasuk.getValueAt(baris, 4).toString();
        String qty = tabelBarangMasuk.getValueAt(baris, 5).toString();
        String totalHarga = tabelBarangMasuk.getValueAt(baris, 6).toString();
        String keterangan = tabelBarangMasuk.getValueAt(baris, 7).toString();
        String jenisTransaksi = tabelBarangMasuk.getValueAt(baris, 8).toString(); 
        
        txtJenisTransaksi.setText("");
        txtIdMasuk.setText("");
        txtTglMasuk.setText("");
        txtNamaBarang.setText("");
        txtNamaSupplier.setText("");
        txtHargaSatuan.setText("");
        txtQtyMasuk.setText("");
        txtTotalHarga.setText("");
        txtKeterangan.setText("");
        
        if(jenisTransaksi.equalsIgnoreCase("pembelian")){
            txtJenisTransaksi.setText("Transaksi Pembelian");
        } else {
            txtJenisTransaksi.setText("Transaksi Retur Pembelian");
        }
        
        txtIdMasuk.setText(id);
        txtTglMasuk.setText(tglMasuk);
        txtNamaBarang.setText(namaBarang);
        txtNamaSupplier.setText(namaSupplier);
        txtHargaSatuan.setText("Rp. " + hargaSatuan);
        txtQtyMasuk.setText(qty);
        txtTotalHarga.setText("Rp. " + totalHarga);
        txtKeterangan.setText(keterangan);
    }//GEN-LAST:event_tabelBarangMasukMouseClicked

    private void cboJenisTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJenisTransaksiActionPerformed
        int index = cboJenisTransaksi.getSelectedIndex();
        isiTabel(index);
    }//GEN-LAST:event_cboJenisTransaksiActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
        objMasuk.Access();

        try{
            DefaultTableModel model = (DefaultTableModel) tabelBarangMasuk.getModel();
            
            switch (cboJenisTransaksi.getSelectedIndex()) {
                case 1 ->                     {
                        JasperPrint jasperPrint = null;
                        JasperCompileManager.compileReportToFile("D:\\CODING\\JAVA\\Inventory\\Inventory\\src\\code\\reportMasuk.jrxml");
                        jasperPrint = JasperFillManager.fillReport("D:\\CODING\\JAVA\\Inventory\\Inventory\\src\\code\\reportMasuk.jasper", null, new JRTableModelDataSource(model));
                        JasperViewer.viewReport(jasperPrint, false);
                    }
                case 2 ->                     {
                        JasperPrint jasperPrint = null;
                        JasperCompileManager.compileReportToFile("D:\\CODING\\JAVA\\Inventory\\Inventory\\src\\code\\reportReturMasuk.jrxml");
                        jasperPrint = JasperFillManager.fillReport("D:\\CODING\\JAVA\\Inventory\\Inventory\\src\\code\\reportReturMasuk.jasper", null, new JRTableModelDataSource(model));
                        JasperViewer.viewReport(jasperPrint, false);
                    }
                default ->                     {
                        JasperPrint jasperPrint = null;
                        JasperCompileManager.compileReportToFile("D:\\CODING\\JAVA\\Inventory\\Inventory\\src\\code\\reportMasuk.jrxml");
                        jasperPrint = JasperFillManager.fillReport("D:\\CODING\\JAVA\\Inventory\\Inventory\\src\\code\\reportMasuk.jasper", null, new JRTableModelDataSource(model));
                        JasperViewer.viewReport(jasperPrint, false);
                    }
            }
        }
        catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnPrintMouseClicked

    public void searchQuery(String query){
        DefaultTableModel tabelDataMasuk;
        tabelDataMasuk = (DefaultTableModel) tabelBarangMasuk.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tabelDataMasuk);
        tabelBarangMasuk.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + query));
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
            
            switch (cboJenisTransaksi.getSelectedIndex()) {
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
    
    public void isiComboJenisTransaksi(){
        cboJenisTransaksi.removeAllItems();
        cboJenisTransaksi.addItem("Semua Transaksi");
        cboJenisTransaksi.addItem("Pembelian");
        cboJenisTransaksi.addItem("Retur Pembelian");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JComboBox<String> cboJenisTransaksi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelHargaSatuan;
    private javax.swing.JLabel labelIdMasuk;
    private javax.swing.JLabel labelJenisTransaksi;
    private javax.swing.JLabel labelKeterangan;
    private javax.swing.JLabel labelNamaBarang;
    private javax.swing.JLabel labelNamaSupplier;
    private javax.swing.JLabel labelQtyMasuk;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelSearch1;
    private javax.swing.JLabel labelTglMasuk;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTotalHarga;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tabelBarangMasuk;
    private javax.swing.JLabel txtHargaSatuan;
    private javax.swing.JLabel txtIdMasuk;
    private javax.swing.JLabel txtJenisTransaksi;
    private javax.swing.JLabel txtKeterangan;
    private javax.swing.JLabel txtNamaBarang;
    private javax.swing.JLabel txtNamaSupplier;
    private javax.swing.JLabel txtQtyMasuk;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtTglMasuk;
    private javax.swing.JLabel txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}
