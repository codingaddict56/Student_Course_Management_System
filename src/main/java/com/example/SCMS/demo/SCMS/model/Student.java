package com.example.SCMS.demo.SCMS.model;

import org.springframework.data.annotation.Id;

import java.util.HashSet;
import java.util.Set;

public class Student {
    @Id
    private String id;
    private String name;
    private Set<String> enrolledCourses = new HashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(Set<String> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }
}
