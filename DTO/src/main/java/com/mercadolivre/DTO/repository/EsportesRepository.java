package com.mercadolivre.DTO.repository;

import com.mercadolivre.DTO.model.Esporte;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;


//@Repository
public class EsportesRepository implements RepositoryHugo<Esporte> {
    LinkedList<Esporte> repositorio;

    public EsportesRepository() {
        this.repositorio = new LinkedList<>();
    }

    @Override
    public LinkedList<Esporte> findAll() {
        return repositorio;
    }

    @Override
    public Esporte findByName(String name) {
        try{
            return repositorio.stream()
                    .filter(esporte->esporte.getName() == name)
                    .findFirst()
                    .get();
        }catch (NoSuchElementException e){
            return null;
        }

    }
}
