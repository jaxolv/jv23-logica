package exercicio01;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private boolean status;
    private double saldo;

    public ContaBanco(int numConta, String dono) {
        this.numConta = numConta;
        this.dono = dono;
        this.status = false;
        this.saldo = 0;
    }

    public int getNumConta() { return numConta; }

    public void setNumConta(int numConta) { this.numConta = numConta; }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getDono() { return dono; }

    public void setDono(String dono) { this.dono = dono; }

    public boolean isStatus() { return status; }

    public void setStatus(boolean status) { this.status = status; }

    public double getSaldo() { return saldo; }

    public void setSaldo(double saldo) { this.saldo = saldo; }
    
    public void abrirConta(String tipo) {
        setStatus(true);
        if (tipo == "CC") {
            setSaldo(50);
        } else if (tipo == "CP") {
            setSaldo(150);
        } else {
            setStatus(false);
            System.out.println("Informe o tipo corretamente:\n[CC] Conte Corrente\n[CP] Conta Poupança");
        }
        setTipo(tipo);
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.printf("Você ainda tem R$ %.2f na conta. "
                    + "Esvazie-a antes de tentar fechá-la novamente.%n", saldo);
        } else if (saldo < 0) {
            System.out.printf("Você ainda tem uma dívida de R$ %.2f. "
                    + "Pague-a antes de tentar de fechá-la novamente.%n", Math.abs(saldo));
        } else {
        setStatus(false);
        System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(double valor) {
        if (isStatus() == true) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Conta não aberta ou inexistente.");
        }
    }

    public void sacar(double valor) {
        if (isStatus() == true) {
            if (getSaldo() > 0) {
                if (getTipo() == "CC") {
                    this.saldo -= valor;
                } else if (getTipo() == "CP") {
                    this.saldo -= valor;
                }
                System.out.println("Saque realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta não aberta ou inexistente.");
        }
    }

    public void pagarMensal() {
        if (getTipo() == "CC") {
            saldo -= 12;
        } else if (getTipo() == "CP") {
            saldo -= 20;
        }
    }
    
    public void imprimirDados() {
        System.out.printf("A conta de número %d pertence a %s, ela é do tipo %s e tem R$ %.2f de saldo.%n", getNumConta(), getDono(), getTipo(), getSaldo());
        
    }
}
