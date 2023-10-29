package br.com.app.wallet.school.services;


import br.com.app.wallet.school.domain.Responsavel;
import br.com.app.wallet.school.repository.ResponsavelRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ResponsavelService {

    @Autowired
    private ResponsavelRepository repository;


    public List<Responsavel> findAll() {
        return repository.findAll();
    }

    public Responsavel salvarResponsavel(Responsavel responsavel) {
        return repository.save(responsavel);
    }

    public void excluirResponsavel(Long id){
        Responsavel responsavelRecuperado = buscarUm(id);
        repository.delete(responsavelRecuperado);
    }

    public Responsavel buscarUm(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Responsavel> filtrarNome(String termo){
        return repository.findByNomeContaining(termo);
    }

}