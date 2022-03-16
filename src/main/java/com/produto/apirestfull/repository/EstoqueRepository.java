package com.produto.apirestfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.apirestfull.models.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Long>{

	Estoque findById(long id);
	
}
