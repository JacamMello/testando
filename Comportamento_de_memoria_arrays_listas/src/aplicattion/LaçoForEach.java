package aplicattion;

import java.util.Scanner;

public class LaçoForEach {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"Maria", "Tui", "Eduardo" };
		
		for(int i = 0; i<vect.length; i++) {
			
		}
		
		for(String i : vect) {
			System.out.println(i);
		}
		
		int[] num = new int[] {32, 2, 8, 18};
		
		for(int i : num) {
			System.out.println(i * 0.5);
		}
		
		sc.close();
	}
}
