package code;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Andryan
 */
public final class formMasuk extends javax.swing.JPanel {

    clsMasuk objMasuk = new clsMasuk();
    private TableColumn column;
    
    public formMasuk() {
        initComponents();
        isiTabel();
        isiComboBarang();
        isiComboSupplier();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
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
        panelFooter = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        labelTitle.setText("Data Barang Masuk");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(labelTitle)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addGap(32, 32, 32))
        );

        add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(738, 250));

        tabelBarang.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Masuk", "Tanggal Masuk", "Nama Barang", "Nama Supplier", "Harga Satuan", "QTY Masuk", "Total Harga", "Keterangan"
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
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

        labelKeterangan.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelKeterangan.setText("Keterangan :");

        labelQTY.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelQTY.setText("QTY Masuk :");

        dateMasuk.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N

        cboSupplier.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        cboSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelBarang)
                            .addComponent(labelHarga))
                        .addGap(18, 18, 18)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(labelIdBarang)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSupplier, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelQTY, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMasuk, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtQTYMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(dateMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboSupplier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelKeterangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
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
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBarang)))
                    .addGroup(panelBodyLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSupplier))))
                .addGap(23, 23, 23)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHarga)
                    .addComponent(labelQTY)
                    .addComponent(txtQTYMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKeterangan))
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
            objMasuk.idMasuk = txtIdMasuk.getText();
            objMasuk.deleteIncomingData(objMasuk.idBarang);
                try {
                    objMasuk.res.executeUpdate(objMasuk.sql);
                    objMasuk.conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(formMasuk.class.getName()).log(Level.SEVERE, null, ex);
                }
                cleanData();
                isiTabel();
        
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        }
        catch(HeadlessException e){
            JOptionPane.showMessageDialog(null, "Proses penghapusan data gagal");
            System.out.println(e.getMessage());
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
        
                objMasuk.saveIncomingData();
                try {
                    objMasuk.res.executeUpdate(objMasuk.sql);
                    objMasuk.conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(formMasuk.class.getName()).log(Level.SEVERE, null, ex);
                }
                cleanData();
                isiTabel();
        
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            } 
            catch(HeadlessException | NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Proses penyimpanan data gagal");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        objMasuk.Access();
        
        try{
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
        
            objMasuk.editIncomingData();
            try {
                objMasuk.res.executeUpdate(objMasuk.sql);
                objMasuk.conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(formMasuk.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            cleanData();
            isiTabel();
        
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
        } catch(HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Proses pengeditan gagal");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void cboBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboBarangActionPerformed

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        int baris = tabelBarang.getSelectedRow();
        String id = tabelBarang.getValueAt(baris, 0).toString();
        String tglMasuk = tabelBarang.getValueAt(baris, 1).toString();
        String harga = tabelBarang.getValueAt(baris, 4).toString();
        String qty = tabelBarang.getValueAt(baris, 5).toString();
        String keterangan = tabelBarang.getValueAt(baris, 7).toString();
        
        txtIdMasuk.setText(id);
        txtHargaSatuan.setText(harga);
        txtQTYMasuk.setText(qty);
        txtKeterangan.setText(keterangan);
        
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateMasuk.setDate(date.parse(tglMasuk));
        } catch (ParseException ex) {
            Logger.getLogger(formMasuk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelBarangMouseClicked
    
    public void isiComboSupplier() {
        try{
            cboSupplier.removeAllItems();
            objMasuk.Access();
            String sql = "SELECT * FROM data_supplier";
            Statement state = objMasuk.conn.createStatement();
            ResultSet result = state.executeQuery(sql);
            
            DefaultComboBoxModel model = new DefaultComboBoxModel();
        
            while(result.next())
            {
                model.addElement(new clsComboSupplier(result.getString("nama_supplier"), result.getString("id_supplier")));
            }
            cboSupplier.setModel(model);
        }
        catch(Exception e)
        {
        }
    }
    
    public void isiComboBarang(){
        try{
            cboBarang.removeAllItems();
            objMasuk.Access();
            String sql = "SELECT * FROM data_stock";
            Statement state = objMasuk.conn.createStatement();
            ResultSet result = state.executeQuery(sql);
            
            DefaultComboBoxModel model = new DefaultComboBoxModel();
        
            while(result.next())
            {
                model.addElement(new clsComboBarang(result.getString("nama_barang"), result.getString("id_barang")));
            }
            cboBarang.setModel(model);
        }
        catch(Exception e){
            
        }
    }
    
    public void isiTabel(){
        DefaultTableModel tabelDataAkun = new DefaultTableModel();
        
        tabelDataAkun.addColumn("ID Masuk");
        tabelDataAkun.addColumn("Tanggal Masuk");
        tabelDataAkun.addColumn("Nama Barang");
        tabelDataAkun.addColumn("Nama Supplier");
        tabelDataAkun.addColumn("Harga Satuan");
        tabelDataAkun.addColumn("QTY Masuk");
        tabelDataAkun.addColumn("Total Harga");
        tabelDataAkun.addColumn("Keterangan");
        
        try{
            objMasuk.Access();
            objMasuk.getIncomingData();
            
            String sql = "SELECT id_masuk, nama_barang, nama_supplier, tgl_masuk,"
                    + " m.harga_satuan, qty_masuk, m.total_harga, keterangan  FROM `data_barang_masuk` m,"
                    + " `data_supplier` s, `data_stock` st WHERE s.id_supplier = m.id_supplier AND st.id_barang = m.id_barang";
            Statement state = objMasuk.conn.createStatement();
            ResultSet result = state.executeQuery(sql);
            
            while(result.next()){
                tabelDataAkun.addRow(new Object[] {result.getString(1),
                    result.getString(4), result.getString(2),
                    result.getString(3), result.getString(5),
                    result.getString(6), result.getString(7),
                    result.getString(8)});
            }
            tabelBarang.setModel(tabelDataAkun);
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
    }
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cboBarang;
    private javax.swing.JComboBox<String> cboSupplier;
    private com.toedter.calendar.JDateChooser dateMasuk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBarang;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelIdBarang;
    private javax.swing.JLabel labelKeterangan;
    private javax.swing.JLabel labelMasuk;
    private javax.swing.JLabel labelQTY;
    private javax.swing.JLabel labelSupplier;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelFooter;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTextField txtHargaSatuan;
    private javax.swing.JTextField txtIdMasuk;
    private javax.swing.JTextField txtKeterangan;
    private javax.swing.JTextField txtQTYMasuk;
    // End of variables declaration//GEN-END:variables
}
