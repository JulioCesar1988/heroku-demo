package com.bolsadeideas.springboot.app.models.entity;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

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
    private Date createAt;

    @NotEmpty
    private String observacion;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;


    // Otros atributos y métodos
    @OneToMany(mappedBy = "perro")
    private List<Turno> turno;


}
