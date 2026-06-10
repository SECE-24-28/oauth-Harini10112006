package com.example.jpademo.controller;
import com.example.jpademo.service.StudentSer;
import com.example.jpademo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentSer s;
    @GetMapping
    public List<Student> getStudents(){
        return s.getStudents();
    }

}