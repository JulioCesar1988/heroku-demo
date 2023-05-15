package com.bolsadeideas.springboot.app.models.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "adopciones")
public class Adopcion implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_adopcion;


    @NotEmpty
    private String raza;


    @NotEmpty
    private String tamanio;


    @NotEmpty
    private String color;


    @NotEmpty
    private String edad;


    @NotEmpty
    private String genero;


    @Column(columnDefinition="tinyint(1) default 0", nullable = false)
    private boolean adoptado;


    @Column(name = "fecha_adopcion", nullable = true)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fechaAdopcion;


    @Column(name = "nombre_completo_adoptante", nullable = true)
    private String nombreCompletoAdoptante;


    @Column(name = "telefono_adoptante", nullable = true)
    private String telefonoAdoptante;


    @Column(name = "email_adoptante", nullable = true)
    private String emailAdoptante;


    @Column(name = "fecha_creacion", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @CreationTimestamp
    private Date fechaCreacion;


    @Column(name = "fecha_borrado", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date fechaBorrado;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente autor;


    public Long getId_adopcion() {
        return id_adopcion;
    }

    public void setId_adopcion(Long id_adopcion) {
        this.id_adopcion = id_adopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Boolean getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(Boolean adoptado) {
        this.adoptado = adoptado;
    }

    public Date getFechaAdopcion() {
        return fechaAdopcion;
    }

    public void setFechaAdopcion(Date fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }

    public String getNombreCompletoAdoptante() {
        return nombreCompletoAdoptante;
    }

    public void setNombreCompletoAdoptante(String nombreCompletoAdoptante) {
        this.nombreCompletoAdoptante = nombreCompletoAdoptante;
    }

    public String getTelefonoAdoptante() {
        return telefonoAdoptante;
    }

    public void setTelefonoAdoptante(String telefonoAdoptante) {
        this.telefonoAdoptante = telefonoAdoptante;
    }

    public String getEmailAdoptante() {
        return emailAdoptante;
    }

    public void setEmailAdoptante(String emailAdoptante) {
        this.emailAdoptante = emailAdoptante;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaBorrado() {
        return fechaBorrado;
    }

    public void setFechaBorrado(Date fechaBorrado) {
        this.fechaBorrado = fechaBorrado;
    }

    public Cliente getAutor() {
        return autor;
    }

    public void setAutor(Cliente autor) {
        this.autor = autor;
    }
}
