package com.mercadolivre.DTO.service;

import com.mercadolivre.DTO.model.Esporte;
import com.mercadolivre.DTO.repository.EsportesRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

import static java.util.Objects.isNull;

@Service
public class EsporteServiceImplementation implements GeneralService {
    private final EsportesRepository esporteRepository;

    public EsporteServiceImplementation() {
        esporteRepository = new EsportesRepository();
    }

    @Override
    public LinkedList<Esporte> findAll() {
        LinkedList<Esporte> lista = esporteRepository.findAll();

        if(isNull(lista)){
            throw new RuntimeException("Book not found!");
        }
        return lista;
    }

    @Override
    public Esporte getByName(String name) {
        Esporte esporte = esporteRepository.findByName(name);
        if(isNull(esporte)){
            throw new RuntimeException("Esporte not found!");
        }
        return esporte;

    }



}
