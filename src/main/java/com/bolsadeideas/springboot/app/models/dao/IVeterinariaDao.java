package com.bolsadeideas.springboot.app.models.dao;

import com.bolsadeideas.springboot.app.models.entity.Veterinaria;
import org.springframework.data.repository.CrudRepository;



public interface IVeterinariaDao extends CrudRepository<Veterinaria, Long> {


}
