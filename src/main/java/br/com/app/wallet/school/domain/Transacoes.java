package br.com.app.wallet.school.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.LocalDateTime;

//Esta tabela registrará todas as transações financeiras
//relacionadas aos alunos, incluindo débitos (compras na cantina) e créditos (recargas).
public class Transacoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Conta conta;
    private BigDecimal valor;
    private LocalDateTime dataTransacao;
}
