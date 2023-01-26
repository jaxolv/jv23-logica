package capitulo02;
import java.util.*;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int cod1, qnt1, cod2, qnt2;
        double vlr1, vlr2, total;
        System.out.println("Informe o código da peça 1: ");
        cod1 = sc.nextInt();
        System.out.println("Informe a quantidade da peça 1: ");
        qnt1 = sc.nextInt();
        System.out.println("Informe a quantidade da peça 1: ");
        vlr1 = sc.nextDouble();
        System.out.println("Informe o código da peça 2: ");
        cod2 = sc.nextInt();
        System.out.println("Informe a quantidade da peça 2: ");
        qnt2 = sc.nextInt();
        System.out.println("Informe a quantidade da peça 2: ");
        vlr2 = sc.nextDouble();
        total = (double) (qnt1*vlr1) + (qnt2*vlr2);
        System.out.printf("Valor a pagar: %.2f%n", total);
        
        sc.close();
    }
}