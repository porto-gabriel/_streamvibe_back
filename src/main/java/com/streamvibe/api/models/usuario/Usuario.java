package com.streamvibe.api.models.usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Usuario {
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private String cpf;
    
}
