package code;

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
}
