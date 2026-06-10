package com.example.FirstApi.Service;

import com.example.FirstApi.Component.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public Student getStudent() {
        return new Student(101, "Harini", "CSE");
    }

    public Student createStudent(Student student) {
        return student;
    }
}