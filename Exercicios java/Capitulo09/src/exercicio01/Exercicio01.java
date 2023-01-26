package exercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 X Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da conta,
   e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é
   opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não
   será feito e o saldo inicial da conta será, naturalmente, zero.
 X Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular
   pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo).
 X Além disso, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso: o saldo
   só aumenta por meio de depósitos, e só diminui por meio de saques:
 X NOME: Conta; ATRIBUTOS: - numeroConta, - proprietario, - balanco; MÉTODOS: + depositar() + sacar();
 X Leve em consideração a seguinte regra:
   Para cada saque realizado, o banco cobra uma taxa de $ 5,00;
   Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa;
 X Diante dos dados apresentados, crie um programa que realize o cadastro de uma conta, dando opção para que seja ou não
   informado o valor de depósito inicial. Em seguida, realize um depósito e depois um saque, sempre mostrando os dados da
   conta após cada operação.
 X Use o conceito de interface/encapulsamento e considere os métodos depositar() e sacar() como uma interface. Isso é
   importante para o contrato.
 X INTERFACE: ControleConta; MÉTODOS: public abstract depositar(), public abstract sacar(); */

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String nome = sc.next();
        System.out.println("Deseja fazer um depósito para iniciar a conta? Digite 0 caso não queira fazer depósito.");
        double deposito = sc.nextDouble();
        Conta cnt = new Conta(0001, nome, deposito);
        System.out.printf("Conta de número %d no nome de %s criada com sucesso! Valor inicial de R$ %.2f.%n", 
                cnt.getNumeroConta(), cnt.getProprietario(), cnt.getBalanco());
        System.out.print("Deposite um valor inicial: R$ ");
        cnt.depositar(sc.nextDouble());
        System.out.print("Saque exatamente a mesma quantia que você depositou: R$ ");
        cnt.sacar(sc.nextDouble());
        System.out.print("Tente novamente sacar a mesma quantia previamente depositada: R$ ");
        cnt.sacar(sc.nextDouble());
    }
}
