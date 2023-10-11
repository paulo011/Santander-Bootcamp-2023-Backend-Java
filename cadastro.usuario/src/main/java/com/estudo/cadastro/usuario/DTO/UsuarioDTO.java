package com.estudo.cadastro.usuario.DTO;

import java.time.LocalDate;

public record UsuarioDTO(String primeiraNome,
                         String sobreNome,
                         LocalDate idade,
                         String cep) {
}
