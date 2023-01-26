package exercicio02;

import java.util.Locale;
import java.util.Scanner;

/* Crie um programa que contenha duas classes "Quadrado" e "Triangulo". Estas classes devem possuir suas principais características,
   como: nome, lado, altura, base e etc. Faça um contrato através da interface e para tal use os seguintes métodos:
 * public abstract void getNomeFigura();
 * public abstract void getArea();
 * public abstract void getPerimetro();
 * Além da interface citada acima, construa as classes apresentadas abaixo:
   NOME: Quadrado; ATRIBUTOS: - lado; MÉTODOS: + getNomeFigura(), + getArea(), + getPerimetro();
   NOME: Triângulo; ATRIBUTOS: - base, - altura, - ladoA, - ladoB, - ladoC; MÉTODOS: + getNomeFigura(), + getArea(), + getPerimetro();
 * Acrescente todos os getters e setters e qualquer outra informação que achar relevante nas respectivas classes.
 * Por fim, instancie os objetos "quadrado" e "triangulo". Apresente o resultado. */

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a medida dos lados do quadrado: ");
        Quadrado quad = new Quadrado(sc.nextDouble());
        System.out.printf("A figura é um %s de lado %.2f, área %.2f, perímetro %.2f%n",
                quad.getNomeFigura(), quad.getLado(), quad.getArea(), quad.getPerimetro());
        System.out.println("Informe, respectivamente, os lados do triângulo, sua altura e sua base: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double h = sc.nextDouble();
        double B = sc.nextDouble();
        Triangulo tri = new Triangulo(B, h, a, b, c);
        System.out.printf("A figura é um %s de lados %.2f, %.2f e %.2f, altura %.2f, base %.2f, área de %.2f"
                + " e perímetro %.2f%n", tri.getNomeFigura(), tri.getLadoA(), tri.getLadoB(), tri.getLadoC(),
                 tri.getAltura(), tri.getBase(), tri.getArea(), tri.getPerimetro());
    }
}
