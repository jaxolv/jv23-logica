package capitulo02;
import java.util.*;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe 4 valores inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int res = (a*b)-(c*d);
        System.out.printf("(%d x %d) - (%d x %d) = %d%n", a, b, c, d, res);
        
        sc.close();
    }
}