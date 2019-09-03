package com.ghost.f.controller;

import com.ghost.f.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    @RequestMapping("student/all")
    public List getAllStudent(){
       return studentService.getAllStudent();
    }

}
