package exercicio07;

/** Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro
 * trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
 * também se o aluno está APROVADO ou REPROVADO e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo
 * para ser aprovado (que é 60% da nota). Você deve criar uma classe Estudante para resolver este problema. */

import java.util.Scanner;
import java.util.Locale;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante student = new Estudante();

        System.out.println("Informe, com números inteiros de 0 a 100, a primeira nota do trimestre: ");
        student.primeiroTrimestre = sc.nextInt();
        System.out.println("Informe, com números inteiros de 0 a 100, a segunda nota do trimestre: ");
        student.segundoTrimestre = sc.nextInt();
        System.out.println("Informe, com números inteiros de 0 a 100, a terceira nota do trimestre: ");
        student.terceiroTrimestre = sc.nextInt();
        student.verificacao();
    }
}
