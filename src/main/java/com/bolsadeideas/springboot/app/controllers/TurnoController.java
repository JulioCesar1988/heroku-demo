package com.bolsadeideas.springboot.app.controllers;

import com.bolsadeideas.springboot.app.models.service.IClienteService;
import com.bolsadeideas.springboot.app.models.service.IPerroService;
import com.bolsadeideas.springboot.app.models.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class TurnoController {


    @Autowired
    private ITurnoService turnoService;


    @Autowired
    private IPerroService perroService;

    @Autowired
    private IClienteService clienteService;


    @RequestMapping(value = "/listarTurnos", method = RequestMethod.GET)
    public String listar(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("cliente") == null) {
            // La sesión no existe o el atributo "cliente" no está presente en la sesión
            // Realiza la lógica correspondiente, por ejemplo, redireccionar a la página de inicio de sesión
            return "redirect:/login";
        }

        // El usuario tiene una sesión válida, continúa con la lógica del controlador
        model.addAttribute("titulo", "Listado de turnos para tu perro");
        model.addAttribute("turnos", turnoService.findAll());
        return "listarTurnos";
    }

    @RequestMapping(value = "/listarTurnosParaUnCliente", method = RequestMethod.GET)
    public String listarTurnosParaUnCliente(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("cliente") == null) {
            // La sesión no existe o el atributo "cliente" no está presente en la sesión
            // Realiza la lógica correspondiente, por ejemplo, redireccionar a la página de inicio de sesión
            return "redirect:/login";
        }

        // El usuario tiene una sesión válida, continúa con la lógica del controlador
        model.addAttribute("titulo", "Listado de turnos para tu perro");
        // Resto del código...


        return "redirect:/login";
    }

}


