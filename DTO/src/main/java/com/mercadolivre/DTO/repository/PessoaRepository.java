package com.mercadolivre.DTO;

import java.util.LinkedList;

public class PessoaRepository {
    LinkedList<Pessoa> repository;

    public PessoaRepository() {
        this.repository = new LinkedList<>();
    }

    public void addPessoa(Pessoa pessoa){
        this.repository.add(pessoa);
    }
}
