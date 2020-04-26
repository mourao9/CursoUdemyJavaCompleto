package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NivelTrabalhador;

public class Progm_aula105_Exercicio_parte_01_02 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Departamento dep;
		Trabalhador trab;
		NivelTrabalhador nivelTrab = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Digite o nome do Departamento: ");
		String nDep = sc.nextLine();
		dep = new Departamento(nDep);
		
		System.out.println("===============================");
		
		System.out.println("Digite os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Nível: ");
		String nivel = sc.nextLine();
		nivelTrab = NivelTrabalhador.valueOf(nivel);
		
		System.out.print("Salário base: ");
		double sBase = sc.nextDouble();
		
		trab = new Trabalhador(nome, nivelTrab, sBase, dep);
		
		System.out.println("======================================");
		
		System.out.print("Quantos contratos para este Trabalhador: ");
		int n = sc.nextInt() + 1;

		System.out.println("======================================");
		
		for(int i = 1; i < n; i++) {
			System.out.println("Digite os dados do contrato #" + i + ":");
						
			System.out.print("Data (DD/MM/YYYY): ");
			Date d = sdf.parse(sc.next());
			
			System.out.print("Valor por hora: ");
			double vHora = sc.nextDouble();
			
			System.out.print("Duração (hora): ");
			int dHora = sc.nextInt();
			
			System.out.println("===============================");
			
			trab.addContrato(new Contrato(d, vHora, dHora));
			
		}
		System.out.println();
		System.out.print("Digite o mês e ano para calcular a renda (MM/YYYY): ");
		//08/2020
		String d = sc.next();
		
		mostrar(trab, d);
		
		sc.close();
	}

	public static void mostrar(Trabalhador t, String d) {
		
		int m = Integer.parseInt((String) d.substring(0, 2));
		int y = Integer.parseInt((String) d.substring(3));
		
		System.out.println("Nome: " + t.getNome() +"\n"
				+ "Departamento: " + t.getDep() + "\n"
						+ "Renda de " + d +": " + String.format("%.2f", t.renda(y, m)));
	}
}
