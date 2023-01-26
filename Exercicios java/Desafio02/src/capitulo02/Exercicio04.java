package capitulo02;
import java.util.*;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int numero, horas;
        double valorHora, salario;
        System.out.print("Informe o número do funcionário: ");
        numero = sc.nextInt();
        System.out.print("Informe as horas trabalhadas pelo funcionário: ");
        horas = sc.nextInt();
        System.out.print("Informe o valor/hora do funcionário: ");
        valorHora = sc.nextDouble();
        salario = (double) horas * valorHora;
        System.out.printf("Número: %d%nSalário: R$ %.2f%n", numero, salario);
        
        sc.close();
    }
}