package com.mercadolivre.DTO;

import java.util.Random;

public class Esporte {
    private String nome;
    private String nivel;

    public Esporte() {
        Random generator = new Random();
        this.nome = "esporte " + generator.nextInt(100);
        this.nivel = "nivel " + generator.nextInt(100);
    }
}
