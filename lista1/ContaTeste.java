package br.ufma.ecp.paradigmas.lista1;

public class ContaTeste {

	public static void main(String[] args) {
		ContaCorrenteEspecial c = new ContaCorrenteEspecial(500);
		
		c.sacar(500);
		System.out.println(c.getSaldo());

	}

}
