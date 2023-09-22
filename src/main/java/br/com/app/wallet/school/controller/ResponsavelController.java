package br.com.app.wallet.school.controller;


import br.com.app.wallet.school.domain.Responsavel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.app.wallet.school.repository.ResponsavelRepository;

import java.util.List;

@RestController
@RequestMapping("/school")
public class ResponsavelController {

    @Autowired
    public ResponsavelRepository repository;

    @GetMapping("/api")
    public List<Responsavel> findAll(){
        return repository.findAll();
    }

    @PostMapping("/api")
    public Responsavel salvarResponsavel(@RequestBody Responsavel responsavel){
      return  repository.save(responsavel);
    }

    @PutMapping("/api")
    public Responsavel editarResponsavel(@RequestBody Responsavel responsavel){
        return salvarResponsavel(responsavel);
    }

    @DeleteMapping("/api/{id}")
    public void excluirResponsavel(@PathVariable Long id){
        Responsavel responsavelRecuperado = buscarUm(id);
        repository.delete(responsavelRecuperado);
    }

    @GetMapping("/api/{id}")
    public Responsavel buscarUm(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }
}
