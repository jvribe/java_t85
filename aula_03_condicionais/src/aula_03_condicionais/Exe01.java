package aula_03_condicionais;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	
	System.out.println("Digite Seu Primeiro Número ");
   int a = leia.nextInt();
    System.out.println("Digite Seu Segundo Número ");
    int b = leia.nextInt();
    System.out.println("Digite Seu Terceiro Número ");
    int c = leia.nextInt();
    
    if(a + b > c) {
    	System.out.printf("%d + %d = %d > %d\n", a, b, (a + b), c);
		System.out.println("A soma de A + B é maior que C!");
	} else {
		System.out.printf("%d + %d = %d < %d\n", a, b, (a + b), c);
	    System.out.println("A soma de A + B é menor que C!");
	}
	System.out.println("*** Fim do Programa ***");

	leia.close();
  
	}

}
