package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.dao.IContactoDao;
import com.bolsadeideas.springboot.app.models.entity.Contacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoServiceImpl implements IContactoService{

@Autowired
private IContactoDao contactoDao;

    @Override
    public List<Contacto> findAll() {
        return (List<Contacto>) contactoDao.findAll();
    }

    @Override
    public void save(Contacto contacto) {
        contactoDao.save(contacto);
    }

    @Override
    public Contacto findOne(Long id) {
       return new Contacto();
    }

    @Override
    public void delete(Long id) {
    contactoDao.deleteById(id);
    }
}
