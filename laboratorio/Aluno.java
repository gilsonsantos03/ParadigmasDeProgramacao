package br.ufma.ecp.paradigmas.laboratorio;

public class Aluno {
	private String nome, dataNascimento;
	private int rg;
	
	public Aluno(String nome, int rg, String dataNascimento) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}

	
	public void mostraInfo () {
		System.out.println("O nome do aluno �: " + this.nome + "\n" + "Seu RG �: " + this.rg + "\n"
		+ "Sua data de nascimento �: " + this.dataNascimento);
	}
	
	
}
