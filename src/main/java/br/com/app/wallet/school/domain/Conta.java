package br.com.app.wallet.school.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

//Cada aluno terá uma conta associada a esta tabela,
//que rastreará o saldo atual.
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Dependente> dependenteList;

    private BigDecimal saldo;
}
