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
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelSearch1)
                        .addComponent(cboJenisTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        tabelBarangMasuk.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        add(panelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchQuery = txtSearch.getText();
        searchQuery(searchQuery);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tabelBarangMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMasukMouseClicked
        
    }//GEN-LAST:event_tabelBarangMasukMouseClicked

    private void cboJenisTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJenisTransaksiActionPerformed
        int index = cboJenisTransaksi.getSelectedIndex();
        isiTabel(index);
    }//GEN-LAST:event_cboJenisTransaksiActionPerformed

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
    private javax.swing.JComboBox<String> cboJenisTransaksi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelSearch1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tabelBarangMasuk;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
