

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marie Arlene
 */
public class DBconnect {
    
    
    public Connection Connect(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root","root");
             System.out.println("Database Connected Successfully!");
             Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery("select * from medicines;");
             
             while(rs.next()){
                 String name = rs.getString("name");
                 System.out.println(name);
                 
             }
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
