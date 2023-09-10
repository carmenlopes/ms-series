package br.com.dorama.controller;

import br.com.dorama.domain.Ator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ator/")
public class AtorController {

    @GetMapping("all")
    public List<Ator> listAll(){
        return null;
    }

    @GetMapping("{pais}")
    public List<Ator> listByPais(@PathVariable String pais){
        return null;
    }
    @PostMapping
    public Ator create(@RequestBody Ator ator){
        return null;
    }
    @PatchMapping("{id}") //Somente chamdo pelo admin
    public Ator updateAtorInformacoes(@RequestBody Ator ator, @PathVariable int id){
    return null;
    }


}
