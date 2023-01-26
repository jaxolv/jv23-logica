package capitulo03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        /**
         * EXERCÍCIO 02
         * Desenvolva o código, utilizando operador de atribuição com divisão, para resolver o seguinte problema:
         * A variável y recebe inicialmente o valor 5 e deve ser dividido pelo valor 3.
         * Qual o resultado printado? OBS: as variáveis devem ser lidas pelo programa. */
        
        double y; y = (double) sc.nextDouble(); y /= 3;
        System.out.println(y);
    }
}
