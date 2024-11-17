package br.com.alura.codechella.application.gateways;


import br.com.alura.codechella.domain.entity.Usuario;

import java.util.List;

public interface UsuarioRepository {

    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();


}
