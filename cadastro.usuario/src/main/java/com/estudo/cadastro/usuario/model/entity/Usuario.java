package com.estudo.cadastro.usuario.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "PRIMEIRO_NOME")
    private String primeiroNome;
    @Column(name = "SOBRE_NOME")
    private String sobreNome;
    private LocalDate idade;
    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    public Usuario(String primeiroNome, String sobreNome, LocalDate idade, Endereco endereco){
        this.primeiroNome = primeiroNome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.endereco = endereco;
    }
}
