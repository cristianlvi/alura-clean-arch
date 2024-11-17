package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.domain.entity.Usuario;
import br.com.alura.codechella.infra.persistence.entity.UsuarioEntity;


public class UsuarioMapper {


    public UsuarioEntity toUsuarioEntity(Usuario usuario){
        return new UsuarioEntity(usuario.getCpf(), usuario.getNome(), usuario.getNascimento(), usuario.getEmail());
    }

    public Usuario toUsuario(UsuarioEntity entity){
        return new Usuario(entity.getCpf(), entity.getNome(), entity.getNascimento(), entity.getEmail());
    }



}
