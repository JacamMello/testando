package aplicattion;

import java.util.Scanner;

public class Matrizes {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o tamanho da matriz:");
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n]; 
		for(int i = 0; i<matriz.length; i++ ) {
			for(int y = 0; y<matriz[i].length; y++) {
				matriz[i][y] = sc.nextInt();
			}
		}
		
		System.out.println("Main digonal:");
		for(int i = 0; i<matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		} 
		
		int negatives = 0;
		for(int i = 0; i<matriz.length; i++) {
			for(int y = 0; y<matriz[i].length; y++) {
				if(matriz[i][y] < 0) {
					negatives++;  
				}
			}
		}
		System.out.println ("Negatives numbers: %d" + negatives);
		
		int positives = 0;
		for(int i = 0; i <matriz.length; i++) {
			for (int y = 0; y < matriz[i].length; y++) {
				if(matriz[i][y] > 0) {
					positives++;
				}
			}
		}
		System.out.println("Positive numbers: " + positives);
		
		sc.close();
	}
}
