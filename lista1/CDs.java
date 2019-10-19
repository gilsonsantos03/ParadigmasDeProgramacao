package br.ufma.ecp.paradigmas.lista1;

public class CDs {
	private String nome;
	private double preco;
	private int numFaixas;
	private int codBarras;

	@Override
	public String toString() {
		return "CDs [nome=" + nome + ", preco=" + preco + ", numFaixas=" + numFaixas + ", codBarras=" + codBarras + "]";
	}


	public CDs(String nome, double preco, int numFaixas, int c) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.numFaixas = numFaixas;
		this.codBarras = c;
	}
	
	
}
