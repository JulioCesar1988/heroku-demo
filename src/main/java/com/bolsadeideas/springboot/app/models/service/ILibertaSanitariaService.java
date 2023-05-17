package com.bolsadeideas.springboot.app.models.service;

import java.util.List;
import java.util.Map;

import com.bolsadeideas.springboot.app.models.entity.LibretaSanitaria;

public interface ILibertaSanitariaService {

	public void save(LibretaSanitaria cliente);
	
	public List<LibretaSanitaria> findAll();
	
	public void delete(Long id);
	
}
