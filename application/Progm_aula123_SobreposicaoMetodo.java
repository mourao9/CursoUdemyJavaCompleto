package application;

import entities.Conta;
import entities.ContaEmpresa;
import entities.ContaPoupanca;

public class Progm_aula123_SobreposicaoMetodo {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta("1001", "Alex", 1000.0);
		conta1.saque(50.0);
		
		System.out.println(conta1);
		
		Conta conta2 = new ContaPoupanca("1003", "Zé", 1000.0, 0.01);
		conta2.saque(50.0);
		
		System.out.println(conta2);
		
		Conta conta3 = new ContaEmpresa("1004", "Maria", 10000.0, 50000.0);
		conta3.saque(1000.0);
		
		System.out.println(conta3);

	}

}
