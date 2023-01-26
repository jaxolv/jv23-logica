package capitulo06;

import java.util.Scanner;

/** Escreva um programa para receber os nomes dos 5 candidatos a líder de turma, em seguida receber
 * os votos dos alunos existentes na sala, e ao final mostrar o total de votos de cada candidato, o total
 * de votos na eleição, e ainda o candidato vencedor da eleição. Caso digite um número inexistente para os
 * candidatos, imprima a mensagem "Voto Inválido". */

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] candidatos = new String[5];
        int[] chapa = {0,0,0,0,0};
        
        System.out.println("Informe quais os 5 candidatos da turma: ");
        for (int i=0; i<5; i++) {
            candidatos[i] = sc.next();
        }
        System.out.println("Informe quantos alunos fazem parte da turma: ");
        int alunos = sc.nextInt();
        int quantidade = alunos;
        
        while (quantidade != 0) {
            System.out.println("Digite no número respectivo para votar no candidato desejado:");
            System.out.println("[1] Jackson\n[2] Fernanda\n[3] Mariana\n[4] Gabriel\n[5] Marcos");
            int voto = sc.nextInt();
            switch (voto) {
                case 1:
                    chapa[0]++;
                    System.out.println("Voto computado com sucesso!");
                    break;
                case 2:
                    chapa[1]++;
                    System.out.println("Voto computado com sucesso!");
                    break;
                case 3:
                    chapa[2]++;
                    System.out.println("Voto computado com sucesso!");
                    break;
                case 4:
                    chapa[3]++;
                    System.out.println("Voto computado com sucesso!");
                    break;
                case 5:
                    chapa[4]++;
                    System.out.println("Voto computado com sucesso!");
                    break;
                default:
                    System.out.println("Voto inválido. Tente novamente.");
                    quantidade++;
                    break;
            }
            quantidade--;
            System.out.println("*************************");
        }
        
        System.out.println("Votos computados ao todo: " + alunos + ".");
        for (int i=0; i<5; i++) {
            System.out.println("candidato(a): " + candidatos[i] + ", votos: " + chapa[i] + ".");
        }
        
        int j = 0;
        int empate = 0;
        for (int i=1; i<5; i++) {
            empate += chapa[i]==chapa[j] ? 1 : 0;
            
            j = chapa[i]>chapa[j] ? i : (chapa[i]<chapa[j] ? j : i);
        }
        
        if (empate==0) {
            System.out.println("O(a) candidato(a) eleito(a) foi " + candidatos[j] + "!");
        } else {
            System.out.println("Houve um empate e será necessário uma nova eleição entre os mais votados.");
        }
        
        sc.close();
    }
}
