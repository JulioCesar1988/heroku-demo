package com.bolsadeideas.springboot.app.models.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import com.bolsadeideas.springboot.app.models.dao.ILibretaSanitariaDao;
import com.bolsadeideas.springboot.app.models.entity.LibretaSanitaria;

public class LibretaSanitariaService implements ILibertaSanitariaService {

	private ILibretaSanitariaDao libretaSanitariaDao;

	@Override
	public void save(LibretaSanitaria libreta) {
		this.libretaSanitariaDao.save(libreta); 
	}

	@Override
	public List<LibretaSanitaria> findAll() {
		return (List<LibretaSanitaria>) this.libretaSanitariaDao.findAll();
	}
	
	public LocalDate obtenerFechaUltimaVacuna() {
        return libretaSanitariaDao.obtenerFechaUltimaVacuna();
    }
	
	public boolean tieneMasDeUnAño() {
		Period periodo = Period.between(libretaSanitariaDao.obtenerFechaUltimaVacuna(), LocalDate.now());
        int diferenciaEnAnios = periodo.getYears();
		return diferenciaEnAnios > 1;
	}

	@Override
	public void delete(Long id) {
		this.libretaSanitariaDao.deleteById(id);
	}
	
	public List<LibretaSanitaria> findDesparacitacion(){
		return libretaSanitariaDao.buscarPorValor("desparacitacion");
	}
	
	public List<LibretaSanitaria> findCastracion(){
		return libretaSanitariaDao.buscarPorValor("castracion");
	}

	public List<LibretaSanitaria> findVacunacion(){
		return libretaSanitariaDao.buscarPorValor("vacunacion");
	}
	
}
