package br.ufma.ecp.paradigmas.lista1;

public abstract class Quadrilatero implements Geometria {
	private double lt, ld, ll, lr;
	
	public Quadrilatero(double lt, double ld, double ll, double lr) {
		super();
		this.lt = lt;
		this.ld = ld;
		this.ll = ll;
		this.lr = lr;
	}

	@Override
	public abstract double perimetro();

	//getters e setters
	public double getLt() {return lt;}
	
	public void setLt(double lt) {this.lt = lt;}

	public double getLd() {return ld;}

	public void setLd(double ld) {this.ld = ld;}

	public double getLl() {return ll;}
	
	public void setLl(double ll) {this.ll = ll;}
	
	public double getLr() {return lr;}
	
	public void setLr(double lr) {this.lr = lr;}

}
