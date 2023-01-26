package exercicio01;

public class Conta{
    private int numeroConta;
    private String proprietario;
    private double balanco;

    public int getNumeroConta() {
        return numeroConta;
    }
    
    protected void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getBalanco() {
        return balanco;
    }

    private void setBalanco(double balanco) {
        this.balanco = balanco;
    }

    public void depositar(double valor) {
        valor = Math.abs(valor);
        this.setBalanco(this.getBalanco()+valor);
    }

    public void sacar(double valor) {
        valor = Math.abs(valor);
        if (this.getBalanco()<0) {
            System.out.println("Não pode mais fazer saques pois o saldo da conta está negativado.");
        } else {
            this.setBalanco(this.getBalanco()-(valor+5));
        }
    }
}
