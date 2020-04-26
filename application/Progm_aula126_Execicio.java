package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTercerizado;

public class Progm_aula126_Execicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();		
		
		System.out.print("Quantos funcionários: ");
		Integer n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("=========================================");
			System.out.println("Funcionario " + i + ":");
			
			String opcao = digite("Tercerizado (y/n)? ", sc);
			
			if(!(validaOpcao(opcao))) {
				System.out.println("Opção inválida!");
				i--;
			}else {
				String nome = (String) digite("Nome", sc);
				Integer hora = Integer.parseInt(digite("Hora Trabalhada", sc));
				Double vPorHora = Double.parseDouble(digite("Valor p/ Hora", sc));
				
				if(opcao.equals("n")) {
					funcionarios.add(new Funcionario(nome, hora, vPorHora));
				}else {
					Double vAdicional = Double.parseDouble(digite("Despesa adicional: ", sc));
					funcionarios.add(new FuncionarioTercerizado(nome, hora, vPorHora, vAdicional));
				}
			}
		}
		mostrar(funcionarios);	
		sc.close();
	}

	private static boolean validaOpcao(String opcao) {
		if(opcao.equals("n")) {
			return true;
		}
		if(opcao.equals("y"))
		{
			return true;
		}
		return false;
	}

	public static String digite(String msg, Scanner sc) {
		System.out.print(msg +": ");
		return sc.next();
	}
	
	public static void mostrar(List<Funcionario> funcionarios) {
		System.out.println("\nPagamentos: ");
		System.out.println("=========================================");
		for (Funcionario f : funcionarios) {
			System.out.print(f + "\n");
		}
	}
}
