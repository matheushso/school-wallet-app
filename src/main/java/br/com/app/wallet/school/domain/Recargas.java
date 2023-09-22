package br.com.app.wallet.school.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

//Registre todas as recargas de saldo nas contas dos alunos.
public class Recargas {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataRecarga;
    @ManyToOne
    private Conta conta;

}
