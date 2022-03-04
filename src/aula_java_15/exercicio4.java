package aula_java_15;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua letra: ");
		String letra = scan.next();
		
		switch(letra) {
		case "a": System.out.println("É vogal"); break;
		case "A": System.out.println("É vogal"); break;
		case "e": System.out.println("É vogal"); break;
		case "E": System.out.println("É vogal"); break;
		case "i": System.out.println("É vogal"); break;
		case "I": System.out.println("É vogal"); break;
		case "o": System.out.println("É vogal"); break;
		case "O": System.out.println("É vogal"); break;
		case "u": System.out.println("É vogal"); break;
		case "U": System.out.println("É vogal"); break;
		default: System.out.println("é consoante");
		}

	}

}
