package com.bolsadeideas.springboot.app.controllers;

import com.bolsadeideas.springboot.app.models.entity.Adopcion;
import com.bolsadeideas.springboot.app.models.entity.Cliente;
import com.bolsadeideas.springboot.app.models.service.IAdopcionService;

import com.bolsadeideas.springboot.app.models.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/adopciones")
public class AdopcionController {
    @Autowired
    private IAdopcionService adopcionService;
    @Autowired
    private IClienteService clienteService;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listarAdopciones(Model model) {
        model.addAttribute("titulo", "Listado de adopciones");
        model.addAttribute("adopciones", adopcionService.findAll());
        return "adopciones/listado";
    }


    @RequestMapping(value = "/misPublicaciones", method = RequestMethod.GET)
    public String listarMisPublicaciones(Model model, HttpSession session) {
        Cliente c = (Cliente) session.getAttribute("cliente");
        model.addAttribute("titulo", "Mis publicaciones de adopción");
        model.addAttribute("adopciones", clienteService.findOne(c.getId_cliente()).getAdopciones());
        return "adopciones/mis_publicaciones";
    }


    @RequestMapping(value = "/nuevo")
    public String nuevo(Map<String, Object> model) {
        Adopcion adopcion = new Adopcion();
        model.put("adopcion", adopcion);
        model.put("titulo", "Nueva adopción");
        return "adopciones/form_crear";
    }


    @RequestMapping(value = "/crear", method = RequestMethod.POST)
    public String crear(@Valid Adopcion adopcion, BindingResult result, Map<String, Object> model, RedirectAttributes flash, SessionStatus status, HttpSession session) throws IOException {
        if(result.hasErrors()){
            return "redirect:/adopciones/misPublicaciones";
        }
        Cliente c = (Cliente) session.getAttribute("cliente");
        adopcion.setAutor(c);
        adopcionService.save(adopcion);
        String mensajeFlash = "Publicación creada con éxito!";
        status.setComplete();
        flash.addFlashAttribute("success", mensajeFlash);
        return "redirect:/adopciones/misPublicaciones";
    }


    @RequestMapping(value = "/detalle/{id}", method = RequestMethod.GET)
    public String detalleAdopcion(@PathVariable("id") Long id, Map<String, Object> model, RedirectAttributes flash, HttpSession session) {
        Adopcion adopcion = null;
        if (id > 0) {
            adopcion = adopcionService.findOne(id);
            if (adopcion == null) {
                flash.addFlashAttribute("error", "El ID de la adopción no existe en la BBDD!");
                return "redirect:/adopciones/misPublicaciones";
            }
        } else {
            flash.addFlashAttribute("error", "El ID de la adopción no puede ser cero!");
            return "redirect:/adopciones/misPublicaciones";
        }
        model.put("adopcion", adopcion);
        model.put("titulo", "Detalle de la adopción");
        return "adopciones/show";
    }


    @RequestMapping(value = "/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash,HttpSession session) {
        if (id > 0) {
            adopcionService.delete(id);
            flash.addFlashAttribute("success", "Adopción eliminada con éxito!");
        }
        return "redirect:/adopciones/misPublicaciones";
    }


    @RequestMapping(value = "/editar/{id}")
    public String editar(@PathVariable(value = "id") Long id, Map<String, Object> model, RedirectAttributes flash) {
        Adopcion adopcion = null;
        if (id > 0) {
            adopcion = adopcionService.findOne(id);
            if (adopcion == null) {
                flash.addFlashAttribute("error", "El ID de la adopción no existe en la BBDD!");
                return "redirect:/adopciones/misPublicaciones";
            }
        } else {
            flash.addFlashAttribute("error", "El ID de la adopción no puede ser cero!");
            return "redirect:/adopciones/misPublicaciones";
        }
        model.put("adopcion", adopcion);
        model.put("titulo", "Editar adopción");
        return "adopciones/form_editar";
    }


    @RequestMapping(value = "/actualizar", method = RequestMethod.POST)
    public String actualizar(@Valid Adopcion adopcion, BindingResult result, Map<String, Object> model, RedirectAttributes flash, SessionStatus status, HttpSession session) throws IOException {
        System.out.println("adopcion: " + adopcion);

        Adopcion adopcionUpdate = adopcionService.findOne((long) adopcion.getId_adopcion());
        //System.out.println("adopcionUpdate: " + adopcionUpdate);

        adopcionUpdate.setRaza(adopcion.getRaza());
        adopcionUpdate.setColor(adopcion.getColor());
        adopcionUpdate.setTamanio(adopcion.getTamanio());
        adopcionUpdate.setEdad(adopcion.getEdad());
        adopcionUpdate.setGenero(adopcion.getGenero());

        if(adopcion.getAdoptado() == true){
            if( adopcion.getNombreCompletoAdoptante() != null &&
                    adopcion.getNombreCompletoAdoptante() != "" &&
                    adopcion.getTelefonoAdoptante() != null &&
                    adopcion.getTelefonoAdoptante() != "" &&
                    adopcion.getEmailAdoptante() != null &&
                    adopcion.getEmailAdoptante() != ""
            ){
                adopcionUpdate.setAdoptado(true);
                adopcionUpdate.setNombreCompletoAdoptante(adopcion.getNombreCompletoAdoptante());
                adopcionUpdate.setTelefonoAdoptante(adopcion.getTelefonoAdoptante());
                adopcionUpdate.setEmailAdoptante(adopcion.getEmailAdoptante());
                Date now = new Date();
                adopcionUpdate.setFechaAdopcion(now);
            }
        }else{
            adopcionUpdate.setAdoptado(false);
            adopcionUpdate.setNombreCompletoAdoptante(null);
            adopcionUpdate.setTelefonoAdoptante(null);
            adopcionUpdate.setEmailAdoptante(null);
            adopcionUpdate.setFechaAdopcion(null);
        }

        adopcionService.save(adopcionUpdate);
        String mensajeFlash = "Publicación editada con éxito!";
        status.setComplete();
        flash.addFlashAttribute("success", mensajeFlash);
        return "redirect:/adopciones/misPublicaciones";
    }

}
