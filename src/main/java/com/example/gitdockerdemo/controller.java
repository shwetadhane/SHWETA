package com.example.gitdockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/hello")
    public String doGet(){

        return "Welcome to Git Docker Web Project";
    }
}
