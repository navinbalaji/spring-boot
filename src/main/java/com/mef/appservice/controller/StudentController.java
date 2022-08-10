package com.mef.appservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    public StudentController() {
    }

    @GetMapping("/v1/student/{id}/class")
    public void getClassSession(@PathVariable long studentId){

    }

    @GetMapping("/v1/student/{id}/assignment")
    public void getAssignment(@PathVariable long studentId){

    }

    @PostMapping("/v1/student/{id}/assignment")
    public void setAssignment(@PathVariable long studentId){

    }

    @GetMapping("/v1/student/{id}")
    public void getUserDetails(@PathVariable long studentId){

    }

    @GetMapping("/v1/student/{id}/session")
    public void getSessionDetails(@PathVariable long studentId){

    }
}
