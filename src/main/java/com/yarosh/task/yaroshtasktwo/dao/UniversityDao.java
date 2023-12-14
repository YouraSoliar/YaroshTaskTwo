package com.yarosh.task.yaroshtasktwo.dao;

import com.yarosh.task.yaroshtasktwo.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UniversityDao extends JpaRepository<University, Long> {

}
