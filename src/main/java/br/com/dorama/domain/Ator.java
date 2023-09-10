package br.com.dorama.domain;

import br.com.dorama.domain.enums.NacionalidadeEnum;
import br.com.dorama.domain.enums.SexoEnum;
import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Entity @Data
public class Ator {
    private String nome;
    //TODO: Verificar se será String mesmo
    private String fotoPerfil;
    private String biografia;
    private SexoEnum sexo;
    private LocalDate dtNascimento;
    private NacionalidadeEnum Nacionalidade;
    private Double altura;
    //private boolean favoritar;
}
