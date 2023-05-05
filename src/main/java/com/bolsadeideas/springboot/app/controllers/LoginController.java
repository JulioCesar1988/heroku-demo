package com.bolsadeideas.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {



    @GetMapping("/test")
    public String showLoginFormtest() {
        return "test";
    }


    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String submitLoginForm( String email, @RequestParam("pwd") String pwd) {
        // Aquí iría la lógica de autenticación del usuario
          System.out.println("datos ingresados : " + email + " - " + pwd);
        // Si el usuario se autentica correctamente, redirigirlo a la página de inicio
        return "login";
    }
}
