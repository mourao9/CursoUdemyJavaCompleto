package application;

import entities.Conta;
import entities.ContaEmpresa;
import entities.ContaPoupanca;

public class Progm_aula122_UpcastingDowncasting {

	public static void main(String[] args) {
		Conta conta = new Conta("101", "Alex", 0.0);

		ContaEmpresa c_empresa = new ContaEmpresa("102", "Maria", 0.0, 500.0);

		// Upcasting
		Conta conta1 = c_empresa;
		Conta conta2 = new ContaEmpresa("103", "Bob", 0.0, 2000.0);
		Conta conta3 = new ContaPoupanca("104", "Zé", 10.0, 0.25);

		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
		System.out.println(conta3.getSaldo());

		// Downcasting
		ContaEmpresa conta4 = (ContaEmpresa) conta2;
		conta4.emprestimo(100.0);

		// ContaEmpresa conta5 = (ContaEmpresa) conta3;

		if (conta3 instanceof ContaEmpresa) {
			ContaEmpresa conta5 = (ContaEmpresa) conta3;
			conta5.deposito(200.0);
			System.out.println("Empréstimo!");
		}

		if (conta3 instanceof ContaPoupanca) {
			ContaPoupanca conta5 = (ContaPoupanca) conta3;
			conta5.atualizarSaldo();
			System.out.println("Atualizado: " + conta5.getSaldo());
		}
		System.out.println(conta4.getSaldo());
	}

}
