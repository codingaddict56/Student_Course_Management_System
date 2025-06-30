package com.example.SCMS.demo.SCMS.service;

import com.example.SCMS.demo.SCMS.model.Course;
import com.example.SCMS.demo.SCMS.model.Student;
import com.example.SCMS.demo.SCMS.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Set;

@Service
public class StudentService {

    final private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student registerStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }


    public void assignCourse(String id, Set<String> course) {
        Student student =  studentRepository.findById(id).orElseThrow();
        student.getEnrolledCourses().addAll(course);
        studentRepository.save(student);

    }
}
