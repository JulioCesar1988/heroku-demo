package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.entity.LibretaSanitaria;
import com.bolsadeideas.springboot.app.models.entity.Perro;

public interface Motivo {
	
	public static final int edadValidaInicio = 2;
	
	public boolean validar(Perro perro);
}
