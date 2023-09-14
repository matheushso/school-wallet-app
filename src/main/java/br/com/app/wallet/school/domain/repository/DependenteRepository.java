package br.com.app.wallet.school.domain.repository;

import br.com.app.wallet.school.domain.model.Dependente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DependenteRepository extends JpaRepository<Dependente, Long> {
}
