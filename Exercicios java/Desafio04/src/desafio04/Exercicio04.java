package desafio04;

import java.util.*;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /** EXERCÍCIO 04    
         * Escreva um Algoritmo que calcule a média de um aluno numa dada disciplina e imprima o resultado. Regra: Durante o semestre
         * o aluno faz 3 avaliações com notas de 0 a 10. É considerado aprovado, o aluno que consegue nota igual ou superior a 7.
         * Se este ficar com nota menor que 7 e maior ou igual a 5, será considerado de recuperação. No entanto, se a nota for abaixo
         * de 5, o aluno será considerado reprovado e deverá repetir o semestre. */
        
        double nota;
        System.out.println("Informe a primeira nota do aluno: ");
        nota = sc.nextDouble();
        System.out.println("Informe a segunda nota do aluno: ");
        nota += sc.nextDouble();
        System.out.println("Informe a terceira nota do aluno: ");
        nota += sc.nextDouble();
        nota /= 3;
        System.out.println("A média do aluno foi: " + nota);
        
        sc.close();
    }
}
