package com.example.welcome.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    //@RequestMapping(path="/hey", method= RequestMethod.GET)
    @GetMapping(path="/hey")
    public String hey(){
        return "Hey from spring";
    }

    @GetMapping(path="/bye")
    public String bye(){
        return "Bye";
    }

    @GetMapping(path="/check/status")
    public String check(){
        return "Everything OK";
    }

    @GetMapping(path="/health")
    public String helth(){
        return "Server health is up and running";
    }



}
