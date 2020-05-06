package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Empregado_02;

public class Program_Interface_Comparable {

	public static void main(String[] args) {
		List<Empregado_02> lista = new ArrayList<>();
		//String path = "C:\\temp\\nomes.txt";
		String path = "C:\\temp\\nomes.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String nomes = br.readLine();
			while (nomes != null) {
				String[] dados = nomes.split(",");
				lista.add(new Empregado_02(dados[0], Double.parseDouble(dados[1])));
				nomes = br.readLine();
			}
			Collections.sort(lista);
			for (Empregado_02 emp : lista) {
				System.out.println(emp);
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
