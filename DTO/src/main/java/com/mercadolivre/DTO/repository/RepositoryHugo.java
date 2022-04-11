package com.mercadolivre.DTO.repository;

import java.util.List;

public interface RepositoryHugo<T> {
    public List<T> findAll();
    public T findByName(String a);
}
