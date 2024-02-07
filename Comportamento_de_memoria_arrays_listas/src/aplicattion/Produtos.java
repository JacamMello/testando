package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entieties.ClassPrudutos;

public class Produtos {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ClassPrudutos[] produtos = new ClassPrudutos[n];
		
		for(int i = 0;i<produtos.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			produtos[i] = new ClassPrudutos(name, price);
		}
		
		
		double soma = 0.0;
		for (int i = 0; i<produtos.length; i++) {
			soma += produtos[i].getPrice();
		}
		double medium = soma / produtos.length;
		
		System.out.printf("Avarage price = %.2f \n", medium);
		
		for(int i = 0;i<produtos.length; i++) {
			System.out.printf("Name: %s, Price: $%.2f \n", produtos[i].getName(), produtos[i].getPrice());
		}
		sc.close();
	}
}
