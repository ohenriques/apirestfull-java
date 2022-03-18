package com.produto.apirestfull.module.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.apirestfull.module.produto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	Produto findById(long id);
	
}
