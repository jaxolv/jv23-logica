package exercicio05;

import java.util.Locale;
import java.util.Scanner;

/** Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua área,
 * perímetro e diagonal. Usar uma classe como mostrado no projeto abaixo:
 * NOME: RETANGULO
 * PARÄMETROS: largura, altura;
 * MÉTODOS: Area(), Perimetro(), Diagonal(); */

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Retangulo rect = new Retangulo();
        
        System.out.print("Informe a largura do retângulo: ");
        rect.largura = sc.nextDouble();
        System.out.print("Informe a alturado retângulo: ");
        rect.altura = sc.nextDouble();
        rect.imprimaResultados();
    }
}
