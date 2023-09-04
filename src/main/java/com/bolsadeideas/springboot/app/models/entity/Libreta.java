package com.bolsadeideas.springboot.app.models.entity;

//LA LIBRETA QUE VA ESTAR RELACIONADA AL PERRO , PARA SER ACTUALIZADA CUANDO SUS TURNOS SEAN


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name = "libreta")
public class Libreta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_libreta;
    private Boolean castracion;
    private Boolean desparasitacion;
    private String vacunas;


    @OneToOne
    @JoinColumn(name = "id_perro")
    private Perro perro;


}
