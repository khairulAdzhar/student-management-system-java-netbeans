/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.project;
import java.io.Serializable;

/**
 *
 * @author User
 */
public class Student implements Serializable
{
    private int ID;
    private String name;
    private String ic;
    private String matricNumber;
    private String phoneNo;
    private String email;
    private String alamat_1;
    private String alamat_2;
    private String gender;
    private String race;
    private String postcode;
    private String city;
    private String academicAdvisor;
    private String faculty;

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public void setMatricNumber(String matricNumber) {
        this.matricNumber = matricNumber;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAlamat_1(String alamat_1) {
        this.alamat_1 = alamat_1;
    }

    public void setAlamat_2(String alamat_2) {
        this.alamat_2 = alamat_2;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAcademicAdvisor(String academicAdvisor) {
        this.academicAdvisor = academicAdvisor;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public String getIc() {
        return ic;
    }

    public String getMatricNumber() {
        return matricNumber;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getAlamat_1() {
        return alamat_1;
    }

    public String getAlamat_2() {
        return alamat_2;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }

    public String getAcademicAdvisor() {
        return academicAdvisor;
    }

    public String getFaculty() {
        return faculty;
    }
    
    
}
