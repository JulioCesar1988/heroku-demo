package com.bolsadeideas.springboot.app.models.dao;


import com.bolsadeideas.springboot.app.models.entity.Libreta;
import com.bolsadeideas.springboot.app.models.entity.Turno;
import org.springframework.data.repository.CrudRepository;

public interface ILibretaDao extends CrudRepository<Libreta, Long> {


}
