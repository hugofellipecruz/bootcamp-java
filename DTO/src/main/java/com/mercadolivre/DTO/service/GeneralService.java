package com.mercadolivre.DTO.service;

import com.mercadolivre.DTO.model.Esporte;

import java.util.LinkedList;
import java.util.List;

public interface GeneralService<T> {
    List<T> findAll();
    T getByName(String name);
}
