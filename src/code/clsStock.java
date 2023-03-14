package code;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Andryan
 */
public class clsStock extends clsKoneksi{
    String idBarang;
    String namaBarang;
    String kategori;
    String status;
    int qty;
    float hargaSatuan;
    float totalHarga;
    
    public String sql_stock;
    public String sql_masuk;
    int qty_stock;
    int qty_masuk;
    
    public void getStockData(){
        sql = "SELECT * FROM data_stock ORDER BY id_barang";
    }
    
    public void saveStockData(){
        try
        {
            sql = "INSERT INTO data_stock VALUE ('" + idBarang + "', '" + namaBarang
                    + "', '" + kategori + "', '" + qty + "', '" + hargaSatuan + "', '"
                    + totalHarga + "', '" + status + "')";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat menyimpan data");
            System.out.println(e.getMessage());
        }
    }
    
    public void saveIncomingStockData(){
        try
        {   
            Statement state = conn.createStatement();
            sql_stock = "SELECT qty_stock FROM data_stock WHERE id_barang = '" + idBarang + "'";
            ResultSet result = state.executeQuery(sql_stock);
            
            while(result.next()){
                String mQtyStock = result.getString("qty_stock");
                qty_stock = Integer.parseInt(mQtyStock);
                qty_stock = qty_stock + qty;
            
                sql = "UPDATE data_stock SET qty_stock = '" + qty_stock + "' WHERE id_barang = '" + idBarang + "'";
            }
            
        }
        catch(NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public void editStockData(){
        try
        {
            sql = "UPDATE data_stock SET nama_barang = '"
                    + namaBarang + "', kategori = '" + kategori 
                    + "', qty_stock = '" + qty + "', harga_satuan = '" + hargaSatuan
                    + "', total_harga = '" + totalHarga
                    + "', status = '" + status + "' WHERE id_barang = '" + idBarang + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat mengedit data");
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteStockData(String mIdBarang){
        try
        {
            sql = "DELETE FROM data_stock WHERE id_barang = '" + idBarang + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat menghapus data");
            System.out.println(e.getMessage());
        }
    }
}
