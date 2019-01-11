package com.javaFinanceiro.financeiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaFinanceiro.financeiro.model.Produto;
import com.javaFinanceiro.financeiro.repository.ProdutoRepository;

@Service
public class ServiceProduto {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public void salvar(Produto produto) {
		produtoRepository.save(produto);
	}
}
