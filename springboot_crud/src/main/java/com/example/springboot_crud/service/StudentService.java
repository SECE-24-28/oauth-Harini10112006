package com.example.springboot_crud.service;

import com.example.springboot_crud.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class StudentService {
    List<Student> students =new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Hazel","Spring"),
                    new Student(2,"Ben","OS")
            ));
    public List<Student> getAllStudent() {
        return students;
    }

    public Student getStudentByRollNo(int roll) {
        int index = 0;
        boolean flag = true;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno() == roll){
                index = i;
                flag =false;
            }
        }
        if(flag)
            return new Student(0,"","");
        else {
            return students.get(index);
        }
    }

    public void addStudent(Student std){
        students.add(std);
    }

    public String updateStudent(Student std){
        int index = 0;
        boolean flag = true;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno() == std.getRno()){
                index=i;
                flag = false;
                break;
            }
        }
        if(flag)return "No such Data";
        else{
            students.set(index,std);
            return "updated";
        }
    }

    public String deleteStudent(int r){
        int index=0;
        boolean flag=true;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno()==r){
                index=i;
                flag=false;
                break;
            }
        }
        if(flag) return "no such data";
        else{
            students.remove(index);
            return "deleted successfully";
        }
    }
}