package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")
   public Student getStudent() {
       return new Student("Srinivas", "Tadakamalla");

   }
    @GetMapping("/students")
   public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Srinivas", "Tadakamalla"));
        students.add(new Student("Srilatha", "Kannegulla"));
        students.add(new Student("Sahithi", "Tadakamalla"));
        students.add(new Student("Saketh", "Sai"));
        students.add(new Student("Bharathi", "Krishna"));
        return students;

   }

}
