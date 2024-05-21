/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.sql.*;

/**
 *
 * @author student2
 */
public class Autentifikacija {
    
    public boolean autentifikovan(String username, String password) throws SQLException{
        DataBaseHandler db = new DataBaseHandler();
        
        ResultSet rs = db.executeQuery("SELECT * FROM Korisnik WHERE username='"+username+"' AND password='"+password+"';");
        if(rs.next()){
            String uname = rs.getString(2);
            boolean admin = rs.getBoolean(4);
            return true;
        }
        return false;
    }
    
}
