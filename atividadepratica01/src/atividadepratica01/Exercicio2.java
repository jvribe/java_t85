package atividadepratica01;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		
	String nome;	
	float notaFinal = 0.0f;
	
	
	System.out.println("Digite o seu nome:");
	nome = leia.next();
	
		System.out.println("Digite a nota final do aluno:");
		notaFinal = leia.nextFloat();
		
		
	    System.out.printf("Nome: %s\n", nome);

		if(notaFinal >= 7) {
			System.out.println("Aluno Aprovado!");
		} else if (notaFinal >=5 && notaFinal <7) {
			System.out.println("Aluno de Recuperação!");
		} else {
			System.out.println("Aluno Reprovado!");
		}

		leia.close();
	}

}
