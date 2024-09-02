package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // ホームページを表示
    @GetMapping("/")
    public String homePage() {
        return "index"; // src/main/resources/templates/index.html を返す
    }

    // 本を表示
    @GetMapping("/book")
    public String bbok(Model model) {
        // 必要に応じてモデルにデータを追加できます
        return "book"; // src/main/resources/templates/book.html を返す
    }
}
