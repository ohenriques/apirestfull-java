package com.produto.apirestfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.apirestfull.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	Produto findById(long id);
	
}
