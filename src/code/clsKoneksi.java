package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Andryan
 */
public class clsKoneksi {
    public Connection conn;
    public Statement res;
    public String sql;    
    
    public void Access()
{
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_inventory","root","");
        res = conn.createStatement();
    }
    catch(ClassNotFoundException | SQLException e)
    {
        JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        System.out.println(e.getMessage());
    }
}  
}
