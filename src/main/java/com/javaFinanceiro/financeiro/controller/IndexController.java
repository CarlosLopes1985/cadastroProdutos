package com.javaFinanceiro.financeiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javaFinanceiro.financeiro.model.Produto;
import com.javaFinanceiro.financeiro.util.Constants;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("passou aki!!!");
		return Constants.INDEX;
	}
	
	@RequestMapping(value = "/salvarProduto", method = RequestMethod.POST)
	public ModelAndView salvarProduto(Produto produto, BindingResult errors, Model model) {
		
		ModelAndView mv = new ModelAndView();
		
		System.out.println(produto.toString());
		mv.addObject(Constants.INDEX);
		
		System.out.println("passou aki!!!");
		
		return mv;
	}
}
