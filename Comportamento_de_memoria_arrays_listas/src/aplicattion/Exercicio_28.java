package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_28 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.printf("Quantas pessoas voce vai digitar: ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		for(int i = 0; i<n; i++) {
			System.out.printf("Dados da %da pessoa: \n", i+1);
			System.out.printf("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.printf("idade: ");
			idades[i] = sc.nextInt();
		}
		
		int olderage = idades[0];
		String name = nomes[0];
		for(int i = 1; i<n; i++) {
			if(idades[i] > olderage) {
				olderage = idades[i];
				name = nomes[i];
			}
		}
		
		System.out.printf("Pessoa mais velha: %s", name);
		
		sc.close();
	}
}
