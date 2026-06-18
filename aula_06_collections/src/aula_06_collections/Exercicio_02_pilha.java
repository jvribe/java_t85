package aula_06_collections;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio_02_pilha {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();

        int opcao;

        do {

            System.out.println("\n***********************************");
            System.out.println("      1 - Adicionar livro na pilha");
            System.out.println("      2 - Listar todos os livros");
            System.out.println("      3 - Retirar livro da pilha");
            System.out.println("      0 - Sair");
            System.out.println("***********************************");
            System.out.print("Entre com a opção desejada: ");

            opcao = leia.nextInt();
            leia.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String livro = leia.nextLine();

                    pilha.push(livro);

                    System.out.println("\nLivro adicionado!");
                    break;

                case 2:
                    System.out.println("\nLista de livros na pilha:");

                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        for (String item : pilha) {
                            System.out.println(item);
                        }
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA pilha está vazia!");
                    } else {
                        String livroRetirado = pilha.pop();

                        System.out.println("\nLivro retirado: " + livroRetirado);
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma finalizado!");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }

        } while (opcao != 0);

        leia.close();
    }
}