package com.mercadolivre.atividadespring;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class Controller {

    @GetMapping("/romanos/{id}")
    public String exemplo(@PathVariable int id) {
        RomanNumber roman = new RomanNumber();
        return roman.toRoman(id);

    }
    @PostMapping("/morse")
    public String exemplo(@RequestBody String morse) {
        MorseCode codigo = new MorseCode();
        String [] palavras = morse.split("   ");
        System.out.println(Arrays.toString(palavras));
        String traducao = "";
        for(var i=0;i<palavras.length;i++) {
            String [] letras = palavras[i].split("\\s");
            for(int j=0;j<letras.length;j++) {
                String letra = letras[j];
                traducao = traducao.concat(codigo.getTranslation(letra));
            }
            traducao = traducao.concat(" ");
        }
        return traducao;

    }

}