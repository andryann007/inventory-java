package code;

import javax.swing.JOptionPane;

/**
 *
 * @author Andryan
 */
public class clsUser extends clsKoneksi{
    String idUser;
    String namaUser;
    String email;
    String password;
    String tipeAkun;
    String alamat;
    
    public void getUserData(){
        sql = "SELECT * FROM data_user ORDER BY id_user";
    }
    
    public void saveData(){
        try
        {
            sql = "INSERT INTO db_inventory VALUE ('" + idUser + "', '" + namaUser + 
                    "', '" + email + "', '" + password + "', '" + tipeAkun + "', '" + alamat + "')";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat menyimpan data");
            System.out.println(e.getMessage());
        }
    }
    
    public void editData(){
        try
        {
            sql = "UPDATE data_user SET nama_lengkap = '"
                    + namaUser + "', email = '" + email + "', password = '" + password
                    + "', tipe_akun = '" + tipeAkun + "', alamat = '" + alamat
                    + "' WHERE id_user = '" + idUser + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat mengedit data");
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteData(String mIdUser){
        try
        {
            sql = "DELETE FROM data_user WHERE id_user = '" + idUser + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat menghapus data");
            System.out.println(e.getMessage());
        }
    }
}
