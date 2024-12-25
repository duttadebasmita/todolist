package com.supdeb.todolist.controller;

import com.supdeb.todolist.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    HelloWorldService service;

    @GetMapping("/pookie")
    public String pookie(){
        return service.pookie();
    }
}
