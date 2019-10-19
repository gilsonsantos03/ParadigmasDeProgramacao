package br.ufma.ecp.paradigmas.lista1;


public class LojaItens implements Comparable<LojaItens> {
	private String nome;
	private double preco;
	private int codBarras;
	
	public LojaItens(String nome, double preco, int codBarras) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.codBarras = codBarras;
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

	//compara se dois produtos possuem o mesmo cod de barras
	@Override
	public boolean equals(Object obj) {
		LojaItens prod = (LojaItens)obj;
		return this.codBarras == prod.codBarras;
	}

	@Override
	public int compareTo(LojaItens prod) {
		return this.getNome().compareTo(prod.getNome());
	}
	
	/*
	 @Override
	 public int compareTo(LojaItens prod){
		int res = preco.compareTo(prod.getPreco());
		if (res < 0){
			return -1;
		}else if (res > 0){
			return 1;
		}
		return 0;
	}
	 */
	
}
