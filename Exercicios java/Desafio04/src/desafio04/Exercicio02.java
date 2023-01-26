package desafio04;

import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /** EXERCÍCIO 02
         * Escreva um programa que leia um número inteiro. Se o número lido for positivo, escreva uma mensagem indicando
         * se ele é PAR ou ÍMPAR. Se o número for negativo, escreva a mensagem “NEGATIVO”. */
        
        int x;
        System.out.println("Informe qualquer número inteiro: ");
        x = sc.nextInt();
        String res = (x>=0) ? ((x%2==0) ? x + " é par." : x + " é ímpar.") : x + " é negativo.";
        
        System.out.println(res);
        
        sc.close();
    }
}