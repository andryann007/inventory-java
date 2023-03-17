package code;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Andryan
 */
public class formLaporanKeluar extends javax.swing.JPanel {

    clsKeluar objKeluar = new clsKeluar();
    
    public formLaporanKeluar() {
        initComponents();
        isiComboJenisTransaksi();
        isiTabel(2);
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarangKeluar = new javax.swing.JTable();

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
        labelSearch1.setText("Pilih Data :");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelSearch1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboJenisTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(labelSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(labelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        panelBody.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(738, 250));

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
        tabelBarangKeluar.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(panelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchQuery = txtSearch.getText();
        searchQuery(searchQuery);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tabelBarangKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangKeluarMouseClicked
        
    }//GEN-LAST:event_tabelBarangKeluarMouseClicked

    private void cboJenisTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJenisTransaksiActionPerformed
        int index = cboJenisTransaksi.getSelectedIndex();
        isiTabel(index);
    }//GEN-LAST:event_cboJenisTransaksiActionPerformed

    public void searchQuery(String query){
        DefaultTableModel tabelDataKeluar;
        tabelDataKeluar = (DefaultTableModel) tabelBarangKeluar.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tabelDataKeluar);
        tabelBarangKeluar.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + query));
    }
    
    public void isiComboJenisTransaksi(){
        cboJenisTransaksi.removeAllItems();
        cboJenisTransaksi.addItem("Penjualan");
        cboJenisTransaksi.addItem("Retur Penjualan");
        cboJenisTransaksi.addItem("Semua Transaksi");
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
                case 1 ->{
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
                
                case 2 ->{
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
    private javax.swing.JComboBox<String> cboJenisTransaksi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelSearch1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tabelBarangKeluar;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
