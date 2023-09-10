package br.com.dorama.domain;

import java.time.LocalDate;
import java.util.List;

public class Episodio {
    private Integer numero;
    private String sinopse;
    private Integer avaliacao;
    private LocalDate dtTransmissao;
    private Integer duracaoEp;
    //TODO: relaciomento para epAssitido;
    private List<Comentario> comentario;
}
