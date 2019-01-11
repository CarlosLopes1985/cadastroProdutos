package com.javaFinanceiro.financeiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaFinanceiro.financeiro.model.Produto;
import com.javaFinanceiro.financeiro.service.ServiceProduto;

@Controller
@RequestMapping(value="/produtos")
public class ProdutoController {
	
	@Autowired
	private ServiceProduto serviceProduto;
	
	@RequestMapping(value="/novo" , method = RequestMethod.POST)
	public String novo(Produto produto) {
		try {
			serviceProduto.salvar(produto);
			System.out.println("Salvou");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return "OK";
	}
}
