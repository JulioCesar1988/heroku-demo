package com.bolsadeideas.springboot.app.models.entity;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import com.bolsadeideas.springboot.app.models.service.LibretaSanitariaService;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@Table(name = "perros")
public class Perro {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_perro;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String color;
    @NotEmpty
    private String raza;
    @NotNull
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fechaNacimiento;
    private Double peso;


    @NotEmpty
    private String observacion;
    private String foto;
    // Otros atributos y métodos
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @OneToOne
    @JoinColumn(name = "id-libreta")
    private LibretaSanitariaService libretasanitaria;

	public LibretaSanitariaService getLibretasanitaria() {
		return libretasanitaria;
	}

	public long getEdad() {
		return 0;
	}

}
