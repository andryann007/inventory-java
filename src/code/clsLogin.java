package code;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Andryan
 */
public class clsLogin extends clsKoneksi{
    String mEmail;
    String mPassword;
    
    public void confirmUser()
    {
        try
        {
            sql = "select * from data_user where email = '" + mEmail + "'and password = '" + mPassword + "'";     
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan, Harap Coba Lagi !!!");
            System.out.println(e.getMessage());
        }
    }
    
    public void logoutUser()
    {
        try
        {
            JOptionPane.showMessageDialog(null, "Sukses Keluar !!!"); 
        }
        
        catch(HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan Saat Logout !!!");
            System.out.println(e.getMessage());
        }
    }
}
