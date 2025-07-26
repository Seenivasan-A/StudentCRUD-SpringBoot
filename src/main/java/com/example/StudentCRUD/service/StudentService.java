package com.example.StudentCRUD.service;

import com.example.StudentCRUD.entity.StudentEntity;
import com.example.StudentCRUD.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentEntity> getStudents() {
        return studentRepository.findAll();
    }

    public StudentEntity getRoll(int rollno) {
        return studentRepository.findById(rollno).orElse(null);
    }

    public void addStudent(StudentEntity student) {
        studentRepository.save(student);
    }

    public StudentEntity getName(String name) {
        return studentRepository.findByName(name);
    }
    public String deleteStudent(int rollno) {
        if (studentRepository.existsById(rollno)) {
            studentRepository.deleteById(rollno);
            return "Student deleted successfully!";
        } else {
            return "Student not found!";
        }
    }
}
