package com.produto.apirestfull.module.venda.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="TB_VENDA")
public class Venda implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	
	private Integer codigoProduto;
	private String nomeProduto;
	private Integer quantidade;
	private BigDecimal valor;
	private Date dataVenda;

  

	public Venda novaVenda(long id, Integer codigoProduto, String nomeProduto, Integer quantidade, BigDecimal valor,
			Date dataVenda) {
		
		this.id = id;
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.valor = valor;
		this.dataVenda = dataVenda;
		return this;
	}



	@Override
	public String toString() {
		return "Venda [id=" + id + ", codigoProduto=" + codigoProduto + ", nomeProduto=" + nomeProduto + ", quantidade="
				+ quantidade + ", valor=" + valor + ", dataVenda=" + dataVenda + "]";
	}
        
        
		
}
