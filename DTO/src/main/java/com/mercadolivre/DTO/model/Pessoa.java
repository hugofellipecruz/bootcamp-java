package com.mercadolivre.DTO.model;

import lombok.Builder;
import lombok.Getter;

import java.util.Random;


@Getter
@Builder
public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa() {
        Random generator = new Random();
        this.nome = "Hugo  " + generator.nextInt(100);
        this.sobrenome = "Da silva " + generator.nextInt(100);
        this.idade = generator.nextInt(100);
    }

    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
}
