package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.dao.IAdopcionDao;
import com.bolsadeideas.springboot.app.models.entity.Adopcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdopcionServiceImpl implements IAdopcionService{


    @Autowired
    private IAdopcionDao adopcionDao;


    @Override
    public List<Adopcion> findAll() {
        return (List<Adopcion>) adopcionDao.findAll();
    }

    @Override
    public void save(Adopcion perro) {
        adopcionDao.save(perro);
    }

    @Override
    public Adopcion findOne(Long id) {
        return adopcionDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        adopcionDao.deleteById(id);
    }
}
