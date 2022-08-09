package com.example.person.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PersonController {

    ArrayList<String> names=new ArrayList<>();

    @GetMapping(path="/name")
    public ArrayList<String> getName(){
        return names;
    }

    @PostMapping(path="/name")
    public String postName(@RequestBody String name){
        names.add(name);
        return  "Student added";
    }

    @PutMapping(path="/name/{index}")
    public String putName(@RequestBody String name, @PathVariable int index){
        names.set(index, name);
        return "name updated";
    }

    @DeleteMapping(path="/name/{index}")
    public String deleteName(@PathVariable int index){
        names.remove(index);
        return "Name deleted";
    }

}
