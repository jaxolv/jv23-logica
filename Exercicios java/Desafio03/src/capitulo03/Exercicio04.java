package capitulo03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        /**
         * EXERCÍCIO 04
         * Desenvolva o código, utilizando operador de atribuição com módulo, para resolver o seguinte problema:
         * A variável w recebe inicialmente o valor 4. Qual o resto a ser printado, sabendo que a variável será
         * dividida por 3.33? OBS: resolva o problema considerando a variável w como inteiro e como ponto flutuante. */
        
        double w;
        w = sc.nextDouble();
        w %= 3.33;
        System.out.printf("%.2f%n",w);
    }
}