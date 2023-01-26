package desafio04;

import java.util.*;

public class Exercicio10 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /** EXERCÍCIO 10
         * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
         * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. Imprima uma
         * mensagem com o resultado. */
        
        int comeco, fim;
        System.out.println("Informe a hora do começo do jogo: ");
        comeco = sc.nextInt();
        System.out.println("Informe a hora do fim do jogo: ");
        fim = sc.nextInt();
        if (comeco < fim) {
            System.out.println(fim - comeco + "h de duração.");
        } else if (comeco == fim) {
            System.out.println("24h de duração.");
        } else {
            System.out.println(fim+24 - comeco + "h de duração.");
        }
        
        sc.close();
    }
}