/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Team137
 */
public class MyResultSet {
    
    public static ResultSet find (String s) {
        
        PreparedStatement pspb =  null;
        ResultSet rsp = null;
        
        try{
            String query = "SELECT * from product where product_id = ?";
            
            pspb = MyConnection.getConnection().prepareStatement(query);
            
            pspb.setString(1, s);  //to replace the ? with the passed Product_Id
            
            rsp = pspb.executeQuery();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return rsp;
    }
    
}
