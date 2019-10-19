package br.ufma.ecp.paradigmas.testes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CircleTest {

	public static void main(String[] args) {
		System.out.println("começando");
		Circle c = new Circle(10);
		System.out.println(c.area());
		System.out.println(c.circumference());
		
		PlaneCircle pc = new PlaneCircle(10, 2, 5);
		System.out.println(pc.area());
		System.out.println(pc.circumference());
		System.out.println(pc.isInside(1, 3));
		
		Circle c2 = new PlaneCircle(20, 4 ,5); //algo assim vai cair na prova
		System.out.println(c2.area());
		System.out.println(c2.circumference());
		//System.out.println(c2.isInside(1, 3)); dá erro pois o método não está definido em Circle
		
		Rectangle r = new Rectangle (10, 20);
		System.out.println(r.area());
		
		List<Geometria> l = Arrays.asList(
				new Rectangle(10,20),
				new Circle(10),
				new Circle(30),
				new PlaneCircle(10, 20, 30)
				);
		
		Collections.sort(l);
		/*
		for (Object o : l) {
			System.out.println(o.toString()); //pode ser usado sem o toString()
			//isso é um exemplo de polimorfismo
		}
		*/
		
		System.out.println("------------");
		double areaTotal = 0;
		for (Geometria g : l) {
			System.out.println(g.area());
			areaTotal += g.area();		
			}
		System.out.println(areaTotal);	
		
		
	}

}
