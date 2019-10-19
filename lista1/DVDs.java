package br.ufma.ecp.paradigmas.lista1;

public class DVDs {
	private String nome;
	private double preco;
	private int duracao;
	private int codBarras;
	

	@Override
	public String toString() {
		return "DVDs [nome=" + nome + ", preco=" + preco + ", duracao=" + duracao + ", codBarras=" + codBarras + "]";
	}

	public DVDs(String nome, double preco, int duracao, int c) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.duracao = duracao;
		this.codBarras = c;
	}
	
	
}
