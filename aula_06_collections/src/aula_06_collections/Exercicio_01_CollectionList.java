package aula_06_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio_01_CollectionList {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<>();

        // Entrada das 5 cores
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a " + i + "ª cor: ");
            cores.add(leia.nextLine());
        }

        // Listar cores na ordem digitada
        System.out.println("\nListar todas as cores:\n");

        for (String cor : cores) {
            System.out.println(cor);
        }

        // Ordenar em ordem crescente
        Collections.sort(cores);

        System.out.println("\nOrdenar as cores:\n");

        for (String cor : cores) {
            System.out.println(cor);
        }

        leia.close();
    }
}