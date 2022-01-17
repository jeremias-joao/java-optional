//package com.algaworks.optional;
//
//import java.math.BigDecimal;
//import java.util.Optional;
//
//import com.algaworks.optional.domain.CatalogosProduto;
//import com.algaworks.optional.domain.Produto;
//
//public class Exemplo1 {
//	CatalogosProduto catalogo = new CatalogosProduto();
//
//	/*
//	 * Produto produto = catalogo.buscar("Picanha 1kg"); if(produto != null) {
//	 * System.out.println(produto.getPreco());
//	 * 
//	 * produto.setPreco(produto.getPreco()).add(new BigDecimal(100)); }else{
//	 * System.out.println("Produto nao existe"); }
//	 */
//
//	Optional<Produto> produtoOptional = catalogo.buscarOptional("Picanha 2kg");
//
//	if(produtoOptional.isPresent()) {
//		Produto produto = produtoOptional.get();
//
//		produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
//
//		System.out.println(produto.getPreco());
//	}
//	
//
//}}
