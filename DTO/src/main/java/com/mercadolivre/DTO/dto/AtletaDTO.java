package com.mercadolivre.DTO.dto;

import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@NoArgsConstructor
public class AtletaDTO implements Serializable {
    private String nome;
    private String sobrenome;
    private int idade;
    private String sportName;
}
