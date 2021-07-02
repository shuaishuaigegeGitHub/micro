package com.shuaishuai.micro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class helloController {
    @GetMapping("/micro")
    public String hello(){
        System.out.println("aaaaaaaaa");
        return "index";
    }
}
