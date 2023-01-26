package capitulo01;

import java.util.Locale;

public class Exercicio01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double x = 21.47583;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        String nome = "Jackson";
        int idade = 27;
        double renda = 2200.0;

        System.out.printf("%s tem %d anos e recebe R$ %.2f ao mês.", nome, idade, renda);
    }
}
