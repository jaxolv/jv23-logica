package exercicio02;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
 * Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
 * sobre o valor em dólar. Crie uma classe Conversor para ser responsável pelos cálculos. */

public class Exercicio02 {    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Conversor conv = new Conversor();
        
        System.out.print("Informe o preço do dólar hoje no Brasil: R$ ");
        conv.valorDolar = sc.nextDouble();
        System.out.print("Informe quantos dólares deseja comprar: US$ ");
        conv.reais = sc.nextDouble();
        conv.conversao();
        System.out.printf("O valor da compra ficará no total de R$ %.2f, incluído IOF.%n", conv.compra());
        sc.close();
    }
}
