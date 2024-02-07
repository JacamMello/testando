package aplicattion;

import java.util.Scanner;

public class Exercicio_25 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, posmaior;
		double maior;
		
		System.out.printf("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] bignum = new double[n];
		
		for(int i = 0; i<bignum.length; i++) {
			System.out.printf("Digite um numero: ");
			bignum[i] = sc.nextDouble();
		}
		
		maior = bignum[0];
		posmaior = 0;
		
		for(int i = 1; i<n; i++) {
			if(bignum[i] > maior) {
				maior = bignum[i];
				posmaior = i;
			}
		}
		
		System.out.printf("Maior valor = %.2f \n", maior);
		System.out.printf("Posição do valor = %d \n", posmaior);
		
		
		sc.close();
	}
}
