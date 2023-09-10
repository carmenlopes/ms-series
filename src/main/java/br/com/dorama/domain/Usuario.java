package br.com.dorama.domain;

import jakarta.persistence.Entity;
import lombok.Data;
import java.time.LocalDate;

@Entity @Data
public class Usuario {
    private Long id;
    private int permissao;
    private String nome;
    private LocalDate dtNascimento;
    private String email;
    private String senha;
    private String estado;

}
