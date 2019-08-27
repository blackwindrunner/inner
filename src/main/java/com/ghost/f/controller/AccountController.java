package com.ghost.f.controller;

import com.ghost.f.vo.StudentInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @RequestMapping("account/insert")
    public StudentInfo insertStudent(StudentInfo studentInfo){
        return studentInfo;

    }
}
