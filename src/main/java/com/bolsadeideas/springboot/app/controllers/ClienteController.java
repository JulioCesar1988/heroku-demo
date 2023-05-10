package com.bolsadeideas.springboot.app.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bolsadeideas.springboot.app.models.entity.Cliente;
import com.bolsadeideas.springboot.app.models.service.IClienteService;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@SessionAttributes("cliente")
public class ClienteController {

	@Autowired
	private IClienteService clienteService;

	@PostMapping("/validarLogin")
	public String iniciarSesion(@RequestParam("email") String email,
								@RequestParam("pwd") String pwd,
								HttpSession session, Model model) {
		Cliente cliente =   clienteService.buscarClientePorEmail(email);

		if (   cliente != null &&  cliente.getEmail().equals(email) && cliente.getClave().equals(pwd) ) {
			session.setAttribute("cliente", cliente);
			model.addAttribute("cliente", cliente);

			return "home";
		} else {
			// aca tenemos que enviar un mensaje  que algo no es valido
			return "login";
		}
	}


	@GetMapping("/logout")
	public String logout(HttpSession session, HttpServletRequest request) {
		session.invalidate();
		return "home";
	}


	// home principal de la pagina
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		return "home";
	}

	// metodo para veterinario
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model,HttpSession session) {

		model.addAttribute("titulo", "Listado de clientes");
		model.addAttribute("clientes", clienteService.findAll());



		return "listar";
	}

	// formulario para el Cliente
	@RequestMapping(value = "/form")
	public String crear(Map<String, Object> model,HttpSession session) {
		Cliente c = new Cliente();
		model.put("c", c);
		model.put("titulo", "Formulario de Cliente");

		return "form";
	}




	@RequestMapping(value = "/login")
	public String login(Map<String, Object> model) {
		Cliente cliente = new Cliente();
		model.put("cliente", cliente);
		model.put("titulo", "Login del sistema");
		return "login";
	}

	@RequestMapping(value = "/form/{id}")
	public String editar(@PathVariable(value = "id") Long id, Map<String, Object> model, RedirectAttributes flash,HttpSession session) {

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
	public String guardar(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes flash, SessionStatus status,HttpSession session) {
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
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash,HttpSession session) {

		if (id > 0) {
			clienteService.delete(id);
			flash.addFlashAttribute("success", "Cliente eliminado con éxito!");
		}
		return "redirect:/listar";
	}


	@RequestMapping(value = "/getPerros")
	public String misPerros(Map<String, Object> model,HttpSession session) {
		System.out.println("Cantidad de perros del clientes : 1 es : " + clienteService.findOne(1L).getPerro().size());
		Cliente cliente = new Cliente();
		model.put("cliente", cliente);
		model.put("titulo", "Login del sistema");
		return "login";
	}
}