package desafio04;

import java.util.*;

public class Exercicio09 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /** EXERCÍCIO 09
         * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou
         * "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder
         * ser digitados em ordem crescente ou decrescente. */
        
        int a, b;
        String res;
        System.out.println("Informe dois números inteiros abaixo: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a >= b) {
            res = a % b == 0 ? "São múltiplos." : "Não são múltiplos.";
        } else {
            res = b % a == 0 ? "São múltiplos." : "Não são múltiplos.";
        }
        
        System.out.println(res);
        
        sc.close();
    }
}