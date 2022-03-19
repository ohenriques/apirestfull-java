package com.produto.apirestfull.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.produto.apirestfull.factory.ControllerFactory;

import com.produto.apirestfull.mapper.MapperEstoque;
import com.produto.apirestfull.mapper.MapperVenda;
import com.produto.apirestfull.module.estoque.model.Estoque;
import com.produto.apirestfull.module.estoque.model.EstoqueRequest;
import com.produto.apirestfull.module.venda.model.Venda;
import com.produto.apirestfull.module.venda.model.VendaRequest;
import com.produto.apirestfull.module.venda.repository.VendaRepository;

public class VendaController {

	
	private ControllerFactory controller;

	private VendaRepository repositoryVenda;

	private MapperVenda mapperVenda = new MapperVenda();
	private MapperEstoque mapperEstoque = new MapperEstoque();
	
	

	public VendaController(ControllerFactory controller, VendaRepository repositoryVenda) {
		super();
		this.controller = controller;
		this.repositoryVenda = repositoryVenda;
	}

	public List<Venda> listaVendas() {
		return repositoryVenda.findAll();
	}

	public Venda listaUmaVenda(long id) {
		return repositoryVenda.findById(id);
	}

	public Venda realizaUmaVenda(VendaRequest venda) {
		venda.setDataVenda(new Date());
		Venda v = mapperVenda.paraEntity(venda);
		System.out.println(v.toString());
		Venda conf = repositoryVenda.save(v);
		if (conf == null) {
			return null;
		}
		EstoqueRequest k = geraChamadaEstoque(conf);
		if (k != null) {
			controller.estoqueControler().atualizarRegistroEstoque(k);
		}
		return v;
	}

	private EstoqueRequest geraChamadaEstoque(Venda conf) {
		List<Estoque> l = controller.estoqueControler().listaOEstoque();
		Estoque select = null;
		for (Estoque j : l) {
			if (j.getProduto().equals(conf.getNomeProduto())) {
				select = j;
				break;
			}
		}
		select.setQuantidade(select.getQuantidade().subtract(new BigDecimal(conf.getQuantidade() + "")));
		if (select.getQuantidade().intValue() < 0) {
			return null;
		}
		return mapperEstoque.paraRequest(select);
	}
}
