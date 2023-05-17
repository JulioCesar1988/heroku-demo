package com.bolsadeideas.springboot.app.controllers;

import com.bolsadeideas.springboot.app.models.entity.Turno;
import com.bolsadeideas.springboot.app.models.service.ITurnos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import java.util.Map;

import org.springframework.stereotype.Controller;

@Controller
public class TurnoController {
	
	@Autowired
	private ITurnos turnoService;
	
	@RequestMapping(value = "/listarTurnos", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("Listado de Turnos");
		model.addAttribute(turnoService.findAll());
		return "listarTurnos";
	}
	
	@RequestMapping(value = "/formularioTurnos")
	public String crearTurno(Map<String, Object> model) {
		Turno turno = new Turno();
		model.put("Turnos", turno);
		model.put("Titulo", "Formulario de turnos");
		return "formularioTurnos";
	}
	
	


}
