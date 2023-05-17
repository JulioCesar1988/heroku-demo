package com.bolsadeideas.springboot.app.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.models.entity.Turno;

public interface ITurnoDao extends CrudRepository<Turno, Long> {

	@Query("SELECT t FROM Turno t WHERE t.aceptada = true")
    public abstract List<Turno> obtenerFilasAceptadas();
	
	@Query("SELECT t FROM Turno t WHERE t.aceptada = false")
    public abstract List<Turno> obtenerFilasPendientes();
	
	
}
