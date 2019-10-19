package br.ufma.ecp.paradigmas.testes;

public abstract class Geometria implements Comparable<Geometria>{
	//toda classe que tem pelo menos um m�todo abstrato deve ser abstrata
	/*
	public double area () {
		return 0;
	}
 	O m�todo acima � abstrato, n�o deve retornar nada ent�o, poder�amos fazer
	abstract public double area ();
	 */
	
	abstract public double area();
	
	public int compareTo(Geometria other) {
		return (int)(other.area() - this.area());
	}
}
