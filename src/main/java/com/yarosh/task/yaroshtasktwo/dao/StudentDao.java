package com.yarosh.task.yaroshtasktwo.dao;

import com.yarosh.task.yaroshtasktwo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDao extends JpaRepository<Student, Long> {

}
