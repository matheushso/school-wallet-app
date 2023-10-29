package br.com.app.wallet.school.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Responsavel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToMany
    private List<Dependente> dependenteList;
    @Column(name = "grau_parentesco")
    private String grauParentesco;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Dependente> getDependenteList() {
        return dependenteList;
    }

    public void setDependenteList(List<Dependente> dependenteList) {
        this.dependenteList = dependenteList;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }
}
