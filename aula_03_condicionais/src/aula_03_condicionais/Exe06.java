package aula_03_condicionais;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome;
		float salario;
		int cargo;
		
		System.out.println("Digite o seu nome:");
		nome = leia.next();
		
		System.out.println("****************************************");
		System.out.println("             Código do Cargo            ");
		System.out.println("****************************************");
		System.out.println("                                        ");
		System.out.println("       1 - Gerente                      ");
		System.out.println("       2 - Vendendor                    ");
		System.out.println("       3 - Supervisor                   ");
		System.out.println("       4 - Motorista                    ");
		System.out.println("       5 - Estoquista                   ");
		System.out.println("       6 - Técnico de TI                ");
		System.out.println("                                        ");
		System.out.println("****************************************");

		
		System.out.println("Escolha o Código do Seu Cargo:");
	    cargo = leia.nextInt();
		
	    System.out.println("Digite seu Salário: ");
	    salario = leia.nextFloat();
	  
	    System.out.printf("Nome: %s\n", nome);

	    switch(cargo) {
	    case 1:
	    	System.out.printf("Valor do novo Salário: = R$ %.2f", (salario + salario* 0.10));
	    break;
	    case 2:
	    	System.out.printf("Valor do novo Salário: = R$ %.2f", (salario + salario* 0.07));
		break;
	    case 3:
	    	System.out.printf("Valor do novo Salário: = R$ %.2f", (salario + salario* 0.09));
		break;
	    case 4:
	    	System.out.printf("Valor do novo Salário: = R$ %.2f", (salario + salario* 0.06));
		break;
	    case 5:
	    	System.out.printf("Valor do novo Salário: = R$ %.2f", (salario + salario* 0.05));
		break;
	    case 6:
	    	System.out.printf("Valor do novo Salário: = R$ %.2f", (salario + salario* 0.08));
		break;
		default:
			System.out.println("Opção Inválida!");
		
	    }
		
		
		leia.close();
	}

}
