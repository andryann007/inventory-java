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
public final class formLaporanKeluar extends javax.swing.JPanel {

    clsKeluar objKeluar = new clsKeluar();
    
    public formLaporanKeluar() {
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
        tabelBarangKeluar = new javax.swing.JTable();
        labelIdKeluar = new javax.swing.JLabel();
        txtIdKeluar = new javax.swing.JLabel();
        labelNamaBarang = new javax.swing.JLabel();
        txtNamaBarang = new javax.swing.JLabel();
        labelHargaSatuan = new javax.swing.JLabel();
        txtHargaSatuan = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JLabel();
        labelTotalHarga = new javax.swing.JLabel();
        labelKeterangan = new javax.swing.JLabel();
        txtKeterangan = new javax.swing.JLabel();
        txtQtyKeluar = new javax.swing.JLabel();
        labelQtyKeluar = new javax.swing.JLabel();
        txtNamaCustomer = new javax.swing.JLabel();
        labelNamaCustomer = new javax.swing.JLabel();
        txtTglKeluar = new javax.swing.JLabel();
        labelTglKeluar = new javax.swing.JLabel();
        labelJenisTransaksi = new javax.swing.JLabel();
        txtJenisTransaksi = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnPrint = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        labelTitle.setText("Laporan Barang Keluar");

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
                        .addComponent(labelSearch)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelSearch1)
                        .addComponent(cboJenisTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        panelBody.setBackground(new java.awt.Color(255, 255, 255));

        tabelBarangKeluar.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        tabelBarangKeluar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Keluar", "Tanggal Keluar", "Nama Barang", "Nama Customer", "Harga Satuan", "QTY Keluar", "Total Harga", "Keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelBarangKeluar.setColumnSelectionAllowed(true);
        tabelBarangKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangKeluarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarangKeluar);
        tabelBarangKeluar.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabelBarangKeluar.getColumnModel().getColumnCount() > 0) {
            tabelBarangKeluar.getColumnModel().getColumn(0).setResizable(false);
            tabelBarangKeluar.getColumnModel().getColumn(1).setResizable(false);
            tabelBarangKeluar.getColumnModel().getColumn(2).setResizable(false);
            tabelBarangKeluar.getColumnModel().getColumn(3).setResizable(false);
            tabelBarangKeluar.getColumnModel().getColumn(4).setResizable(false);
            tabelBarangKeluar.getColumnModel().getColumn(5).setResizable(false);
            tabelBarangKeluar.getColumnModel().getColumn(6).setResizable(false);
            tabelBarangKeluar.getColumnModel().getColumn(7).setResizable(false);
        }

        labelIdKeluar.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelIdKeluar.setText("ID Keluar :");

        txtIdKeluar.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtIdKeluar.setText("ID Keluar");

        labelNamaBarang.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelNamaBarang.setText("Nama Barang :");

        txtNamaBarang.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtNamaBarang.setText("Nama Barang");

        labelHargaSatuan.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelHargaSatuan.setText("Harga Satuan :");

        txtHargaSatuan.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtHargaSatuan.setText("Harga Satuan");

        txtTotalHarga.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtTotalHarga.setText("Total Harga");

        labelTotalHarga.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelTotalHarga.setText("Total Harga :");

        labelKeterangan.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelKeterangan.setText("Keterangan :");

        txtKeterangan.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtKeterangan.setText("Keterangan");

        txtQtyKeluar.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtQtyKeluar.setText("QTY Keluar");

        labelQtyKeluar.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelQtyKeluar.setText("QTY Keluar :");

        txtNamaCustomer.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtNamaCustomer.setText("Nama Customer");

        labelNamaCustomer.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelNamaCustomer.setText("Nama Customer :");

        txtTglKeluar.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        txtTglKeluar.setText("Tgl Keluar");

        labelTglKeluar.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        labelTglKeluar.setText("Tgl Keluar :");

        labelJenisTransaksi.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        labelJenisTransaksi.setText("Jenis Transaksi :");

        txtJenisTransaksi.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(labelJenisTransaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJenisTransaksi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTotalHarga)
                            .addComponent(labelHargaSatuan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHargaSatuan)
                            .addComponent(txtTotalHarga)))
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelIdKeluar)
                            .addComponent(labelNamaBarang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdKeluar)
                            .addComponent(txtNamaBarang))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelBodyLayout.createSequentialGroup()
                                    .addComponent(labelKeterangan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtKeterangan))
                                .addGroup(panelBodyLayout.createSequentialGroup()
                                    .addComponent(labelQtyKeluar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtQtyKeluar)))
                            .addGroup(panelBodyLayout.createSequentialGroup()
                                .addComponent(labelTglKeluar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTglKeluar)
                                .addGap(6, 6, 6)))
                        .addGap(30, 30, 30))
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addComponent(labelNamaCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNamaCustomer)))
                .addGap(118, 118, 118))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1)
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJenisTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJenisTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdKeluar)
                    .addComponent(labelTglKeluar)
                    .addComponent(txtTglKeluar)
                    .addComponent(labelIdKeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamaBarang)
                    .addComponent(txtNamaBarang)
                    .addComponent(labelNamaCustomer)
                    .addComponent(txtNamaCustomer))
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHargaSatuan)
                    .addComponent(txtHargaSatuan)
                    .addComponent(labelQtyKeluar)
                    .addComponent(txtQtyKeluar))
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotalHarga)
                    .addComponent(txtTotalHarga)
                    .addComponent(labelKeterangan)
                    .addComponent(txtKeterangan))
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

    private void tabelBarangKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangKeluarMouseClicked
        int baris = tabelBarangKeluar.getSelectedRow();
        String id = tabelBarangKeluar.getValueAt(baris, 0).toString();
        String tglKeluar = tabelBarangKeluar.getValueAt(baris, 1).toString();
        String namaBarang = tabelBarangKeluar.getValueAt(baris, 2).toString();
        String namaCustomer = tabelBarangKeluar.getValueAt(baris, 3).toString();
        String hargaSatuan = tabelBarangKeluar.getValueAt(baris, 4).toString();
        String qty = tabelBarangKeluar.getValueAt(baris, 5).toString();
        String totalHarga = tabelBarangKeluar.getValueAt(baris, 6).toString();
        String keterangan = tabelBarangKeluar.getValueAt(baris, 7).toString();
        String jenisTransaksi = tabelBarangKeluar.getValueAt(baris, 8).toString(); 
        
        txtJenisTransaksi.setText("");
        txtIdKeluar.setText("");
        txtTglKeluar.setText("");
        txtNamaBarang.setText("");
        txtNamaCustomer.setText("");
        txtHargaSatuan.setText("");
        txtQtyKeluar.setText("");
        txtTotalHarga.setText("");
        txtKeterangan.setText("");
        
        if(jenisTransaksi.equalsIgnoreCase("penjualan")){
            txtJenisTransaksi.setText("Transaksi Penjualan");
        } else {
            txtJenisTransaksi.setText("Transaksi Retur Penjualan");
        }
        
        txtIdKeluar.setText(id);
        txtTglKeluar.setText(tglKeluar);
        txtNamaBarang.setText(namaBarang);
        txtNamaCustomer.setText(namaCustomer);
        txtHargaSatuan.setText("Rp. " + hargaSatuan);
        txtQtyKeluar.setText(qty);
        txtTotalHarga.setText("Rp. " + totalHarga);
        txtKeterangan.setText(keterangan);
    }//GEN-LAST:event_tabelBarangKeluarMouseClicked

    private void cboJenisTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJenisTransaksiActionPerformed
        int index = cboJenisTransaksi.getSelectedIndex();
        isiTabel(index);
    }//GEN-LAST:event_cboJenisTransaksiActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
        objKeluar.Access();
        
        try{
            DefaultTableModel model = (DefaultTableModel) tabelBarangKeluar.getModel();
            
            switch (cboJenisTransaksi.getSelectedIndex()) {
                case 1 ->                     {
                        JasperPrint jasperPrint = null;
                        JasperCompileManager.compileReportToFile("D:\\CODING\\JAVA\\Inventory\\Inventory\\src\\code\\reportKeluar.jrxml");
                        jasperPrint = JasperFillManager.fillReport("D:\\CODING\\JAVA\\Inventory\\Inventory\\src\\code\\reportKeluar.jasper", null, new JRTableModelDataSource(model));
                        JasperViewer.viewReport(jasperPrint, false);
                    }
                case 2 ->                     {
                        JasperPrint jasperPrint = null;
                        JasperCompileManager.compileReportToFile("D:\\CODING\\JAVA\\Inventory\\Inventory\\src\\code\\reportReturKeluar.jrxml");
                        jasperPrint = JasperFillManager.fillReport("D:\\CODING\\JAVA\\Inventory\\Inventory\\src\\code\\reportReturKeluar.jasper", null, new JRTableModelDataSource(model));
                        JasperViewer.viewReport(jasperPrint, false);
                    }
                default ->                     {
                        JasperPrint jasperPrint = null;
                        JasperCompileManager.compileReportToFile("D:\\CODING\\JAVA\\Inventory\\Inventory\\src\\code\\reportKeluar.jrxml");
                        jasperPrint = JasperFillManager.fillReport("D:\\CODING\\JAVA\\Inventory\\Inventory\\src\\code\\reportKeluar.jasper", null, new JRTableModelDataSource(model));
                        JasperViewer.viewReport(jasperPrint, false);
                    }
            }
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnPrintMouseClicked

    public void searchQuery(String query){
        DefaultTableModel tabelDataKeluar;
        tabelDataKeluar = (DefaultTableModel) tabelBarangKeluar.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tabelDataKeluar);
        tabelBarangKeluar.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + query));
    }
    
    public void isiComboJenisTransaksi(){
        cboJenisTransaksi.removeAllItems();
        cboJenisTransaksi.addItem("Semua Transaksi");
        cboJenisTransaksi.addItem("Penjualan");
        cboJenisTransaksi.addItem("Retur Penjualan");
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
            
            switch (cboJenisTransaksi.getSelectedIndex()) {
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JComboBox<String> cboJenisTransaksi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelHargaSatuan;
    private javax.swing.JLabel labelIdKeluar;
    private javax.swing.JLabel labelJenisTransaksi;
    private javax.swing.JLabel labelKeterangan;
    private javax.swing.JLabel labelNamaBarang;
    private javax.swing.JLabel labelNamaCustomer;
    private javax.swing.JLabel labelQtyKeluar;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelSearch1;
    private javax.swing.JLabel labelTglKeluar;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTotalHarga;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tabelBarangKeluar;
    private javax.swing.JLabel txtHargaSatuan;
    private javax.swing.JLabel txtIdKeluar;
    private javax.swing.JLabel txtJenisTransaksi;
    private javax.swing.JLabel txtKeterangan;
    private javax.swing.JLabel txtNamaBarang;
    private javax.swing.JLabel txtNamaCustomer;
    private javax.swing.JLabel txtQtyKeluar;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtTglKeluar;
    private javax.swing.JLabel txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}
