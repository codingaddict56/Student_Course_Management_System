package com.example.SCMS.demo.SCMS.controller;

import com.example.SCMS.demo.SCMS.model.Student;
import com.example.SCMS.demo.SCMS.service.StudentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class StudentController {

    final private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student register(@RequestBody Student student){
        return studentService.registerStudent(student);
    }

    public List<Student> getAll(){
        return studentService.getAllStudent();
    }

    @PutMapping("/{id}/course")
    public void assignCourse(@PathVariable String id, @RequestBody Set<String> course){
        studentService.assignCourse(id, course);
    }
}
