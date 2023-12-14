package com.yarosh.task.yaroshtasktwo.controller;

import com.yarosh.task.yaroshtasktwo.entity.Student;
import com.yarosh.task.yaroshtasktwo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasktwo")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> showAllStudents() {
        List<Student> allStudents = studentService.getAllStudents();
        return allStudents;
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable Long id) {
        Student student = studentService.getStudent(id);
        return student;
    }

    @PostMapping("/students")
    public Student addNewStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return student;
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {

        studentService.deleteStudent(id);
        String response = "Student with ID " + id + " was deleted";
        return response;
    }
}
