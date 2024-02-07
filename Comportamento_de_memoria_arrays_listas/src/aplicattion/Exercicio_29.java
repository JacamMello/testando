package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_29 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		
		char[] sexos = new char[n];
		double[] alturas = new double[n];
		
		for(int i = 0; i<n; i++) {
			System.out.printf("Genero da %da pessoa: ", i+1);
			sexos[i] = sc.next().charAt(0);
			System.out.printf("Altura da %da pessoa: ", i+1);
			alturas[i] = sc.nextDouble();
		}
		
		double maioraltura = alturas[0];
		double menoraltura = alturas[0];
		
		for(int i = 1; i<n; i++) {
			if(maioraltura < alturas[i]) {
				maioraltura = alturas[i];
			}
			if(menoraltura > alturas[i]) {
				menoraltura = alturas[i];
			}
		}
		
		double somamulheres = 0.0;
		int contm = 0;
		int conth = 0;
		for(int i = 0; i<n; i++) {
			if(sexos[i] == 'F') {
				somamulheres+= alturas[i];
				contm++;
			}else {
				conth++;
			}
		}
		
		double mediamulheres = somamulheres/contm;
		
		System.out.printf("Menor altura = %.2f\n",menoraltura );
		System.out.printf("Maior altura = %.2f\n",maioraltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediamulheres);
		System.out.printf("Numero de homens = %d", conth);
		
		sc.close();
	}
}
