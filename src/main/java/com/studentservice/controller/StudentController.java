package com.studentservice.controller;


import com.studentservice.Dto.StudentDto;
import com.studentservice.modal.StudentEntity;
import com.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

   @GetMapping("/get")
    public List<StudentDto> getListOfStudent(){
        List<StudentDto> list = new ArrayList<>();
        list.add(new StudentDto("Rahul","Satija","@gmail","+91"));
        return  list;
    }
    @PutMapping ("/put")
    public  void  addStudent(@RequestBody StudentDto studentDto) {
       stude

        StudentEntity e = new StudentEntity();
        e.setFirstName(studentDto.getFirstName());
        e.setLastName(studentDto.getLastName());
        e.setEmail(studentDto.getEmail());
        e.setPhoneNumber(studentDto.getPhoneNumber());

        studentService.

    }


}
