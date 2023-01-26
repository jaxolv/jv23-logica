package capitulo02;
import java.util.*;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
        System.out.println("Informe três valores para A, B e C, respectivamente: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        triangulo = (a*c)/2;
        circulo = 3.14159*(c*c);
        trapezio = ((a+b)*c)/2;
        quadrado = b*b;
        retangulo = a*b;
        System.out.printf("Triângulo: %.3f%nCírculo: %.3f%nTrapézio: %.3f%nQuadrado: %.3f%n"
                + "Retângulo: %.3f%n", triangulo, circulo, trapezio, quadrado, retangulo);
        
        sc.close();
    }
}

