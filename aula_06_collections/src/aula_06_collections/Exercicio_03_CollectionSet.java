package aula_06_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_03_CollectionSet {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Set<Integer> numeros = new HashSet<>();

        // Entrada de 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numeros.add(leia.nextInt());
        }

        // Listagem utilizando Iterator
        System.out.println("\nListar dados do Set:");

        Iterator<Integer> iterator = numeros.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        leia.close();
    }
}