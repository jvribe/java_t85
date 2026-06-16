package aula_04_repeticoes;

import java.util.Scanner;

public class ExercicioDoWhile05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;

		int soma = 0;

		do {

			System.out.print("Digite um número (0 para sair): ");

			numero = leia.nextInt();

			if (numero > 0) {

				soma += numero;

			}

		} while (numero != 0);

		System.out.println("Soma dos números positivos: " + soma);

		leia.close();

	}

}
