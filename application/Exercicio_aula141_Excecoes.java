package application;

import java.util.Scanner;

import entities.ContaEspecial;
import entities.exceptions.ContaExcecoes;

public class Exercicio_aula141_Excecoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os dados da conta: ");
		ContaEspecial conta;
		
		try {
			String numero = pegaDados("Número: ", sc);
			String titular = pegaDados("Titular: ", sc);
			Double saldo = Double.parseDouble(pegaDados("Saldo: ", sc));
			Double limite = Double.parseDouble(pegaDados("Limite: ", sc));
			
			conta = new ContaEspecial(numero, titular, saldo, limite);
			
			Double valor = Double.parseDouble(pegaDados("\nDigite o valor do saque: ", sc));
			conta.saque(valor);
			
		}catch(ContaExcecoes e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		sc.close();
	}
	
	private static String pegaDados(String msg, Scanner sc) {
		System.out.print(msg);
		return sc.next();
	}

}
