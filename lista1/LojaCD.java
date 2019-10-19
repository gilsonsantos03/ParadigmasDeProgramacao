package br.ufma.ecp.paradigmas.lista1;

public class LojaCD extends LojaItens{
	private int numFaixas;

	public LojaCD(String nome, double preco, int codBarras, int numFaixas) {
		super(nome, preco, codBarras);
		this.numFaixas = numFaixas;
	}

	
	//getters e setters
	public int getNumFaixas() {
		return numFaixas;
	}
	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}


	@Override
	public String toString() {
		return "LojaCD [Número de faixas: " + numFaixas + ", Nome: " + getNome() + ", Preço(R$): " + getPreco()
				+ ", Código de barras: " + getCodBarras() + "]";
	}


	
	
}
