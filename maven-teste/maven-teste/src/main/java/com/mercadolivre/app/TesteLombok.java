package com.mercadolivre.app;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TesteLombok {
    int teste;

    @Override
    public String toString() {
        return "TesteLombok{" +
                "teste=" + teste +
                '}';
    }
}
