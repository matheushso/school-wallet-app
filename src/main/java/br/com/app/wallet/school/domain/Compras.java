package br.com.app.wallet.school.domain;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.LocalDateTime;

//Registre as compras individuais dos alunos,
//associando-as aos itens da cantina e ao valor gasto.
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Conta conta;
    private BigDecimal valor;
    private LocalDateTime dataCompra;
}
