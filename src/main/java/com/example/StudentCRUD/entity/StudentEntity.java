package com.example.StudentCRUD.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students") 
public class StudentEntity {

    @Id
    private int rno;
    private String name;
    private String dept;

    // Constructors
    public StudentEntity() {}

    public StudentEntity(int rno, String name, String dept) {
        this.rno = rno;
        this.name = name;
        this.dept = dept;
    }

    // Getters and Setters
    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
