package desafio_capgmini;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class questao1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double resultado;
		float numeros;

		System.out.println("Digite uma quantidade ímpar de elementos da lista: ");
		int lista = scan.nextInt();

		while (lista % 2 == 0) {

			System.out.println("Digite uma quantidade ímpar");

			lista = scan.nextInt();

		}

		int[] vetor = new int[lista];

		for (int i = 0; i < lista; i++) {
			System.out.println("Digite o próximo númuero: \n");
			vetor[i] = scan.nextInt();

		}

		Arrays.sort(vetor);
		System.out.println(Arrays.toString(vetor));
		int posicaoNumeros = (vetor.length + 1) / 2;
		resultado = posicaoNumeros;
		System.out.println("A mediana é : " + vetor[(int) resultado - 1]);

	}

}
