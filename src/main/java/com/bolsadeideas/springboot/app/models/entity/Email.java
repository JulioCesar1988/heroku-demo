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
@Table(name = "emails")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_email;

    @NotEmpty
    @javax.validation.constraints.Email
    private String emailFrom;

    @NotEmpty
    @javax.validation.constraints.Email
    private String emailTo;

    @NotEmpty
    private String asunto;

    @NotEmpty
    private String mensaje;

}
