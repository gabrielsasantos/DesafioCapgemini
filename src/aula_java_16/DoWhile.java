package aula_java_16;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		int i = 1;
		int max = 10; 
		
		System.out.println("Contando até " + max );
		
		while (i < max ) {
			System.out.println("Valor de i: " + i);
			i++ ;
			
		}
		
		
	}

}
