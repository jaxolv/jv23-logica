package exercicio01;

import java.util.Locale;
import java.util.Scanner;

/* Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome, horas
   trabalhadas e valor por hora. Funcionários terceirizado possuem ainda uma despesa adicional.
 * O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os funcionários
   terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.
    * Funcionario: - nome, - horas, - valorPorHora; + pagamento();
    * FuncionarioTercerizado: - nome, - horas, - valorPorHora; + pagamento();
 * Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. Depois de
   ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados. Construa o programa
   conforme projeto ao lado. Insira setters, getters e construtores.
 * O método pagamento em FuncionarioTercerizado deve sobrepor Funcionario. Por fim, instancie objetos e imprima o resultado.
***Dica: ArrayList é uma parte da estrutura de coleção e está presente no pacote java.util. Ele nos fornece matrizes dinâmicas
   em Java. Porém, pode ser mais lento do que os arrays padrão, mas pode ser útil em programas onde é necessária muita
   manipulação no array. Esta classe é encontrada no pacote java.util .
 * Portanto, instancie objetos como uma lista de funcionários. Algo do tipo: List<Funcionario> list = new ArrayList<>();
 */

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe, em sequência, o nome, as horas trabalhadas e o valor por hora do funcionário: ");
        Funcionario func = new Funcionario();
        func.setNome(sc.next());
        func.setHoras(sc.nextInt());
        func.setValorHora(sc.nextDouble());
        System.out.println(func.toString());
        
        System.out.println("Informe, em sequência, o nome, as horas trabalhadas e o valor por hora do funcionário terceirizado: ");
        FuncionarioTerceirizado terc = new FuncionarioTerceirizado();
        terc.setNome(sc.next());
        terc.setHoras(sc.nextInt());
        terc.setValorHora(sc.nextDouble());
        System.out.println(terc.toString());
    }
}
