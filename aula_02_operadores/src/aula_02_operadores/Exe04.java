package aula_02_operadores;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in)	;
	float n1, n2, n3, n4;
	
	System.out.print("Digite Primeiro Número: ");
	n1 = leia.nextFloat();
	System.out.print("Digite Segundo Número: ");
	n2 = leia.nextFloat();
	System.out.print("Digite Terceiro Número: ");
	n3 = leia.nextFloat();
	System.out.print("Digite Quarto Número: ");
	n4 = leia.nextFloat();
	
	System.out.printf("\n (%.1f x %.1f) - (%.1f * %.1f) = %.1f ", 
			n1, n2, n3, n4, (n1*n2) - (n3*n4) );
	
	
	leia.close();
	
	}

}
