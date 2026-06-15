package aula_03_condicionais;

import java.util.Scanner;
public class Exe08 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float saldo = 1000.00f;
        int operacao;
        float valor;

        System.out.println("=== CONTA BANCÁRIA ===");
        System.out.println("1 - Saldo");
        System.out.println("2 - Saque");
        System.out.println("3 - Depósito");

        System.out.println("Escolha a operação:");
        operacao = leia.nextInt();

        switch (operacao) {

            case 1:
                System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
                break;

            case 2:
                System.out.println("Digite o valor do saque:");
                valor = leia.nextFloat();

                if (valor <= saldo) {
                    saldo = saldo - valor;
                    System.out.printf("Saque realizado!\nNovo saldo: R$ %.2f\n", saldo);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
                break;

            case 3:
                System.out.println("Digite o valor do depósito:");
                valor = leia.nextFloat();

                saldo = saldo + valor;

                System.out.printf("Depósito realizado!\nNovo saldo: R$ %.2f\n", saldo);
                break;

            default:
                System.out.println("Operação Inválida!");
        }

        leia.close();
    }
}