package com.produto.apirestfull.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produto.apirestfull.controller.EstoqueController;
import com.produto.apirestfull.controller.VendaController;
import com.produto.apirestfull.mapper.MapperEstoque;
import com.produto.apirestfull.module.estoque.repository.EstoqueRepository;
import com.produto.apirestfull.module.venda.repository.VendaRepository;

@Service
public class ControllerFactory implements Factory{

	
	@Autowired
	EstoqueRepository repo;
	
	@Autowired
	VendaRepository repositoryVenda;
	
	public EstoqueController estoqueControler() {
		return new EstoqueController(repo);
	}
	
	public VendaController vendaControler() {
		return new VendaController(this, repositoryVenda);
	}
}
