package exercicio01;

public class Funcionario {
    private String nome;
    private int horas;
    private double valorHora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double pagamento() {
        return this.getHoras() * this.getValorHora();
    }

    public String toString() {
        return "O funcionario " + this.getNome() + " que recebe R$ " + this.getValorHora() +
                " por hora, ganha, ao todo, R$ " + this.pagamento() + ".";
    }
}
