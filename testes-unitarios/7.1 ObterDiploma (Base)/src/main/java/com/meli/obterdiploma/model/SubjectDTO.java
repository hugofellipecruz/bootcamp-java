package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Getter @Setter
public class SubjectDTO {
    @Pattern(regexp = "[A-Z][a-z]*",
            message = "O nome do aluno deve começar com letra maiuscula.")
    @Length(max=30,
            message = "O comprimento do nome não pode exceder 30 caracteres")
    @NotEmpty(message = "O nome do aluno não pode ficar vazio")
    String name;

    @NotEmpty(message = "A nota não pode estar vazia")
    @Min(value = (long) 0.0,
        message = "a nota minima é 0")
    @Max(value = (long) 10.0,
        message = "A nota máxima é 10")
    Double score;
}
