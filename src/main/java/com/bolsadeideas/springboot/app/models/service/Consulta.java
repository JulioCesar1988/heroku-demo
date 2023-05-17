package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.entity.Perro;

public class Consulta implements Motivo{

	@Override
	public boolean validar(Perro perro) {
		// TODO Auto-generated method stub
		return true;
	}

}
