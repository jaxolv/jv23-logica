package exercicio03;

import java.util.Locale;
import java.util.Scanner;

/**Desenvolva o código apropriado para um dos últimos exemplos apresentado na aula de polimorfismo. Siga o diagrama ao
 * lado e as informações apresentadas. Implemente o Polimorfismo de Sobreposição, pois o método “emitirSom”:
Possui assinaturas semelhantes. Estão em classes diferentes. superClasse é abstrato.
Animal: peso, idade, membros; [abs]locomover( ), [abs]alimentar( ), [abs]emitirSom( );
Mamífero: CorPelo; emitirSom( ) // "som de mamífero"
Lobo: emitirSom( ) // "Auuuuuuuuuu.."
Cachorro:   emititSom() // "Au Au Au Au..."
            reagir()
 * Suponha que o método “reagir()”, da classe cachorro, tenha comportamentos diferentes. Para tipo de ação o “reagir()” pode
 * ser de forma diferente. Isso é também polimorfismo de sobrecarga. Portanto, implemente também o polimorfismo de sobrecarga.
 * Siga a regra apresentada abaixo.
 * Reagir( ):
Falar frase
    Agradável: abanar e latir
    Agressiva: rosnar
Horário do dia
    Manhã: abanar
    Tarde: abanar e latir
    Noite: ignorar
Dono: 
    É dono: abanar
    Não é: rosnar e latir
Idade e peso
    Novo < 5 Leve < 10 - Novo e leve: abanar
    Novo e pesado: latir
    Velho e leve: rosnar
    Velho e pesado: ignorar
 */

public class Exercicio03 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Cachorro dog = new Cachorro();
        
        System.out.println(dog.reagir("Olá"));
        System.out.println(dog.reagir("Vai apanhar"));
        System.out.println(dog.reagir(11, 45));
        System.out.println(dog.reagir(21,00));
        System.out.println(dog.reagir(true));
        System.out.println(dog.reagir(false));
        System.out.println(dog.reagir(6, 12.5));
    }
}
