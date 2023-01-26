package capitulo02;
import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double pi = 3.14159;
        double raio;
        System.out.println("Informe o valor do raio de uma circuferência: ");
        raio = sc.nextDouble();
        double area = pi * ( raio * raio );
        System.out.printf("A área da circuferência de raio %.2f é de %.4f%n", raio, area);
    }
    
}
