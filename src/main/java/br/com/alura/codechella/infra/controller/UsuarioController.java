package br.com.alura.codechella.infra.controller;

import br.com.alura.codechella.application.usecases.CriarUsuario;
import br.com.alura.codechella.application.usecases.ListUsuario;
import br.com.alura.codechella.domain.entity.Usuario;
import br.com.alura.codechella.infra.controller.Dtos.UsuarioDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final CriarUsuario criarUsuario;
    private final ListUsuario listUsuario;

    public UsuarioController(CriarUsuario criarUsuario,
                             ListUsuario listUsuario) {
        this.criarUsuario = criarUsuario;
        this.listUsuario = listUsuario;
    }


    @PostMapping("/criar")
    public ResponseEntity<UsuarioDto> cadastrarUsuario(@RequestBody UsuarioDto usuarioDto) {
        Usuario novoUsuario = criarUsuario.cadastrarUsuario(usuarioDto.toUsuarioDomain(
                usuarioDto.getCpf(), usuarioDto.getNome(),
                usuarioDto.getNascimento(), usuarioDto.getEmail()));

        UsuarioDto dtoResponse = UsuarioDto.UsuarioDto(novoUsuario);


        return ResponseEntity.status(HttpStatus.CREATED).body(dtoResponse);
    }


    @GetMapping("/lista")
    public ResponseEntity<List<UsuarioDto>> getAllListUsuario() {
        List<Usuario> usuarios = listUsuario.getAllUsuarios();

        List<UsuarioDto> usuarioDtos = usuarios.stream()
                .map(u -> new UsuarioDto(u.getCpf(), u.getNome(), u.getNascimento(), u.getEmail()))
                .toList();


        return ResponseEntity.ok(usuarioDtos);
    }


}
