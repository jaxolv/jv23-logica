package exercicio01;

import java.util.Locale;
import java.util.Scanner;

/** Pensando na definição de herança, suponha um negócio de banco que possui uma conta comum e uma conta para empresas,
sendo que a conta para empresa possui todos membros da conta comum, mais um limite de empréstimo e uma operação de realizar
empréstimo.
 * NOME: Conta; ATRIBUTOS: - numeroConta, - proprietario, - balanco; MÉTODOS: + deposito(), + saque();
 * NOME: ContaJurídica; ATRIBUTOS: - numeroConta, - proprietario, - balanco, - limiteEmprestimo; MÉTODOS: + deposito(), + saque(), + emprestimo();
 * Veja que as contas possuem características semelhantes. Isso obviamente permite o reaproveitamento de código. Construa
um programa que use o conceito de herança. Reaproveite o código e faça a classe "ContaJuridica" herdar da classe "Conta"
todos os atributos e métodos.
 * Suponha que, para realizar um empréstimo, é descontada uma taxa no valor de 10.0. Crie essa lógica dentro do método
apropriado. Faça com que o usuário digite o valor desejado para o emprestimo. Caso o valor esteja dentro do limite,
apresente o balanco com o valor correto na conta. Caso o emprestimo não seja permito, apresente a mensagem dizendo ser
impossível. Tente com um valor menor.
 * Por fim, crie dois objetos. Um objeto conta e outro objeto contaJuridica. Entre com os devidos dados de cada conta.
Número da conta, nome do proprietário, o empréstimo realizado (ou não) e o balanço final.
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Conta cnt = new Conta();
        ContaJuridica jrd = new ContaJuridica();
        
        System.out.print("Informe o nome do proprietario da conta: ");
        String nome = sc.next();
        cnt.setProprietario(nome);
        cnt.setNumeroConta(0001);
        System.out.println("Deseja depositar algum valor? Se não, responda com 0.");
        cnt.depositar(sc.nextDouble());
        System.out.println("Aqui estão os dados da sua conta pessoal: ");
        System.out.printf("Conta: %d%nNome: %s%nSaldo: R$ %.2f%n",
                cnt.getNumeroConta(), cnt.getProprietario(), cnt.getBalanco());
        jrd.setProprietario(nome);
        jrd.setNumeroConta(1001);
        jrd.depositar(500);
        System.out.println("\nAqui estão os dados da sua conta criada pelo departamento financeiro do seu trabalho: ");
        System.out.printf("Conta: %d%nNome: %s%nSaldo: R$ %.2f%nLimite para emprésitmo: R$ %.2f%n",
                jrd.getNumeroConta(), jrd.getProprietario(), jrd.getBalanco(), jrd.getLimiteEmprestimo());
        System.out.println("Para realizar um empréstimo, informe o valor desejado: ");
        jrd.emprestimo(sc.nextDouble());
    }
}
