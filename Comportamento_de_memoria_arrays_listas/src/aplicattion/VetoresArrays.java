package aplicattion;
//import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class VetoresArrays {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		double[]n2 = new double[n1];
		
		for(int i = 0; i<n1; i++) {
			n2[i] = sc.nextDouble();
		}
		
		double somarray = 0.0;
		for(int i = 0; i<n1; i++) { // modo 1 de fazer a media usando um laço for 
			somarray += n2[i];
		}
		double medium = somarray / n1;
		
		//double medium = (Arrays.stream(n2).sum()) / n2.length ; modo 2 de fazer a media usando a class Arrays 
		
		System.out.printf("AVERAGE HEIGHT: %.2f",medium);
		
		sc.close();
	}
}
