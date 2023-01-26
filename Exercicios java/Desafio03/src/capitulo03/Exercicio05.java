package capitulo03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        /**
         * EXERCÍCIO 05
         * Escreva um algoritmo que leia três lados quaisquer. Identifique se esses lados podem formar um triângulo.
         * Caso os lados formem um triângulo, identifique se o triângulo é equilátero, escaleno ou isóceles.
         * Regra: Suponha os lados a, b e c. É triangulo somente se a condição for satisfeita:
         * (a+b)>c e (a+c)>b e (b+c)>a
         * Equilátero: todos os lados iguais.
         * Escaleno: todos os lados diferentes.
         * Isóceles: dois lados são iguais. */
        
        int a, b, c;
        System.out.println("Informe a medida dos três lados do triângulo: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            if (a == b && a == c) {
                System.out.println("É um triânfgulo equilátero.");
            } else if (a != b && a != c && b != c) {
                System.out.println("É um triânfgulo escaleno.");
            } else if ((a == b && a != c) || (a == c && a != b) || (c == b && b != a)) {
                System.out.println("É um triânfgulo isóceles.");
            }
        } else {
            System.out.println("Não é um triângulo.");
        }
    }
}