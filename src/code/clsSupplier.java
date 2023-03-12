package code;

import javax.swing.JOptionPane;

/**
 *
 * @author Andryan
 */
public class clsSupplier extends clsKoneksi{
    String idSupplier;
    String namaSupplier;
    String alamat;
    String email;
    String telp;
    
    public void getSupplierData(){
        sql = "SELECT * FROM data_supplier ORDER BY id_supplier";
    }
    
    public void saveSupplierData(){
        try
        {
            sql = "INSERT INTO data_supplier VALUE ('" + idSupplier + "', '" + namaSupplier + 
                    "', '" + alamat + "', '" + email + "', '" + telp + "')";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat menyimpan data");
            System.out.println(e.getMessage());
        }
    }
    
    public void editSupplierData(){
        try
        {
            sql = "UPDATE data_supplier SET nama_supplier = '"
                    + namaSupplier + "', alamat = '" + alamat 
                    + "', email = '" + email + "', telp = '" + telp
                    + "' WHERE id_supplier = '" + idSupplier + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat mengedit data");
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteSupplierData(String mIdSupplier){
        try
        {
            sql = "DELETE FROM data_supplier WHERE id_supplier = '" + idSupplier + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat menghapus data");
            System.out.println(e.getMessage());
        }
    }
}
