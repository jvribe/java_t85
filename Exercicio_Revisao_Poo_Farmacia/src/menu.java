import java.util.InputMismatchException;
import java.util.Scanner;

import model.Cosmetico;
import model.Medicamento;

public class menu {
    
	private static final Scanner leia = new Scanner(System.in).useLocale(java.util.Locale.forLanguageTag("pt-BR"));
    private static final Controller.Produto_Controller Produto_Controller = new Controller.Produto_Controller();

    public static void main(String[] args) {

        int opcao;
        
        while (true) {
            System.out.println("******************************************************");
            System.out.println("************ FARMA AURA SIX SEVEN MEDS ***************");
            System.out.println("******************************************************");
            System.out.println("**** _________  1 - Cadastrar Produtos  _________ ****");
            System.out.println("**** _________  2 - Listar Produtos     _________ ****");
            System.out.println("**** _________  3 - Buscar Produto      _________ ****");
            System.out.println("**** _________    4 - Atualizar         _________ ****");
            System.out.println("**** _________       5 - Excluir        _________ ****");
            System.out.println("**** _________        0 - Sair          _________ ****");
            System.out.println("******************************************************");
            System.out.println("******************************************************");

            try {
                System.out.print("Digite a opção desejada: ");
                opcao = leia.nextInt();
                leia.nextLine(); // Limpa o buffer
            } catch (InputMismatchException e) {
                System.out.println("\nDigite um número válido!");
                leia.nextLine(); // Limpa o buffer do erro
                continue;
            }

            switch (opcao) {
                case 1 -> cadastrarProduto();
                case 2 -> Produto_Controller.listarTodos();
                case 3 -> listarPorID();
                case 4 -> atualizarProduto();
                case 5 -> deletarProduto();
                case 0 -> {
                    System.out.println("\nObrigado por utilizar a Farma Aura Six Seven Meds! Saindo...");
                    System.exit(0);
                }
                default -> System.out.println("\nOpção inválida!");
            }

            System.out.println("\nPressione ENTER para continuar...");
            leia.nextLine();
        }
    }

    // CADASTRAR
    public static void cadastrarProduto() {
        System.out.print("Nome: ");
        String nome = leia.nextLine();

        System.out.print("Tipo (1 - Medicamento / 2 - Cosmético): ");
        int tipo = leia.nextInt();

        System.out.print("Preço: ");
        float preco = leia.nextFloat();
        leia.nextLine();

        int id = Produto_Controller.gerarId();

        switch (tipo) {
            case 1 -> {
                System.out.print("Precisa de receita? (1 - Sim / 2 - Não): ");
                int receita = leia.nextInt();
                leia.nextLine();

                Produto_Controller.cadastrarProduto(
                        new Medicamento(id, nome, tipo, preco, receita)
                );
            }
            case 2 -> {
                System.out.print("Em promoção? (1 - Sim / 2 - Não): ");
                int promocao = leia.nextInt();
                leia.nextLine();

                Produto_Controller.cadastrarProduto(
                        new Cosmetico(id, nome, tipo, preco, promocao)
                );
            }
            default -> System.out.println("Tipo inválido!");
        }
    }

    // LISTAR POR ID
    public static void listarPorID() {
        System.out.print("Digite o ID: ");
        int id = leia.nextInt();
        leia.nextLine();

        Produto_Controller.listarPorID(id);
    }

    // EXCLUIR
    public static void deletarProduto() {
        System.out.print("Digite o ID: ");
        int id = leia.nextInt();
        leia.nextLine();

        Produto_Controller.deletarProduto(id);
    }

    // ATUALIZAR
    public static void atualizarProduto() {
        System.out.print("Digite o ID do produto que deseja atualizar: ");
        int id = leia.nextInt();
        leia.nextLine();

        System.out.print("Novo nome: ");
        String nome = leia.nextLine();

        System.out.print("Novo tipo (1 - Medicamento / 2 - Cosmético): ");
        int tipo = leia.nextInt();

        System.out.print("Novo preço: ");
        float preco = leia.nextFloat();
        leia.nextLine();

        switch (tipo) {
            case 1 -> {
                System.out.print("Precisa de receita? (1 - Sim / 2 - Não): ");
                int receita = leia.nextInt();
                leia.nextLine();

                Produto_Controller.atualizarProduto(
                        new Medicamento(id, nome, tipo, preco, receita)
                );
            }
            case 2 -> {
                System.out.print("Em promoção? (1 - Sim / 2 - Não): ");
                int promocao = leia.nextInt();
                leia.nextLine();

                Produto_Controller.atualizarProduto(
                        new Cosmetico(id, nome, tipo, preco, promocao)
                );
            }
            default -> System.out.println("Tipo inválido!");
        }
    }
}