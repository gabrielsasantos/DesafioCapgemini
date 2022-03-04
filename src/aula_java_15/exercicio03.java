package aula_java_15;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu sexo: \n 1- Masculino \n 2-Feminino");
		int sexo = scan.nextInt();
		
		
		if (sexo == 2) {
			System.out.println("Seu sexo é feminino.");
			
		} else if (sexo == 1) {
			System.out.println("Seu sexo é masculino");
			
		}else {
			System.out.println("Sexo inválido");
			
		}
	}

	
	

	}