package com.codestates.todoapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoAppController {


    @GetMapping("/")
    public String helloWorld(){

        return "To-do-Application !";
    }

}
