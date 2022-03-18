package com.produto.apirestfull.module.venda.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.apirestfull.module.venda.model.Venda;

public interface VendaRepository extends JpaRepository<Venda,Long>{

	Venda findById(long id);
	
}
