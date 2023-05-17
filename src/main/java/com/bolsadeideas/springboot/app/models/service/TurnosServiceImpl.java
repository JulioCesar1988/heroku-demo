package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.dao.IPerroDao;
import com.bolsadeideas.springboot.app.models.dao.ITurnoDao;
import com.bolsadeideas.springboot.app.models.entity.Perro;
import com.bolsadeideas.springboot.app.models.entity.Turno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnosServiceImpl implements ITurnos {
	
	@Autowired
	public ITurnoDao turnos;

	@Override
	public List<Turno> findAll() {
		return (List<Turno>) turnos.findAll();
	}

	@Override
	public void save(Turno turno) {
		turnos.save(turno);
	}

	@Override
	public Turno findOne(Long id) {
		return turnos.findById(id).orElse(null); 
	}

	@Override
	public void deleteTurno(Long id) {
		turnos.deleteById(id);	
	}
	
	public void SolicitarTurno(Turno turno) { // probar bien
		Motivo motivo = turno.getMotivo();
		// ingresa el formulario desde html
		// obtenemos libreta sanitaria del perro
		if(motivo.validar(turno.getPerro())) {
			turno.setAceptado(false);
			turnos.save(turno);
		}
	}
	
	public List<Turno> obtenerFilasAceptadas(){
		return turnos.obtenerFilasAceptadas();
	}
	
	public List<Turno> obtenerFilasPendientes(){
		return turnos.obtenerFilasPendientes();
	}
}