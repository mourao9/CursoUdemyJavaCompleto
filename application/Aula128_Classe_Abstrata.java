package application;

import java.util.ArrayList;
import java.util.List;

import entities.Conta;
import entities.ContaEmpresa;
import entities.ContaPoupanca;

public class Aula128_Classe_Abstrata {

	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<>();
		
		lista.add(new ContaPoupanca("1001", "Alex", 500.0, 0.01));
		lista.add(new ContaEmpresa("1002", "Maria", 1000.0, 400.0));
		lista.add(new ContaPoupanca("1003", "Bob", 300.0, 0.01));
		lista.add(new ContaEmpresa("1005", "Ana", 500.0, 500.0));
		
		Double sum = 0.0;
		
		for (Conta conta : lista) {
			sum+=conta.getSaldo();
		}
		
		System.out.printf("Total: %.2f", sum);
		
		for (Conta conta : lista) {
			conta.deposito(10.0);
		}
		
		System.out.println("\n");
		
		for (Conta conta : lista) {
			System.out.printf("Saldo atualizado %s: %.2f%n", conta.getnConta(), conta.getSaldo());
		}
		
		sum = 0.0;
		
		for (Conta conta : lista) {
			sum+=conta.getSaldo();
		}
		
		System.out.printf("\nTotal com acrécimo: %.2f", sum);
		
 	}

}
