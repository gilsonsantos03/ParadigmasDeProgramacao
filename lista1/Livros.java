package br.ufma.ecp.paradigmas.lista1;

public class Livros {
	private String nome, autor;
	private double preco;
	private int codBarras;

	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", autor=" + autor + ", preco=" + preco + ", codBarras=" + codBarras + "]";
	}

	public Livros(String nome, String autor, double preco, int c) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.preco = preco;
		this.codBarras = c;
	}

	
	
	
	
}
