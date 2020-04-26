package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ProgramaBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Conta conta;
		String nConta, titular, dep;
		double valorDep;
		
		System.out.println("=====================================");
		
		System.out.print("Enter account number: ");
		nConta = sc.nextLine();
		System.out.print("Enter account holder: ");
		titular = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)?");
		dep = sc.nextLine();
		
		if(dep.equals("y")) {
			//sc.nextLine();
			System.out.print("Enter inicial deposit value: ");
			valorDep = sc.nextDouble();
			conta = new Conta(nConta, titular, valorDep);
			System.out.println(conta);
			System.out.println("=====================================");
		}else {
			conta = new Conta(nConta, titular);
			System.out.println(conta);
		}
		System.out.println("=====================================");
		System.out.print("Enter a deposit value: ");
		valorDep = sc.nextDouble();
		System.out.println();
		
		conta.deposito(valorDep);
		System.out.print("Valor atualizado: ");
		System.out.println(conta);
		
		System.out.println("=====================================");
		System.out.print("Enter a saque value: ");
		valorDep = sc.nextDouble();
		System.out.println();
		
		conta.saque(valorDep);
		System.out.println("Valor atualizado: ");
		System.out.println(conta);
		
		sc.close();
	}

}
