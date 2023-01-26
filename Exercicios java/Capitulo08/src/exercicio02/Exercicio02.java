package exercicio02;

import java.util.Locale;
import java.util.Scanner;

/** NOME: Carro;
 * ATRIBUTOS: + cor, + marc, + ano, + marcha, + ligado ,+ velocidadeAtual, + velocidadeMaxima;
 * MÉTODOS: + ligar(), + desligar(), + acelegar(), + pegarMarcha;
 **********************************
 * Use o construtor para definir o início padrão do carro. Ele deve estar desligado e marcha zero;
 * Insira dos os getters e setters;
 * Dentro do método desligado, avise com uma mensagem "Carro está desligado";
 * Dentro do método ligar(), avise com a mensagem quando estiver ligado "O carro está ligado". E ao acelerar
   que apresente o valor da velocidade Atual;
 * Dentro do método acelerar crie a lógica necessária. Considere uma quantidade/aumento de 10km/h para cada
   acelerada que for incrementado;
 * Dentro do método acelerar crie a lógica necessária. Considere a seguinte marcha:
 * (-1) Ré : velocidade < 0;
 * (0 ) Ponto Morto : velocidade = 0;
 * (1 ) Media: 0 < velocidade < 40;
 * (2 ) Alta : 40 =< velocidade =< 80;
 * (3 ) qualquer valor diferente do previsto.
 * Por fim, instancie dois objetos carro. Teste os carros com características e comportamentos diferentes. > */

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Carro azul = new Carro();
        System.out.print("Informe a marca do carro: ");
        azul.setMarca(sc.next());
        System.out.print("Informe o ano: ");
        azul.setAno(sc.nextInt());
        azul.setCor("Azul");
        azul.imprimirDados();
        System.out.println("**********************************************");
        
        Carro verm = new Carro();
        System.out.print("Informe a marca do carro: ");
        verm.setMarca(sc.next());
        System.out.print("Informe o ano: ");
        verm.setAno(sc.nextInt());
        verm.setCor("Vermelho");
        verm.imprimirDados();
        System.out.println("**********************************************");
        
        azul.ligar();
        azul.pegarMarcha();
        azul.acelerar();
        azul.pegarMarcha();
        azul.acelerar();
        azul.acelerar();
        azul.acelerar();
        azul.acelerar();
        azul.pegarMarcha();
        azul.reduzir();
        azul.reduzir();
        azul.reduzir();
        azul.pegarMarcha();
        azul.reduzir();
        azul.reduzir();
        azul.reduzir();
        azul.pegarMarcha();
        azul.reduzir();
        azul.acelerar();
        azul.pegarMarcha();
        azul.desligar();
    }
}
