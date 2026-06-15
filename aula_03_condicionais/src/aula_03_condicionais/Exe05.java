package aula_03_condicionais;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int produto; 
		int quantidade; 
		double valorTotal = 0;
        String nomeProduto = "";
		
		
		System.out.println("****************************************");
		System.out.println("            Código do Produto           ");
		System.out.println("****************************************");
		System.out.println("                                        ");
		System.out.println("       1 - Cachorro Quente              ");
		System.out.println("       2 - X-Salada                     ");
		System.out.println("       3 - X-Bacon                      ");
		System.out.println("       4 - Bauru                        ");
		System.out.println("       5 - Refrigerante                 ");
		System.out.println("       6 - Suco de Laranja              ");
		System.out.println("                                        ");
		System.out.println("****************************************");

		
		System.out.println("Escolha o Código do Seu Produto:");					
	    produto = leia.nextInt();
		
	    System.out.println("Digite a Quantidade do Produto: ");
	    quantidade = leia.nextInt();		
	    
	    switch (produto) {

        case 1:

            nomeProduto = "Cachorro Quente";

            valorTotal = 10.00 * quantidade;

            break;
            
	    case 2:
	    	 nomeProduto = "X-Salada";

	            valorTotal = 15.00 * quantidade;

	            break;
	    case 3:
	    	nomeProduto = "X-Bacon";

            valorTotal = 15.00 * quantidade;
		break;
	    case 4:
	    	nomeProduto = "Bauru";

            valorTotal = 18.00 * quantidade;
		break;
	    case 5:
	    	nomeProduto = "Refrigerante";

            valorTotal = 12.00 * quantidade;
		break;
	    case 6:
	    	nomeProduto = "Suco de Laranja";

            valorTotal = 8.00 * quantidade;
		break;
		default:
			System.out.println("Opção Inválida!");
		
	    }


        System.out.printf("Produto: %s\n", nomeProduto);

        System.out.printf("Valor Total: R$ %.2f\n", valorTotal);
        
        leia.close();

	}

}
