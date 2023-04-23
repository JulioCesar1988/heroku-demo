package models.dao;

import models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface IClienteDao extends CrudRepository<Cliente, Long>{


}
