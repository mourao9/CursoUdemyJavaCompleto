package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Progm_aula134_try_catch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o inv�lida!");
		}catch(InputMismatchException e) {
			System.out.println("Valor inv�lido!");
		}

		System.out.println("End of program!");

		sc.close();
	}

}
