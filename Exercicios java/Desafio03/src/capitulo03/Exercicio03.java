package capitulo03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        /**
         * EXERCÍCIO 03
         * A) Desenvolva o código, utilizando operador de atribuição com divisão, para resolver o seguinte problema:
         * A variável y recebe inicialmente o valor 5 (valor flutuante) e deve ser dividido pelo valor 3.0.
         * Qual o resultado printado? B) Resolva o mesmo problema com a variável y sendo um valor inteiro. */
   
        double y;
        y = (double) sc.nextDouble();
        y /= 3;
        System.out.println(y);
        
        int x;
        x = sc.nextInt();
        x /= 3; System.out.println(x);
    }
}