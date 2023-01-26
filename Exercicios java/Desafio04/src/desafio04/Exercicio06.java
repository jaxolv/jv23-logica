package desafio04;

import java.util.*;

public class Exercicio06 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /** EXERCÍCIO 06
         * Escreva o algoritmo "Programa Solidário". O doador deve clicar nas opções (mostradas abaixo) para efetuar a sua doação.
         * Imprima o resultado na tela com o valor da doação e uma mensagem de agradecimento. Utilize a estrutura Switch-Case.
         * [1] para doar R$10
         * [2] para doar R$25
         * [3] para doar R$50
         * [4] para doar outros valores
         * [5] para cancelar */
        
        int digito;
        System.out.println("Bem vindo ao Programa Solidário");
        System.out.println("De acordo com as opções abaixo, informe o valor que deseja doar: ");
        System.out.println("[1] para doar R$10\n[2] para doar R$25\n[3] para doar R$50\n[4] para doar outros valores\n[5] para cancelar ");
        digito = sc.nextInt();
        switch (digito) {
            case 1:
                System.out.println("Você doou R$ 10,00.\nMuito obrigado pela sua participação!");
                break;
            case 2:
                System.out.println("Você doou R$ 25,00.\nMuito obrigado pela sua participação!");
                break;
            case 3:
                System.out.println("Você doou R$ 50,00.\nMuito obrigado pela sua participação!");
                break;
            case 4:
                System.out.println("Informe o valor que deseja doar:");
                double doacao = sc.nextDouble();
                System.out.printf("Você doou R$ %.2f%nMuito obrigado pela sua participação!%n", doacao);
                break;
            case 5:
                System.out.println("Seu monstro! D:");
                break;
            default:
                System.out.println("Valor não aceito. Tente novamente.");
        }
        
        sc.close();
    }
}
