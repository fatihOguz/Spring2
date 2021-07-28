package com.example.demo;

import org.springframework.stereotype.Component;


/**
 * bu class Customers classs içinde bulunudğundan bunu compoent olduğunu belirtmemiz gerekir
 * Asagıdaki @component import org.springframework.stereotype.Component; bilgisini otomatik getiriyor
 */
@Component
public class Technologies {
    private int Techid;
    private String techname;


    public int getTechid() {
        return Techid;
    }

    public void setTechid(int techid) {
        Techid = techid;
    }

    public String getTechname() {
        return techname;
    }

    public void setTechname(String techname) {
        this.techname = techname;
    }

    public void tech(){
        System.out.println("Technologies successfully...");
    }
}
