package com.yarosh.task.yaroshtasktwo.service;


import com.yarosh.task.yaroshtasktwo.entity.University;

import java.util.List;

public interface UniversityService {

    public List<University> getAllUniversities();

    public void saveUniversity(University university);

    public University getUniversity(Long id);

    public void deleteUniversity(Long id);
}
