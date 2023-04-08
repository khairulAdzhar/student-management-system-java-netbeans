/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ViewStudent extends javax.swing.JFrame {
    private static ArrayList<Student> studentList;
    private StudentManager manager = new StudentManager();
    private Student student;
   private Statement stat;
   public ResultSet rs;
   private DBConnection db = new DBConnection();
       private DefaultTableModel tabmode;
       Date_Timer dt = new Date_Timer();

    /**
     * Creates new form ViewStudent
     */
    public ViewStudent(){
    }

    ViewStudent(String id) {
        initComponents();
        displayItems();
        setDateAndTimer();
        jLabel5.setText(id);
    }
        private void setDateAndTimer(){
        date.setText(dt.getDate());
        showTime();
    }
            private void showTime(){
        new Timer (0,new ActionListener (){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh-mm-ss");
                String tim = s.format(d);
                timer.setText(tim);
            }
        }).start();
    }
    
    
    private void clearForm(){
        ID.setText("");
        nama.setText("");
        icNum.setText("");
        matric.setText("");
        phoneNo.setText("");
        email.setText("");
        alamat_1.setText("");
        alamat_2.setText("");
        postcode.setText("");
        city.setText("");
        
        String [] Type = new String []{"-","Male","Female"};
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(Type));
        
        String [] Type1 = new String []{ "-","ISLAM","KRISTIAN","BUDDHA","HINDU","ATHEIS","OTHER"};
        race.setModel(new javax.swing.DefaultComboBoxModel<>(Type1));
        
        String [] Type2 = new String []{"-","MUHAMMAD SYAZWAN BIN ROSLI","KHAIRUL ADZHAR BIN NORAIDI","ISKANDAR ZULKARNAIN BIN ROSMI","MUHAMMAD HAZIQ BIN FADHLAN"};
        academic_advisor.setModel(new javax.swing.DefaultComboBoxModel<>(Type2));
        
        String [] Type3 = new String []{ "-","FAKULTI TEKNOLOGI MAKLUMAT & KOMUNIKASI", "FAKULTI KEJURUTERAAN MEKANIKAL", "FAKULTI KEJURUTERAAN ELEKTRIK", "FAKULTI KEJURUTERAAN PEMBUATAN","FAKULTI PENGURUSAN TEKNOUSAHAWAN"};
        faculty.setModel(new javax.swing.DefaultComboBoxModel<>(Type3));
    }
    
    private void initialBtn(){
        editbtn.setEnabled(true);
        resetbtn.setEnabled(true);
        deletebtn.setEnabled(true);
        backbtn.setEnabled(true);
    }
    
    
     private void displayItems(){
       
        try {   
            studentList = manager.readAll();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel tableContent = (DefaultTableModel) studentTable.getModel();
        
        Object rowData[] = new Object[14];
        
//        for(Student x:studentList){
//            int ID = x.getID();
//            String name = x.getName();
//            String ic = x.getIc();
//            String gender = x.getGender();
//            String phoneno = x.getPhoneNo();
//            String race = x.getRace();
//            String email = x.getEmail();
//            String alamat_1 = x.getAlamat_1();
//            String alamat_2 = x.getAlamat_2();
//            String postcode = x.getPostcode();
//            String city = x.getCity();
//            String academic_adv = x.getAcademicAdvisor();
//            String faculty = x.getFaculty();
//            String matricno = x.getMatricNumber();
//            
//            Object [] = vdata {ID,name,ic,gender,phoneno,race,email,alamat_1,alamat_2,postcode,city,academic_adv,faculty,matricno};
//            tableContent.addRow(rowData);
//            
//            
//        }
        for(Student x:studentList){
            rowData[0] = x.getID();
            rowData[1] = x.getName();
            rowData[2] = x.getIc();
            rowData[3] = x.getGender();
            rowData[4] = x.getPhoneNo();
            rowData[5] = x.getRace();
            rowData[6] = x.getEmail();
            rowData[7] = x.getAlamat_1();
            rowData[8] = x.getAlamat_2();
            rowData[9] = x.getPostcode();
            rowData[10] = x.getCity();
            rowData[11] = x.getAcademicAdvisor();
            rowData[12] = x.getFaculty();
            rowData[13] = x.getMatricNumber();
            tableContent.addRow(rowData);
            
            
        }         
    }
     
    
    
        private boolean isEmptyField()
    {
        if(nama.getText().isEmpty()||icNum.getText().isEmpty()||matric.getText().isEmpty()||phoneNo.getText().isEmpty()||email.getText().isEmpty()||
                alamat_1.getText().isEmpty()||alamat_2.getText().isEmpty()|| postcode.getText().isEmpty() || city.getText().isEmpty())
        {
           return true;
        }
        else{
            return false;
        }
    }
        

        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nameText = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        icText = new javax.swing.JLabel();
        icNum = new javax.swing.JTextField();
        genderText = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        raceText = new javax.swing.JLabel();
        race = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        matricText = new javax.swing.JLabel();
        matric = new javax.swing.JTextField();
        phoneText = new javax.swing.JLabel();
        phoneNo = new javax.swing.JTextField();
        emailText = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        alamat_1 = new javax.swing.JTextField();
        alamat_2 = new javax.swing.JTextField();
        postcode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        faculty = new javax.swing.JComboBox<>();
        academic_advisor = new javax.swing.JComboBox<>();
        ID = new javax.swing.JTextField();
        editbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        timer = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        studentTable.setBackground(new java.awt.Color(204, 204, 255));
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "IC NUM", "GENDER", "PHONE NO", "RACE", "EMAIL", "ALAMAT_1", "ALAMAT_2", "POSTCODE", "CITY", "ACADEMIC_ADV", "FACULTY", "MATRIC NO"
            }
        ));
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studentTable);
        if (studentTable.getColumnModel().getColumnCount() > 0) {
            studentTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            studentTable.getColumnModel().getColumn(1).setPreferredWidth(130);
            studentTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            studentTable.getColumnModel().getColumn(3).setPreferredWidth(2);
            studentTable.getColumnModel().getColumn(4).setPreferredWidth(30);
            studentTable.getColumnModel().getColumn(5).setPreferredWidth(3);
            studentTable.getColumnModel().getColumn(6).setPreferredWidth(40);
            studentTable.getColumnModel().getColumn(9).setPreferredWidth(10);
            studentTable.getColumnModel().getColumn(10).setPreferredWidth(10);
            studentTable.getColumnModel().getColumn(13).setPreferredWidth(10);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("LIST OF STUDENT");

        backbtn.setBackground(new java.awt.Color(204, 204, 255));
        backbtn.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        nameText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nameText.setText("NAME");

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        icText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        icText.setText("IC / PASSPORT NO");

        icNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icNumActionPerformed(evt);
            }
        });

        genderText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        genderText.setText("GENDER");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-","Male", "Female",}));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        raceText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        raceText.setText("RACE");

        race.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-","ISLAM","KRISTIAN","BUDDHA","HINDU","SIKHSM","TAO","BAHAI","KONFUSIAN","ATHEIS","OTHER"}));
        race.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raceActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel9.setText("Student Details");

        matricText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        matricText.setText("MATRIC NO");

        matric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matricActionPerformed(evt);
            }
        });

        phoneText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        phoneText.setText("PHONE NO");

        phoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoActionPerformed(evt);
            }
        });

        emailText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        emailText.setText("E-MAIL");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel20.setText("Faculty & Course");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("ACADEMIC ADVISOR");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("PERMANENT ADDRESS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("CITY");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("POSTCODE");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("FACULTY");

        faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-","FAKULTI TEKNOLOGI MAKLUMAT & KOMUNIKASI", "FAKULTI KEJURUTERAAN MEKANIKAL", "FAKULTI KEJURUTERAAN ELEKTRIK", "FAKULTI KEJURUTERAAN PEMBUATAN","FAKULTI PENGURUSAN TEKNOUSAHAWAN"}));
        faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyActionPerformed(evt);
            }
        });

        academic_advisor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-","MUHAMMAD SYAZWAN BIN ROSLI","KHAIRUL ADZHAR BIN NORAIDI","ISKANDAR ZULKARNAIN BIN ROSMI","MUHAMMAD HAZIQ BIN FADHLAN" }));

        ID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ID.setText("ID");
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(190, 190, 190))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(raceText)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icText)
                            .addComponent(genderText)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(matricText))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alamat_2)
                            .addComponent(alamat_1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(race, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailText, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(email)))
                            .addComponent(icNum)
                            .addComponent(nama)
                            .addComponent(faculty, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(academic_advisor, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(matric)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(postcode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(city)))
                        .addGap(40, 40, 40))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icText)
                    .addComponent(icNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderText)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raceText)
                    .addComponent(race, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailText)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(alamat_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alamat_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(academic_advisor, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(faculty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matricText))
                .addContainerGap())
        );

        editbtn.setBackground(new java.awt.Color(204, 204, 255));
        editbtn.setText("EDIT");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(204, 204, 255));
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(204, 204, 255));
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedule.png"))); // NOI18N

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date.setText("Date");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stopwatch.png"))); // NOI18N

        timer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timer.setText("Timer");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timer, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(timer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/authorization.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(392, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(editbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(518, 518, 518))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(757, 757, 757))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(217, Short.MAX_VALUE)
                        .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5))
                                .addGap(54, 54, 54)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166)))
                        .addComponent(jLabel1)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        String id=jLabel5.getText();
        Home h = new Home(id);
        dispose();
        h.setTitle("HOME");
        h.setLocationRelativeTo(null);//center the form
        h.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void icNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icNumActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void raceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raceActionPerformed

    private void matricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matricActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matricActionPerformed

    private void phoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
         if(!isEmptyField()){
            student = new Student();
            student.setID(Integer.parseInt(ID.getText()));
            student.setName(nama.getText().trim());
            student.setIc(icNum.getText().trim());
            student.setGender(gender.getSelectedItem().toString());
            student.setPhoneNo(phoneNo.getText().trim());
            student.setRace(race.getSelectedItem().toString());
            student.setEmail(email.getText().trim());
            student.setAlamat_1(alamat_1.getText().trim());
            student.setAlamat_2(alamat_2.getText().trim());
            student.setPostcode(postcode.getText().trim());
            student.setCity(city.getText().trim());
            student.setAcademicAdvisor(academic_advisor.getSelectedItem().toString());
            student.setFaculty(faculty.getSelectedItem().toString());            
            student.setMatricNumber(matric.getText().trim());
            
             try {
                 manager.editStudent(student);
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(ViewStudent.class.getName()).log(Level.SEVERE, null, ex);
             }
            
            JOptionPane.showMessageDialog(null,"The Student details for " + nama.getText()+" has been updated!");
            
            clearForm();
            initialBtn();
            clearTable();
            displayItems();
                 
        }
        else{
            JOptionPane.showMessageDialog(null,"Complete teh form!");           
        }
    }//GEN-LAST:event_editbtnActionPerformed

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        // TODO add your handling code here:
        table_click();
    }//GEN-LAST:event_studentTableMouseClicked

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        clearForm();
        
    }//GEN-LAST:event_resetbtnActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        
        int result = JOptionPane.showConfirmDialog(null,"Are you sure to delete the student details for " + nama.getText() + " ?","Delete Item",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(result == JOptionPane.YES_OPTION){
            try {
                manager.deleteItem(Integer.parseInt(ID.getText().trim()));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ViewStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            
           JOptionPane.showMessageDialog(null,"The Student details for " + nama.getText()+" has been deleted!");
           
           clearForm();
            initialBtn();
            clearTable();
            displayItems();
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void table_click(){
        int selectedRow = studentTable.getSelectedRow();
        ID.setText(studentTable.getValueAt(selectedRow,0).toString());
        nama.setText(studentTable.getValueAt(selectedRow,1).toString());
        icNum.setText(studentTable.getValueAt(selectedRow,2).toString());
        String Gender = studentTable.getValueAt(selectedRow, 3).toString();
        for(int i = 0; i<gender.getItemCount();i++){
            if(gender.getItemAt(i).toString().equalsIgnoreCase(Gender)){
                gender.setSelectedIndex(i);
            }
        }
        phoneNo.setText(studentTable.getValueAt(studentTable.getSelectedRow(),4).toString());
        String Race = studentTable.getValueAt(selectedRow, 5).toString();
        for(int i = 0; i<race.getItemCount();i++){
            if(race.getItemAt(i).toString().equalsIgnoreCase(Race)){
                race.setSelectedIndex(i);
            }
        }
        email.setText(studentTable.getValueAt(studentTable.getSelectedRow(),6).toString());
        alamat_1.setText(studentTable.getValueAt(studentTable.getSelectedRow(),7).toString());
        alamat_2.setText(studentTable.getValueAt(studentTable.getSelectedRow(),8).toString());
        postcode.setText(studentTable.getValueAt(studentTable.getSelectedRow(),9).toString());
        city.setText(studentTable.getValueAt(studentTable.getSelectedRow(),10).toString());
        String academic_ADVISOR = studentTable.getValueAt(selectedRow, 11).toString();
        for(int i = 0; i<academic_advisor.getItemCount();i++){
            if(academic_advisor.getItemAt(i).toString().equalsIgnoreCase(academic_ADVISOR)){
                academic_advisor.setSelectedIndex(i);
            }
        }
        String Faculty = studentTable.getValueAt(selectedRow, 12).toString();
        for(int i = 0; i<faculty.getItemCount();i++){
            if(faculty.getItemAt(i).toString().equalsIgnoreCase(Faculty)){
                faculty.setSelectedIndex(i);
            }
        }
        matric.setText(studentTable.getValueAt(studentTable.getSelectedRow(),13).toString());
    }
        private void clearTable(){
            DefaultTableModel tableContent = (DefaultTableModel)studentTable.getModel();
            tableContent.setRowCount(0);
    }
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new ViewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JComboBox<String> academic_advisor;
    private javax.swing.JTextField alamat_1;
    private javax.swing.JTextField alamat_2;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField city;
    private javax.swing.JLabel date;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailText;
    private javax.swing.JComboBox<String> faculty;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel genderText;
    private javax.swing.JTextField icNum;
    private javax.swing.JLabel icText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField matric;
    private javax.swing.JLabel matricText;
    private javax.swing.JTextField nama;
    private javax.swing.JLabel nameText;
    private javax.swing.JTextField phoneNo;
    private javax.swing.JLabel phoneText;
    private javax.swing.JTextField postcode;
    private javax.swing.JComboBox<String> race;
    private javax.swing.JLabel raceText;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTable studentTable;
    private javax.swing.JLabel timer;
    // End of variables declaration//GEN-END:variables



}
