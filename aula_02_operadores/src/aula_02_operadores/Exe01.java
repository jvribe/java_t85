package aula_02_operadores;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		float numero1, numero2;
		
		System.out.println("*** Calculo de Salário de Funcionário ***");
		
		System.out.print("Digite o Sálario do Funcionário: ");
		numero1 = leia.nextFloat();
		
		System.out.print("Digite o Abono do Funcionário: ");
		numero2 = leia.nextFloat();
		
		System.out.printf("\nNovo Sálario: %.2f + %.2f = %.2f ", numero1, numero2, numero1 + numero2);
		
		leia.close();
		
	}

}
