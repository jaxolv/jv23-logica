package capitulo06;

import java.util.Scanner;

public class Exercicio04 {
    /** EXERCÍCIO 4
     * Crie um programa que verifica se o número é par ou ímpar. A verificação de ver ser feita por
     * um método também criado. */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe qualquer número inteiro: ");
        int num = sc.nextInt();
        System.out.printf("O número %d é %s.%n", num, parOuImpar(num));
    }
    
    public static String parOuImpar(int numero) {
        if (numero == 0) {
            return "nulo";
        }
        
        numero %= 2;
        
        switch (numero) {
            case 0: return "par";
            case 1: return "ímpar";
            default: return "";
        }
    }
}