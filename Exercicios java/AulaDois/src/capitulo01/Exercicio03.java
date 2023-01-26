package capitulo01;

import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;

public class Exercicio03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.next();
        int idade = entrada.nextInt();
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        System.out.printf("Olá, %s. Você nasceu em %d.%n", nome, (anoAtual - idade));
    }
}
