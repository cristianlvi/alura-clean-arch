package br.com.alura.codechella.infra.controller.Dtos;

import br.com.alura.codechella.domain.entity.Usuario;

import java.time.LocalDate;

public class UsuarioDto {

    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String email;


    public UsuarioDto() {
    }

    public UsuarioDto(String cpf, String nome, LocalDate nascimento, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
    }

    public Usuario toUsuarioDomain(String cpf, String nome, LocalDate nascimento, String email) {
        return new Usuario(cpf, nome, nascimento, email);
    }

    public static UsuarioDto UsuarioDto(Usuario usuario){
        return new UsuarioDto(usuario.getCpf(), usuario.getNome(), usuario.getNascimento(), usuario.getEmail());
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
