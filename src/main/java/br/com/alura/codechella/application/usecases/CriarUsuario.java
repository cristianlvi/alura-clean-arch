package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.UsuarioRepository;
import br.com.alura.codechella.domain.entity.Usuario;

public class CriarUsuario {


    private final UsuarioRepository repository;

    public CriarUsuario(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repository.cadastrarUsuario(usuario);
    }

}
