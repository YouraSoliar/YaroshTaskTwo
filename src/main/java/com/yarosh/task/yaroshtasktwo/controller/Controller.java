package com.yarosh.task.yaroshtasktwo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/tasktwo")
public class Controller {

    @GetMapping(value = "/**")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> showStatus200() {

        return ResponseEntity.ok("ALWAYS 200");
    }

}
