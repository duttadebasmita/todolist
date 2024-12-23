package com.supdeb.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/pookie")
    public String pookie(){
        return "hello world pookie";
    }
}
