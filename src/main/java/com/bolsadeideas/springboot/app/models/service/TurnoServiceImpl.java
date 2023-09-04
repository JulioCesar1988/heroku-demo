package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.dao.ITurnoDao;
import com.bolsadeideas.springboot.app.models.entity.Turno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TurnoServiceImpl implements ITurnoService{


    @Autowired
    private ITurnoDao turnoDao;


    @Override
    public List<Turno> findAll() {
        return (List<Turno>) turnoDao.findAll();
    }

    @Override
    public void save(Turno turno) {
     turnoDao.save(turno);
    }

    @Override
    public Optional<Turno> findOne(Long id) {
        return turnoDao.findById(id);
    }

    @Override
    public void delete(Long id) {
        //turnoDao.delete(id);
    }

}
