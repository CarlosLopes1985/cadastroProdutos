package com.javaFinanceiro.financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaFinanceiro.financeiro.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
