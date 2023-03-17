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
    String jenisTransaksi;
    int qty;
    float hargaSatuan;
    float totalHarga;
    
    public String sql_stock;
    public String sql_masuk;
    
    public void getIncomingData(){
        sql = "SELECT * FROM data_barang_masuk ORDER BY tgl_masuk";
    }
    
    public void saveIncomingData(){
        try
        {
            sql = "INSERT INTO data_barang_masuk (id_masuk, id_barang, id_supplier, "
                    + "tgl_masuk, qty_masuk, harga_satuan, total_harga, keterangan, "
                    + "jenis_transaksi) VALUE ('" + idMasuk + "', '" + idBarang
                    + "', '" + idSupplier + "', '" + tglMasuk + "', '" + qty + "', '"
                    + hargaSatuan + "', '" + totalHarga +"', '" + keterangan + "', '"
                    + jenisTransaksi + "')";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public void editIncomingData(){
        try
        {
            sql = "UPDATE data_barang_masuk SET id_barang = '"
                    + idBarang + "', id_supplier = '" + idSupplier 
                    + "', tgl_masuk = '" + tglMasuk + "', qty_masuk = '" + qty
                    + "', harga_satuan = '" + hargaSatuan + "', total_harga = '" + totalHarga
                    + "', keterangan = '" + keterangan + "', jenis_transaksi = '" + jenisTransaksi
                    + "' WHERE id_masuk = '" + idMasuk + "'";
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