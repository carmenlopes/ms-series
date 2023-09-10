package br.com.dorama.domain;

import br.com.dorama.domain.enums.IdiomaEnum;
import jakarta.persistence.Entity;
import java.util.List;

@Entity
public class Serie {
    private String tituloOriginal;
    private String tituloTraduzido;
    private String cover;
    private String paisOrigem;
    private Integer qtdEpisodios;
    private String anoLancamento;
    private IdiomaEnum idioma;
    private String urlTrailer;
    private List<Categoria> categoria;
    private List<Temporada> temporadas;

}
