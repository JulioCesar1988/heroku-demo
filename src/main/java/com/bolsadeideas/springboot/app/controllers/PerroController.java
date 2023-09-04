package com.bolsadeideas.springboot.app.controllers;

import com.bolsadeideas.springboot.app.models.entity.Cliente;
import com.bolsadeideas.springboot.app.models.entity.Perro;
import com.bolsadeideas.springboot.app.models.entity.Turno;
import com.bolsadeideas.springboot.app.models.service.IClienteService;
import com.bolsadeideas.springboot.app.models.service.IPerroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class PerroController {




    @Autowired
    private IClienteService clienteService;

    @Autowired
    private IPerroService perroService;

    @RequestMapping(value = "/listarPerros", method = RequestMethod.GET)
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de perros");
        model.addAttribute("perros", perroService.findAll());
        return "listado_perros";
    }



    @RequestMapping(value = "/listarPerrosDeUsuario", method = RequestMethod.GET)
    public String listarPerrosCliente(Model model , HttpSession session) {
        Cliente c = (Cliente) session.getAttribute("cliente");
        model.addAttribute("titulo", "Listado de perros");
        model.addAttribute("perros", clienteService.findOne(c.getId_cliente()).getPerro());
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


// Agregamos al perro para un cliente
    @RequestMapping(value = "/agregarperro", method = RequestMethod.POST)
    public String guardar(@Valid Perro perro, BindingResult result, Model model, RedirectAttributes flash, SessionStatus status, HttpSession session) throws IOException {

        Cliente c = (Cliente) session.getAttribute("cliente");

        LocalDate fechaNac = perro.getCreateAt().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaActual = LocalDate.now();
        int edadEnAnios = Period.between(fechaNac, fechaActual).getYears();

        Period edadEnMeses = Period.between(fechaNac, fechaActual);
        int meses = edadEnMeses.getYears() * 12 + edadEnMeses.getMonths();
        System.out.println("ANos ->:" + edadEnAnios +" Meses -> "+meses );

        perro.setCliente(c);
        perroService.save(perro);
        String mensajeFlash = (perro.getId_perro() == null) ? "Perro editado con éxito!" : "Perro creado con éxito!";

        status.setComplete();
        flash.addFlashAttribute("success", mensajeFlash);
        return "redirect:listarPerrosDeUsuario";
    }

}
