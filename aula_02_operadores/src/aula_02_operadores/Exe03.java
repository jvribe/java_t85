package aula_02_operadores;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, n4, n5;
		
		System.out.println("*** Calculo de Salário de Funcionário ***");
		
		System.out.print("Digite o Sálario Bruto do Funcionário: ");
		n1 = leia.nextFloat();
		
		System.out.print("Digite o Valor do Adcional Noturno: ");
		n2 = leia.nextFloat();
		
		System.out.print("Digite o Valor Base das Horas Extras: ");
		n3 = leia.nextFloat();
		
		System.out.print("Quantas Horas Extras o Funcionário Fez? ");
		n4 = leia.nextFloat();
		
		System.out.print("Digite o Valor dos Descontos do Funcionário: ");
		n5 = leia.nextFloat();
		
		System.out.printf("\nSálario Líquido: %.2f + %.2f + (%.2f x %.0f) - %.2f = R$ %.2f ", 
				n1, n2, n3, n4, n5, n1 + n2 + (n3*n4) - n5 );
		
		leia.close();
	}

}
