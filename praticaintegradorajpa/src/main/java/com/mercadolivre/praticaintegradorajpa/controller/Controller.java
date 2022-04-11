package com.mercadolivre.praticaintegradorajpa.controller;

import com.mercadolivre.praticaintegradorajpa.model.Joia;
import com.mercadolivre.praticaintegradorajpa.service.IJoiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private IJoiaService JoiaServ;

    @PostMapping("/joia/inserir")
    public Long createJoia(@RequestBody Joia joia){
        JoiaServ.saveJoia(joia);
        return joia.getId();
    }

    @GetMapping("/joias")
    public List<Joia> getJoias(){
        List<Joia> joias = JoiaServ.getJoias();
        return joias;
    }

    @DeleteMapping("/joia/excluir")
    public String deleteJoia(@PathVariable long id) {
        JoiaServ.deleteJoia(id);
        return "Deletado com sucesso";
    }

    @PostMapping("edit/{id}")
    public Joia editJoia (@PathVariable long id,
                            @RequestParam ("material") String newMaterial,
                            @RequestParam ("peso") Long peso,
                            @RequestParam ("quilates") Integer quilates) {
        Joia joia = JoiaServ.findJoia(id);
        joia.setMaterial(newMaterial);
        joia.setPeso(peso);
        joia.setQuilates(quilates);
        JoiaServ.saveJoia(joia);
        return joia;
    }


}
