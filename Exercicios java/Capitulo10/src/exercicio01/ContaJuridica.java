package exercicio01;

public class ContaJuridica extends Conta {
    private double limiteEmprestimo;

    public double getLimiteEmprestimo() {
        this.limiteEmprestimo = getBalanco()*10;
        return this.limiteEmprestimo;
    }

    /*private void setLimiteEmprestimo() {
        this.limiteEmprestimo = getBalanco()*10;
    }*/

    public void emprestimo(double valor) {
        valor = Math.abs(valor);
        if (this.getLimiteEmprestimo()>=valor) {
            this.depositar(valor-(valor*0.1));
            System.out.printf("Empréstimo concedido. Agora, você possui R$ %.2f em sua conta.", this.getBalanco());
        } else {
            System.out.printf("Emprésitmo não autorizado, seu limite para empréstimo é de R$ %.2f. "
                    + "Tente um valor menor.%n", this.getLimiteEmprestimo());
        }
    }
}
