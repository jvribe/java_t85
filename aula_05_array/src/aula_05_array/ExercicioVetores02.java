package aula_05_array;

import java.util.Scanner;

public class ExercicioVetores02 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] numero = new int[10];

        int soma = 0;

        double media;

        // Leitura dos 10 números
        
        System.out.println("Digite 10 números:");

        for (int contador = 0; contador < 10; contador++) {

            numero[contador] = leia.nextInt();

            soma += numero[contador];

        }

        // Elementos nos índices ímpares

        System.out.println("Elementos nos índices ímpares:");

        for (int contador = 0; contador < 10; contador++) {

            if (contador % 2 != 0) {

                System.out.print(numero[contador] + " ");

            }

        }

        System.out.println();

        // Elementos pares

        System.out.println("Elementos pares:");

        for (int contador = 0; contador < 10; contador++) {

            if (numero[contador] % 2 == 0) {

                System.out.print(numero[contador] + " ");

            }

        }

        // Soma e média

        media = soma / 10.0;

        System.out.println();

        System.out.println("Soma: " + soma);

        System.out.printf("Média: %.2f%n", media);

        leia.close();

    }

}