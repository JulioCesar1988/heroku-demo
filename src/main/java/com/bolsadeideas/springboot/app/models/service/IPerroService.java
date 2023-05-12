package com.bolsadeideas.springboot.app.models.service;


import com.bolsadeideas.springboot.app.models.entity.Perro;

import java.util.List;

public interface IPerroService {

        public List<Perro> findAll();

        public void save(Perro perro);

        public Perro findOne(Long id);

        public void delete(Long id);


        // metodo para calcular los meses  de un perro
        int cantidadMesesParaUnPerro(Perro perro);
}
