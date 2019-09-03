package com.ghost.f.service;

import com.ghost.f.entity.StudentEntity;
import com.ghost.f.vo.StudentVO;

import java.util.List;

public interface StudentService {

    List getAllStudent();
    List<StudentVO> getAllStudentName();
}
