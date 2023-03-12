package code;

import javax.swing.JOptionPane;

/**
 *
 * @author Andryan
 */
public class clsCustomer extends clsKoneksi {
    String idCustomer;
    String namaCustomer;
    String alamat;
    String email;
    String telp;
    
    public void getCustomerData(){
        sql = "SELECT * FROM data_customer ORDER BY id_customer";
    }
    
    public void saveCustomerData(){
        try
        {
            sql = "INSERT INTO data_customer VALUE ('" + idCustomer + "', '" + namaCustomer + 
                    "', '" + alamat + "', '" + email + "', '" + telp + "')";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat menyimpan data");
            System.out.println(e.getMessage());
        }
    }
    
    public void editCustomerData(){
        try
        {
            sql = "UPDATE data_customer SET nama_customer = '"
                    + namaCustomer + "', alamat = '" + alamat 
                    + "', email ='" + email + "', telp = '" + telp
                    + "' WHERE id_customer = '" + idCustomer + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat mengedit data");
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteCustomerData(String mIdCustomer){
        try
        {
            sql = "DELETE FROM data_customer WHERE id_customer = '" + idCustomer + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat menghapus data");
            System.out.println(e.getMessage());
        }
    }
}
