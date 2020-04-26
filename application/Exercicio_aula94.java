package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Empregado;

public class Exercicio_aula94 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Empregado> empregados = new ArrayList<>();

		Empregado empregado;

		int n, id;
		String nome;
		Double salario;

		System.out.print("Quantos empregados serão registrados? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("==========================");
			System.out.println("Empregado #" + (i + 1) + ":");
			System.out.print("Id: ");
			id = sc.nextInt();
			sc.nextLine();

			System.out.print("Nome: ");
			nome = sc.nextLine();

			System.out.print("Salario: ");
			salario = sc.nextDouble();

			empregado = new Empregado(id, nome, salario);
			empregados.add(empregado);
		}
		System.out.println("==========================");
		System.out.print("Digite o id do empregado que terá o salário incrementado: ");
		int cod = sc.nextInt();

		Empregado emp = empregados.parallelStream().filter(x -> x.getId() == cod).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("==========================");
			System.out.println("Id não encontrado!");
		} else {
			System.out.print("Digite a percentagem: ");
			double perc = sc.nextDouble();
			emp.incrementar(perc);
		}
		System.out.println("==========================");

		System.out.println("Lista de Empregados:");
		mostraLista(empregados);

		sc.close();
	}

	public static void mostraLista(List<Empregado> l) {
		for (Empregado e : l) {
			System.out.println(e);
		}
	}

}
