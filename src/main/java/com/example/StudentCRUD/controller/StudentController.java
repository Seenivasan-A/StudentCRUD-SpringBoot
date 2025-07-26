package com.example.StudentCRUD.controller;

import com.example.StudentCRUD.entity.StudentEntity;
import com.example.StudentCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<StudentEntity> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/{rno}")
    public StudentEntity getStdByRoll(@PathVariable("rno") int rollno) {
        return studentService.getRoll(rollno);
    }

    @PostMapping
    public String addStudent(@RequestBody StudentEntity student) {
        studentService.addStudent(student);
        return "Student added successfully!";
    }

    @GetMapping("/name/{name}")
    public StudentEntity getName(@PathVariable("name") String name) {
        return studentService.getName(name);
    }

    @PutMapping("/{rno}")
    public String updateStudent(@PathVariable("rno") int rollno, @RequestBody StudentEntity updatedStudent) {
        StudentEntity existingStudent = studentService.getRoll(rollno);
        if (existingStudent == null) {
            return "Student not found!";
        }

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setDept(updatedStudent.getDept());
        studentService.addStudent(existingStudent);
        return "Student updated successfully!";
    }

    @DeleteMapping("/{rno}")
    public String deleteStudent(@PathVariable("rno") int rollno) {
        return studentService.deleteStudent(rollno);
    }
}
