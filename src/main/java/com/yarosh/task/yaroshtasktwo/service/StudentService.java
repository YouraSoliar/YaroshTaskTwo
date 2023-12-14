package com.yarosh.task.yaroshtasktwo.service;


import com.yarosh.task.yaroshtasktwo.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudents();

    public void saveStudent(Student student);

    public Student getStudent(Long id);

    public void deleteStudent(Long id);
}
