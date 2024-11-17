package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.UsuarioRepository;
import br.com.alura.codechella.domain.entity.Usuario;

import java.util.List;

public class ListUsuario {


    private final UsuarioRepository usuarioRepository;

    public ListUsuario(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getAllUsuarios() {
        return this.usuarioRepository.listarTodos();
    }


}
