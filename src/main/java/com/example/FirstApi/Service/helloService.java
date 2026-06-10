package com.example.FirstApi.Service;

import org.springframework.stereotype.Service;

@Service
public class helloService {
    public String greeting(){
        return "Hello springboot";
    }
    public String aboutme(){
        return "This is course";
    }

    public String lec(){
        return "class 1";
    }
}
