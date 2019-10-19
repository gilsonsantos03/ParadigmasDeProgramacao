package br.ufma.ecp.paradigmas.lista1;

public class Retangulo extends Quadrilatero {
	private String nome;
	public Retangulo(double lt, double ll) {
		super(lt, 0, ll, 0);
	}

	@Override
	public double area() {
		return this.getLt()*this.getLl();
	}
	
	@Override
	public double perimetro() {
		return 2*(this.getLt() + this.getLl());
	}

	@Override
	public String toString() {
		return nome;
	}
	
	
	
}
