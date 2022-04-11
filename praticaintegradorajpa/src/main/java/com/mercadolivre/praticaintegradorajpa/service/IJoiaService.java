package com.mercadolivre.praticaintegradorajpa.service;

import com.mercadolivre.praticaintegradorajpa.model.Joia;

import java.util.List;

public interface IJoiaService {
    public List<Joia> getJoias();
    public void saveJoia(Joia joia);
    public void deleteJoia(long id);
    public Joia findJoia(long id);

}
