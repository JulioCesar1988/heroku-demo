package controllers;

import com.bolsadeideas.springboot.app.models.service.IVeterinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VeterinariaController {

    // inyectamos el servicio.
    @Autowired
    private IVeterinariaService veterinariaService;


    // endpoint para obtener los datos de la veterinarias disponibles en la base
    @RequestMapping(value = "/listarVeterinarias", method = RequestMethod.GET)
    public String listarVeterinaria(Model model) {
        model.addAttribute("titulo", "Listado de Veterinarias");
        model.addAttribute("veterinarias",veterinariaService.findAll() );
        return "listado_veterinarias";
    }


}
