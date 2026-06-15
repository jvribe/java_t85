package aula_03_condicionais;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	
	System.out.println("Digite um Número ");
   int a = leia.nextInt();
   
    
    if( a > 0 && a % 2 == 0 ) {
    	System.out.println("O Número é par e positivo!");
    }
    if( a < 0 && a % 2 == 0 ) {
       System.out.println("O Número é par e negativo!");
    }
    if( a > 0 && a % 2 != 0 ) {
    	System.out.println("O Número é ímpar e positivo!");
    }
    if( a < 0 && a % 2 != 0 ) {
       System.out.println("O Número é Ímpar e negativo!");
    }
	leia.close();
  
	}

}
