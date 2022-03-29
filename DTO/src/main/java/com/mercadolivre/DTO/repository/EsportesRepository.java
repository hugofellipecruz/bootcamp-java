package com.mercadolivre.DTO;

import java.util.LinkedList;

public class EsportesRepository {
    LinkedList<Esporte> repository;

    public EsportesRepository() {
        this.repository = new LinkedList<>();
    }

    public void addSport(Esporte esporte){
        this.repository.add(esporte);
    }
}
