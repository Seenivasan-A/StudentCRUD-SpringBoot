package com.example.StudentCRUD.dataModel;


public class Student {
     private int rno;
     private String name;
     private String Department;

     public Student(int rno, String name, String department) {
          this.rno = rno;
          this.name = name;
          this.Department = department;
     }

     public int getRno() {
          return rno;
     }

     public String getName() {
          return name;
     }

     public String getDepartment() {
          return Department;
     }
}
