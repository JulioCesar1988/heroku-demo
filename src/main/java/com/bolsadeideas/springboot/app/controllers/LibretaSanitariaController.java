package com.bolsadeideas.springboot.app.controllers;

import java.util.Map;

import javax.validation.Valid;

import com.bolsadeideas.springboot.app.models.entity.Perro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bolsadeideas.springboot.app.models.entity.LibretaSanitaria;
import com.bolsadeideas.springboot.app.models.service.ILibertaSanitariaService;

@Controller
public class LibretaSanitariaController {

	@Autowired
	private ILibertaSanitariaService libretaService;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model, LibretaSanitaria libreta) {
		model.addAttribute("Titulo", "Libreta Sanitaria");
		model.addAttribute("Datos de la librteta", libretaService.findAll());
		return "listar";
	}
	

}
