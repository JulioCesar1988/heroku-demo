package models.service;


import models.entity.Veterinaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VeterinariaServiceImpl  implements IVeterinariaService{

    @Autowired
    private IVeterinariaDao veterinariaDao;

    @Override
    public List<Veterinaria> findAll() {
        return (List<Veterinaria>) veterinariaDao.findAll();
    }

    @Override
    public void save(Veterinaria veterinaria) {

    }

    @Override
    public Veterinaria findOne(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
