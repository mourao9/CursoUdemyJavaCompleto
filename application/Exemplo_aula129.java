package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.Cor;

public class Exemplo_aula129 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Forma> formas = new ArrayList<>();
		Cor cor;

		System.out.print("Digite o número de formas: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da forma #" + i + ":");
			
			String opcao = pegaDadosDigitados("Retângulo ou Círculo (r/c)? ", sc);
			
			if (!(validaOpcao(opcao))) {
				System.out.println("Opção inválida!");
				i--;
			} else {
				switch (opcao) {
				case "r":
					cor = Cor.valueOf(pegaDadosDigitados("Color (PRETO, AZUL, VERMELHO): ", sc));
					Double largura = Double.parseDouble(pegaDadosDigitados("Largura: ", sc));
					Double altura = Double.parseDouble(pegaDadosDigitados("Altura: ", sc));
					
					formas.add(new Retangulo(largura, altura, cor));
					break;
				case "c":
					cor = Cor.valueOf(pegaDadosDigitados("Color (PRETO, AZUL, VERMELHO): ", sc));
					Double raio = Double.parseDouble(pegaDadosDigitados("Raio: ", sc));
					
					formas.add(new Circulo(raio, cor));	
					break;
				default:
					break;
				}
			}
		}
		mostrar(formas);
	}

	private static void mostrar(List<Forma> formas) {
		System.out.println("\n\nÁreas das formas: ");
		System.out.println("=======================================");
		for (Forma forma : formas) {
			System.out.println(forma);
		}
	}

	private static boolean validaOpcao(String opcao) {
		if (opcao.equals("c"))
			return true;
		if (opcao.equals("r"))
			return true;
		return false;
	}

	public static String pegaDadosDigitados(String msg, Scanner sc) {
		System.out.print(msg);
		return sc.next();
	}
}
