package com.yarosh.task.yaroshtasktwo.controller;

import com.yarosh.task.yaroshtasktwo.entity.University;
import com.yarosh.task.yaroshtasktwo.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasktwo")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping("/universities")
    public List<University> showAllUniversities() {
        List<University> allUniversities = universityService.getAllUniversities();
        return allUniversities;
    }

    @GetMapping("/abc")
    public int showCount() {
        List<University> allUniversities = universityService.getAllUniversities();
        int count = allUniversities.size();
        return count;
    }

    @GetMapping("/universities/{id}")
    public University getUniversity(@PathVariable Long id) {
        University university = universityService.getUniversity(id);
        return university;
    }

    @PostMapping(name = "/universities", consumes = MediaType.APPLICATION_JSON_VALUE)
    public University addNewUniversity(@RequestBody University university) {
        universityService.saveUniversity(university);
        return university;
    }

    @PutMapping("/universities")
    public University updateUniversity(@RequestBody University university) {
        universityService.saveUniversity(university);
        return university;
    }

    @DeleteMapping("/universities/{id}")
    public String deleteUniversity(@PathVariable Long id) {

        universityService.deleteUniversity(id);
        String response = "University with ID " + id + " was deleted";
        return response;
    }
}
