package desafio04;

import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /** EXERCÍCIO 01
         * Crie um algoritmo que lê um dado número e decida se ele é par ou ímpar. Imprima o resultado. */
        
        int x;
        System.out.println("Informe qualquer número inteiro: ");
        x = sc.nextInt();
        String res = (x%2==0) ? x + " é par." : x + " é ímpar.";
        
        System.out.println(res);
        
        sc.close();
    }
}