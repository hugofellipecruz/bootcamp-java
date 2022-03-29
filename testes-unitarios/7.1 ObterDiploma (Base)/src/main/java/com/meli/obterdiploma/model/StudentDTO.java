package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;


@Getter @Setter
public class StudentDTO {

    @Pattern(regexp = "[A-Z][a-z]*",
            message = "O nome do aluno deve começar com letra maiuscula.")
    @Length(max=50,
            message = "O comprimento do nome não pode exceder 50 caracteres")
    @NotEmpty(message = "O nome do aluno não pode ficar vazio")
    String studentName;
    String message;
    Double averageScore;

    @NotEmpty(message = "A lista não pode estar vazia")
    List<SubjectDTO> subjects;
}
