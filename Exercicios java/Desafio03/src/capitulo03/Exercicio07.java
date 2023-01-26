package capitulo03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        /**  EXERCÍCIO 07
         * Faça um programa que leia dois números. Caso o primeiro número seja maior que o segundo número,
         * o programa deve ter como resultado a soma dos dois números. No entanto, caso o primeiro número
         * seja menor que o segundo número, o programa deve fazer a subtração dos números. Utilize o operador
         * ternário para resolver o problema. */
        
        int a, b, res;
        System.out.println("Informe dois números inteiros quaisquer: ");
        a = (int) sc.nextInt();
        b = (int) sc.nextInt();
        res = (a>b ? a+b : (a<b ? a-b : 0));
        if (res == 0) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println(res);
        }
    }
}