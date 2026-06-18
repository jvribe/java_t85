package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_01_fila {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();

        int opcao;

        do {
            System.out.println("\n***********************************");
            System.out.println("      1 - Adicionar cliente na fila");
            System.out.println("      2 - Listar todos os clientes");
            System.out.println("      3 - Retirar cliente da fila");
            System.out.println("      0 - Sair");
            System.out.println("***********************************");
            System.out.print("Entre com a opção desejada: ");

            opcao = leia.nextInt();
            leia.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = leia.nextLine();

                    fila.add(nome);

                    System.out.println("\nCliente Adicionado!");
                    break;

                case 2:
                    System.out.println("\nLista de Clientes na Fila:");

                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("\nA fila está vazia!");
                    } else {
                        String clienteRemovido = fila.poll();

                        System.out.println("\nCliente Chamado: " + clienteRemovido);
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        } while (opcao != 0);

        leia.close();
    }
}