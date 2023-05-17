package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Turno;

public interface ITurnos {

	public List<Turno> findAll();

    public void save(Turno perro);

    public Turno findOne(Long id);

    public void deleteTurno(Long id);
	
}
