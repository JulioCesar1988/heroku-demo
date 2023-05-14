package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.entity.Adopcion;

import java.util.List;

public interface IAdopcionService {
	
	public List<Adopcion> findAll();

	public void save(Adopcion adopcion);
	
	public Adopcion findOne(Long id);
	
	public void delete(Long id);
	
}
