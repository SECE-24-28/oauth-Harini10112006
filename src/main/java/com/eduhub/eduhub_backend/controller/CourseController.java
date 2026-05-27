package com.eduhub.eduhub_backend.controller;

import com.eduhub.eduhub_backend.component.CourseService;
import com.eduhub.eduhub_backend.component.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("courses")
    public ResponseEntity<List<CourseService>> getCourse(){
        List<CourseService> coursesList=new ArrayList<>();
        coursesList.add(new CourseService("cs11","OS",4));
        coursesList.add(new CourseService("cs12","JAVA",3));
        coursesList.add(new CourseService("cs13","DBMS",4));
        coursesList.add(new CourseService("cs14","Python",2));
        return new ResponseEntity<>(coursesList,HttpStatus.OK);
    }

    //http://localhost:8080/id/firstname/lastname
    @GetMapping("{courseCode}")
    public ResponseEntity<CourseService> coursePathVariable(@PathVariable("courseCode") String courseCode)
    {
        CourseService courseService = new CourseService();
        return new ResponseEntity<>(courseService, HttpStatus.OK);
    }

    //http://localhost:8080/query?studentId=2&firstName=Visahasri&lastName=G
    @GetMapping("query")
    public ResponseEntity<CourseService> courseServiceResponseEntity(@RequestParam String courseCode,
                                                           @RequestParam String subjectName,
                                                           @RequestParam int credits
    )
    {
        CourseService courseService = new CourseService(courseCode, subjectName, credits);
        return ResponseEntity.ok(courseService);
    }

    @PostMapping("create-course")
    public  ResponseEntity<CourseService> createCourse(@RequestBody CourseService courseService){
        System.out.println(courseService.getCourseCode());
        System.out.println(courseService.getSubjectName());
        System.out.println(courseService.getCredits());
        return ResponseEntity.ok(courseService);
    }

    @PutMapping("{courseCode}/update-course")
    public ResponseEntity updateCourse(@PathVariable("courseCode") String courseCode,
                                        @RequestBody CourseService courseService
    ){
        return ResponseEntity.accepted().body(courseCode);
    }

    @DeleteMapping("{courseCode}/delete")
    public ResponseEntity deleteCourse(@PathVariable("courseCode") String courseCode){
        return ResponseEntity.ok(courseCode);
    }
}
