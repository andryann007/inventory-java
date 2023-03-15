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
public class formCustomer extends javax.swing.JPanel {

    clsCustomer objCustomer = new clsCustomer();
    private TableColumn column;
    
    public formCustomer() {
        initComponents();
        isiTabel();
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
        txtSearch = new javax.swing.JTextField();
        labelSearch = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelCustomer = new javax.swing.JTable();
        labelIdCustomer = new javax.swing.JLabel();
        txtIdCustomer = new javax.swing.JTextField();
        labelNama = new javax.swing.JLabel();
        txtEmailCustomer = new javax.swing.JTextField();
        labelAlamat = new javax.swing.JLabel();
        txtNamaCustomer = new javax.swing.JTextField();
        txtAlamatCustomer = new javax.swing.JTextField();
        labelTelp = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        txtTelpCustomer = new javax.swing.JTextField();
        panelFooter = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        labelTitle.setText("Data Customer");

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
                .addGap(283, 283, 283)
                .addComponent(labelTitle)
                .addContainerGap(289, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(738, 250));

        tabelCustomer.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        tabelCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Customer", "Nama Customer", "Alamat", "Email", "No. Telp"
            }
        ));
        tabelCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelCustomer);

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

        labelIdCustomer.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelIdCustomer.setText("ID Customer :");

        txtIdCustomer.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtIdCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdCustomerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdCustomerKeyTyped(evt);
            }
        });

        labelNama.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelNama.setText("Nama Customer :");

        txtEmailCustomer.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtEmailCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailCustomerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailCustomerKeyTyped(evt);
            }
        });

        labelAlamat.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelAlamat.setText("Alamat :");

        txtNamaCustomer.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtNamaCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaCustomerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaCustomerKeyTyped(evt);
            }
        });

        txtAlamatCustomer.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtAlamatCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAlamatCustomerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlamatCustomerKeyTyped(evt);
            }
        });

        labelTelp.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelTelp.setText("No. Telp :");

        labelEmail.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        labelEmail.setText("Email :");

        txtTelpCustomer.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txtTelpCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelpCustomerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelpCustomerKeyTyped(evt);
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
                .addGap(34, 34, 34)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelAlamat)
                    .addComponent(labelIdCustomer))
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAlamatCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNama, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelpCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNamaCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNama))
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelIdCustomer)
                        .addComponent(txtIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlamat)
                    .addComponent(txtAlamatCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail)
                    .addComponent(txtEmailCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelp)
                    .addComponent(txtTelpCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
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

    private void txtIdCustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdCustomerKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(((txtIdCustomer.getText().isEmpty())))
            {
                JOptionPane.showMessageDialog(this, "ID Customer Tidak Boleh Kosong !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtIdCustomer.requestFocus();
            }
            else
            {
            } 
        }
    }//GEN-LAST:event_txtIdCustomerKeyPressed

    private void txtIdCustomerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdCustomerKeyTyped

    }//GEN-LAST:event_txtIdCustomerKeyTyped

    private void txtEmailCustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailCustomerKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCustomerKeyPressed

    private void txtEmailCustomerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailCustomerKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCustomerKeyTyped

    private void txtNamaCustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaCustomerKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(((txtNamaCustomer.getText().isEmpty())))
            {
                JOptionPane.showMessageDialog(this, "Nama Customer Tidak Boleh Kosong !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtNamaCustomer.requestFocus();
            }
            else
            {
            } 
        }
    }//GEN-LAST:event_txtNamaCustomerKeyPressed

    private void txtNamaCustomerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaCustomerKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaCustomerKeyTyped

    private void txtAlamatCustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlamatCustomerKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatCustomerKeyPressed

    private void txtAlamatCustomerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlamatCustomerKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatCustomerKeyTyped

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        objCustomer.Access();
        
        try{
            objCustomer.idCustomer = txtIdCustomer.getText();
        
            objCustomer.deleteCustomerData(objCustomer.idCustomer);
            try {
                objCustomer.res.executeUpdate(objCustomer.sql);
                objCustomer.conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(formCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            cleanData();
            isiTabel();
        
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Proses penghapusan data gagal");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        objCustomer.Access();
        
        if(txtIdCustomer.getText().equals(""))
        {
            JOptionPane.showMessageDialog( null, "ID Customer Tidak Boleh Kosong!!!");
        } else {
            try{
                objCustomer.idCustomer = txtIdCustomer.getText();
                objCustomer.namaCustomer = txtNamaCustomer.getText();
                objCustomer.alamat = txtAlamatCustomer.getText();
                objCustomer.email = txtEmailCustomer.getText();
                objCustomer.telp = txtTelpCustomer.getText();
        
                objCustomer.saveCustomerData();
                try {
                    objCustomer.res.executeUpdate(objCustomer.sql);
                    objCustomer.conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(formCustomer.class.getName()).log(Level.SEVERE, null, ex);
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
        objCustomer.Access();
        
        try{
            objCustomer.idCustomer = txtIdCustomer.getText();
            objCustomer.namaCustomer = txtNamaCustomer.getText();
            objCustomer.alamat = txtAlamatCustomer.getText();
            objCustomer.email = txtEmailCustomer.getText();
            objCustomer.telp = txtTelpCustomer.getText();
        
            objCustomer.editCustomerData();
            try {
                objCustomer.res.executeUpdate(objCustomer.sql);
                objCustomer.conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(formCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            cleanData();
            isiTabel();
        
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Proses pengeditan gagal");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tabelCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelCustomerMouseClicked
        int baris = tabelCustomer.getSelectedRow();
        String id = tabelCustomer.getValueAt(baris, 0).toString();
        String nama = tabelCustomer.getValueAt(baris, 1).toString();
        String alamat = tabelCustomer.getValueAt(baris, 2).toString();
        String email = tabelCustomer.getValueAt(baris, 3).toString();
        String telp = tabelCustomer.getValueAt(baris, 4).toString();
        
        txtIdCustomer.setText(id);
        txtNamaCustomer.setText(nama);
        txtAlamatCustomer.setText(alamat);
        txtEmailCustomer.setText(email);
        txtTelpCustomer.setText(telp);
    }//GEN-LAST:event_tabelCustomerMouseClicked

    private void txtTelpCustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelpCustomerKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelpCustomerKeyPressed

    private void txtTelpCustomerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelpCustomerKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelpCustomerKeyTyped

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchQuery = txtSearch.getText();
        searchQuery(searchQuery);
    }//GEN-LAST:event_txtSearchKeyReleased

    public void isiTabel(){
        DefaultTableModel tabelDataCustomer = new DefaultTableModel();
        
        tabelDataCustomer.addColumn("ID Customer");
        tabelDataCustomer.addColumn("Nama Customer");
        tabelDataCustomer.addColumn("Alamat");
        tabelDataCustomer.addColumn("Email");
        tabelDataCustomer.addColumn("No.Telp");
        
        try{
            objCustomer.Access();
            objCustomer.getCustomerData();
            
            Statement state = objCustomer.conn.createStatement();
            ResultSet result = state.executeQuery(objCustomer.sql);
            
            while(result.next()){
                tabelDataCustomer.addRow(new Object[] {result.getString(1),
                    result.getString(2), result.getString(3),
                    result.getString(4), result.getString(5)});
            }
            tabelCustomer.setModel(tabelDataCustomer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan pada penampilan data !!!");
            System.out.println(e.getMessage());
        }
    }
    
    public void cleanData()
    {
        txtIdCustomer.setText("");
        txtNamaCustomer.setText("");
        txtAlamatCustomer.setText("");
        txtEmailCustomer.setText("");
        txtTelpCustomer.setText("");
    }
    
    public void searchQuery(String query){
        DefaultTableModel tabelDataCustomer;
        tabelDataCustomer = (DefaultTableModel) tabelCustomer.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tabelDataCustomer);
        tabelCustomer.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + query));
   }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelIdCustomer;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelTelp;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelFooter;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tabelCustomer;
    private javax.swing.JTextField txtAlamatCustomer;
    private javax.swing.JTextField txtEmailCustomer;
    private javax.swing.JTextField txtIdCustomer;
    private javax.swing.JTextField txtNamaCustomer;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTelpCustomer;
    // End of variables declaration//GEN-END:variables
}
