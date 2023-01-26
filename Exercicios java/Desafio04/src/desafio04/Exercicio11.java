package desafio04;

import java.util.*;

public class Exercicio11 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /** EXERCÍCIO 11
         * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes
         * intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Se o valor não estiver em nenhum destes
         * intervalos, imprima a mensagem “Fora de intervalo”. */
        
        int num;
        System.out.println("Informe qualquer número inteiro entre 0 e 100: ");
        num = sc.nextInt();
        if (num > 0 && num < 25) {
            System.out.println("[0, 25]");
        } else if (num >= 25 && num < 50) {
            System.out.println("(25, 50]");
        } else if (num >= 50 && num < 75) {
            System.out.println("(50, 75]");
        } else if (num >= 75 && num < 100) {
            System.out.println("(75, 100]");
        } else {
            System.out.println("Fora de intervalo.");
        }
        
        sc.close();
    }
}
        