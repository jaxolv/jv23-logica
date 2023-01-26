package capitulo02;
import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe dois valores inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int soma = a + b;
        System.out.printf("%d + %d = %d%n", a, b, soma);
    }
    
}
