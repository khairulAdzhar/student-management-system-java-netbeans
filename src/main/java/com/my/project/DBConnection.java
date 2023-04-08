/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.project;

import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Huawei
 */
public class DBConnection {

    public static final String DB_URL = "jdbc:mysql://localhost/myDatabase";
    public static final String USER = "root";
    public static final String PASS = "";
    public static Connection connectDB;
       
    public static Connection connectDB() throws ClassNotFoundException{
         Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
            
        }
        catch(Exception err){
           JOptionPane.showMessageDialog(null,err.getMessage());
           return null;
        }
    }
}
