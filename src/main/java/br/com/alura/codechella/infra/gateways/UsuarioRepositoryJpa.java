package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.application.gateways.UsuarioRepository;
import br.com.alura.codechella.domain.entity.Usuario;
import br.com.alura.codechella.infra.persistence.UsuarioRepositoryInfra;
import br.com.alura.codechella.infra.persistence.entity.UsuarioEntity;

import java.util.List;

public class UsuarioRepositoryJpa implements UsuarioRepository {

    private final UsuarioRepositoryInfra repositoryInfra;
    private final UsuarioMapper usuarioMapper;

    public UsuarioRepositoryJpa(UsuarioRepositoryInfra repositoryInfra, UsuarioMapper usuarioMapper) {
        this.repositoryInfra = repositoryInfra;
        this.usuarioMapper = usuarioMapper;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        UsuarioEntity usuarioEntity = usuarioMapper.toUsuarioEntity(usuario);

        repositoryInfra.save(usuarioEntity);

        return usuarioMapper.toUsuario(usuarioEntity);
    }

    @Override
    public List<Usuario> listarTodos() {
        return repositoryInfra.findAll().stream()
                .map(usuarioMapper::toUsuario)
                .toList();

    }
}
