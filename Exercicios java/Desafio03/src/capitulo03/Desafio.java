package capitulo03;

import java.util.*;
        /** DESAFIO
         * Escreva o código que resolva a equação:
         * a*(x*x) + b*x + c == 0;
         * delta = (b*b) - 4*a*c;
         * x1 = (-b + Math.sqrt(delta)) / 2*a
         * x2 = (-b - Math.sqrt(delta)) / 2*a
         * OBS.: Utilize a classe Math. */

public class Desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        
        System.out.printf("BHÁSKARA:%nInforme os valores para realizarmos a equação de 2˚ grau:%n");
        System.out.printf("a = ");
        double a = sc.nextDouble();
        System.out.printf("b = ");
        double b = sc.nextDouble();
        System.out.printf("c = ");
        double c = sc.nextDouble();
        System.out.printf("%.1fxˆ2 + %.1fx + %.1f = 0%n", a, b, c);
        double delta = Math.pow(b, 2) - 4*a*c;
        System.out.printf("∆ = %.1f%n", delta);
        
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / 2*a;
            double x2 = (-b - Math.sqrt(delta)) / 2*a;
            System.out.printf("x\' = %.2f, x\'\' = %.2f%n", x1, x2);
        } else if (delta == 0) {
            double x = -b / 2*a;
            System.out.printf("x = %.2f%n", x);
        } else {
            System.out.println("Não há raízes.");
        }
        
        sc.close();
    }
}
