package exercicio03;

public class OperacaoMatematica {
    private int n;
    // protected int n;
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    String parOuImpar() {
        return getN()==0 ? "" : (getN()%2==0 ? n + " é par." : n + " é ímpar.");
    }

    String negativoOuPositivo() {
        return getN()>0 ? n + " é positivo" : (getN()==0 ? "0 é neutro." : n + " é ímpar.");
    }
}
