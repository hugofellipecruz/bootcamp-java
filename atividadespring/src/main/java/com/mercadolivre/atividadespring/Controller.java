package com.mercadolivre.atividadespring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/romanos/{id}")
    public String exemplo(@PathVariable int id) {
        RomanNumber roman = new RomanNumber();
        return roman.toRoman(id);

    }

}