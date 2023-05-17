package com.bolsadeideas.springboot.app.models.entity;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.bolsadeideas.springboot.app.models.service.Motivo;

@Entity
@Table(name = "LibretaSanitaria")
public class LibretaSanitaria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_libreta;
	@NotEmpty
	private Long peso_actual; // peso del perro al momento de la vacuna
	@NotEmpty
	@Column(name = "fecha_visita")
	private LocalDate fecha_visita;
	@NotEmpty
	private Motivo motivo_visita;
	@NotEmpty
	//private String motivo;
	private String tipo_vacuna;
	private Long cantidadaplicada;
	
	
	@OneToOne
	@JoinColumn(name = "id_perro")
	private Perro perro;
	
	public Long getId_libreta() {
		return id_libreta;
	}

	public void setId_libreta(Long id_libreta) {
		this.id_libreta = id_libreta;
	}

	public Long getPeso_actual() {
		return peso_actual;
	}

	public void setPeso_actual(Long peso_actual) {
		this.peso_actual = peso_actual;
	}

	public LocalDate getFecha_visita() {
		return fecha_visita;
	}

	public void setFecha_visita(LocalDate fecha_visita) {
		this.fecha_visita = fecha_visita;
	}

	public Motivo getMotivo_visita() {
		return motivo_visita;
	}

	public void setMotivo_visita(Motivo motivo_visita) {
		this.motivo_visita = motivo_visita;
	}

	public Perro getPerro() {
		return perro;
	}

	public void setPerro(Perro perro) {
		this.perro = perro;
	}

}
