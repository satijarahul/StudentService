package com.studentservice.service;

import com.studentservice.Dto.StudentDto;
import com.studentservice.repository.StudentServiceRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    StudentServiceRepository studentServiceRepository;

    @Override
    public void saveStudent(StudentDto dto) {

    }

    @Override
    public List<StudentDto> getListOfStudent() {

        return null;
    }
}
