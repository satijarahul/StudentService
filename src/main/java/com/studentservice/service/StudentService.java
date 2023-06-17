package com.studentservice.service;

import com.studentservice.Dto.StudentDto;

import java.util.List;

public interface StudentService {

    public void saveStudent(StudentDto dto);
    public List<StudentDto> getListOfStudent();
}
