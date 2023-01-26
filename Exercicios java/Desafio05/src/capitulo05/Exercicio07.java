package capitulo05;

import java.util.*;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        /** EXERCÍCIO 07
         * Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que: a) esse funcionário foi
         * contratado em 2010, com salário inicial de R$2.000,00; b) Em 2011, ele recebeu aumento de 1,5%, sobre o seu
         * salário inicial; c) A partir de 2012 (inclusive), os aumentos salariais sempre corresponderam ao dobro do
         * percentual do ano anterior. Faça um programa que determine o salário desse funcionário dos anos de 2010 à 2022.
         * Apresente todos os valores. */
        
        double salario = 2000;
        double percentual = 1.50 / 100;
        int ano = 2010;

        for (int i = 2010; i <= 2022; i++) {
            System.out.printf("Em %d este funcionário ganhava R$ %.2f.%n", i, salario);
            salario += salario * percentual;
            percentual *= 2;
        }
    }
}
