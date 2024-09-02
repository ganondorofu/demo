package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping; 

@Controller
public class MainController {

    // ホームページを表示
    @GetMapping("/")
    public String homePage() {
        return "index"; // src/main/resources/templates/index.html を返す
    }
}
