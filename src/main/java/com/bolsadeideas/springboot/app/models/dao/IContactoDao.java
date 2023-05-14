package com.bolsadeideas.springboot.app.models.dao;


import com.bolsadeideas.springboot.app.models.entity.Contacto;
import org.springframework.data.repository.CrudRepository;

public interface IContactoDao extends CrudRepository<Contacto, Long> {
}
