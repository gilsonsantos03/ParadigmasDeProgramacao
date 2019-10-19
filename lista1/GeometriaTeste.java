package br.ufma.ecp.paradigmas.lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeometriaTeste {

	public static void main(String[] args) {
		int qtd;
		String resp;
		List <Geometria> shapes = new ArrayList<Geometria>();
		
		System.out.print("Quantas formas você deseja criar? ");
		Scanner entrada = new Scanner(System.in);
		qtd = Integer.parseInt(entrada.nextLine());
		
		for(int i = 1; i <= (qtd) ; i++) {
			System.out.println("Qual forma você quer criar (Quadrado, Retângulo ou Círculo)? ");
			System.out.print("Insira q, r ou c:");
			resp = entrada.nextLine();
			
			if (resp.equals("q") || resp.equals("Q")) {
				double l;
				System.out.println("Insira o tamanho do lado do quadrado: ");
				l = Double.parseDouble(entrada.nextLine());
				Quadrado q1 = new Quadrado(l);
				shapes.add(q1);
			} else if (resp.equals("r") || resp.equals("R")) {
				double lb, ll;
				System.out.println("Insira o tamanho da base do retângulo: ");
				lb = Double.parseDouble(entrada.nextLine());
				System.out.println("Insira o tamanho da altura do retângulo: ");
				ll = Double.parseDouble(entrada.nextLine());
				Retangulo r1 = new Retangulo(lb, ll);
				shapes.add(r1);
			}else if (resp.equals("c") || resp.equals("C")) {
				double r;
				System.out.println("Insira o tamanho do raio do círculo: ");
				r = Double.parseDouble(entrada.nextLine());
				Circulo c1 = new Circulo(r);
				shapes.add(c1);
			}
		}
		
		System.out.println("");
		for(Geometria g : shapes) {
			System.out.println("Área do " + g + " é: " + g.area());
			if (g instanceof Circulo) {
				Circulo c = (Circulo)g;
				System.out.println("O raio do círculo é: " + c.getRaio());
			}else if (g instanceof Retangulo) {
				Retangulo r = (Retangulo)g;
				System.out.println("A base do do retângulo é: " + r.getLt());
				System.out.println("A altura do do retângulo é: " + r.getLl());
			}else {
				Quadrado q = (Quadrado)g;
				System.out.println("O lado do quadrado é: " + q.getLt());
			}
		}
		
		entrada.close();
	}

}
