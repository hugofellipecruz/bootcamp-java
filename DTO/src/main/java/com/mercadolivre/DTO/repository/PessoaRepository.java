package com.mercadolivre.DTO.repository;

import com.mercadolivre.DTO.model.Esporte;
import com.mercadolivre.DTO.model.Pessoa;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;


//@Repository
public class PessoaRepository implements RepositoryHugo<Pessoa> {

    LinkedList<Pessoa> repositorio;

    public PessoaRepository() {
        this.repositorio = new LinkedList<>();
    }

    @Override
    public LinkedList<Pessoa> findAll() {
        return repositorio;
    }

    @Override
    public Pessoa findByName(String name) {
        return repositorio.stream()
                .filter(pessoa->pessoa.getNome() == name)
                .findFirst()
                .get();
    }
}
