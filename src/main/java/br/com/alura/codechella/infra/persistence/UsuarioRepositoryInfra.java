package br.com.alura.codechella.infra.persistence;

import br.com.alura.codechella.infra.persistence.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositoryInfra extends JpaRepository<UsuarioEntity, Long> {
}
