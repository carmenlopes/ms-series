package br.com.dorama.domain;

import br.com.dorama.domain.enums.CategoriaEnum;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity @Data
public class Categoria {
    private Long id;
    private CategoriaEnum nome;
}
