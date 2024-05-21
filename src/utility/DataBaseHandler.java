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
public class DataBaseHandler {
    private Connection connection;
    
    public DataBaseHandler() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/erasmus", "root", "");
    }
    
    public ResultSet executeQuery(String query) throws SQLException{
        Statement statement = connection.createStatement();
        return statement.executeQuery(query);
    }
    
    public void updateRecord(String query) throws SQLException{
        Statement statement = connection.createStatement();
        int rowsAffected = statement.executeUpdate(query);
    }
}
