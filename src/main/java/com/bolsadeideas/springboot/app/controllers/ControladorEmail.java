package com.bolsadeideas.springboot.app.controllers;


import com.bolsadeideas.springboot.app.models.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEmail {

    @Autowired
    private EmailService emailService;

    @GetMapping("/enviar-correo")
    public String enviarCorreo() {
        emailService.enviarCorreo("julio.unlp2010@gmail.com", "Asunto del correo", "Este es el mensaje del correo.");
        return "Correo enviado.";
    }
}
