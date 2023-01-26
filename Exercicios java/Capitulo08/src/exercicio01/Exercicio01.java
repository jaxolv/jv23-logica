package exercicio01;

/** Crie uma classe “ContaBanco”.
 * O “tipo” de conta só pode ser conta corrente “CC” ou conta poupança “CP”;
 * Na hora de “abrirConta()” lembre-se que é necessário mudar o “status” pra verdadeiro. Se a conta não está aberta,
   o “status” é falso.
 * Suponha que se a pessoa abrir uma conta “CC” a pessoa ganha “R$50,00” e se abrir uma conta “CP” ganha “R$150,00”;
 * Para o método “fecharConta()” lembre-se que a pessoa não pode ter dinheiro e nem dívida na conta;
 * Para o método “depositar()” veja que só é possível se o “status” estiver “Verdadeiro”;
 * E pra “sacar()” dinheiro só é possível se a conta estiver aberta, ou seja, com “status” verdadeiro e além disso,
   é necessário ter dinheiro. E por fim, o cliente vai pagar mensalmente uma taxa “pagarMensal()”. Cliente “CC” paga
   “R$12,00” e cliente “CP” paga “R$20,00”;
 * De acordo com o diagrama de classes, insira os atributos e métodos. Veja as visibilidades de cada atributo e método.
   Além disso, insira os métodos Get e Set para cada atributo;
 * Insira também um “construtor”, onde cada conta que é aberta já recebe o “status” como falso, ou seja está fechada ainda,
   e o “saldo” como “zero”.
 ***************************
 * NOME: ContaBanco;
 * ATRIBUTOS: + numConta, # tipo, - dono, - saldo, - status;
 * MÉTODOS:  + abrirConta(), + fecharConta(), + depositar(), + sacar(), + pegarMensal();
 ***************************
 * Por fim, instancie:
 * A conta corrente 0001 do João Silva, que vai precisar depositar R$300,00.
 * A conta poupança 0002 de Maria Silva que vai precisar depositar R$400,00. */

import java.util.Scanner;
import java.util.Locale;

public class Exercicio01 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        ContaBanco joao = new ContaBanco(0001, "João da Silva");
        joao.abrirConta("CC");
        joao.depositar(300);
        joao.imprimirDados();
        joao.sacar(150);
        joao.imprimirDados();
        joao.pagarMensal();
        joao.imprimirDados();
        
        System.out.println("*****************************************************************************************");
        
        ContaBanco maria = new ContaBanco(0002, "Maria da Silva");
        maria.abrirConta("CP");
        maria.depositar(400);
        maria.imprimirDados();
        maria.sacar(35);
        maria.imprimirDados();
        maria.pagarMensal();
        maria.imprimirDados();
    }
    
}
