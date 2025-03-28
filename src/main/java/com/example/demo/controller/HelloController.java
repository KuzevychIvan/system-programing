package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, World!");
        return "greeting";
    }

    @GetMapping("/greet")
    public String greet(Model model) {
        model.addAttribute("message", "Ласкаво просимо до Spring Boot!");
        return "greeting";
    }
} 