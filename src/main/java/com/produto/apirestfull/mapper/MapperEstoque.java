package com.produto.apirestfull.mapper;

import java.math.BigDecimal;

import com.produto.apirestfull.module.estoque.model.Estoque;
import com.produto.apirestfull.module.estoque.model.EstoqueRequest;

public class MapperEstoque {

	public Estoque paraSistema(EstoqueRequest estoqueRequest) {
		String produto = estoqueRequest.getProduto();
		String armazem = estoqueRequest.getArmazem();
		BigDecimal quantidade= estoqueRequest.getQuantidade(); 
		BigDecimal valorUnitario=  estoqueRequest.getValorUnitario();
		return new Estoque().preparaEstoque(produto, armazem, quantidade, valorUnitario);
	}
	
	public EstoqueRequest paraRequest(Estoque estoque) {
		Long id =estoque.getId();
		String produto= estoque.getProduto();
		String armazem = estoque.getArmazem();
		BigDecimal quantidade = estoque.getQuantidade();
		BigDecimal valorUnitario = estoque.getValorUnitario();
		EstoqueRequest s =new EstoqueRequest(produto, armazem, quantidade, valorUnitario);
		s.setId(id);
		return s;
		
	}

}
