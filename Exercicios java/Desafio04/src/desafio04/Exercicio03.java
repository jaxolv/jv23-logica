package desafio04;

import java.util.*;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /** EXERCÍCIO 03
         * Faça um algoritmo que receba o valor do salário de uma pessoa e o valor de um financiamento pretendido. Caso o
         * financiamento seja menor ou igual a 5 vezes o salário da pessoa, o algoritmo deverá escrever "Financiamento Concedido";
         * senão, ele deverá escrever "Financiamento Negado". Independente de conceder ou não o financiamento, o algoritmo escreverá
         * depois a frase "Obrigado por nos consultar". */
        
        double salario, financiamento;
        System.out.println("Informe o valor do seu salário: ");
        salario = sc.nextDouble();
        System.out.println("Informe o valor do financiamento que deseja fazer: ");
        financiamento = sc.nextDouble();
        
        String res = (financiamento >= 5 * salario) ? "Financiamento negado." : "Financiamento concedido.";
        System.out.printf("%s%nObrigado por nos consultar.%n", res);
        
        sc.close();
    }
}