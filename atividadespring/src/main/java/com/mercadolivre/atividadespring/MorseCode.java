package com.mercadolivre.atividadespring;

import java.util.HashMap;

public class MorseCode {
    HashMap<String,String> dicionario = new HashMap<>();

    public MorseCode() {
        dicionario = new HashMap<>();
        dicionario.put(".-", "a");
        dicionario.put("-...", "b");
        dicionario.put("-.-.", "c");
        dicionario.put("-..", "d");
        dicionario.put(".", "e");
        dicionario.put("..-.", "f");
        dicionario.put("--.", "g");
        dicionario.put("....", "h");
        dicionario.put("..", "i");
        dicionario.put(".---", "j");
        dicionario.put("-.-", "k");
        dicionario.put(".-..", "l");
        dicionario.put("--", "m");
        dicionario.put("-.", "n");
        dicionario.put("---", "o");
        dicionario.put(".--.", "p");
        dicionario.put("--.-", "q");
        dicionario.put(".-.", "r");
        dicionario.put("...", "s");
        dicionario.put("-", "t");
        dicionario.put("..-", "u");
        dicionario.put("...-", "v");
        dicionario.put(".--", "w");
        dicionario.put("-..-", "x");
        dicionario.put("-.--", "y");
        dicionario.put("--..", "z");
        dicionario.put("/", " ");
    }

    public String getTranslation(String code){
        return dicionario.get(code);
    }
}
