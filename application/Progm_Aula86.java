package application;

import entities.Produto;

public class Progm_Aula86 {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("TV", 800.00, 5);

		Produto p2 = new Produto("Radio", 80.00, 15);
		
		p1 = p2;
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
