package com.bolsadeideas.springboot.app.models.dao;


import com.bolsadeideas.springboot.app.models.entity.Perro;
import org.springframework.data.repository.CrudRepository;

public interface IPerroDao extends CrudRepository<Perro, Long> {
}
