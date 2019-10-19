package br.ufma.ecp.paradigmas.lista1;

public class Quadrado extends Quadrilatero{
	private String nome = "Quadrado";
	
	public Quadrado(double lt) {
		super(lt, 0, 0, 0);
	}

	@Override
	public double area() {
		return this.getLt()*this.getLt();
	}
	
	@Override
	public double perimetro() {
		return 4*this.getLt();
	}

	@Override
	public String toString() {
		return nome;
	}

	
}
