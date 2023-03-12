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
    String alamat;
    String telp;
    String tipeAkun;
    
    public void getUserData(){
        sql = "SELECT * FROM data_user ORDER BY id_user";
    }
    
    public void saveUserData(){
        try
        {
            sql = "INSERT INTO data_user VALUE ('" + idUser + "', '" + namaUser + 
                    "', '" + email + "', '" + password + "', '" + alamat + "', '" + telp 
                    + "', '" + tipeAkun + "')";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat menyimpan data");
            System.out.println(e.getMessage());
        }
    }
    
    public void editUserData(){
        try
        {
            sql = "UPDATE data_user SET nama_lengkap = '"
                    + namaUser + "', email = '" + email + "', password = '" + password
                    + "', alamat = '" + alamat + "', telp = '" + telp
                    + "', tipe_akun = '" + tipeAkun + "' WHERE id_user = '" + idUser + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan saat mengedit data");
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteUserData(String mIdUser){
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
