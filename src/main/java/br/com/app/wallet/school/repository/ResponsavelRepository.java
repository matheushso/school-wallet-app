package br.com.app.wallet.school.repository;

import br.com.app.wallet.school.domain.Responsavel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ResponsavelRepository extends JpaRepository<Responsavel, Long> {

    List<Responsavel> findAll();

    Optional<Responsavel> findById(Long id);
}
