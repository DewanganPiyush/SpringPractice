package com.healthcatalyst.main.beans;

import org.springframework.stereotype.Component;


public class Student {
    private String name;
    private int rollno;
    private Address address;
    //private float marks;

    public Student(String name, int rollno, Address address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }


//    public Student(String name, int rollno) {
//        this.name = name;
//        this.rollno = rollno;
//        //this.marks = marks;
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getRollno() {
//        return rollno;
//    }
//
//    public void setRollno(int rollno) {
//        this.rollno = rollno;
//    }
//
//    public Address getAdresss() {
//        return address;
//    }
//
//    public void setAdresss(Address adresss) {
//        this.address = adresss;
//    }

    //    public float getMarks() {
//        return marks;
//    }
//
//    public void setMarks(float marks) {
//        this.marks = marks;
//    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        //System.out.println("Marks: " + marks);
        System.out.println("Address: " + address);
    }

}
