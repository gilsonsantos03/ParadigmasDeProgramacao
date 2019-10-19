package br.ufma.ecp.paradigmas.testes;

public class Rectangle extends Geometria {
	private double base;
	private double altura;
	
	public Rectangle(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public double area() {
		return base*altura;
	}

	@Override
	public String toString() {
		return "Rectangle [base=" + base + ", altura=" + altura + "]";
	}
	
}
