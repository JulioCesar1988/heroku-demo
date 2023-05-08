package com.bolsadeideas.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
@Data
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;

	@NotEmpty
	private String nombre;
	
	@NotEmpty
	private String apellido;

	// Otros atributos y métodos
	@OneToMany(mappedBy = "cliente")
	private List<Perro> perro;

	@NotEmpty
	private String dni;


	private String rol;
	
	@NotEmpty
	@Email
	private String email;

	@NotNull
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createAt;

   private String clave;

}
