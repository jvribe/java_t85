package atividadepratica01;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		int resposta = 0;
		boolean autorizacao;
		
		System.out.println("Qual o seu nome?");
		nome = leia.next();
		
		System.out.println("Qual a sua idade?");
		idade = leia.nextInt();
		
		if (idade < 18) {
		System.out.println("Possui autorização dos resposáveis? Digite 1 para sim e 0 para não");
		resposta = leia.nextInt();
		}
		autorizacao = (resposta == 1);
	   
		if (idade >= 18) {
			System.out.printf("Acesso liberado para %s!", nome);
			
		 } else if (autorizacao) {

            System.out.printf("Acesso liberado para %s com autorização!", nome);

        } else {

            System.out.printf("Acesso para %s não liberado!", nome);

        }
		
		
		leia.close();

	}

}
