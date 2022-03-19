package com.produto.apirestfull.module.venda.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VendaRequest {

	private long id;

	private Integer codigoProduto;
	private String nomeProduto;
	private Integer quantidade;
	private BigDecimal valor;
	private Date dataVenda;

}
