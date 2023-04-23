package com.example.herokudemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "home";
    }


    @GetMapping("/login")
    public String login() {
        return "listado_veterinarias";
    }


    @GetMapping("/listar")
    public String listar() {
        return "listar";
    }

}
