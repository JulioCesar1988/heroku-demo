package com.bolsadeideas.springboot.app.models.dao;

import com.bolsadeideas.springboot.app.models.entity.Adopcion;
import org.springframework.data.repository.CrudRepository;

public interface IAdopcionDao extends CrudRepository<Adopcion, Long>{


}
