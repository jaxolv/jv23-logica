package capitulo05;

import java.util.*;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /** EXERCÍCIO 08
         * Escreva um algoritmo que leia as notas das duas provas de cada um dos 3 alunos. Leia o nome do aluno e suas
         * respectivas notas. Imprima o resultado dizendo se os alunos foram aprovados(nota >= 6.0) e imprima no final
         * a média da turma. */
        
        String nome;
        double notas, media;
        double soma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Qual o nome do(a) aluno(a)? ");
            nome = sc.next();
            System.out.print("Informe sua primeira nota: ");
            notas = sc.nextDouble();
            media = notas;
            System.out.print("Informe sua segunda nota: ");
            notas = sc.nextDouble();
            media += notas;
            System.out.print("Informe sua terceira nota: ");
            notas = sc.nextDouble();
            media += notas;
            media /= 3;
            soma += media;
            System.out.printf("%s tirou %.2f na média e ", nome, media);
            String res = (media>=6) ? "foi aprovado(a)." : "não foi aprovado(a).";
            System.out.println(res + "\n************************************");
        }
        
        System.out.printf("A média de toda a turma foi %.2f.%n", soma/3);
        
        sc.close();
    }
}
