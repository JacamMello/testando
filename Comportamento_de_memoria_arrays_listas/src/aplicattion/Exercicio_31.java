package aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entieties.ClasseFuncionariosEx31;

public class Exercicio_31 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("How many employees will be registered? ");
		int n = sc.nextInt();
		List<ClasseFuncionariosEx31> employees = new ArrayList<>();	
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1 )+ ":");
			System.out.printf("Id: ");
			Integer id = sc.nextInt();
			while(hasId(employees, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.printf("Salary: ");
			Double salary = sc.nextDouble();
			employees.add(new ClasseFuncionariosEx31(id, name, salary));//adicionando elementos a lista ja com o construtor
		}
		
		System.out.println(" ");
		System.out.printf("Enter the employee id that will have salary increase:");
		Integer numid = sc.nextInt();
		//Integer searchid = position(employees, numid);
		ClasseFuncionariosEx31 searchid = employees.stream().filter(x -> x.getId()== numid).findFirst().orElse(null);
		if(searchid == null) {
			System.out.println("This id not exist");
		}
		else {
			System.out.println("Enter the percentage:");
			double percentage = sc.nextDouble();
			searchid.addSalary(percentage);
		}
		
		System.out.println("List of employees: ");
		for(ClasseFuncionariosEx31 obj : employees) {
			System.out.println(obj);
		}
		sc.close();
	}
	
	public static boolean hasId( List<ClasseFuncionariosEx31> list, int id) {
		ClasseFuncionariosEx31 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
	public static Integer position(List<ClasseFuncionariosEx31> list, int id) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	} 
}
