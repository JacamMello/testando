package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entieties.ClassAprovadosEx30;

public class Exercicio_30 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		ClassAprovadosEx30[] alunos = new ClassAprovadosEx30[n];
		
		for(int i = 0; i<alunos.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			alunos[i] = new ClassAprovadosEx30(nome, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados:");
		for(int i = 0; i<alunos.length; i++) {
			if(alunos[i].finalGrade() >= 6.0) {
				System.out.printf("%s\n", alunos[i].getName());
			}
		}
		
		sc.close();
	}
}
