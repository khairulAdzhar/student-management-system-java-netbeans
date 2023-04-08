/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.project;
import java.sql.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author user
 */
public class StudentManager 
{
    private ArrayList<Student> studentList;
    private Student student = new Student();
    private DBConnection db = new DBConnection();
    
    public StudentManager(){}
    
    public ArrayList<Student>readAll() throws ClassNotFoundException{
        studentList = new ArrayList<Student>();
        try{
           
            String SQL="SELECT * FROM student_details";
            PreparedStatement ps = db.connectDB().prepareStatement(SQL);
            ResultSet rs =ps.executeQuery();
            
            while(rs.next()){
                student = new Student();
                student.setID(rs.getInt("ID"));
                student.setName(rs.getString("NAME"));
                student.setIc(rs.getString("ICNO"));
                student.setGender(rs.getString("GENDER"));
                student.setPhoneNo(rs.getString("PHONE_NO"));
                student.setRace(rs.getString("RACE"));
                student.setEmail(rs.getString("EMAIL"));
                student.setAlamat_1(rs.getString("ALAMAT_1"));
                student.setAlamat_2(rs.getString("ALAMAT_2"));
                student.setPostcode(rs.getString("POSTCODE"));
                student.setCity(rs.getString("CITY"));
                student.setAcademicAdvisor(rs.getString("ACADEMIC_ADV"));
                student.setFaculty(rs.getString("FACULTY"));
                student.setMatricNumber(rs.getString("MATRICNO"));
                studentList.add(student);
            }
        }
        catch (SQLException err)
        {
            JOptionPane.showMessageDialog(null,err.getMessage());
        }
        return studentList;
    }
    
    public void saveStudent(Student student) throws ClassNotFoundException
    {
        int id = student.getID();
        String name = student.getName();
        String ic = student.getIc();
        String gender = student.getGender();
        String phoneno = student.getPhoneNo();
        String race = student.getRace();
        String email = student.getEmail();
        String alamat_1 = student.getAlamat_1();
        String alamat_2 = student.getAlamat_2();
        String postcode = student.getPostcode();
        String city = student.getCity();
        String academic_v = student.getAcademicAdvisor();
        String faculty = student.getFaculty();
        String MatricNo = student.getMatricNumber();
        
        try{
            
            String SQL = "INSERT INTO student_details VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = db.connectDB().prepareStatement(SQL);
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setString(3,ic);
            ps.setString(4,gender);
            ps.setString(5, phoneno);
            ps.setString(6, race);
            ps.setString(7, email);
            ps.setString(8, alamat_1);
            ps.setString(9, alamat_2);
            ps.setString(10, postcode);
            ps.setString(11,city);
            ps.setString(12, academic_v);
            ps.setString(13, faculty);
            ps.setString(14,MatricNo);
            
            
            ps.executeUpdate();
        }
        catch(SQLException err){
            JOptionPane.showMessageDialog(null,err.getMessage());
        }
      
    }
    
     public void editStudent(Student student) throws ClassNotFoundException{
        int ID = student.getID();
        String name = student.getName();
        String ic = student.getIc();
        String gender = student.getGender();
        String phoneno = student.getPhoneNo();
        String race = student.getRace();
        String email = student.getEmail();
        String alamat_1 = student.getAlamat_1();
        String alamat_2 = student.getAlamat_2();
        String postcode = student.getPostcode();
        String city = student.getCity();
        String academic_v = student.getAcademicAdvisor();
        String faculty = student.getFaculty();
        String MatricNo = student.getMatricNumber();
        
        try{
            
            String SQL="UPDATE student_details SET NAME= ?, ICNO = ?, " + "GENDER = ? ,PHONE_NO=?,"
                    +" RACE = ?, EMAIL=?,ALAMAT_1=?,ALAMAT_2=?,POSTCODE=?,"
                    +" CITY=?,ACADEMIC_ADV=?,FACULTY=?,MATRICNO=? WHERE ID = ?";
            
            
            PreparedStatement ps = db.connectDB().prepareStatement(SQL);
             ps.setString(1,name);
             ps.setString(2,ic);
             ps.setString(3,gender);
             ps.setString(4,phoneno);
             ps.setString(5,race);
             ps.setString(6,email);
             ps.setString(7,alamat_1);
             ps.setString(8,alamat_2);
             ps.setString(9,postcode);
             ps.setString(10,city);
             ps.setString(11,academic_v);
             ps.setString(12,faculty);
             ps.setString(13,MatricNo);
             ps.setInt(14, ID);
           
            
           ps.executeUpdate();
            
        }
         catch( SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
         }       
    }
     
        public void deleteItem(int deleteID) throws ClassNotFoundException{
        
        try{
            
            
            String SQL =" DELETE FROM student_details where ID=?";
            
            PreparedStatement ps = db.connectDB().prepareStatement(SQL);
            
            ps.setInt(1, deleteID);
            
            ps.executeUpdate();
        
        }
        
        catch ( SQLException err){
            JOptionPane.showMessageDialog(null,err.getMessage());
            
        }
    }
     
}


