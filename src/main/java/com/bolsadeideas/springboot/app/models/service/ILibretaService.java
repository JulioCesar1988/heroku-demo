package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.entity.Libreta;
import com.bolsadeideas.springboot.app.models.entity.Turno;

import java.util.List;
import java.util.Optional;

public interface ILibretaService {



    public List<Libreta> findAll();

    public void save(Libreta libreta);

    public Optional<Libreta> findOne(Long id);

    public void delete(Long id);


}
