package com.yarosh.task.yaroshtasktwo.service;

import com.yarosh.task.yaroshtasktwo.dao.UniversityDao;
import com.yarosh.task.yaroshtasktwo.entity.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityServiceImpl implements UniversityService {

    @Autowired
    private UniversityDao universityDao;

    @Override
    public List<University> getAllUniversities() {
        return universityDao.findAll();
    }

    @Override
    public void saveUniversity(University university) {
        universityDao.save(university);
    }

    @Override
    public University getUniversity(Long id) {
        University university = null;
        Optional<University> universityOptional = universityDao.findById(id);

        if (universityOptional.isPresent()) {
            university = universityOptional.get();
        }

        return university;
    }

    @Override
    public void deleteUniversity(Long id) {
        universityDao.deleteById(id);
    }

}
