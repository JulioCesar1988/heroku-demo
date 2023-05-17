package com.bolsadeideas.springboot.app.models.entity;

import org.springframework.format.annotation.DateTimeFormat;

import com.bolsadeideas.springboot.app.models.service.Motivo;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import java.time.*;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "Turno") // creacion de la tabla turno 
public class Turno {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_turno;
	@NotEmpty
	private Date fechaInicio; // se necesita el sistema chequear la cant o lo hace el vet
	@NotEmpty
	private Motivo motivo;
	@NotEmpty
	private LibretaSanitaria libretasanitaria;
	@NotEmpty
	@Column(name = "aceptada")
	private boolean aceptado;
	
	@ManyToOne
    @JoinColumn(name = "id_perro")
    private Perro perro;
	
	public boolean isAceptado() {
		return aceptado;
	}

	public void setAceptado(boolean aceptado) {
		this.aceptado = aceptado;
	}
	
	
	public Long getId_turno() {
		return id_turno;
	}

	public void setId_turno(Long id_turno) {
		this.id_turno = id_turno;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Motivo getMotivo() {
		return motivo;
	}

	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}

	public LibretaSanitaria getLibretasanitaria() {
		return libretasanitaria;
	}

	public void setLibretasanitaria(LibretaSanitaria libretasanitaria) {
		this.libretasanitaria = libretasanitaria;
	}

	public Perro getPerro() {
		return perro;
	}

	public void setPerro(Perro perro) {
		this.perro = perro;
	}
}
