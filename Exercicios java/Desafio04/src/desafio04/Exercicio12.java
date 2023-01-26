package desafio04;

import java.util.*;

public class Exercicio12 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /** EXERCÍCIO 12
         * Faça um programa que lê 4 valores I, A, B e C onde I é um número inteiro e positivo e A, B, e C são quaisquer valores
         * reais. O programa deve escrever os valores lidos e:
         * se I = 1, escrever os três valores A, B e C em ordem crescente;
         * se I = 2, escrever os três valores A, B e C em ordem decrescente;
         * se I = 3, escrever os três valores A, B, e C de forma que o maior valor fique entre os outros dois;
         * se I não for um dos três valores acima, dar uma mensagem indicando este comportamento. */
        
        int i;
        double a, b, c, x, y, z;
        System.out.println("Informe três valores reais a seguir:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        x = y = z = 0;
        System.out.println("Informe um valor para ordenação:\n[1] Para ordem crescente\n[2] Para ordem decrescente\n[3] O maior entre os demais.");
        i = sc.nextInt();
        switch (i) {
            case 1:
                x = a>b && a>c ? a : (b>a && b>c ? b : c);
                z = a<b && a<c ? a : (b<a && b<c ? b : c);
                y = (x==a || x==b) && (z==a || z==b) ? c : ((x==a || x==c) && (z==c || z==a) ? b : a);
                break;
            case 2:
                z = a>b && a>c ? a : (b>a && b>c ? b : c);
                x = a<b && a<c ? a : (b<a && b<c ? b : c);
                y = (x==a || x==b) && (z==a || z==b) ? c : ((x==a || x==c) && (z==c || z==a) ? b : a);
                break;
            case 3:
                y = a>b && a>c ? a : (b>a && b>c ? b : c);
                x = a!=y ? a : (b!=y ? b : c);
                z = a!=y && a!=x ? a : (b!=y && b!=x ? b : c);
                break;
            default:
                System.out.println("Valor inválido.");
        }
        
        System.out.printf("%.2f, %.2f, %.2f%n", z, y, x);
        
        sc.close();
    }
}
