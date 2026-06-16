package aula_04_repeticoes;

import java.util.Scanner;

public class ExercicoWhile03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		   int idade, menores21 = 0, maiores50 = 0;

	        System.out.print("Digite a idade (negativa para sair): ");

	        idade = leia.nextInt();

	        while (idade >= 0) {

	            if (idade > 50) {

	                maiores50++;

	            }

	            if (idade < 21) {

	                menores21++;

	            }

	            System.out.print("Digite a idade (negativa para sair): ");

	            idade = leia.nextInt();

	        }

	        System.out.printf("Total de pessoas menores de 21 anos: %d\n", menores21);

	        System.out.printf("Total de pessoas maiores de 50 anos: %d\n", maiores50);

	        leia.close();
		}
		

	}


