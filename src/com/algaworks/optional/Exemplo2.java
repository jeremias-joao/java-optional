//package com.algaworks.optional;
//
//import java.math.BigDecimal;
//
//import com.algaworks.optional.domain.CatalogosProduto;
//
//public class Exemplo2 {
//	
//	CatalogosProduto catalogo = new CatalogosProduto();
//	
//	
//	BigDecimal preco = catalogo.buscarPreco("Picanha 12kg")
//			.orElseThrow(( -> new RuntimeException("Preco do produto nao encontrado"));
//	
//	System.out.println(preco);
//}
