package com.produto.apirestfull.mapper;

import java.math.BigDecimal;
import java.util.Date;

import com.produto.apirestfull.module.venda.model.Venda;
import com.produto.apirestfull.module.venda.model.VendaRequest;

public class MapperVenda {



	public Venda paraEntity(VendaRequest venda) {
		 long id = venda.getId();
		
		 Integer codigoProduto = venda.getCodigoProduto();
		 String nomeProduto = venda.getNomeProduto();
		 Integer quantidade = venda.getQuantidade();
		 BigDecimal valor = venda.getValor();
		 Date dataVenda = venda.getDataVenda();
		 
		 return new Venda().novaVenda(id, codigoProduto, nomeProduto, quantidade, valor, dataVenda);
	}

}
