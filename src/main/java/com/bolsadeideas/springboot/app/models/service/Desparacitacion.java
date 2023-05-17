package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.entity.Perro;

public class Desparacitacion implements Motivo{

	@Override
	public boolean validar(Perro perro) {
		if ((perro.getEdad() >= 4) && (perro.getLibretasanitaria().findDesparacitacion().size() < 1)) {
			   return true;
			}
			else {
				if ((perro.getEdad() >= 4) && (perro.getLibretasanitaria().tieneMasDeUnAño() && (perro.getLibretasanitaria().findDesparacitacion().size() > 1))) {
					return true;
				}
				else {
					return false;
				}
			}
	}



}
