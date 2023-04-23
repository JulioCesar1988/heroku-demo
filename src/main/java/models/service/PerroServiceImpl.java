package models.service;


import models.dao.IPerroDao;
import models.entity.Perro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerroServiceImpl implements IPerroService{


    @Autowired
    private IPerroDao perroDao;


    @Override
    public List<Perro> findAll() {
        return (List<Perro>) perroDao.findAll();
    }

    @Override
    public void save(Perro perro) {
        perroDao.save(perro);
    }

    @Override
    public Perro findOne(Long id) {
        return perroDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        perroDao.deleteById(id);
    }
}
