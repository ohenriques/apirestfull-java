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

import com.produto.apirestfull.factory.ControllerFactory;
import com.produto.apirestfull.factory.Factory;
import com.produto.apirestfull.module.estoque.model.Estoque;
import com.produto.apirestfull.module.estoque.model.EstoqueRequest;
import com.produto.apirestfull.module.estoque.repository.EstoqueRepository;

@CrossOrigin
@RestController
@RequestMapping(value ="/estoque")
public class EstoqueControllerWeb {
	
	@Autowired
	Factory controller;
	
	@GetMapping("/listaEstoque")
	public List<Estoque> listaOEstoque(){
		return controller.estoqueControler().listaOEstoque();
	}
	
	@PostMapping("/insereEstoque")
	public Estoque insereDadoNoEstoque(@RequestBody EstoqueRequest estoque) {
		return controller.estoqueControler().insereDadoNoEstoque(estoque);
	}
	
	@PatchMapping("/atualizarRegistro")
	public Estoque atualizarRegistroEstoque(@RequestBody EstoqueRequest estoque) {
		return controller.estoqueControler().insereDadoNoEstoque(estoque);
	}
}
