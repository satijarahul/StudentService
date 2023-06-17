package com.studentservice.controller;
import com.studentservice.Dto.StudentDto;
import com.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

   @GetMapping("/")
    public List<StudentDto> getListOfStudent(){
       return  studentService.getListOfStudent();
    }
    @PutMapping ("/")
    public  void  addStudent(@RequestBody StudentDto studentDto) {
        studentService.saveStudent(studentDto);
    }


}
