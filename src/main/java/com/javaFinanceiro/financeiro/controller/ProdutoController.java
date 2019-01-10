package com.javaFinanceiro.financeiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaFinanceiro.financeiro.model.Produto;

@Controller
@RequestMapping(value="/produtos")
public class ProdutoController {
	
	@RequestMapping(value="/novo" , method = RequestMethod.POST)
	public String novo(Produto produto) {
		
		
		return novo();
	}
}
