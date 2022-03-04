package desafio_capgmini;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números inteiros você quer digitar?? ");
		int numeros = sc.nextInt();

		int[] vetor = new int[numeros];
		int contador = 0;

		for (int i = 0; i < numeros; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		System.out.println("Digite o valor de x: ");
		int valorx = sc.nextInt();

		for (int j = 0; j < vetor.length; j++) {

			for (int z = 0; z < vetor.length; z++) {

				if ((vetor[j] - vetor[z]) == valorx) {
					contador++;

				}

			}

		}
		System.out.println("O valor dos resultados pares é:" + contador);
	}

}