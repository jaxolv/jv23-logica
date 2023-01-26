package capitulo05;

import java.util.*;

public class Exercicio09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /** EXERCÍCIO 09
         * Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a massa inicial, em gramas,
         * fazer um programa que determine o tempo necessário para que essa massa se torne menor que 0,5 grama. Escreva a
         * massa inicial, a massa final e o tempo calculado em horas, minutos e segundos. */
        
        double massaInicial, massaFinal;
        int segundos = 0;
        int minutos = 0;
        int horas = 0;

        System.out.println("Informe o valor da massa inicial: ");
        massaInicial = sc.nextDouble();
        massaFinal = massaInicial;

        while (massaFinal>0.5) {
          massaFinal /= 2;
          segundos += 50;
        }

        if (segundos > 60) {
          minutos = segundos / 60;
          segundos %= 60;
            if (minutos > 60) {
                horas = minutos / 60;
                minutos -= (horas * 60);
                System.out.printf("%d hora(s), ", horas, minutos, segundos);
            }
            System.out.printf("%d minuto(s) e ", minutos);
        }
        System.out.printf("%d segundo(s).%n", segundos);
        
        sc.close();
    }
}
