package com.yarosh.task.yaroshtasktwo.service;

import com.yarosh.task.yaroshtasktwo.dao.StudentDao;
import com.yarosh.task.yaroshtasktwo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        studentDao.save(student);
    }

    @Override
    public Student getStudent(Long id) {
        Student student = null;
        Optional<Student> studentOptional = studentDao.findById(id);

        if (studentOptional.isPresent()) {
            student = studentOptional.get();
        }

        return student;
    }

    @Override
    public void deleteStudent(Long id) {
        studentDao.deleteById(id);
    }

}
