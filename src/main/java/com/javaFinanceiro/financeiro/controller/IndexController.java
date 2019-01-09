package com.javaFinanceiro.financeiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	private static String INDEX = "cadastroProdutos";
	
	@RequestMapping("/")
	public String index() {
		System.out.println("passou aki!!!");
		return INDEX;
	}
	
	@RequestMapping("/salvarProduto")
	public String salvarProduto() {
		System.out.println("passou aki!!!");
		return INDEX;
	}
}
