package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.entity.Turno;

import java.util.List;
import java.util.Optional;

public interface ITurnoService {



    public List<Turno> findAll();

    public void save(Turno turno);

    public Optional<Turno> findOne(Long id);

    public void delete(Long id);


}
