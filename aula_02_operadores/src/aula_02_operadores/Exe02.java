package aula_02_operadores;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		float nota1, nota2, nota3, nota4;
		
		System.out.println("*** Cálculo da Média do Aluno ***");
		
		System.out.print("Digite a Nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Digite a Nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Digite a Nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.print("Digite a Nota 4: ");
		nota4 = leia.nextFloat();
		
		System.out.printf("\nMédia do Aluno: (%.1f + %.1f + %.1f +%.1f)/4 = %.1f ", 
				nota1, nota2, nota3, nota4, (nota1 + nota2 + nota3 + nota4)/4);

		
		
		leia.close();
	}

}
