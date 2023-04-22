package com.example.herokudemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "Hola mundo.";
    }


    @GetMapping("/login")
    public String login() {
        return "POR FAVOR INGRESA TU EMAILS Y CONTRASEÑA";
    }
}
