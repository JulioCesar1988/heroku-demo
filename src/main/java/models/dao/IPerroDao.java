package models.dao;


import models.entity.Perro;
import org.springframework.data.repository.CrudRepository;

public interface IPerroDao extends CrudRepository<Perro, Long> {
}
