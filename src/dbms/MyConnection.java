/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GOWTHAM V BHAT
 */
public class MyConnection {
    public static Connection getConnection() {
    
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/shop", "root", "");
        }    
        catch(ClassNotFoundException | SQLException ex){ 
            System.out.println(ex.getMessage());
        }
        return conn;
    }   
}
