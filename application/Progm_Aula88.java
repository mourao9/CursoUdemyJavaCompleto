package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Progm_Aula88 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto[] produtos;
		
		System.out.println("====================================");

		System.out.print("Enter tamanho vector: ");
		int n = sc.nextInt();
		produtos = new Produto[n];
		double mPreco = 0.0;
				
		System.out.println("====================================");
		
		for(int i = 0; i < produtos.length; i++) {
			System.out.println("Entre com os dados do Produto: ");
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			sc.nextLine();
			
			System.out.print("Preço: ");
			double price = sc.nextDouble();
						
			produtos[i] = new Produto(nome, price);
			mPreco+=produtos[i].getPrice();

			System.out.println("====================================");
		}
		System.out.printf("Média: %.2f%n", mPreco/produtos.length);
		
		sc.close();
		
	}
}
