package br.ufma.ecp.paradigmas.lista1;

public class LojaDVD extends LojaItens{
	private double duracao;

	public LojaDVD(String nome, double preco, int codBarras, double duracao) {
		super(nome, preco, codBarras);
		this.duracao = duracao;
	}

	
	//getters e setters
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}


	@Override
	public String toString() {
		return "LojaDVD [Duração(min): " + duracao + ", Nome: " + getNome() + ", Preço(R$): " + getPreco()
				+ ", Código de barras: " + getCodBarras() + "]";
	}
	
	
	
}
