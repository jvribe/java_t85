package aula_03_condicionais;

import java.util.Scanner;
import java.text.Normalizer;

public class Exe04 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String tipo, classe, alimentacao;

        System.out.println("O animal é vertebrado ou invertebrado?");
        tipo = normalizar(leia.next());

        if (tipo.equals("vertebrado")) {

            System.out.println("É ave ou mamifero?");
            classe = normalizar(leia.next());

            if (classe.equals("ave")) {

                System.out.println("É carnivoro ou onivoro?");
                alimentacao = normalizar(leia.next());

                if (alimentacao.equals("carnivoro")) {
                    System.out.println("Animal escolhido: Águia");
                } else {
                    System.out.println("Animal escolhido: Pomba");
                }

            } else { // mamifero

                System.out.println("É onivoro ou herbivoro?");
                alimentacao = normalizar(leia.next());

                if (alimentacao.equals("onivoro")) {
                    System.out.println("Animal escolhido: Homem");
                } else {
                    System.out.println("Animal escolhido: Vaca");
                }
            }

        } else { // invertebrado

            System.out.println("É inseto ou anelideo?");
            classe = normalizar(leia.next());

            if (classe.equals("inseto")) {

                System.out.println("É hematofago ou herbivoro?");
                alimentacao = normalizar(leia.next());

                if (alimentacao.equals("hematofago")) {
                    System.out.println("Animal escolhido: Pulga");
                } else {
                    System.out.println("Animal escolhido: Lagarta");
                }

            } else { // anelideo

                System.out.println("É hematofago ou onivoro?");
                alimentacao = normalizar(leia.next());

                if (alimentacao.equals("hematofago")) {
                    System.out.println("Animal escolhido: Sanguessuga");
                } else {
                    System.out.println("Animal escolhido: Minhoca");
                }
            }
        }

        leia.close();
    }

   
    public static String normalizar(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
                .toLowerCase();
    }
}