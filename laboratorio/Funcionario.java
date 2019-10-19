package br.ufma.ecp.paradigmas.laboratorio;

public class Funcionario {
	private String cargo;
	private int salario;
	
	public Funcionario(String cargo, int salario) {
		super();
		this.cargo = cargo;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", salario=" + salario + "]";
	}
	
	
}	
