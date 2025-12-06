

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
    
import java.sql.Connection;
import java.sql.DriverManager;
public class DBconnect {
    




    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pharmacy",
                "root",
                ""
            );

            System.out.println("Database Connected Successfully!");
            return con;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


