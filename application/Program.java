package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		

		System.out.println("Entre com os dados do Produto: ");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		

		System.out.print("Quantidade em Estoque: ");
		int quantidade = sc.nextInt();
		
		Produto p1 = new Produto(nome, price, quantidade);
			
		
		System.out.println();
		System.out.println(p1);
		System.out.println();
		
		System.out.print("Entre com a quantidade a ser inserida no estoque: ");
		int qadd = sc.nextInt();
		p1.addQuatidadeProduto(qadd);
		
		System.out.println();
		System.out.println("Dados atualizados - " + p1);
		System.out.println();
		
		System.out.print("Entre com a quantidade que será removida do estoque: ");
		int qrem = sc.nextInt();
		p1.removeQuatidadeProduto(qrem);
		
		System.out.println();
		System.out.println("Dados atualizados - " + p1);
		
		sc.close();
	}

}
