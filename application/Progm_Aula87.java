package application;
import java.util.Locale;
import java.util.Scanner;

public class Progm_Aula87 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter tamanho vector: ");
		int n = sc.nextInt();
		
		double sAltura = 0.0;
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite a altura %d: ", i+1);
			sAltura += sc.nextDouble();
		}
		
		System.out.printf("M�dia: %.2f%n", sAltura/n);
		
		sc.close();
		
	}
}
