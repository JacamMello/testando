package aplicattion;

import java.util.Scanner;

public class Exercicio_32_Matriz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] mat = new int[l][c];
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0 ; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int n = sc.nextInt();
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0 ; j<mat[i].length; j++) {
				if (mat[i][j] == n ) {
					System.out.printf("Position: %d, %d\n", i, j);
					if(j>0) {
						System.out.printf("Left: %d\n", mat[i][j-1]);
					}
					if(j < mat[i].length-1) {
						System.out.printf("Rigth: %d\n", mat[i][j+1]);
					}
					if(i > 0) {
						System.out.printf("Up: %d\n", mat[i-1][j]);
					}
					if(i < mat.length-1) {
						System.out.printf("Dow: %d\n", mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}
