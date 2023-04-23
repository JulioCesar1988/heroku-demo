package controllers;

import models.entity.Cliente;
import models.entity.Perro;
import models.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Map;

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

    @Controller
    @SessionAttributes("cliente")
    public static class ClienteController {

        @Autowired
        private IClienteService clienteService;

        @RequestMapping(value = "/listar", method = RequestMethod.GET)
        public String listar(Model model) {
            model.addAttribute("titulo", "Listado de clientes");
            model.addAttribute("clientes", clienteService.findAll());
            return "listar";
        }

        @RequestMapping(value = "/form")
        public String crear(Map<String, Object> model) {

            Cliente cliente = new Cliente();
            model.put("cliente", cliente);
            model.put("titulo", "Formulario de Cliente");
            return "form";
        }

        @RequestMapping(value = "/formularioPerro")
        public String crearPerro(Map<String, Object> model) {

            Perro perro = new Perro();
            model.put("perro", perro);
            model.put("titulo", "Formulario de Perro");
            return "add_perro";
        }


        @RequestMapping(value = "/login")
        public String login(Map<String, Object> model) {

            Cliente cliente = new Cliente();
            model.put("cliente", cliente);
            model.put("titulo", "Login del sistema");
            return "login";
        }

        @RequestMapping(value = "/form/{id}")
        public String editar(@PathVariable(value = "id") Long id, Map<String, Object> model, RedirectAttributes flash) {

            Cliente cliente = null;

            if (id > 0) {
                cliente = clienteService.findOne(id);
                if (cliente == null) {
                    flash.addFlashAttribute("error", "El ID del cliente no existe en la BBDD!");
                    return "redirect:/listar";
                }
            } else {
                flash.addFlashAttribute("error", "El ID del cliente no puede ser cero!");
                return "redirect:/listar";
            }
            model.put("cliente", cliente);
            model.put("titulo", "Editar Cliente");
            return "form";
        }

        @RequestMapping(value = "/form", method = RequestMethod.POST)
        public String guardar(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes flash, SessionStatus status) {
            if (result.hasErrors()) {
                model.addAttribute("titulo", "Formulario de Cliente");
                return "form";
            }
            String mensajeFlash = (cliente.getId_cliente() != null) ? "Cliente editado con éxito!" : "Cliente creado con éxito!";

            clienteService.save(cliente);
            status.setComplete();
            flash.addFlashAttribute("success", mensajeFlash);
            return "redirect:listar";
        }

        @RequestMapping(value = "/eliminar/{id}")
        public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash) {

            if (id > 0) {
                clienteService.delete(id);
                flash.addFlashAttribute("success", "Cliente eliminado con éxito!");
            }
            return "redirect:/listar";
        }
    }
}
