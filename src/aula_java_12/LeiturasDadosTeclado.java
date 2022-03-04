package aula_java_12;

import java.util.Scanner;


public class LeiturasDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo : ");
		String nome = scan.nextLine();
		System.out.println("Seu nome completo é: " + nome);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é : " + primeiroNome);*/
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altura: "); 
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);
		
		if(idade >= 12) {
			System.out.println("voce esta grandinho");
		}
		
		
	
	}

}
