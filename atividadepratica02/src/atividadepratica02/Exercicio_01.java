package atividadepratica02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		ArrayList <Integer> listaNumeros = new ArrayList <Integer>();
		Scanner leia = new Scanner(System.in);

		
		
		for (int contador = 0; contador < 5; contador++) {
			System.out.print("Digite o " + (contador + 1) + "º número: ");
			Integer numero = leia.nextInt();
			listaNumeros.add(numero);
		}
		
		System.out.println("\nNúmeros adicioados com Sucesso! ");
		System.out.println("Entradas: " + listaNumeros);
		
		double soma = 0;
		for (Integer numero : listaNumeros) {
			soma += numero;
		}
		
		System.out.printf("\nSoma das entradas: %.0f", soma);
		System.out.printf("\nMédia: %.1f", (soma / listaNumeros.size()));
		
		int maior = listaNumeros.get(0);
		
		for (Integer numero : listaNumeros) { 
			if (numero > maior) {
				maior = numero;
			}
		}
		
		System.out.println("\nMaior Número da lista é: " + maior);
	
leia.close();
	}

}
