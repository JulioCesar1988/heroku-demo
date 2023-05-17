package com.bolsadeideas.springboot.app.models.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.models.entity.LibretaSanitaria;

public interface ILibretaSanitariaDao extends CrudRepository<LibretaSanitaria, Long> {

	@Query("SELECT e FROM LibretaSanitaria e WHERE e.motivo LIKE %:valor%")
	public abstract List<LibretaSanitaria> buscarPorValor(String valor);
	
	@Query(value = "SELECT MAX(v.fecha_visita) FROM LibretaSanitaria LS")
    public abstract LocalDate obtenerFechaUltimaVacuna();
	
	
}
