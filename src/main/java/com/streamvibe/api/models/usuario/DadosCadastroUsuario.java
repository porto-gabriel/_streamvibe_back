package com.streamvibe.api.models.usuario;

public record DadosCadastroUsuario(
    String nome, 
    String dataNascimento,
    String cpf,
    String email,
    String senha) {

}
