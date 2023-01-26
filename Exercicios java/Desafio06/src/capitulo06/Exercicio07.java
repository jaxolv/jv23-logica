package capitulo06;

import java.util.Scanner;

public class Exercicio07 {
    /** EXERCÍCIO 7
     *  Crie um programa que escolha um número aleatório entre 100 números de forma randômica. Após tal escolha,
     * o programa deve ler a entrada de um número com o intuito de adivinhar o número escolhido randomicamente.
     * Crie o programa de tal forma que, a cada número digitado ele indique se o número verdadeiro é maior ou
     * menor. Dessa forma, você consegue adivinhar mais rápido ao número randômico. */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, chute, chances = 0;
        System.out.println("Pensei num número inteiro que vai de 0 a 100.");
        System.out.println("Tente adivinhar em qual número estou pensando: ");
        numero = random();
        do {
            chute = sc.nextInt();
            String resposta = adivinhacao(chute, numero);
            System.out.print(resposta);
            chances++;
        } while (chute != numero);
        System.out.printf("Você precisou de %d palpites até acertar.%n", chances);
    }
    
    public static int random() {
        return (int) Math.ceil(Math.random()*100);
    }
    
    public static String adivinhacao(int palpite, int randomico) {
        if (palpite==randomico) {
            return "ACERTOU! O número que pensei é " + randomico + ".\n";
        } else if (palpite>randomico) {
            return "ERROU!\nTente um número mais baixo: ";
        } else {
            return "ERROU!\nTente um número mais alto: ";
        }
    }
}