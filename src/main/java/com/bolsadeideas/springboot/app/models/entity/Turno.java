package com.bolsadeideas.springboot.app.models.entity;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "Turno")
public class Turno  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_turno;


    @NotNull
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createAt;


    @NotEmpty
    private String motivo;

    @NotEmpty
    private String franjaHoraria;


    @NotEmpty
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_perro")
    private Perro perro;


}