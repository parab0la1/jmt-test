package com.example.gitcourse.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitCourseController {

    @GetMapping(value = "/hello-world")
    public String getHelloWorld() {
        return "Hello JMTrickers!";
    }
}
