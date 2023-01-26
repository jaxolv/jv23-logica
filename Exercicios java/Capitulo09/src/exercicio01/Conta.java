package exercicio01;

public class Conta implements ControleConta{
    private int numeroConta;
    private String proprietario;
    private double balanco;

    public Conta(int numeroConta, String proprietario, double balanco) {
        this.numeroConta = numeroConta;
        this.proprietario = proprietario;
        this.balanco = balanco==0 ? 0 : (balanco>0 ? balanco : 0);
    }

    public int getNumeroConta() {
        return numeroConta;
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
        System.out.printf("Olá, %s. Foi depositado o valor de R$ %.2f na sua conta %d e agora você tem R$ %.2f de saldo.%n",
                this.getProprietario(), valor, this.getNumeroConta(),this.getBalanco());
    }

    public void sacar(double valor) {
        valor = Math.abs(valor);
        if (this.getBalanco()<0) {
            System.out.println("Não pode mais fazer saques pois o saldo da conta está negativo.");
        } else {
            this.setBalanco(this.getBalanco()-(valor+5));
            System.out.printf("Olá, %s. Foi sacado o valor de R$ %.2f da sua conta %d, somados R$ 5,00 de juros por saque,"
                    + " e agora você tem R$ %.2f de saldo.%n", this.getProprietario(), valor, this.getNumeroConta(), 
                    this.getBalanco());
        }
    }
}
