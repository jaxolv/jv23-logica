package capitulo05;

import java.util.*;

public class Desafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /** DESAFIO
         * Escreva um programa para receber os nomes dos 5 candidatos a líder de turma, em seguida receber os votos dos
         * alunos existentes na sala, e ao final mostrar o total de votos de cada candidato, o total de votos na eleição,
         * e ainda o candidato vencedor da eleição. Caso digite um número inexistente para os candidatos, imprima a mensagem
         * "Voto Inválido". */
        
        int voto;
        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        int cand4 = 0;
        int cand5 = 0;
        int branco = 0;
        
        System.out.println("informe quantos alunos fazem parte da turma: ");
        int qntd = sc.nextInt();
        
        for (int i = 0; i < qntd; i++) {
            System.out.println("Informe em qual candidato você votará: ");
            System.out.println("[1] Jackson\n[2] Mariana\n[3] Marcos\n[4] Gabriel\n[5] Augusto\n[0] Voto em branco.");
            voto = sc.nextInt();
            switch (voto) {
                case 1:
                    cand1++;
                    break;
                case 2:
                    cand2++;
                    break;
                case 3:
                    cand3++;
                    break;
                case 4:
                    cand4++;
                    break;
                case 5:
                    cand5++;
                    break;
                default:
                    branco++;
            }
            System.out.println("Voto computado com sucesso.\n* * * * * * * * * * * * * * * * *");
        }
        
        System.out.printf("N˚   NOME        VOTOS%n");
        System.out.printf("1    Jackson     %d%n", cand1);
        System.out.printf("2    Mariana     %d%n", cand2);
        System.out.printf("3    Marcos      %d%n", cand3);
        System.out.printf("4    Gabriel     %d%n", cand4);
        System.out.printf("5    Augusto     %d%n", cand5);
        System.out.printf("0    Anulados    %d%n", branco);
        
        int votos[] = {cand1,cand2,cand3,cand4,cand5,branco};
        String candidatos[] = {"Jackson","Mariana","Marcos","Gabriel","Augusto"};
        int maisVotos = cand1;
        int j = 0;
        
        for (int i=1; i<votos.length; i++) {
            maisVotos = votos[i]>maisVotos ? votos[i] : maisVotos;
            j = votos[i]>maisVotos ? i : j;
        }
        
        System.out.println("O candidato mais votado teve " + maisVotos + " votos.");
        
        sc.close();
    }
}
