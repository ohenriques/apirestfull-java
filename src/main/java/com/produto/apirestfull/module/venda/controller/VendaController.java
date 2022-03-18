package com.produto.apirestfull.module.venda.controller;

import java.io.IOException;
import java.net.URISyntaxException;
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

import com.produto.apirestfull.module.venda.model.Venda;
import com.produto.apirestfull.module.venda.repository.VendaRepository;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/carrinho")
@Api(value = "API REST Produtos")
public class VendaController {

	@Autowired
	VendaRepository repo;
	@Autowired(required = true)
	ClasseTesteRestGet get;

	@GetMapping("/vendas")
	public Object listaVendas() throws IOException, InterruptedException {
		return get.buscaDados();
//		return repo.findAll();
	}

	@GetMapping("/venda/{id}")
	public Venda listaUmaVenda(@PathVariable(value = "id") long id) {
		return repo.findById(id);
	}

	@PostMapping("/venda")
	public Venda realizaUmaVenda(@RequestBody Venda venda) {
		venda.setDataVenda(new Date());
		System.out.println(venda);
		return repo.save(venda);
	}
}
