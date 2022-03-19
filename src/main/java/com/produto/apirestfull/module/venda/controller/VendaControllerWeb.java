package com.produto.apirestfull.module.venda.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produto.apirestfull.factory.ControllerFactory;
import com.produto.apirestfull.factory.Factory;
import com.produto.apirestfull.module.estoque.controller.EstoqueControllerWeb;
import com.produto.apirestfull.module.estoque.model.Estoque;
import com.produto.apirestfull.module.estoque.repository.EstoqueRepository;
import com.produto.apirestfull.module.venda.model.Venda;
import com.produto.apirestfull.module.venda.model.VendaRequest;
import com.produto.apirestfull.module.venda.repository.VendaRepository;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/carrinho")
@Api(value = "API REST Produtos")
public class VendaControllerWeb {

	@Autowired
	Factory controller;
	

	@GetMapping("/vendas")
	public List<Venda> listaVendas() {
		return controller.vendaControler().listaVendas();
	}

	@GetMapping("/venda/{id}")
	public Venda listaUmaVenda(@PathVariable(value = "id") long id) {
		return controller.vendaControler().listaUmaVenda(id);
	}

	@PostMapping("/venda")
	public Venda realizaUmaVenda(@RequestBody VendaRequest venda) {
		return controller.vendaControler().realizaUmaVenda(venda);
	}
}
