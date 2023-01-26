package exercicio03;

/** Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe- se que: a) esse funcionário foi contratado
 * em 2016, com salário inicial de R$2.000,00; b) Em 2017, ele recebeu aumento de 1,5%, sobre o seu salário inicial;
 * c) A partir de 2018 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
 * Faça um programa que determine o salário desse funcionário dos anos de 2016 ao ano atual(2022). Apresente todos os valores. */

import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Aumento aum = new Aumento();
        Calendar cal = Calendar.getInstance();
        
        System.out.println("Informe o ano em que foi iniciado o contrato: ");
        aum.ano = sc.nextInt();
        aum.atual = cal.get(Calendar.YEAR);
        System.out.println("Informe o salário que o funcionário começará a ganhar no princípio do contrato: ");
        aum.salario = sc.nextDouble();
        System.out.println("Informe o percentual do aumento a partir do ano seguinte: ");
        aum.percentual = sc.nextDouble();
        aum.aumentoProgressivo();
        
        sc.close();
    }
}
