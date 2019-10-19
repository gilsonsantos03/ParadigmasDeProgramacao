package br.ufma.ecp.paradigmas.lista1;

public class Circulo implements Geometria{
	private double raio;
	private double pi = 3.14;
	private String nome = "Círculo";
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	
	//getters e setters
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}


	@Override
	public double perimetro() {
		return 2*this.getPi()*this.getRaio();
	}
	
	@Override
	public double area() {
		return this.getPi()*this.getRaio()*this.getRaio();
	}

	@Override
	public String toString() {
		return nome;
	}
	
	
}
