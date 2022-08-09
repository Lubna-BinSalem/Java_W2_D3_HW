package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class GradeController {
     ArrayList<Integer> grades=new ArrayList<>();

    @GetMapping(path="/grade")
    public ArrayList<Integer> getGrade(){
        return grades;
    }

    @PostMapping(path="/grade")
    public String postGrade(@RequestBody int g){
        grades.add(g);
        return "Grade added";
    }

    @PutMapping(path="/grade/{index}")
    public String putGrade(@RequestBody int grade, @PathVariable int index){
        grades.set(index, grade);
        return "Grade updated";
    }

    @DeleteMapping(path="/grade/{index}")
    public String deleteGrade(@PathVariable int index){
        grades.remove(index);
            return "Grade deleted";
        }
}
