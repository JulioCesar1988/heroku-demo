package models.service;


import models.entity.Veterinaria;

import java.util.List;

public interface IVeterinariaService {


    public List<Veterinaria> findAll();

    public void save(Veterinaria veterinaria);

    public Veterinaria findOne(Long id);

    public void delete(Long id);
}
