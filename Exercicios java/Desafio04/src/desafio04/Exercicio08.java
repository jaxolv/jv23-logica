package desafio04;

import java.util.*;

public class Exercicio08 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /** EXERCÍCIO 08
         * Escreva um algoritmo que calcule o IMC de uma pessoa e imprima a situação em que ela se encontra.
         * Resolva de duas formas:
         * 1) se..então..senão.
         * 2) escolha..caso.
         * STATUS:
         * <16          Magreza grave;
         * 16 a 17      Magreza moderada;
         * 17 a 18,5    Magreza leve;
         * 18,5 a 25    Saudável;
         * 25 a 30      Sobrepeso;
         * 30 a 35      Obesidade grau I;
         * 35 a 40      Obesidade grau II (severa);
         * >=40         Obesidade grau III (mórbida). */
        
        double imc, peso, altura;
        System.out.println("Informe seu peso: ");
        peso = sc.nextDouble();
        System.out.println("Informe sua altura: ");
        altura = sc.nextDouble();
        imc = peso / Math.pow(altura, 2);
        
        System.out.printf("Seu IMC é de %.2f: ", imc);
        // if...else
        if (imc < 16) {
            System.out.println("Magreza grave.");;
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Magreza moderado.");;
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Magreza leve.");;
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Saudável.");;
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso.");;
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau I.");;
        } else if (imc >= 35 && imc < 40) {
            System.out.println("obesidade severa.");;
        } else {
            System.out.println("Obesidade mórbida.");;
        }
        
        // não sei como fazer funcionar esse mesmo exercício com switch-case
        
        sc.close();
    }
}