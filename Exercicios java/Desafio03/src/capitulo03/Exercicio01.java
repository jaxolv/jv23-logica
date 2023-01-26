package capitulo03;

import java.util.*;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /**
         * EXERCÍCIO 01
         * Desenvolva o código, utilizando operador de atribuição com multiplicação, para resolver o seguinte problema:
         * A variável x recebe inicialmente o valor 4 e deve ser printada com o valor final 20.
         * OBS: as variáveis devem ser lidas pelo programa. */
         
        int x;
        x = (int) sc.nextInt();
        x *= 5;
        System.out.println(x);
         
        
        
        sc.close();
    }
}
