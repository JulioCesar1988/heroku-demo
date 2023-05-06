package com.bolsadeideas.springboot.app.controllers;

import com.bolsadeideas.springboot.app.models.service.IVeterinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VeterinariaController {
    @Autowired
    private IVeterinariaService veterinariaService;


    @RequestMapping(value = "/listarVeterinarias", method = RequestMethod.GET)
    public String listarVeterinaria(Model model) {
        model.addAttribute("titulo", "Listado de Veterinarias");
        model.addAttribute("veterinarias", veterinariaService.findAll());
        return "listado_veterinarias";
    }


}
