/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Huawei
 */
public class FindStudent extends javax.swing.JFrame {

        private ArrayList<Student> itemList;
    private StudentManager manager = new StudentManager();
    DefaultTableModel  model;
    private DefaultTableModel tabmode;
    private Statement stat;
    private Connection con;
    public ResultSet rs;
        Date_Timer dt = new Date_Timer();
    /**
     * Creates new form FindStudent
     */
    public FindStudent() {
        initComponents();
        displayItems();
        setDateAndTimer();
    }

    FindStudent(String id) {
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
    
    
        private void displayItems(){
       
            try {
                itemList = manager.readAll();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FindStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        DefaultTableModel tableContent = (DefaultTableModel) studentTable.getModel();
        
        Object rowData[] = new Object[14];
        
        for(Student x:itemList){
            
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
        
     public void searching(String str){
         model =  (DefaultTableModel) studentTable.getModel();
         TableRowSorter<DefaultTableModel> trs= new TableRowSorter<> (model);
         studentTable.setRowSorter(trs);
         trs.setRowFilter(RowFilter.regexFilter(str));
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
        searchField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        timer = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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
        }

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Find Student");

        searchField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchFieldCaretUpdate(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Search a String");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedule.png"))); // NOI18N

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
                        .addComponent(jLabel3)
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
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(timer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/authorization.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(409, 409, 409))
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(171, 171, 171)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)
                        .addContainerGap(944, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(663, 663, 663))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_studentTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = jLabel5.getText();
        Home h = new Home(id);
        dispose();
        h.setTitle("HOME");
        h.setLocationRelativeTo(null);//center the form
        h.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO add your handling code here:
        String searchString = searchField.getText();
        searching(searchString);

        
    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchFieldCaretUpdate
        // TODO add your handling code here:
        
      
    }//GEN-LAST:event_searchFieldCaretUpdate

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

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
            java.util.logging.Logger.getLogger(FindStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindStudent().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchField;
    private javax.swing.JTable studentTable;
    private javax.swing.JLabel timer;
    // End of variables declaration//GEN-END:variables

 
//        private void searching(){
//        String choice = pilih.getSelectedItem().toString();
//        String search = searchField.getText();
//            if(choice.equals("MATRIC NO")){
//                int sT = studentTable.getRowCount();
//                for(int i=0 ;i<sT;i++){
//                    tabmode.removeRow(0);
//                }
//                 try{
//                    String sql = "SELECT * FROM student_details WHERE MATRICNO='"+searchField.getText()+"'";
//               stat=(Statement)con.createStatement();
//                ResultSet rs = stat.executeQuery(sql);
//                    if(rs.next()){
//                    String name = rs.getString("NAME");
//                    String IcNo = rs.getString("ICNO");
//                    String Gender=rs.getString("GENDER");
//                    String PhoneNo=rs.getString("PHONE_NO");
//                    String Race=rs.getString("RACE");
//                    String Email=rs.getString("EMAIL");
//                    String Alamat_1=rs.getString("ALAMAT_1");
//                    String Alamat_2=rs.getString("ALAMAT_2");
//                    String Postcode=rs.getString("POSTCODE");
//                    String City=rs.getString("CITY");
//                    String AcademicAdvisor=rs.getString("ACADEMIC_ADV");
//                    String Faculty=rs.getString("FACULTY");
//                    String MatricNumber=rs.getString("MATRICNO");
//                
//                    Object[] vdata={name,IcNo,Gender,PhoneNo,Race,Email,Alamat_1,Alamat_2,Postcode,City,AcademicAdvisor,Faculty,MatricNumber};
//                    tabmode.addRow(vdata);
//                        
////                        student.setName(rs.getString("NAME"));
////                        student.setIc(rs.getString("ICNO"));
////                        student.setGender(rs.getString("GENDER"));
////                        student.setPhoneNo(rs.getString("PHONE_NO"));
////                        student.setRace(rs.getString("RACE"));
////                        student.setEmail(rs.getString("EMAIL"));
////                        student.setAlamat_1(rs.getString("ALAMAT_1"));
////                        student.setAlamat_2(rs.getString("ALAMAT_2"));
////                        student.setPostcode(rs.getString("POSTCODE"));
////                        student.setCity(rs.getString("CITY"));
////                        student.setAcademicAdvisor(rs.getString("ACADEMIC_ADV"));
////                        student.setFaculty(rs.getString("FACULTY"));
////                        student.setMatricNumber(rs.getString("MATRICNO"));
////                
////                        Object[] vdata={name,IcNo,Gender,PhoneNo,Race,Email,Alamat_1,Alamat_2,Postcode,City,AcademicAdvisor,Faculty,MatricNumber};
////                        tabmode.addRow(vdata);
//                    }
//                    else
//                    {
//                        displayItems();
//                    }
//                }
//                catch(Exception se){
//                    JOptionPane.showMessageDialog(null, "Tak dapat Capai");
//                }
//            }      
//            else if(choice.equals("NAME")){
//                studentTable.show();
//                int sT = studentTable.getRowCount();
//                for(int i=0 ;i<sT;i++){
//                    tabmode.removeRow(0);
//            }
//            try{
//                String sql = "SELECT * FROM student_details WHERE NAME LIKE '%"+searchField.getText()+"%'";  
//               stat=(Statement)con.createStatement();
//                rs = stat.executeQuery(sql);
//                while(rs.next()){
//                    String name = rs.getString("NAME");
//                    String IcNo = rs.getString("ICNO");
//                    String Gender=rs.getString("GENDER");
//                    String PhoneNo=rs.getString("PHONE_NO");
//                    String Race=rs.getString("RACE");
//                    String Email=rs.getString("EMAIL");
//                    String Alamat_1=rs.getString("ALAMAT_1");
//                    String Alamat_2=rs.getString("ALAMAT_2");
//                    String Postcode=rs.getString("POSTCODE");
//                    String City=rs.getString("CITY");
//                    String AcademicAdvisor=rs.getString("ACADEMIC_ADV");
//                    String Faculty=rs.getString("FACULTY");
//                    String MatricNumber=rs.getString("MATRICNO");
//                
//                    Object[] vdata={name,IcNo,Gender,PhoneNo,Race,Email,Alamat_1,Alamat_2,Postcode,City,AcademicAdvisor,Faculty,MatricNumber};
//                    tabmode.addRow(vdata);
//                }
//
//            }
//            catch(Exception se){
//                JOptionPane.showMessageDialog(null, "Tak dapat Capai");
//            }
//        }
//        
//    }
    
}