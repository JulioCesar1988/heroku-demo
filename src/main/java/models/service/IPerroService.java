package models.service;



import models.entity.Perro;

import java.util.List;

public interface IPerroService {

        public List<Perro> findAll();

        public void save(Perro perro);

        public Perro findOne(Long id);

        public void delete(Long id);


}
