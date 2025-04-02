/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author HP
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
           /* Class.forName("conn.mysql.jdbc.Driver");*/
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","P14r#@iyaa");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
}
