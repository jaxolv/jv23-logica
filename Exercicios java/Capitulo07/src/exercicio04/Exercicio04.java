package exercicio04;

/** Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a massa inicial, em gramas,
 * fazer um programa que determine o tempo necessário para que essa massa se torne menor que 0,5 grama. Escreva a massa
 * inicial, a massa final e o tempo calculado em horas e minutos. */

import java.util.Scanner;
import java.util.Locale;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Massa m = new Massa();
        
        System.out.println("Informe o valor da massa inicial: ");
        m.massaInicial = sc.nextDouble();
        System.out.print("O tempo necessário para a massa valer menos que 0,5g é de ");
        m.tempo();
    }
}
