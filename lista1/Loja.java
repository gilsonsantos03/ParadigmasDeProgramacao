package br.ufma.ecp.paradigmas.lista1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Loja {
	//2b)c)
	public static void busca(LojaItens produto, List<LojaItens> produtos) {
		int indice = -3;
		for (LojaItens p : produtos) {
			if (produto.equals(p)){
				indice = produtos.indexOf(p);
				System.out.println("O índice do produto é: " + indice);
				break;
			}	
		}
		if (indice == -3) {
			System.out.println("Produto não encontrado");
		}
	}
	
	public static void main(String[] args) {
	
		//2a)
		List<LojaItens> itens = Arrays.asList(
				new LojaCD("Barões da Pisadinha", 55.0, 1213232, 24),
				new LojaCD("Raça Negra", 70, 11223, 19),
				new LojaLivro("A Moreninha", 50, 12123, "Joaozin"),
				new LojaDVD("A volta dos que não foram", 100, 12123, 120),
				new LojaDVD("Marceneiro", 90, 12234, 60));
		
		for(LojaItens i : itens) {
			System.out.println(i);
		}
		System.out.println("------");
		
		LojaCD c1 = new LojaCD("Uu", 40, 1111, 29);
		LojaCD c2 = new LojaCD("Uuu", 40, 1111, 29);
		System.out.println(c1.equals(c2));
		System.out.println("------");
		
		//2b)c) e 2b)d)
		busca (new LojaCD("Barões da Pisadinha", 55.0, 1213232, 24), itens);
		System.out.println("------");
		
		//2c)
		System.out.println(c1.compareTo(c2));
		Collections.sort(itens);
		for(LojaItens i : itens) {
			System.out.println(i);
		}
	}
		
	
}
