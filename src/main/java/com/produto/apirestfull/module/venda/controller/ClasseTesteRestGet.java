package com.produto.apirestfull.module.venda.controller;

import javax.persistence.criteria.FetchParent;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public interface ClasseTesteRestGet<Z,X> extends FetchParent<Z,X> {


	
}