package br.ufma.ecp.paradigmas.testes;

public abstract class Geometria implements Comparable<Geometria>{
	//toda classe que tem pelo menos um método abstrato deve ser abstrata
	/*
	public double area () {
		return 0;
	}
 	O método acima é abstrato, não deve retornar nada então, poderíamos fazer
	abstract public double area ();
	 */
	
	abstract public double area();
	
	public int compareTo(Geometria other) {
		return (int)(other.area() - this.area());
	}
}
