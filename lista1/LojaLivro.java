package br.ufma.ecp.paradigmas.lista1;

public class LojaLivro extends LojaItens {
	private String autor;

	public LojaLivro(String nome, double preco, int codBarras, String autor) {
		super(nome, preco, codBarras);
		this.autor = autor;
	}

	//getters e setters
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "LojaLivro [Autor: " + autor + ", Nome: " + getNome() + ", Preço(R$): " + getPreco()
				+ ", Código de barras: " + getCodBarras() + "]";
	}
	
	
	
	
}
