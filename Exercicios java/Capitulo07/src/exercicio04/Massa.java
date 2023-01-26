package exercicio04;

public class Massa {
    double massaInicial;

    int contagem() {
        int segundos = 0;
        double massaFinal = massaInicial;
        while (massaFinal>0.5) {
            massaFinal /= 2;
            segundos += 50;
        }
        return segundos;
    }
    
    void tempo() {
        int segundos = contagem();
        int minutos = 0;
        int horas = 0;
        
        if (contagem() > 60) {
          minutos = (int) segundos / 60;
          segundos %= 60;
            if (minutos > 60) {
                horas = (int) minutos / 60;
                minutos -= (horas * 60);
                if (horas > 1) {
                    System.out.printf("%d horas, ", horas);
                } else {
                    System.out.printf("%d hora, ", horas);
                }
            }
            if (minutos > 1) {
                System.out.printf("%d minutos e ", minutos);
            } else {
                System.out.printf("%d minuto e ", minutos);
            }
        }
        if (segundos > 1) {
            System.out.printf("%d segundos.%n", segundos);
        } else {
            System.out.printf("%d segundo.%n", segundos);
        }
    } 
}
