package aplicattion;

import java.util.Scanner;

public class Exercicio_26 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 2;
		
		int[] vet1 = new int[n];
		int[] vet2= new int[n];
		int[] vet3 = new int[n];
		
		for(int i = 0; i<n; i++) {
			vet1[i] = sc.nextInt();
		}
		
		for(int i = 0; i<n; i++) {
			vet2[i] = sc.nextInt();
		}
		
		
		System.out.println("Valor resultante:");
		
		for(int i = 0; i<n; i++) {
			System.out.println(vet3[i] = vet1[i] + vet2[i]);
		}
		
		
		sc.close();
	}
}
