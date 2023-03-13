package code;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Andryan
 */
public class clsMasuk extends clsKoneksi{
    String idMasuk;
    String tglMasuk;
    String idBarang;
    String idSupplier;
    String keterangan;
    int qty;
    float hargaSatuan;
    float totalHarga;
    
    public String sql_stock;
    public String sql_masuk;
    int qty_stock;
    int qty_masuk_lama;
    
    public void getIncomingData(){
        sql = "SELECT * FROM data_barang_masuk ORDER BY tgl_masuk";
    }
    
    public void saveIncomingData(){
        try
        {
            sql = "INSERT INTO data_barang_masuk VALUE ('" + idMasuk + "', '" + idBarang
                    + "', '" + idSupplier + "', '" + tglMasuk + "', '" + qty + "', '"
                    + hargaSatuan + "', '" + totalHarga +"', '" + keterangan + "')";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat menyimpan data");
            System.out.println(e.getMessage());
        }
    }
    
    public void saveStockData(){
        
        try
        {   
            Statement state = conn.createStatement();
            sql_stock = "SELECT qty_stock FROM data_stock WHERE id_barang = '" + idBarang + "'";
            ResultSet result = state.executeQuery(sql_stock);
            
            String mQtyStock = result.getString("qty_stock");
            qty_stock = Integer.parseInt(mQtyStock);
            qty_stock = qty_stock + qty;
            
            sql = "UPDATE data_stock SET qty_stock = '" + qty_stock + "' WHERE id_barang = '" + idBarang + "'";
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal Update Stock Barang");
            System.out.println(e.getMessage());
        }
    }
    
    public void editIncomingData(){
        try
        {
            sql = "UPDATE data_barang_masuk SET id_barang = '"
                    + idBarang + "', id_supplier = '" + idSupplier 
                    + "', tgl_masuk = '" + tglMasuk + "', qty_masuk = '" + qty
                    + "', harga_satuan = '" + hargaSatuan + "', total_harga = '" + totalHarga
                    + "', keterangan = '" + keterangan + "' WHERE id_masuk = '" + idMasuk + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat mengedit data");
            System.out.println(e.getMessage());
        }
    }
    
    public void editStockData(){
        
        try
        {
            Statement state = conn.createStatement();
            sql_stock = "SELECT qty_stock FROM data_stock WHERE id_barang = '" + idBarang + "'";
            ResultSet result = state.executeQuery(sql_stock);
            
            String mQtyStock = result.getString("qty_stock");
            qty_stock = Integer.parseInt(mQtyStock);
            
            sql_masuk = "SELECT qty_masuk FROM `data_barang_masuk` WHERE id_barang = '" + idBarang + "'";
            ResultSet result2 = state.executeQuery(sql_masuk);
            
            String mQtyMasuk = result.getString("qty_masuk");
            qty_masuk_lama = Integer.parseInt(mQtyMasuk);
            
            qty = (qty_stock - qty_masuk_lama) + qty;
            sql = "UPDATE `data_stock` SET qty_stock = '" + qty + "' WHERE id_barang = '" + idBarang + "'";
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal Update Stock Barang");
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteIncomingData(String mIdMasuk){
        try
        {
            sql = "DELETE FROM data_barang_masuk WHERE id_masuk = '" + idMasuk + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat menghapus data");
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteStockData(){
        
        try
        {
            sql = "UPDATE `data_stock` s,`data_barang_masuk` m SET qty_stock = qty_stock - '" + qty + "' WHERE s.id_barang = m.id_barang";
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal Update Stock Barang");
            System.out.println(e.getMessage());
        }
    }
}
