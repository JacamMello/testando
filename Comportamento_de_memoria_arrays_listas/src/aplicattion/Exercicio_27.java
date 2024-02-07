package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entieties.ClassAlturaEx27;

public class Exercicio_27 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.printf("Quantas pessoas serao digitadas: ");
		n = sc.nextInt();
		
		ClassAlturaEx27[] peoples = new ClassAlturaEx27[n];
		
		
		for(int i = 0; i<peoples.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.printf("Nome: ");
			sc.nextLine();
			String names = sc.nextLine();			
			System.out.printf("Idade: ");
			int idades = sc.nextInt();
			System.out.printf("Altura: ");
			double alturas = sc.nextDouble();
			peoples[i] = new ClassAlturaEx27(names, idades, alturas);
		}
		
		double mediumheigth = 0.0;
		for(int i = 0; i<peoples.length; i++) {
			mediumheigth += peoples[i].getHeight();
		}
		mediumheigth = mediumheigth/peoples.length;
		
		int menores = 0;
		for(int i = 0; i<peoples.length; i++) {
			if(16<peoples[i].getAge()) {
				 menores++;
			}
		}
		double percentualmenores = ((double)menores/peoples.length) * 100.0;
		
		System.out.printf("Altura media = %.2f\n", mediumheigth);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualmenores);
		
		for(int i = 0; i<peoples.length; i++) {
			if(peoples[i].getAge()<16) {
				System.out.printf("%s\n", peoples[i].getName());
			}
		}
		
		
		sc.close();
	}

}
