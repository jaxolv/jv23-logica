package exercicio02;

import java.util.Locale;
import java.util.Scanner;

/* Faça um programa para ler os dados de N figuras (N fornecido pelo usuário), e depois mostre as áreas destas
   figuras na mesma ordem em que foram digitadas. Considere o método area() abstrato. Insira no projeto uma estrutura
   de dado organizado enum com o objetivo de classificar em 3 cores.
 * NOME: Forma;     ATRIBUTOS: - cor;               MÉTODOS: + area();
 * NOME: Retangulo; ATRIBUTOS: - largura, - altura;
 * NOME: Circulo;   *ATRIBUTOS: - raio*;
 * <enum>: - BLACK, - RED, - BLUE;
 * Enum no Java São tipos de campos que consistem em um conjunto fixo de constantes (static final), sendo como uma lista
   de valores pré- definidos. Todos os tipos enums implicitamente estendem a classe java.lang.Enum, sendo que o Java não
   suporta herança múltipla, não podendo estender nenhuma outra classe. */

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Retangulo rect = new Retangulo(2.5, 4);
        System.out.printf("A área do retângulo com medidas %.2f em altura e %.2f em largura é de %.2f%n",
                rect.getAltura(), rect.getLargura(), rect.area());
        
        Circulo circ = new Circulo(2);
        System.out.printf("A área do círculo de raio %.2f é de %.2f.%n", circ.getRaio(), circ.area());
    }
}
