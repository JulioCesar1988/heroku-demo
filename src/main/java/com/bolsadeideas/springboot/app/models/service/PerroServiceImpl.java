package com.bolsadeideas.springboot.app.models.service;

import com.bolsadeideas.springboot.app.models.dao.IPerroDao;
import com.bolsadeideas.springboot.app.models.entity.Perro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
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


// metodo para calcular los meses  de un perro
    @Override
    public int cantidadMesesParaUnPerro(Perro perro){
        LocalDate fechaNac = perro.getCreateAt().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaActual = LocalDate.now();
        int edadEnAnios = Period.between(fechaNac, fechaActual).getYears();
        Period edadEnMeses = Period.between(fechaNac, fechaActual);
        int meses = edadEnMeses.getYears() * 12 + edadEnMeses.getMonths();
        System.out.println("ANos ->:" + edadEnAnios +" Meses -> "+meses );
        return meses;
    }


}
