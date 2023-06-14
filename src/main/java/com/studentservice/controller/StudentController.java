package com.studentservice.controller;


import com.studentservice.Dto.StudentDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

   @GetMapping("/")
    public List<StudentDto> getListOfStudent(){
        List<StudentDto> list = new ArrayList<>();
        list.add(new StudentDto("Rahul","Satija","@gmail","+91"));
        return  list;
    }
    @PutMapping ("/")
    public  void  addStudent(@RequestBody StudentDto studentDto) {

    }


}
