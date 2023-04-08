/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.project;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Huawei
 */
public class userManager {
    private ArrayList<user> userList;
    private user user1 = new user();
    private DBConnection db = new DBConnection();
    
    public userManager(){}
    
    public ArrayList<user>readAll(String id) throws ClassNotFoundException{
        userList = new ArrayList<user>();
        try{
           
            String SQL="SELECT * FROM user WHERE S_Number = '"+id+"'";
            PreparedStatement ps = db.connectDB().prepareStatement(SQL);
            ResultSet rs =ps.executeQuery();
            
            while(rs.next()){
                user1 = new user();
                user1.setS_number(rs.getString("S_Number"));
                user1.setUsername(rs.getString("Username"));
                user1.setIcno(rs.getString("IC_NO"));
                user1.setEmail(rs.getString("email"));
                user1.setPassword(rs.getString("Password"));
                 userList.add(user1);
            }
        }
        catch (SQLException err)
        {
            JOptionPane.showMessageDialog(null,err.getMessage());
        }
        return userList;
    }
}
