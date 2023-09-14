package br.com.app.wallet.school.api.controller;

import br.com.app.wallet.school.domain.model.Responsavel;
import br.com.app.wallet.school.domain.repository.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ResponsavelController {

    @Autowired
    private ResponsavelRepository repository;


    @GetMapping("/{id}")
    public void buscarResponsavel(@PathVariable Long id) {
        System.out.println("Oi");
    }

    @PostMapping
    public Responsavel salvarResponsavel(@RequestBody Responsavel responsavel) {
        return repository.save(responsavel);
    }
}
