package aplicattion;

import java.util.Scanner;

public class Exercicio_24 {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int n;
		
		
		System.out.printf("Quantos numeros voce vai digitar: ");
		n = sc.nextInt();
		
		int[] negatives = new int[n];
		
		for(int i = 0; i<negatives.length; i++) {
			System.out.printf("Difgite um numero: ");
			negatives[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos:"); 
		
		for(int i = 0; i<negatives.length; i++) {
			if (negatives[i] < 0) {
				System.out.println(negatives[i]);
			}
		}
		
		System.out.printf("Soma:"); 
		
		
		sc.close();
	}
}
