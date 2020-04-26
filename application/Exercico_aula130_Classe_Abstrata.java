package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Exercico_aula130_Classe_Abstrata {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(pegaDados("Digite o nº de contrinuintes: ", sc));

		List<Pessoa> contribuintes = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do contribuinte #" + i);
			String opcao = pegaDados("Física ou Jurídica (f/j)? ", sc);

			if (opcao.equals("f")) {
				String nome = pegaDados("Nome: ", sc);
				Double renda = Double.parseDouble(pegaDados("Renda Anual: ", sc));
				Double despesasMedicas = Double.parseDouble(pegaDados("Despesas Médicas: ", sc));

				contribuintes.add(new PessoaFisica(nome, renda, despesasMedicas));
			}
			if (opcao.equals("j")) {
				String nome = pegaDados("Nome: ", sc);
				Double renda = Double.parseDouble(pegaDados("Renda Anual: ", sc));
				int funcionarios = Integer.parseInt(pegaDados("Nº Funcionários: ", sc));

				contribuintes.add(new PessoaJuridica(nome, renda, funcionarios));
			}
		}

		mostrar(contribuintes);

	}

	private static void mostrar(List<Pessoa> contribuintes) {
		System.out.println("\n\nImpostos pagos: ");
		System.out.println("================================");
		for (Pessoa pessoa : contribuintes) {
			System.out.println(pessoa);
		}
		System.out.printf("\n\nTotal de taxas: R$%.2f", allTaxas(contribuintes));
	}

	private static Double allTaxas(List<Pessoa> contribuintes) {
		double sum = 0.0;
		for (Pessoa pessoa : contribuintes) {
			sum += pessoa.impostos();
		}
		return sum;
	}

	public static String pegaDados(String msg, Scanner sc) {
		System.out.print(msg);
		return sc.next();
	}

}
