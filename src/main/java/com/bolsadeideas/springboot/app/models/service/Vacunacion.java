package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.entity.Perro;

public class Vacunacion implements Motivo{

	public final int edadValidaInicio = 2;
	
	@Override
	public boolean validar(Perro perro) {
		if ((perro.getEdad() >= this.edadValidaInicio) && (perro.getLibretasanitaria().findVacunacion().size() < 1)) {
			return true;
		}
		else {
			if ((perro.getEdad() >= 2) && (perro.getEdad() <= 4) && (perro.getLibretasanitaria().findVacunacion().size() > 1)) {
				return true;
			}
			else {
				if ((perro.getEdad() >= 4) && (perro.getLibretasanitaria().tieneMasDeUnAño()) && (perro.getLibretasanitaria().findVacunacion().size() > 1)) {
					return true;
				}
				else {
					return false;
				}
			}
		}
	}

	
	//validar si se aplico menos de 2 vacunas antirabicas
	//comparacion si no se le aplico nunca una vacuna  
	// ¿Como hago para saber si ya el perro se lo aplico una vez a la vacuna
	//contar la cantidad de vacunas aplicadas { // entonces verifico si esta entre los 2 y 4 meses ademas de que deben haber pasado 21 dias, get dias es un metodo de la clase libretasanitaria donde se calcula los dias entre la fecha actual y la fecha de la visita
}
