package atividadepratica02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio03 {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> produtos = new ArrayList<>();
		ArrayList<Integer> quantidades = new ArrayList<>();

		int opcao;

		do {
			System.out.println("\n***********************************************************");
			System.out.println("                CONTROLE DE ESTOQUE - MENU                 ");
			System.out.println("***********************************************************");
			System.out.println("1 - Adicionar Novo Produto");
			System.out.println("2 - Atualizar Quantidade de um Produto");
			System.out.println("3 - Listar Todos os Produtos");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");

			String opcaoInput = leia.nextLine();
			opcao = opcaoInput.isEmpty() ? -1 : Integer.parseInt(opcaoInput);

			switch (opcao) {
				case 1:
					System.out.println("\n*** ADICIONAR PRODUTOS (Aperte ENTER em branco no Nome para voltar) ***");
					while (true) {
						System.out.print("\nNome do Produto: ");
						String nome = leia.nextLine();

						if (nome.isEmpty()) {
							System.out.println("Voltando ao menu principal...");
							break;
						}

						System.out.print("Quantidade em Estoque: ");
						String qtdInput = leia.nextLine();
						int quantidade = qtdInput.isEmpty() ? 0 : Integer.parseInt(qtdInput);

						produtos.add(nome);
						quantidades.add(quantidade);
						System.out.println("Produto adicionado com sucesso!");
					}
					break;

				case 2:
					if (produtos.isEmpty()) {
						System.out.println("\nO estoque está completamente vazio.");
					} else {
						System.out.println("\n*** ATUALIZAR QUANTIDADE ***");
						System.out.print("Digite o nome exato do produto que deseja atualizar: ");
						String produtoBusca = leia.nextLine();

						boolean encontrado = false;

						for (int contador = 0; contador < produtos.size(); contador++) {
							if (produtos.get(contador).equalsIgnoreCase(produtoBusca)) {
								System.out.printf("Quantidade atual de %s: %d%n", produtos.get(contador), quantidades.get(contador));
								System.out.print("Digite a NOVA quantidade: ");
								
								String novaQtdInput = leia.nextLine();
								int novaQuantidade = novaQtdInput.isEmpty() ? 0 : Integer.parseInt(novaQtdInput);

								quantidades.set(contador, novaQuantidade);
								System.out.println("Quantidade updated com sucesso!");
								encontrado = true;
								break; 
							}
						}

						if (!encontrado) {
							System.out.println("Produto não encontrado no estoque.");
						}
					}

					System.out.print("\nPressione ENTER para continuar...");
					leia.nextLine();
					break;

				case 3:
					if (produtos.isEmpty()) {
						System.out.println("\nNenhum produto cadastrado no estoque até o momento.");
					} else {
						System.out.println("\n***********************************************************");
						System.out.println("                   PRODUTOS EM ESTOQUE                     ");
						System.out.println("***********************************************************");
						
						for (int contador = 0; contador < produtos.size(); contador++) {
							System.out.printf("Produto: %-20s | Quantidade: %d%n", produtos.get(contador), quantidades.get(contador));
						}
						System.out.println("***********************************************************");
					}

					System.out.print("\nPressione ENTER para voltar ao menu principal...");
					leia.nextLine();
					break;

				case 0:
					System.out.println("\nSistema de estoque encerrado.");
					break;

				default:
					System.out.println("\nOpção inválida! Tente novamente.");
					System.out.print("\nPressione ENTER para continuar...");
					leia.nextLine();
					break;
			}

		} while (opcao != 0);

		leia.close();
	}
}