package com.example.jpademo.repository;

import com.example.jpademo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepo extends JpaRepository<Student,Integer> {

}