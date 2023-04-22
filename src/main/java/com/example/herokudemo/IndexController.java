package com.example.herokudemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "login";
    }


    @GetMapping("/login")
    public String login() {
        return " 10101011 !!!! ";
    }
}
