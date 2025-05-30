package com.nisum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Welcome to Spring MVC!");
        return "hello"; // Maps to /WEB-INF/views/hello.jsp
    }
}
