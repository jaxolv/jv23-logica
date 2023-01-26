package exercicio07;

public class Estudante {
    int primeiroTrimestre, segundoTrimestre, terceiroTrimestre;
    
    void verificacao() {
        if (primeiroTrimestre>100 || segundoTrimestre>100 || terceiroTrimestre>100) {
            System.out.println("As notas devem valer no máximo 100.");
        } else if (primeiroTrimestre<0 || segundoTrimestre<0 || terceiroTrimestre<0) {
            System.out.println("As notas devem valer no mínimo 0.");
        } else {
            status();
        }
    }

    double notaFinal() {
        double nota1 = 30 * ((double) primeiroTrimestre/100);
        double nota2 = 35 * (double) segundoTrimestre/100; // (double) (segundoTrimestre/100) == 0; -> Assim o programa não lerá que a divisão resultará num valor fracionado.
        double nota3 = 35 * (double) terceiroTrimestre/100;
        return nota1 + nota2 + nota3;
    }

    void status() {
        System.out.printf("Sua nota foi %.1f. Você foi ", notaFinal());
        if (notaFinal() >= 60) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO. ");
            double resta = 60 - notaFinal();
            System.out.printf("Você precisa de %.1f para passar.%n", resta);
        }
    }
}
