package com.mercadolivre.DTO.service;

import com.mercadolivre.DTO.model.Esporte;
import com.mercadolivre.DTO.model.Pessoa;
import com.mercadolivre.DTO.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

import static java.util.Objects.isNull;

@Service
@AllArgsConstructor
public class PessoaServiceImplementation implements GeneralService {
    private final PessoaRepository pessoaRepository;


    @Override
    public Object getByName(String name) {
        return null;
    }

    @Override
    public LinkedList<Pessoa> findAll() {
        LinkedList<Pessoa> lista = pessoaRepository.findAll();

        if(isNull(lista)){
            throw new RuntimeException("Book not found!");
        }
        return lista;
    }
}
