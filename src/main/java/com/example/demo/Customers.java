package com.example.demo;


import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * beam i kullanmaya hazırlar @componennt 
 */
@Component
public class Customers {
    private int custid;
    private  String custname;
    private String coursename;
    /**
     * bu @Autowired olmasa customer technologies i tanıyamaz
     *  otomatik olarak
     *  import org.springframework.beans.factory.annotation.Autowired;
     *  yukarıdakini ekler
     */
    @Autowired
    private Technologies techdetail;

    public Technologies getTechdetail() {
        return techdetail;
    }

    public void setTechdetail(Technologies techdetail) {
        this.techdetail = techdetail;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public void display(){

        System.out.println("object created successfully");
        this.techdetail.tech();
    }
}
