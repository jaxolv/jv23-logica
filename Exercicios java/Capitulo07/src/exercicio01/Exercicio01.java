package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /** Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas),
         * conforme diagrama ao lado. Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos
         * dois triângulos possui a maior área. A fórmula para calcular a área de um triângulo a partir das medidas
         * de seus lados a, b e c é a seguinte fórmula de Heron. Use os conceitos de classes e objetos.
         * p (semiperímetro) = (a+b+c)/2;
         * S = Math.sqrt(p*(p-a)*(p-b)*(p-c)); */
        
        Triangulo tr1 = new Triangulo();
        System.out.println("Informe os três lados do triângulo 1: ");
        tr1.a = sc.nextDouble();
        tr1.b = sc.nextDouble();
        tr1.c = sc.nextDouble();
        tr1.verificacao();
        System.out.println("");
        
        Triangulo tr2 = new Triangulo();
        System.out.println("Informe os três lados do triângulo 2: ");
        tr2.a = sc.nextDouble();
        tr2.b = sc.nextDouble();
        tr2.c = sc.nextDouble();
        tr2.verificacao();
        System.out.println("");
        
        sc.close();
    }
}
