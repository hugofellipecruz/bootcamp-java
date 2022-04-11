package com.mercadolivre.DTO;

import com.mercadolivre.DTO.model.Esporte;
import com.mercadolivre.DTO.service.EsporteService;
import com.mercadolivre.DTO.service.EsporteServiceImplementation;
import com.mercadolivre.DTO.service.PessoaServiceImplementation;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@EnableAutoConfiguration
public class Controller {
    private final EsporteServiceImplementation esportesService;
    private final PessoaServiceImplementation pessoaService;

    @GetMapping("/findSports")
    public ResponseEntity<?> findSports() {
        List<Esporte> lista = esportesService.findAll();
        try {
            return  new ResponseEntity<>(lista, HttpStatus.OK);
        }catch(RuntimeException e){
            return  new ResponseEntity<>(e.getMessage(), HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/findSport/{name}")
    public ResponseEntity<?> findSport(@PathVariable("name") String name){

        try {
            Esporte esporte = esportesService.getByName(name);
            return  new ResponseEntity<>(esporte, HttpStatus.OK);
        }catch(RuntimeException e){
            return  new ResponseEntity<>(e.getMessage(), HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/findSportsPersons/")
    public ResponseEntity<?> findAthletes(){
        pessoaService.findAll()

    }
}
