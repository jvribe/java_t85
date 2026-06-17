package aula_05_array;

import java.util.Scanner;

public class ExercicioMatrizes03 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        
        System.out.println("Digite 9 números: ");
        
        // leitura da matriz
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                matriz[linha][coluna] = leia.nextInt();
            }
        }

        // diagonal principal
        System.out.println("Elementos da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
            somaPrincipal += matriz[i][i];
        }

        System.out.println();

        // diagonal secundária
        System.out.println("Elementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
            somaSecundaria += matriz[i][2 - i];
        }

        System.out.println();

        // soma principal
        System.out.println("Soma dos Elementos da Diagonal Principal:");
        System.out.println(somaPrincipal);

        // soma secundária
        System.out.println("Soma dos Elementos da Diagonal Secundária:");
        System.out.println(somaSecundaria);

        leia.close();
    }
}