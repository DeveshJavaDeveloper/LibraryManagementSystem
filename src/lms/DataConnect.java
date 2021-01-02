/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author 91963
 */
public class DataConnect {
    public static Connection ConnecrDb()
    {
        Connection con=null;
        String url = "jdbc:mysql://localhost:3306/librarymanagementsystem";
        String user = "root";
        String password = "";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,user,password);
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return con;
        }
    }
}
