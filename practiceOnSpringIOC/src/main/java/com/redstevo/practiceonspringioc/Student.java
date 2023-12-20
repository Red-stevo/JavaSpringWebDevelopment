package com.redstevo.practiceonspringioc;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    private String fName;

    private String sName;
    private String regNo;

    private  int age;


    public String getfName() {
        return fName;
    }

    @Value("${Student.fName}")
    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }
    @Value("${Student.sName}")
    public void setsName(String sName) {
        this.sName = sName;
    }


    public String getRegNo() {
        return regNo;
    }
    @Value("${Student.regNo}")
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public int getAge() {
        return age;
    }

    @Value("${Student.age}")
    public void setAge(int age) {
        this.age = age;
    }
}
