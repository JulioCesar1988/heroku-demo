package com.bolsadeideas.springboot.app.controllers;

import com.bolsadeideas.springboot.app.models.entity.Perro;
import com.bolsadeideas.springboot.app.models.service.IPerroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class PerroController {

    @Autowired
    private IPerroService perroService;

    @RequestMapping(value = "/listarPerros", method = RequestMethod.GET)
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de perros");
        model.addAttribute("perros", perroService.findAll());
        return "listado_perros";
    }


    //Formulario para cargar la Informcion de un Perro para un  Cliente
    @RequestMapping(value = "/formularioPerro")
    public String crearPerro(Map<String, Object> model) {
        Perro perro = new Perro();
        model.put("perro", perro);
        model.put("titulo", "Formulario de Perro");
        return "add_perro";
    }

}
