package com.bolsadeideas.springboot.app.controllers;

import com.bolsadeideas.springboot.app.models.entity.Adopcion;
import com.bolsadeideas.springboot.app.models.entity.Cliente;
import com.bolsadeideas.springboot.app.models.service.IAdopcionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.util.Map;

@Controller
public class AdopcionController {
    @Autowired
    private IAdopcionService adopcionService;


    @RequestMapping(value = "/listado-adopciones", method = RequestMethod.GET)
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de adopciones");
        model.addAttribute("adopciones", adopcionService.findAll());
        return "listado_adopciones";
    }

    @RequestMapping(value = "/formularioAdopcion")
    public String publicarAdopcion(Map<String, Object> model) {
        Adopcion adopcion = new Adopcion();
        model.put("adopcion", adopcion);
        model.put("titulo", "Formulario de adopción");
        return "form_publicar_adopcion";
    }

    @RequestMapping(value = "/publicaradopcion", method = RequestMethod.POST)
    public String guardar(@Valid Adopcion adopcion, BindingResult result, Model model, RedirectAttributes flash, SessionStatus status, HttpSession session) throws IOException {

        Cliente c = (Cliente) session.getAttribute("cliente");

        adopcion.setAutor(c);
        adopcionService.save(adopcion);
        String mensajeFlash = (adopcion.getId_adopcion() == null) ? "Publicación editada con éxito!" : "Publicación creada con éxito!";

        status.setComplete();
        flash.addFlashAttribute("success", mensajeFlash);
        return "redirect:listado-adopciones";
    }


}
