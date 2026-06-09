package com.example.springboot_crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int rno;
    private String name;
    private String tech;

    public int getRno() {
        return rno;
    }

    public String getName() {
        return name;
    }

    public String getTech() {
        return tech;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
}
