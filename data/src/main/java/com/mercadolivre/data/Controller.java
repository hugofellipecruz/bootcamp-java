package com.mercadolivre.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;


import java.util.Arrays;
@RestController
public class Controller {

    @GetMapping("/data/{dia}/{mes}/{ano}")
    public int data(@PathVariable int dia,
                    @PathVariable int mes,
                    @PathVariable int ano) {
        Data data = new Data(dia,mes,ano);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate now = LocalDate.now();
        System.out.println(data);
        System.out.println(Period.between(data.getData(),now).getYears());
        return Period.between(data.getData(),now).getYears();
    }


}