package application;

import java.util.Locale;
import java.util.Scanner;
/*
3 4
10 8 15 12
21 11 23 8
14 5 13 19
*/
public class Exerc_aula97_Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), m = sc.nextInt();
		int[][] matz = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matz[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(matz[i][j] == x) {
					System.out.print("Position "+i+","+j+":\n");
					if(j > 0)
						System.out.println("Left: " + matz[i][j-1]);
					
					if(j < m - 1)
						System.out.println("Right: " + matz[i][j+1]);
					
					if(i > 0)
						System.out.println("Up: " + matz[i-1][j]);
					
					if(i < n - 1)
						System.out.println("Down: " + matz[i+1][j]);
				}
			}
		}
		
		sc.close();
	}

}
