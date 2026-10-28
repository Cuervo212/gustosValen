package com.example.gustosValen;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GustosValenServicioImp implements IGustosValenServicio{

    private final IGustosValenDao iGustosValenDao;

    GustosValenServicioImp(IGustosValenDao iGustosValenDao) {
        this.iGustosValenDao = iGustosValenDao;
    }

    @Override 
    @Transactional(readOnly = true)
    public List<GustosValen> listaGustos(){
        return (List<GustosValen>)iGustosValenDao.findAll();
    }
    @Override 
    @Transactional
    public void guardar(GustosValen gustosValen){
        iGustosValenDao.save(gustosValen);
    }
    @Override 
    @Transactional
    public void borrar(GustosValen gustosValen){
        iGustosValenDao.delete(gustosValen);
    }
    @Override 
    @Transactional(readOnly = true)
    public GustosValen localizarGusto(GustosValen gustosValen){
        return iGustosValenDao.findById(gustosValen.getId_gustosValentina()).orElse(null);
    }
    @Override
    public Optional<GustosValen> findBySabor(String sabor){
        return iGustosValenDao.findBySabor(sabor);
    }
    @Override 
    public Optional<GustosValen> findById(Long id){
        return iGustosValenDao.findById(id);
    }

    
}