package br.ufma.ecp.paradigmas.lista1;

import br.ufma.ecp.paradigmas.lista1questao4.Contato;

public abstract class ContatoTelefone implements Contato {
	private String nome, contato, tipo;
	
	public ContatoTelefone(String nome, String contato, String tipo) {
		super();
		this.nome = nome;
		this.contato = contato;
		this.tipo = tipo;
	}
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public String getContato() {
		return contato;
	}
	
	@Override
	public String getTipo() {
		return tipo;
	}

}
