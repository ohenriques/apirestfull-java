package com.produto.apirestfull.module.estoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produto.apirestfull.module.estoque.model.Estoque;
import com.produto.apirestfull.module.estoque.repository.EstoqueRepository;

@CrossOrigin
@RestController
@RequestMapping(value ="/estoque")
public class EstoqueController {

	@Autowired
	EstoqueRepository repo;
	
	@GetMapping("/listaEstoque")
	public List<Estoque> listaOEstoque(){
		return repo.findAll();
	}
	
	@PostMapping("/insereEstoque")
	public Estoque insereDadoNoEstoque(@RequestBody Estoque estoque) {
		return repo.save(estoque);
	}
	
	@PatchMapping("/atualizarRegistro")
	public Estoque atualizarRegistroEstoque(@RequestBody Estoque estoque) {
		return repo.save(estoque);
	}
}
