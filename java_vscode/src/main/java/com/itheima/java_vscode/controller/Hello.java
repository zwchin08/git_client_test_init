package com.itheima.java_vscode.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("Hello!");
        return "Hello";
    }
}
