package exercicio04;

import java.util.Locale;
import java.util.Scanner;

/** Baseado na tabela ao lado, escreva um programa que leia o código de um item e a quantidade deste item.
 * A seguir, calcule e mostre o valor da conta a pagar. Crie o programa principal para instanciar os objetos
 * e crie a classe Produtos para criar lógica do problema.
 * Código   Produto             Preço
 * 1        Cachorro-Quente     7.00
 * 2        X-Salada            9.00
 * 3        X-Bacon             11.00
 * 4        Torrada             5.00
 * 5        Refrigerante        4.00
 * Implemente as variáveis como protegido e o método como publico. */
public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Produto comida = new Produto();
        
        comida.produtos();
        System.out.println("Informe qual produto deseja consumir através de seu código: ");
        comida.setCodigo(sc.nextInt());
        while (comida.getCodigo()<=0 || comida.getCodigo()>5) {
            System.out.println("Número de código não válido. Digite novamente: ");
            comida.setCodigo(sc.nextInt());
        }
        System.out.println("Qual a quantidade desse produto deseja consumir: ");if (comida.getCodigo()==0) {
            System.out.println("Número de código não válido.");
        }
        comida.setQuantidade(sc.nextInt());
        
        System.out.printf("O total do seu pedido é de R$ %.2f%n", comida.valorFinal());;
    }
}