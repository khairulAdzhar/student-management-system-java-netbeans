/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Huawei
 */
public class Date_Timer {
    private Date d;
    private Timer t;
    private SimpleDateFormat sdf;
    
    public Date_Timer(){
        
    }
    
    public String getDate(){
        d = new Date();
        sdf = new SimpleDateFormat("dd-MM-yyy");
        String dat = sdf.format(d);
        return dat;
    }
//    String getTimer(){
//        t = new Timer (0, (ActionEvent e) -> {
//            Date d1 = new Date();
//            sdf = new SimpleDateFormat("hh-mm-ss");
//            String tim = sdf.format(d1);
//        });
//        t.start();
//        return null;
//    }
//    
    
    
//    public String getTime()
//    {
//        
//        Date d = new Date();
//        sdf = new SimpleDateFormat("hh-mm-ss");
//        LocalDateTime now =LocalDateTime.now();
//        String tim = sdf.format(now);
//        return (tim);
//    }
    
//    public String date()
//    {
//        
//        DateTimeFormatter dates =DateTimeFormatter .ofPattern("yyyy/MM/dd");
//        LocalDateTime now =LocalDateTime.now();
//        return(dates.format(now));
//    }
//    
//        private void showTime(){
//        new Timer (0,new ActionListener (){
//            
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Date d = new Date();
//                SimpleDateFormat s = new SimpleDateFormat("hh-mm-ss");
//                String tim = s.format(d);
//                timer.setText(tim);
//            }
//        }).start();
//    }
    
    
//     public String getTime()
//         {
//             DateTimeFormatter times =DateTimeFormatter .ofPattern("hh : mm a");
//            LocalDateTime now =LocalDateTime.now();
//            return(times.format(now));
//        }
}
