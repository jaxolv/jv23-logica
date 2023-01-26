package capitulo03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        /** EXERCÍCIO 06
         * Escreva um programa que leia um número inteiro e através do operador ternário decida se o número
         * é maior ou menor que 10. Caso seja menor que 10, que o operador ternário possa também decidir se
         * este é maior ou menor que 5. Imprima a seguinte mensagem:
         * Numero é maior que 10;
         * Numero é maior que 5;
         * Numero é menor que 5. */
        
        int num;
        String resultado;
        System.out.println("Informe um número inteiro qualquer: ");
        num = sc.nextInt();
        resultado = (num>10 ? " é maior que 10." : (num<5 ? " é menor que 5." : " é maior que 5."));
        System.out.println(num + resultado);
    }
}