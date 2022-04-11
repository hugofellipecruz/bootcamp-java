package com.mercadolivre.DTO.service;

import java.util.LinkedList;
import java.util.List;

public interface GeneralService<T> {
    LinkedList<T> findAll();
    T getByName(String name);
}
