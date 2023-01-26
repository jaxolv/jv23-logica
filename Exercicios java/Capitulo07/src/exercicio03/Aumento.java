package exercicio03;

public class Aumento {
    double salario, percentual;
    int atual, ano;
    
    void aumentoProgressivo() {
        for (int i=ano; i<=atual; i++) {
            System.out.printf("%d: R$ %.2f, percentual maior para %d: %.2f%% %n", i, salario, (i+1), percentual);
            salario += (double) salario*(percentual/100);
            percentual *= 2;
        }
    }
}
