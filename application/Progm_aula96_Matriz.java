package application;

import java.util.Locale;
import java.util.Scanner;

public class Progm_aula96_Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] matz = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Diagonal principal: ");

		for (int i = 0; i < n; i++) {
			System.out.print(matz[i][i]+" ");			
		}
		
		
		int soma = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matz[i][j] < 0) {
					soma++;
				}
			}
		}
		System.out.println("\nNúmeros negativos = " + soma);
		sc.close();
	}

}
