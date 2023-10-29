package br.com.app.wallet.school.controller;


import br.com.app.wallet.school.domain.Responsavel;
import br.com.app.wallet.school.services.ResponsavelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
@CrossOrigin(origins = "*")
public class ResponsavelController {

    @Autowired
    public ResponsavelService service;

    @GetMapping("/api")
    public List<Responsavel> findAll(){
        return service.findAll();
    }

    @PostMapping("/api")
    public Responsavel salvarResponsavel(@RequestBody Responsavel responsavel){
      return  service.salvarResponsavel(responsavel);
    }

    @PutMapping("/api")
    public Responsavel editarResponsavel(@RequestBody Responsavel responsavel){
        return service.salvarResponsavel(responsavel);
    }

    @DeleteMapping("/api/{id}")
    public void excluirResponsavel(@PathVariable Long id){
        service.excluirResponsavel(id);
    }

    @GetMapping("/api/{id}")
    public Responsavel buscarUm(@PathVariable Long id) {
        return service.buscarUm(id);
    }

    @GetMapping("/api/filtrarNome")
    public List<Responsavel> filtrarNome(@RequestParam String termo){
        return service.filtrarNome(termo);
    }

}
