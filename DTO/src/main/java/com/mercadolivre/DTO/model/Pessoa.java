package com.mercadolivre.DTO;

import java.util.Random;

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
}
