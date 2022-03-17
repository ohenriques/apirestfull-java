package com.produto.apirestfull.module.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class TesteRepository<T> implements JpaRepository<T, Long> {

	//abstract T findById(long id);
	
	public T buscarPorId(long id) {
		return (T)findById(id);
		
	}
}
