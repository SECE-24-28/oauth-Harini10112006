package com.eduhub.eduhub_backend.controller;

import com.eduhub.eduhub_backend.component.CourseService;
import com.eduhub.eduhub_backend.component.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("get-course")
    public String getCourse(){
        return courseService.getCourse();
    }

    @Autowired
    DemoService demoService;

    @GetMapping("get-demo")
    public String getDemo(){
        return demoService.getDemo();
    }

}
