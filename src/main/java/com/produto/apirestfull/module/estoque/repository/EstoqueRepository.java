package com.produto.apirestfull.module.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.apirestfull.module.estoque.model.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Long>{

	Estoque findById(long id);
	
}
