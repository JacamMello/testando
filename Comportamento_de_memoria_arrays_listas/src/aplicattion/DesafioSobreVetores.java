package aplicattion;

import java.util.Locale;

import java.util.Scanner;

import entieties.ClassDesafioVetor;

public class DesafioSobreVetores {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("How many rooms will be rented: ");
		int n = sc.nextInt();
		
		System.out.println("");
		
		ClassDesafioVetor[] rents = new ClassDesafioVetor[10];
		
		for(int i = 0; i<n; i++) {
			System.out.printf("rent #%d\n", i+1);
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int roomnum = sc.nextInt();
			rents[roomnum] = new ClassDesafioVetor(name, email);
			System.out.println("");
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i<rents.length; i++) {
			if(rents[i] != null) {
				System.out.println(i + ": " + rents[i]);
			}
		}
		
		sc.close();
	}
}
