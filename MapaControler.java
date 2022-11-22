package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapaControler {
	@Autowired
	private Repositorio repositorio;
	
	@PostMapping("/salvar")
    public Ponto salvar(Ponto ponto) {
		repositorio.save(ponto);
        return ponto;
        
        
    }

	@GetMapping("/buscar/{nome}")
    public List<Ponto> buscar(@PathVariable String nome) { 
        return repositorio.findPontosByNome(nome);
    }
}
