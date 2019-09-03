package com.ghost.f.service.impl;

import com.ghost.f.entity.StudentEntity;
import com.ghost.f.repository.StudentRepository;
import com.ghost.f.service.StudentService;
import com.ghost.f.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<StudentEntity> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public List<StudentVO> getAllStudentName() {
        List<StudentEntity> list=studentRepository.findAll();
        return list.stream().map(studentEntity -> boToVo(studentEntity)).collect(Collectors.toList());
    }

    private StudentVO boToVo(StudentEntity studentEntity) {
        StudentVO studentVO=new StudentVO();
        studentVO.setId(studentEntity.getId());
        studentVO.setName(studentEntity.getName());
        return studentVO;
    }


}
