package com.produto.apirestfull.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.produto.apirestfull.mapper.MapperEstoque;
import com.produto.apirestfull.module.estoque.model.Estoque;
import com.produto.apirestfull.module.estoque.model.EstoqueRequest;
import com.produto.apirestfull.module.estoque.repository.EstoqueRepository;

public class EstoqueController {

	
	private EstoqueRepository repo;
	
	private MapperEstoque mapperEstoque = new MapperEstoque();
	
	
	
	public EstoqueController(EstoqueRepository repo) {
		super();
		this.repo = repo;
	}


	public List<Estoque> listaOEstoque(){
		return repo.findAll();
	}
		
	
	public Estoque insereDadoNoEstoque(EstoqueRequest estoqueRequest) {
		return repo.save(mapperEstoque.paraSistema(estoqueRequest));
	}
	
	
	public Estoque atualizarRegistroEstoque( EstoqueRequest estoqueRequest) {
		return repo.save(mapperEstoque.paraSistema(estoqueRequest));
	}
}
