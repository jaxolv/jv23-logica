package exercicio03;

/** Faça uma programa para ler um número inteiro (N), e depois dizer se este número é negativo ou não. Além disso dizer
 * também se este número é par ou ímpar. Crie o programa principal e crie uma classe operaçãoMatematica com dois métodos,
 * ParOuImpar e NegativoOuPositivo, onde deve conter a lógica do problema. Considere os métodos como públicos. E Considere
 * a variável N como protegido. Depois tente trocar para privado e discuta o resultado.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        OperacaoMatematica mat = new OperacaoMatematica();
        
        System.out.print("Informe um número inteiro: ");
        // mat.n = sc.nextInt();
        mat.setN(sc.nextInt());
        System.out.print(mat.negativoOuPositivo() + "\n" + mat.parOuImpar() + "\n");
        
        // Com o atributo N protegido, não houve problemas na execução dos métodos.
        // Quando N se tornou privado, a única forma de acesso ao atributo foi através do get/set.
    }
}
