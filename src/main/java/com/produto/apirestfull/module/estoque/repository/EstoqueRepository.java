package com.produto.apirestfull.module.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.apirestfull.module.estoque.model.Estoque;
import com.produto.apirestfull.module.estoque.model.EstoqueRequest;
import com.produto.apirestfull.module.venda.model.Venda;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

	Estoque findById(long id);
	

	public default void atualizaEstoque(Venda Venda) {
		
	}

	
}
