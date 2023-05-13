package com.bolsadeideas.springboot.app.models.service;


import com.bolsadeideas.springboot.app.models.entity.Contacto;

import java.util.List;

public interface IContactoService {

        public List<Contacto> findAll();

        public void save(Contacto contacto);

        public Contacto findOne(Long id);

        public void delete(Long id);

}
