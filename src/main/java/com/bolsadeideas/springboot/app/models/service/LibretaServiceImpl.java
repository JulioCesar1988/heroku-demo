package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.dao.ILibretaDao;

import com.bolsadeideas.springboot.app.models.entity.Libreta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class LibretaServiceImpl implements ILibretaService{

@Autowired
private ILibretaDao libretaDao;

    @Override
    public List<Libreta> findAll() {
        return (List<Libreta>) libretaDao.findAll();
    }

    @Override
    public void save(Libreta libreta) {
        libretaDao.save(libreta);
    }

    @Override
    public Optional<Libreta> findOne(Long id) {
        return libretaDao.findById(id);
    }

    @Override
    public void delete(Long id) {
   libretaDao.deleteById(id);
    }


}
