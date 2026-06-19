package atividadepratica02;

import java.util.Scanner;

public class Exercicio02 {

	public static Scanner leia = new Scanner(System.in);

	public static float tratarNota(String textoNota) {
		if (textoNota == null || textoNota.trim().isEmpty()) {
			return 0.0f;
		}
		String textoTratado = textoNota.trim().replace(",", ".");
		return Float.parseFloat(textoTratado);
	}

	public static void main(String[] args) {

		String[][] cadastro = new String[0][3];
		float somaNotas = 0.0f; 
		
		System.out.println("***** CADASTRO DE ALUNOS (Pressione ENTER em branco no Nome para parar) ****");
		
		while (true) {
			System.out.println("\n--- " + (cadastro.length + 1) + "º Aluno ---");
			System.out.print("Nome: ");
			String nome = leia.nextLine();
			
			if (nome.isEmpty()) {
				System.out.println("\nCadastro finalizado pelo usuário.");
				break;
			}
			
			System.out.print("Idade: ");
			String idade = leia.nextLine();
			
			System.out.print("Nota Final: ");
			String nota = leia.nextLine();
			
			String[][] novaMatriz = new String[cadastro.length + 1][3];
			
			for (int i = 0; i < cadastro.length; i++) {
				novaMatriz[i][0] = cadastro[i][0];
				novaMatriz[i][1] = cadastro[i][1];
				novaMatriz[i][2] = cadastro[i][2];
			}
			
			int ultimaLinha = novaMatriz.length - 1;
			novaMatriz[ultimaLinha][0] = nome;
			novaMatriz[ultimaLinha][1] = idade.isEmpty() ? "0" : idade;
			novaMatriz[ultimaLinha][2] = nota.isEmpty() ? "0.0" : nota;
			
			somaNotas += tratarNota(novaMatriz[ultimaLinha][2]);
			
			cadastro = novaMatriz;
		}
		
		if (cadastro.length > 0) {
			
			System.out.println("\n***********************************************************");
			System.out.println("                   LISTA DE ALUNOS CADASTRADOS             ");
			System.out.println("***********************************************************");
			System.out.printf("%n%-15s%-10s%-10s%n", "Nome", "Idade", "Nota Final");
			
			for (int linha = 0; linha < cadastro.length; linha++) {
				System.out.printf("%-15s", cadastro[linha][0]); // Nome
				System.out.printf("%-10s", cadastro[linha][1]); // Idade
				
				
				float notaFormatada = tratarNota(cadastro[linha][2]);
				System.out.printf("%-10.1f%n", notaFormatada);
			}
			
			float mediaGeral = somaNotas / cadastro.length;
			
			System.out.println("***********************************************************");
			System.out.printf("Média Geral das Notas: %.2f%n", mediaGeral);
			System.out.println("***********************************************************");
		} else {
			System.out.println("\nNenhum aluno foi cadastrado.");
		}
		
		leia.close();
	} 
}