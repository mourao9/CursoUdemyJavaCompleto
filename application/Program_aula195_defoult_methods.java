package application;

import java.util.Locale;
import java.util.Scanner;

import services.ServicoEmprestimo;
import services.ServicoEmprestimoBrasileiro;

public class Program_aula195_defoult_methods {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor: ");
		double valor = sc.nextDouble();
		
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		ServicoEmprestimo seb = new ServicoEmprestimoBrasileiro(2.0);
		
		double res = seb.pagamento(valor, meses);
		
		System.out.println("Pagamento depois de "+meses+" meses:");
		System.out.println(String.format("%.2f", res));
		
	}

}
