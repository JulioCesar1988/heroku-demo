package models.dao;

import models.entity.Veterinaria;
import org.springframework.data.repository.CrudRepository;



public interface IVeterinariaDao extends CrudRepository<Veterinaria, Long> {


}
