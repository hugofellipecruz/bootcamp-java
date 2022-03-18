package com.mercadolivre.data;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Data {
    int dia;
    int mes;
    int ano;
    LocalDate data;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateString = Integer.toString(dia) + "/"+Integer.toString(mes) + "/"+Integer.toString(ano);
        data = LocalDate.parse(dateString,dtf);
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +

                '}';
    }
}
