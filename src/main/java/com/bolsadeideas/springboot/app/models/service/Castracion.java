package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.entity.LibretaSanitaria;
import com.bolsadeideas.springboot.app.models.entity.Perro;

public class Castracion implements Motivo {

	@Override
	public boolean validar(Perro perro) {
		LibretaSanitariaService libretasanitaria = new LibretaSanitariaService ();
		if ((perro.getEdad() >= 6) && (libretasanitaria.findCastracion().size() < 1)) {
			return true;
		}
		else {
			return false;
		}
	}



	
	// verificar si tiene ya alguna castracion
	// get edad asumo que me devuelve meses
	// registar turno en base de datos
}
