package aula_03_condicionais;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		int resposta;
		boolean primeiraDoacao;
		
		System.out.println("Qual o seu nome?");
		nome = leia.next();
		
		System.out.println("Qual a sua idade?");
		idade = leia.nextInt();
		
		System.out.println("É a sua primeira vez doando Sangue? Digite 1 para sim e 0 para não");
		resposta = leia.nextInt();

		primeiraDoacao = (resposta == 1);
	   
		if (idade < 18 || idade > 69) {
			System.out.printf(" Nome: %s\n não está apto para doar sangue!", nome);
			
		} else if (idade >= 60 && idade <= 69 && primeiraDoacao) {
			System.out.printf(" Nome: %s\n não está apto para doar sangue!", nome);
	} else {
		System.out.printf("Nome: %s - Está apto para doar sangue!\n", nome);
}
			
		
		
		leia.close();

	}

}
