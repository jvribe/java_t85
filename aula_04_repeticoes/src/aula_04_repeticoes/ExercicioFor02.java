package aula_04_repeticoes;

import java.util.Scanner;

public class ExercicioFor02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int [] numeros = new int [10];
		
		int pares = 0, impares = 0;
		
		for (int contador = 0; contador < 10; contador++) {
			System.out.print("Digite um número: ");
			numeros[contador] = leia.nextInt();
		}
		
		for (int contador = 0; contador < 10; contador++) { 
			if (numeros[contador] % 2 == 0) { pares++; }
			else { impares++;
					}
		}
		 System.out.println("Pares: " + pares);

	     System.out.println("Ímpares: " + impares);
	     
	     leia.close();
		
	}

}
