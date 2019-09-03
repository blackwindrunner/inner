package com.ghost.f.controller;

import com.ghost.f.service.AccountService;
import com.ghost.f.service.StudentService;
import com.ghost.f.vo.AccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    public AccountService accountService;
    @Autowired
    StudentService studentService;
    @RequestMapping("/insert")
    public AccountVO insertStudent(AccountVO accountVO){
        accountService.saveAccount(accountVO);
        return accountVO;

    }

    @RequestMapping("/index")
    public String index(ModelMap map){
        List studentList=studentService.getAllStudentName();
        map.put("students",studentList);
        return "index";

    }
}
