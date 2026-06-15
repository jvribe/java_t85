package atividadepratica01;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);	
		
		
		float numero1, numero2, resultado;
		int codigo;
		
		System.out.println("Digite o Primeiro Número");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o Segundo Número");
		numero2 = leia.nextFloat();
		
		System.out.println("Digite o código da operação:");

        System.out.println("1 - Soma");

        System.out.println("2 - Subtração");

        System.out.println("3 - Multiplicação");
 
        System.out.println("4 - Divisão");

        codigo = leia.nextInt();
        
        switch(codigo) {
        case 1 :
        	 resultado = numero1 + numero2;

             System.out.printf("Resultado da Soma: %.2f\n", resultado);

             break;
        case 2 :
       	 resultado = numero1 - numero2;

            System.out.printf("Resultado da Subtração: %.2f\n", resultado);

            break;
        case 3 :
          	 resultado = numero1 * numero2;

               System.out.printf("Resultado da Multiplicação: %.2f\n", resultado);

               break;  
        case 4 :
        	if (numero2 != 0) {

                resultado = numero1 / numero2;

                System.out.printf("Resultado da Divisão: %.2f\n", resultado);

            } else {

                System.out.println("Erro: divisão por zero!");

            }

            break;

        default:

            System.out.println("Operação Inválida!");   
             
        }
		
        leia.close();
				

	}

}