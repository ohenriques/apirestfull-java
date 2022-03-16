package com.produto.apirestfull.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.apirestfull.models.Venda;

public interface VendaRepository extends JpaRepository<Venda,Long>{

	Venda findById(long id);
	
}
