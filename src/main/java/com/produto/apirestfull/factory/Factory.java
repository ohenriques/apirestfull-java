package com.produto.apirestfull.factory;

import com.produto.apirestfull.controller.EstoqueController;
import com.produto.apirestfull.controller.VendaController;

public interface Factory {
	
	public EstoqueController estoqueControler();
	public VendaController vendaControler() ;
	
}
