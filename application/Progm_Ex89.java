package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Ocupante;
import entities.Quartos;

public class Progm_Ex89 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão arrendados? ");
		int n = sc.nextInt();
		
		Quartos[] quartos = new Quartos[10];
		
		for(int i = 0; i < n; i++) {
			System.out.println("==================================");
			System.out.println("Arrendado #"+(i+1)+":");
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
						
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			
			System.out.print("Nº Quarto: ");
			int nq = sc.nextInt();
			if(quartos[nq] == null) {
				quartos[nq] = new Quartos(new Ocupante(nome, email));
				quartos[nq].setNquarto(nq);
			}else {
				System.out.println("Quarto ocupado!");
				i--;
			}
		}
		System.out.println("==================================");
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i < quartos.length; i++) {
			if(quartos[i]!=null)
				System.out.println(""+quartos[i].getNquarto()+": "+quartos[i].getOcupante());
		}
		
		
		sc.close();
	}

}
