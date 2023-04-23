package controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

    @SpringBootApplication
    public static class HerokuDemoApplication {

        public static void main(String[] args) {
            SpringApplication.run(HerokuDemoApplication.class, args);
        }

    }
}
