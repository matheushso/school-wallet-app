package br.com.app.wallet.school.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Dependente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String matricula;
    private String email;
    @ManyToMany
    private List<Responsavel> responsavelList;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
