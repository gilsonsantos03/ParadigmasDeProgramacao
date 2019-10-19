package br.ufma.ecp.paradigmas.lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeometriaTeste {

	public static void main(String[] args) {
		int qtd;
		String resp;
		List <Geometria> shapes = new ArrayList<Geometria>();
		
		System.out.print("Quantas formas voc� deseja criar? ");
		Scanner entrada = new Scanner(System.in);
		qtd = Integer.parseInt(entrada.nextLine());
		
		for(int i = 1; i <= (qtd) ; i++) {
			System.out.println("Qual forma voc� quer criar (Quadrado, Ret�ngulo ou C�rculo)? ");
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
				System.out.println("Insira o tamanho da base do ret�ngulo: ");
				lb = Double.parseDouble(entrada.nextLine());
				System.out.println("Insira o tamanho da altura do ret�ngulo: ");
				ll = Double.parseDouble(entrada.nextLine());
				Retangulo r1 = new Retangulo(lb, ll);
				shapes.add(r1);
			}else if (resp.equals("c") || resp.equals("C")) {
				double r;
				System.out.println("Insira o tamanho do raio do c�rculo: ");
				r = Double.parseDouble(entrada.nextLine());
				Circulo c1 = new Circulo(r);
				shapes.add(c1);
			}
		}
		
		System.out.println("");
		for(Geometria g : shapes) {
			System.out.println("�rea do " + g + " �: " + g.area());
			if (g instanceof Circulo) {
				Circulo c = (Circulo)g;
				System.out.println("O raio do c�rculo �: " + c.getRaio());
			}else if (g instanceof Retangulo) {
				Retangulo r = (Retangulo)g;
				System.out.println("A base do do ret�ngulo �: " + r.getLt());
				System.out.println("A altura do do ret�ngulo �: " + r.getLl());
			}else {
				Quadrado q = (Quadrado)g;
				System.out.println("O lado do quadrado �: " + q.getLt());
			}
		}
		
		entrada.close();
	}

}
