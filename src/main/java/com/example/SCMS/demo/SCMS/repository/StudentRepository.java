package com.example.SCMS.demo.SCMS.repository;

import com.example.SCMS.demo.SCMS.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String > {

}
