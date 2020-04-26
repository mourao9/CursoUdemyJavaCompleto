package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Progm_aula127_Exercicio {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produto> produtos = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Digite o número de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("==============================================");
			System.out.println("Dados do produto #" + i + ":");
			String opcao = pegaDadosDigitados("Comum, Usado ou Importado (c/u/i)? ", sc);
			if (!(validaOpcao(opcao))) {
				System.out.println("Opção inválida!");
				i--;
			} else {
				
				String nome = pegaDadosDigitados("Nome: ", sc);
				Double preco = Double.parseDouble(pegaDadosDigitados("Preço: ", sc));
				
				switch (opcao) {
				case "c":
					produtos.add(new Produto(nome, preco));
					break;
				case "u":
					String dFabricacao = pegaDadosDigitados("Data de fabricação (DD/MM/YYYY): ", sc);
					produtos.add(new ProdutoUsado(nome, preco, dFabricacao));
					break;
				case "i":
					Double taxa = Double.parseDouble(pegaDadosDigitados("Taxa: ", sc));
					produtos.add(new ProdutoImportado(nome, preco, taxa));
					break;
				default:
					break;
				}
			}
		}
		mostrar(produtos);
	}

	private static void mostrar(List<Produto> produtos) {
		System.out.println("\n==============================================");
		System.out.println("ETIQUETA DE PREÇOS:");
		for (Produto produto : produtos) {
			System.out.println(produto.etiquetaDePreco());
		}
	}

	private static boolean validaOpcao(String opcao) {
		if (opcao.equals("c"))
			return true;
		if (opcao.equals("u"))
			return true;
		if (opcao.equals("i"))
			return true;
		return false;
	}

	public static String pegaDadosDigitados(String msg, Scanner sc) {
		System.out.print(msg);
		return sc.next();
	}
}
