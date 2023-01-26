package desafio04;

import java.util.*;

public class Exercicio05 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /** EXERCÍCIO 05
         * Suponha que a empresa "Google" decidiu conceder um aumento de salários a seus funcionários de acordo com a tabela ao lado.
         * Escreva um algoritmo que lê, para cada funcionário, o seu nome e o seu salário atual. Após receber estes dados, o algoritmo
         * calcula o novo salário e escreve na tela as seguintes informações:
         * 0-3: 20%;
         * 4-6: 15%;
         * 7-9: 12%;
         * 10-12: 10%;
         * 12-15: 7%;
         * >16: 0%; */
        
        double atual, novo;
        int percentual;
        System.out.println("Informe o salário do funcionário: ");
        atual = sc.nextDouble();
        novo = atual;
        if (0 < atual && atual < 4000) {
            percentual = 20;
        } else if (4000 <= atual && atual < 7000) {
            percentual = 15;
        } else if (7000 <= atual && atual < 10000) {
            percentual = 12;
        } else if (10000 <= atual && atual < 12000) {
            percentual = 10;
        } else if (12000 <= atual && atual < 16000) {
            percentual = 7;
        } else {
            percentual = 0;
        }
        
        novo += novo*((double) percentual/100);
        
        System.out.printf("Aumento de %d%% | Salário atual: R$ %.2f | Novo salário: R$ %.2f%n", percentual, atual, novo);
        
        
        sc.close();
    }
}