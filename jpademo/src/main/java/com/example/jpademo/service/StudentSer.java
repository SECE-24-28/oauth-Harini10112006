package com.example.jpademo.service;

import com.example.jpademo.repository.StudentRepo;
import com.example.jpademo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSer {
    @Autowired
    StudentRepo repo;

    public List<Student> getStudents() {
        return repo.findAll();
    }
}