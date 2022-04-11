package com.mercadolivre.praticaintegradorajpa.service;

import com.mercadolivre.praticaintegradorajpa.model.Joia;
import com.mercadolivre.praticaintegradorajpa.repository.JoiaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JoiaService implements IJoiaService{

    private final JoiaRepository joiaRepo;

    public JoiaService(JoiaRepository joiaRepo) {
        this.joiaRepo = joiaRepo;
    }

    @Override
    @Transactional (readOnly = true)
    public List<Joia> getJoias() {
        List<Joia> joiaList = joiaRepo.findAll();
        return joiaList;
    }

    @Override
    @Transactional
    public void saveJoia(Joia joia) {
        joiaRepo.save(joia);
    }

    @Override
    public void deleteJoia(long id) {
        joiaRepo.deleteById(id);
    }

    @Override
    @Transactional
    public Joia findJoia(long id) {
        return null;
    }
}
