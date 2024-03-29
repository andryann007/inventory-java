package code;

import javax.swing.JOptionPane;

/**
 *
 * @author Andryan
 */
public class clsKeluar extends clsKoneksi{
    String idKeluar;
    String tglKeluar;
    String idBarang;
    String idCustomer;
    String keterangan;
    String jenisTransaksi;
    int qty;
    float hargaSatuan;
    float totalHarga;
    
    public void getOutcomingData(){
        sql = "SELECT * FROM data_barang_keluar ORDER BY tgl_keluar";
    }
    
    public void saveOutcomingData(){
        try
        {
            sql = "INSERT INTO data_barang_keluar (id_keluar, id_barang, id_customer, "
                    + "tgl_keluar, qty_keluar, harga_satuan, total_harga, keterangan, "
                    + "jenis_transaksi) VALUE ('" + idKeluar + "', '" + idBarang
                    + "', '" + idCustomer + "', '" + tglKeluar + "', '" + qty + "', '"
                    + hargaSatuan + "', '" + totalHarga +"', '" + keterangan + "', '"
                    + jenisTransaksi +  "')";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat menyimpan data");
            System.out.println(e.getMessage());
        }
    }
    
    public void editOutcomingData(){
        try
        {
            sql = "UPDATE data_barang_keluar SET id_barang = '"
                    + idBarang + "', id_customer = '" + idCustomer 
                    + "', tgl_keluar = '" + tglKeluar + "', qty_keluar = '" + qty
                    + "', harga_satuan = '" + hargaSatuan + "', total_harga = '" + totalHarga
                    + "', keterangan = '" + keterangan + "', jenis_transaksi = '" + jenisTransaksi 
                    + "' WHERE id_keluar = '" + idKeluar + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat mengedit data");
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteOutcomingData(String mIdKeluar){
        try
        {
            sql = "DELETE FROM data_barang_keluar WHERE id_keluar = '" + idKeluar + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat menghapus data");
            System.out.println(e.getMessage());
        }
    }
}
