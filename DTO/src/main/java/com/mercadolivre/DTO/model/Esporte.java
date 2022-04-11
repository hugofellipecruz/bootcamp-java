package com.mercadolivre.DTO.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Esporte {

    private String nome;
    private String nivel;


    public String getName() {
        return nome;
    }
}
