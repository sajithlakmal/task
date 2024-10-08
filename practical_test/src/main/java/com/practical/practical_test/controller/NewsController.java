package com.practical.practical_test.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {

    @GetMapping("/")
    public String homepage() {
        return "index.html";
    }

}