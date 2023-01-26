package exercicio06;

import java.util.Locale;
import java.util.Scanner;

/** Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados
 * do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem
 * dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
 * projetada abaixo:
* NOME: Funcionário;
* PARÂMETROS: nome, imposto, salarioBruto;
* MÉTODOS: SalarioLiquido(), AumentoSalario(); */

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Funcionario func = new Funcionario();
        
        System.out.print("Qual o nome do funcionário? ");
        func.nome = sc.next();
        System.out.printf("Informe quanto %s recebe bruto: R$ ", func.nome);
        func.salarioBruto = sc.nextDouble();
        System.out.println("Informe o imposto do salário bruto do funcioário (em porcento): ");
        func.imposto = sc.nextDouble();
        System.out.printf("O salário líquido do funcionário é de R$ %.2f%n", func.salarioLiquido());
        System.out.println("Informe em quantos porcento o salário do funcionário irá aumentar: ");
        func.aumento = sc.nextDouble();
        func.aumentoSalario();
        System.out.printf("O salário líquido do funcionário, depois do aumento, é de R$ %.2f%n", func.salarioLiquido());
        
        sc.close();
    }
}
