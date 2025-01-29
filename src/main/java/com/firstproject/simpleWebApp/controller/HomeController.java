package com.firstproject.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController         // to send data only(not file page)     [used before Class, so that all the methods in class sends data]
public class HomeController {

    @RequestMapping("/")        // "/" means homepage
    // @ResponseBody           // to only send data not file  [used before method]
    public String greed(){
        return "Welcome Back";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is about Section";
    }

    
}
