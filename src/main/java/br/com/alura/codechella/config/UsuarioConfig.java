package br.com.alura.codechella.config;

import br.com.alura.codechella.application.gateways.UsuarioRepository;
import br.com.alura.codechella.application.usecases.CriarUsuario;
import br.com.alura.codechella.application.usecases.ListUsuario;
import br.com.alura.codechella.infra.gateways.UsuarioMapper;
import br.com.alura.codechella.infra.gateways.UsuarioRepositoryJpa;
import br.com.alura.codechella.infra.persistence.UsuarioRepositoryInfra;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {


    @Bean
    public CriarUsuario criarUsuario(UsuarioRepository usuarioRepository) {
        return new CriarUsuario(usuarioRepository);
    }


    @Bean
    public UsuarioRepositoryJpa repositoryJpa(UsuarioRepositoryInfra repositoryInfra, UsuarioMapper usuarioMapper) {
        return new UsuarioRepositoryJpa(repositoryInfra, usuarioMapper);
    }

    @Bean
    public UsuarioMapper getUsuarioMapper() {
        return new UsuarioMapper();
    }


    @Bean
    public ListUsuario getAllUsuarios(UsuarioRepository usuarioRepository) {
        return new ListUsuario(usuarioRepository);
    }


}
